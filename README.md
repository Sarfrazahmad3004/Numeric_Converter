# Numeric_Converter

The NumericConverter class extends the Frame class and implements the ActionListener interface. This means that the NumericConverter class can be used to create a graphical user interface (GUI) window.

The NumericConverter class has the following fields:

decimalValueTextField: A text field for entering the decimal value.
hexadecimalValueTextField: A text field for entering the hexadecimal value.
errorLabel: A label for displaying error messages.
The NumericConverter class has the following methods:

constructor(): This method initializes the NumericConverter class.
actionPerformed(): This method is called when a button is clicked.
main(): This method is the entry point for the NumericConverter class.
The constructor() method initializes the NumericConverter class by setting the title of the window, the layout of the window, and the text fields. It also adds the buttons and the label to the window.

The actionPerformed() method is called when a button is clicked. This method determines which button was clicked and performs the appropriate action. For example, if the Decimal to Hexadecimal button is clicked, the actionPerformed() method converts the decimal value in the decimalValueTextField to hexadecimal and displays the result in the hexadecimalValueTextField.
