package com.kadmiv.main.view

import javafx.event.ActionEvent
import javafx.scene.control.Button
import javafx.scene.layout.AnchorPane
import javafx.scene.layout.BorderPane
import javafx.scene.text.Text
import tornadofx.*


class MainView : View("Hello TornadoFX"), MainContract.IView {


    override val root: AnchorPane by fxml("/views/MainView.fxml")
    val button: Button by fxid("click_btn")
    val helloText: Text by fxid("hello_text")

    lateinit var mPresenter: MainContract.IPresenter

    init {
        mPresenter = MainController(this)
    }

    fun btn() {
        println("btn click")
        mPresenter.onButtonClick()
    }

    override fun setVisible() {
        println("Set visibility")
        helloText.isVisible = true
    }
}