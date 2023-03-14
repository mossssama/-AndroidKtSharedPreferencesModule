package com.example.sharedprefsktmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Making an instance of the module
        val sharedPrefs = SharedPrefs.getInstance(applicationContext);

        // Writing in sharedPrefs
        sharedPrefs.write("Name","MohamedOsama")

        // Reading from sharedPrefs
        var name = sharedPrefs.read("Name","")

        Toast.makeText(applicationContext,name,Toast.LENGTH_LONG).show()

        // Deleting from sharedPrefs
        sharedPrefs.remove("Name")


    }
}