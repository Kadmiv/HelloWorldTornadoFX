package com.example.demo.app

import com.kadmiv.main.view.MainView
import javafx.application.Platform
import javafx.stage.Stage
import tornadofx.App

class MyApp : App(MainView::class, Styles::class) {
    override fun start(stage: Stage) {
        super.start(stage)
        stage.setOnCloseRequest {
            Platform.exit()
            System.exit(0)
        }
    }
}