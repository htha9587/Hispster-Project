package hipster.view;
/**
 * 11-17-15
 * @author htha9587
 *Version 1.1
 */

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import hipster.controller.HipsterAppController;
import hipster.model.Book;


public class HipsterPanel extends JPanel
{
	private HipsterAppController baseController;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	private JLabel bookPageCountLabel;
	private JLabel bookAuthorLabel;
	private JLabel bookSubjectLabel;
	private JLabel bookTitleLabel;
	private JLabel bookPriceLabel;
	private JButton changeBookButton;
	private int maxClicks;
	private int startClick;
	private JTextField textField;
	
	public HipsterPanel(HipsterAppController baseController)
	{
		setBackground(Color.ORANGE);
		this.baseController = baseController;
		
		JScrollBar scrollBar = new JScrollBar();
		add(scrollBar);
		
		JButton btnNewButton_1 = new JButton("New button");
		add(btnNewButton_1);
		baseLayout = new SpringLayout();
		bookPageCountLabel = new JLabel("The page count");
		bookAuthorLabel = new JLabel("The author");
		bookPriceLabel = new JLabel("The price");
		bookSubjectLabel = new JLabel("The subject");
		bookTitleLabel = new JLabel("The title");
		changeBookButton = new JButton("Change books");
		phraseComboBox = new JComboBox<String>();
		maxClicks = baseController.getFirstHipster().getHipsterBooks().length;
		startClick = 0;
	}
	
	
	private void setupComboBox()
	{
		String[] phrases = baseController.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.ORANGE);
		this.add(phraseComboBox);
	}
	
	private void setUpLayout()
	{
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton);
		
		JButton button = new JButton("New button");
		add(button);
		
	}
	
	private void setUpListeners()
	{
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);
		phraseComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selction)
			{
				int red = (int) (Math.random() *256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				setBackground(new Color(red, green, blue));
				String updatedTitle = phraseComboBox.getSelectedItem().toString();
				baseController.getBaseFrame().setTitle(updatedTitle);
			}
		});
		
		changeBookButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Book[] tempBooks = baseController.getFirstHipster().getHipsterBooks();
				if(startClick < maxClicks)
				{
					bookSubjectLabel.setText("Book subject: " + tempBooks[startClick].getSubject());
					bookAuthorLabel.setText("Book author: " + tempBooks[startClick].getAuthor());
					bookTitleLabel.setText("Book title: " + tempBooks[startClick].getTitle());
					bookPageCountLabel.setText("Book pages " + tempBooks[startClick].getPageCount());
					bookPriceLabel.setText("Book price; " + tempBooks[startClick].getPrice());
					startClick++;
					}
				else
				{
					startClick = 0;
					bookSubjectLabel.setText("Book subject: ");
					bookAuthorLabel.setText("Book author: ");
					bookTitleLabel.setText("Book title: ");
					bookPageCountLabel.setText("Book pages:");
					bookPriceLabel.setText("Book price: ");
					}
			}
		});		
	}		
			
}