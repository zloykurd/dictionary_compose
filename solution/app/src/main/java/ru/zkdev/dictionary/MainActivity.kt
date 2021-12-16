package ru.zkdev.dictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * main activity
 */
class MainActivity : AppCompatActivity() {
    /**
     * create activity context and view
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}