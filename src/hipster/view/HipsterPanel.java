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
	}
	
}
