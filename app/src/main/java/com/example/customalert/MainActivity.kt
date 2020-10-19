package com.example.customalert

import com.example.customalert.R
import android.app.AlertDialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showCustomDialog();
//        var alert = findViewById<Button>(R.id.buttonShowDialog)
//        alert.setOnClickListener {
//            showCustomDialog();
//
//        }


    }


    private fun showCustomDialog() {
        val viewGroup = findViewById<ViewGroup>(R.id.content)

        val dialogView: View =
            LayoutInflater.from(this).inflate(R.layout.custom_layout, null, false)

        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setView(dialogView)
        val alertDialog: AlertDialog = builder.create()

        var yes = dialogView.findViewById<Button>(R.id.buttonYes)

        yes.setOnClickListener {
            Toast.makeText(this,"Yes",Toast.LENGTH_SHORT).show()
        }

        var no =  dialogView.findViewById<Button>(R.id.buttonNo)
        no.setOnClickListener {
            Toast.makeText(this,"No",Toast.LENGTH_SHORT).show()
        }

        alertDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        alertDialog.show()


    }
}