package com.example.firsttestwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var picture1: ImageView
    lateinit var picture2: ImageView
    lateinit var picture3: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.et_text)

        picture1=findViewById(R.id.panda)
        picture2=findViewById(R.id.shifu)
        picture3=findViewById(R.id.tigress)
        button = findViewById(R.id.btn_go)

        button.setOnClickListener{
            var text = editText.text
            if (text.isNullOrEmpty()) Toast.makeText(this, "Пустое поле", Toast.LENGTH_LONG).show()

            val intent = Intent (this, MainActivity2::class.java)
            when {
                editText.text.toString() == "1" -> intent.putExtra("PICTURE", R.drawable.panda)
                editText.text.toString() == "2" -> intent.putExtra("PICTURE", R.drawable.shifu)
                editText.text.toString() == "3" -> intent.putExtra("PICTURE", R.drawable.tigress)
            }
            startActivity(intent)


        }
    }
}