package com.tratagroup.librarypublishdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tratagroup.testdemolib.TestActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        idBtnOpenLib.setOnClickListener {
          startActivity(Intent(this, TestActivity::class.java))
        }
    }
}
