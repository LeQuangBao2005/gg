/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;


/**
 *
 * @author ADMIN
 */
public class JNotepad extends JFrame {

    private JMenuBar mBar;
    private JMenu mFile, mEdit, mFormat;
    private JMenuItem itemNew, itemOpen, itemSave, itemSaveAs, itemPageSetup, itemPrint, itemExit;
    private JMenuItem itemFont;
    private JCheckBoxMenuItem itemWrap;
    private JTextArea txtEditor;

    public JNotepad(String title) {
        super(title);
        createMenu();
        createGUI();
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void createMenu() {
        mBar = new JMenuBar();
        mBar.add(mFile = new JMenu("File"));
        mBar.add(mEdit = new JMenu("Edit"));
        mBar.add(mFormat = new JMenu("Format"));

        mFile.add(itemNew = new JMenuItem("New"));
        mFile.add(itemOpen = new JMenuItem("Open"));
        mFile.add(itemSave = new JMenuItem("Save"));
        mFile.add(itemSaveAs = new JMenuItem("Save As"));
        mFile.addSeparator();
        mFile.add(itemPageSetup = new JMenuItem("Pase Setup"));
        mFile.add(itemPrint = new JMenuItem("Print"));
        mFile.addSeparator();
        mFile.add(itemExit = new JMenuItem("Exit"));
        mFormat.add(itemWrap = new JCheckBoxMenuItem("Word Wrap", true));
        mFormat.add(itemFont = new JMenuItem("Font"));

        itemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
        itemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
        itemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
        itemSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
        itemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.CTRL_DOWN_MASK));

        setJMenuBar(mBar);

        itemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Are you sure to exit"))  == JOptionPane.YES_OPTION){
                    
                              System.exit(0);
                }
                
                }
            });
        
    }
    public static void main(String[] args) {
        JNotepad notepad = new JNotepad ("Demo Nodepad")
                
    }
}
