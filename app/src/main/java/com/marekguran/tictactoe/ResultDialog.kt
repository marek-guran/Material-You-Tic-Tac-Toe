package com.marekguran.tictactoe

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ResultDialog(
    context: Context,
    private val message: String,
    private val mainActivity: MainActivity
) : Dialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window?.decorView?.let { decorView ->
            val uiOptions = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_FULLSCREEN)
            decorView.systemUiVisibility = uiOptions
        }
        window?.setBackgroundDrawableResource(android.R.color.transparent)
        setContentView(R.layout.activity_result_dialog)
        val messageText = findViewById<TextView>(R.id.messageText)
        val startAgainButton = findViewById<Button>(R.id.startAgainButton)
        messageText.text = message
        startAgainButton.setOnClickListener {
            mainActivity.restartMatch()
            dismiss()
        }
    }
}