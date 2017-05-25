/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotscara;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Michał
 */
public class ControlPanelControls extends Panel {
    
    String startActionString = "Strat";
    String stopActionString = "Stop";
    String NAME_OF_JRADIOBUTTONS = "Działanie Robota SCARA";
    
    public Panel controlPanel()
    {
        Panel controlPanel = new Panel();
        
        
        Panel northControlPanel = new Panel();
        controlPanel.add("North", northControlPanel);
        
        controlPanel.setBackground(Color.white);
        
        JLabel controlslabel = new JLabel(NAME_OF_JRADIOBUTTONS);
        northControlPanel.setForeground(Color.BLACK);
        northControlPanel.add("North",controlslabel);
        
        JRadioButton startActionButton = new JRadioButton(startActionString);
        startActionButton.setActionCommand(startActionString);
        startActionButton.setSelected(true);
        
        JRadioButton stopActionButton = new JRadioButton(stopActionString);
        stopActionButton.setActionCommand(stopActionString);
        
        ButtonGroup controlActiongGroup = new ButtonGroup();
        controlActiongGroup.add(startActionButton);
        controlActiongGroup.add(stopActionButton);
        
        JPanel radioPanel = new JPanel(new GridLayout(0, 1));
        radioPanel.add(startActionButton);
        radioPanel.add(stopActionButton);
        
        northControlPanel.add(radioPanel, BorderLayout.LINE_START);
        
        controlPanel.add(northControlPanel);
        
        return controlPanel;
    }
    
}
