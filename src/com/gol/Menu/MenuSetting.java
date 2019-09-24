package com.gol.Menu;

import com.gol.Configure.Config;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Contains menu of the setting.
 *
 * @see JFrame
 *
 * @author Dominik Kunze
 * @version 1.0
 */
public class MenuSetting {
    private JPanel panel;
    private JTextField evolutionTimeField;
    private JTextField cellsHorizontalField;
    private JTextField cellsVerticalField;
    private JTextField widthField;
    private JTextField heightField;
    private JTextField gameRuleField;
    private JButton saveButton;
    private JButton cancelButton;

    /**
     * Constructor of the class. Opens the menu setting.
     */
    public MenuSetting() {
        // set text of all textFields
        evolutionTimeField.setText(String.valueOf(Config.evolutionInMS));
        cellsHorizontalField.setText(String.valueOf(Config.cellsInWidth));
        cellsVerticalField.setText(String.valueOf(Config.cellsInHeight));
        widthField.setText(String.valueOf(Config.width));
        heightField.setText(String.valueOf(Config.height));
        gameRuleField.setText(Config.gameRule);

        // create JFrame
        JFrame frame = new JFrame("Game of life | Settings");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Action listeners
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new MenuStart();
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Settings saved!","Settings",JOptionPane.INFORMATION_MESSAGE);

                //Set config
                Config.cellsInHeight = Integer.parseInt(cellsVerticalField.getText());
                Config.cellsInWidth = Integer.parseInt(cellsHorizontalField.getText());
                Config.width = Integer.parseInt(widthField.getText());
                Config.height = Integer.parseInt(heightField.getText());
                Config.evolutionInMS = Integer.parseInt(evolutionTimeField.getText());
                Config.gameRule = gameRuleField.getText();

                frame.setVisible(false);
                new MenuStart();
            }
        });
    }
}
