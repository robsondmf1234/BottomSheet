package com.example.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.dialog_btn
import kotlinx.android.synthetic.main.bottom_sheet_layout.copy
import kotlinx.android.synthetic.main.bottom_sheet_layout.link
import kotlinx.android.synthetic.main.bottom_sheet_layout.view.copy
import kotlinx.android.synthetic.main.bottom_sheet_layout.view.delete
import kotlinx.android.synthetic.main.bottom_sheet_layout.view.link
import kotlinx.android.synthetic.main.bottom_sheet_layout.view.share

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottonSheetDialog = BottomSheetDialog(this)

        val view = layoutInflater.inflate(R.layout.bottom_sheet_layout,null)

        bottonSheetDialog.setContentView(view)

        dialog_btn.setOnClickListener {
            bottonSheetDialog.show()
        }

        view.share.setOnClickListener {
            Toast.makeText(this,"Share",Toast.LENGTH_SHORT).show()
        }

        view.link.setOnClickListener {
            Toast.makeText(this,"Link",Toast.LENGTH_SHORT).show()
        }

        view.copy.setOnClickListener {
            Toast.makeText(this,"Copy",Toast.LENGTH_SHORT).show()
        }

        view.delete.setOnClickListener {
            Toast.makeText(this,"Delete",Toast.LENGTH_SHORT).show()
        }

    }
}