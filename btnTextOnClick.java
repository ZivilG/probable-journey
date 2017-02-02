package com.company;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Zivile Gel on 2017.01.19.
 */
public class btnTextOnClick implements ActionListener {
    private JButton btn;
    private JLabel lbl;

    public btnTextOnClick(JButton btn) {
        this.btn=btn;
    }

    public void setLabel (JLabel lbl){
        this.lbl=lbl;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        lbl.setText(Main.CONST_BUTTON_IS_PRESSED );
    }
}
