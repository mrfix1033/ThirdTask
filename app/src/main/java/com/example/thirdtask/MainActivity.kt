package com.example.thirdtask

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var resultText: TextView
    private lateinit var countSymbolsText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        resultText = findViewById(R.id.resultText)
        countSymbolsText = findViewById(R.id.countSymbolsText)

        setTextCountSymbols(0)
    }

    fun onButtonClick(view: View) {
        val input = editText.text.toString()

        resultText.text = input.reversed()

        setTextCountSymbols(getCountWithoutWhitespaces(input))
    }

    private fun setTextCountSymbols(text: Int) {
        countSymbolsText.text =
            getString(R.string.countSymbols, text)
    }

    private fun getCountWithoutWhitespaces(input: String) =
        input.count { char -> !char.isWhitespace() }
}
