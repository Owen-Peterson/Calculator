package com.owenpeterson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    public GUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);

        JButton button = new JButton("Click Me");
        panel.add(button);

        JLabel label = new JLabel("Number of clicks: 0");
        panel.add(label);
        button.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
