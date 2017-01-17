package com.andreamazzarella.roman_numerals_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private Text conversionResult;
    @FXML private TextField romanInput;

    @FXML
    protected void convertRoman(ActionEvent actionEvent) {
        int result = RomanToArabicConverter.convert(romanInput.getText());
        conversionResult.setText(Integer.toString(result));
    }
}
