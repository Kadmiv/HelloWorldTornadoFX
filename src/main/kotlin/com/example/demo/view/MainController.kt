package com.kadmiv.main.view

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.text.Text

class MainController(var mView: MainContract.IView) : MainContract.IPresenter {


    override fun onButtonClick() {
        mView.setVisible()
    }
}