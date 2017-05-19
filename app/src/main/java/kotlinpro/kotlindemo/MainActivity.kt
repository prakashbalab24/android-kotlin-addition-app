package kotlinpro.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.kotlindemo.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val but = findViewById(R.id.button2) as Button
        val num1 = findViewById(R.id.num1) as EditText
        val num2 = findViewById(R.id.num2) as EditText

        but.setOnClickListener{Toast.makeText(this,sumOf(num1,num2),Toast.LENGTH_SHORT).show()}
    }



    fun sumOf(number1: EditText, number2: EditText):String {
        if(number1.text.toString().equals("") || number2.text.toString().equals("")){
            return "Values cannot be empty!"
        }
        val num1 = Integer.parseInt(number1.text.toString())
        val num2 = Integer.parseInt(number2.text.toString())
        Log.i("num1",num1.toString())
        Log.i("num2",num2.toString())
        val ans = num1 + num2
        return ans.toString()
    }
}
