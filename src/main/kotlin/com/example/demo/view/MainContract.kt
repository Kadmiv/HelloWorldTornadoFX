package com.kadmiv.main.view

interface MainContract {

    interface IView {
        fun setVisible()
    }

    interface IPresenter {
        fun onButtonClick()
    }

    interface IModel
}