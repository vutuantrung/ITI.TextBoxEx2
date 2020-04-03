package com.example.textboxapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.display_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSave(view: View){
        val intent = Intent(this@MainActivity, DisplayActivity::class.java)
        intent.putExtra("Name", txtName.text.toString());
        intent.putExtra("Address", txtAddress.text.toString());
        intent.putExtra("Telephone", txtTelephone.text.toString());

        startActivity(intent);
    }
}
