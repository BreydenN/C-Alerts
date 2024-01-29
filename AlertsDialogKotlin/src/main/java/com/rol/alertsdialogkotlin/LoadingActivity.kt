package com.rol.alertsdialogkotlin

import android.app.AlertDialog
import android.content.Context
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.rol.alertsdialogkotlin.databinding.ActivityLoadingBinding


class LoadingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoadingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoadingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    companion object {

        private var alertDialog: AlertDialog? = null

        fun showLoadingDialog(context: Context) {
            val loadingDialogBinding: ActivityLoadingBinding = ActivityLoadingBinding.inflate(LayoutInflater.from(context))

            val builder = AlertDialog.Builder(context)
            builder.setView(loadingDialogBinding.root)
            alertDialog = builder.create()

            alertDialog?.window?.setBackgroundDrawable(ColorDrawable(0))
            alertDialog?.show()
        }

        fun closeLoadingDialog(){
            alertDialog?.dismiss()
        }
    }
}