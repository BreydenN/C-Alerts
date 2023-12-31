package com.rol.alertsdialogkotlin

import android.app.AlertDialog
import android.content.Context
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.rol.alertsdialogkotlin.databinding.ActivitySuccessBinding

class SuccessActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySuccessBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuccessBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    companion object {
        fun showSuccessDialog(context: Context) {
            val successDialogBinding: ActivitySuccessBinding = ActivitySuccessBinding.inflate(LayoutInflater.from(context))
            val successDone = successDialogBinding.successDone

            val builder = AlertDialog.Builder(context)
            builder.setView(successDialogBinding.root)
            val alertDialog: AlertDialog = builder.create()

            successDone.setOnClickListener {
                alertDialog.dismiss()
            }

            alertDialog.window?.setBackgroundDrawable(ColorDrawable(0))
            alertDialog.show()
        }
    }
}
