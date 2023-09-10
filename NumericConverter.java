package asapJava;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

    public class NumericConverter extends Frame {
        private TextField decimalValueTextField;
        private TextField hexadecimalValueTextField;
        private Label errorLabel;

        public NumericConverter() {
            super("Numeric Converter");
            setLayout(new FlowLayout());

            decimalValueTextField = new TextField(10);
            add(decimalValueTextField);

            hexadecimalValueTextField = new TextField(10);
            add(hexadecimalValueTextField);

            errorLabel = new Label("");
            errorLabel.setBackground(Color.WHITE);
            errorLabel.setForeground(Color.RED);
            add(errorLabel);

            Button decimalToHexadecimalButton = new Button("Decimal to Hexadecimal");
            decimalToHexadecimalButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String decimalValueString = decimalValueTextField.getText();
                    if (decimalValueString.isEmpty()) {
                        hexadecimalValueTextField.setText("");
                        errorLabel.setText("");
                    } else {
                        try {
                            int decimalValue = Integer.parseInt(decimalValueString);
                            String hexadecimalValueString = Integer.toHexString(decimalValue);
                            hexadecimalValueTextField.setText(hexadecimalValueString);
                            errorLabel.setText("");
                        } catch (NumberFormatException ex) {
                            errorLabel.setText("Invalid decimal value");
                        }
                    }
                }
            });
            add(decimalToHexadecimalButton);

            Button hexadecimalToDecimalButton = new Button("Hexadecimal to Decimal");
            hexadecimalToDecimalButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String hexadecimalValueString = hexadecimalValueTextField.getText();
                    if (hexadecimalValueString.isEmpty()) {
                        decimalValueTextField.setText("");
                        errorLabel.setText("");
                    } else {
                        try {
                            int hexadecimalValue = Integer.parseInt(hexadecimalValueString, 16);
                            decimalValueTextField.setText(String.valueOf(hexadecimalValue));
                            errorLabel.setText("");
                        } catch (NumberFormatException ex) {
                            errorLabel.setText("Invalid hexadecimal value");
                        }
                    }
                }
            });
            add(hexadecimalToDecimalButton);

            Button clearButton = new Button("Clear");
            clearButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    decimalValueTextField.setText("");
                    hexadecimalValueTextField.setText("");
                    errorLabel.setText("");
                }
            });
            add(clearButton);

            pack();
            setVisible(true);
        }

        public static void main(String[] args) {
            new NumericConverter();
        }
    }