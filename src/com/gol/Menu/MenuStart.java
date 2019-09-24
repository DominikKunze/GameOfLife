package com.gol.Menu;

import com.gol.Configure.Config;
import com.gol.GUI.GUI;
import com.gol.Library.Loader;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Contains the menu.
 *
 * @see JFrame
 *
 * @author Dominik Kunze
 * @version 1.0
 */
public class MenuStart {
    private JPanel panel;
    private JButton startGameButton;
    private JButton settingsButton;
    private JButton creditsButton;
    private JButton exitButton;

    /**
     * Constructor of the class. Opens the menu.
     */
    public MenuStart() {
        // create JFrame
        JFrame frame = new JFrame("Game of life");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Action listeners
        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Press space to start/stop the generation.","Game of life",JOptionPane.INFORMATION_MESSAGE);

                frame.setVisible(false);

                // Loaders
                Loader loader = new Loader();
                loader.generateCells();
                loader.loadGameRule(Config.gameRule);
                loader.calculateSize();

                // start game gui
                GUI gui = new GUI();
                gui.openGUI();
            }
        });
        settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new MenuSetting();
            }
        });
        creditsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"This game was created by Dominik Kunze.","Credits",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }
}
