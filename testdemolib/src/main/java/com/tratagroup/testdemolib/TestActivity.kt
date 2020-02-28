package com.tratagroup.testdemolib

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        displayMessage()
    }

    private fun displayMessage() {
        Toast.makeText(this, "Welcome Ganesh", Toast.LENGTH_LONG).show()
    }

}
