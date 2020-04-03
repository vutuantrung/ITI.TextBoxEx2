package com.example.textboxapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.display_layout.*

class DisplayActivity: AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.display_layout)

        txtNameResult.text = intent.getStringExtra("Name");
        txtAddressResult.text = intent.getStringExtra("Address");
        txtTelephoneResult.text = intent.getStringExtra("Telephone");
    }
}