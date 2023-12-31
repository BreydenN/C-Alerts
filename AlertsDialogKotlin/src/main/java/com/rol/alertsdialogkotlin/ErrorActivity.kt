package com.rol.alertsdialogkotlin

import android.app.AlertDialog
import android.content.Context
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.rol.alertsdialogkotlin.databinding.ActivityErrorBinding

class ErrorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityErrorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityErrorBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    companion object {
        fun showErrorDialog(context: Context) {
            val errorDialogBinding: ActivityErrorBinding = ActivityErrorBinding.inflate(LayoutInflater.from(context))
            val errorDone = errorDialogBinding.errorClose

            val builder = AlertDialog.Builder(context)
            builder.setView(errorDialogBinding.root)
            val alertDialog: AlertDialog = builder.create()

            errorDone.setOnClickListener {
                alertDialog.dismiss()
            }

            alertDialog.window?.setBackgroundDrawable(ColorDrawable(0))
            alertDialog.show()
        }
    }
}
