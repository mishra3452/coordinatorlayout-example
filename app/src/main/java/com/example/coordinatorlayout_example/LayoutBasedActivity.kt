package com.example.coordinatorlayout_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_layout_based.*

class LayoutBasedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_based)
        setSupportActionBar(findViewById(R.id.toolbar))

        fab.setOnClickListener { view ->
            Snackbar.make(view, getString(R.string.msg_clicked), Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}