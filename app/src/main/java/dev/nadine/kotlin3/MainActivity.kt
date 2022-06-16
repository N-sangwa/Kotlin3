package dev.nadine.kotlin3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilNum1:TextInputLayout
    lateinit var etnum1:TextInputEditText
    lateinit var tilNum2:TextInputLayout
    lateinit var etnum2:TextInputEditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnModulus:Button
    lateinit var btnDivide:Button
    lateinit var tvAnswer:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilNum1=findViewById(R.id.tilNum1)
        etnum1=findViewById(R.id.etnum1)
        tilNum2=findViewById(R.id.tilNUm2)
        etnum2=findViewById(R.id.etnum2)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnModulus=findViewById(R.id.btnModulus)
        btnDivide=findViewById(R.id.btnDivide)
        tvAnswer=findViewById(R.id.tvAnswer)

        btnAdd.setOnClickListener {
            var num1= etnum1.text.toString().toInt()
            var  num2 = etnum2.text.toString().toInt()
            add(num1, num2)
        }
        btnSubtract.setOnClickListener {
            var num1= etnum1.text.toString().toInt()
            var num2= etnum2.text.toString().toInt()
            subtract(num1, num2)
        }
        btnModulus.setOnClickListener {
            var num1= etnum1.text.toString().toInt()
            var num2= etnum2.text.toString().toInt()
            modulus(num1, num2)

        }
        btnDivide.setOnClickListener {
            var num1= etnum1.text.toString().toInt()
            var  num2= etnum2.text.toString().toInt()
            division(num1, num2)
        }
        validate()
    }


    fun add(num1:Int, num2:Int){
        var answer= num1+num2
        tvAnswer.text=answer.toString()
    }
    fun subtract(num1:Int, num2:Int){
        var answer= num1-num2
        tvAnswer.text=answer.toString()
    }
    fun modulus(num1: Int, num2: Int){
        var answer= num1%num2
        tvAnswer.text=answer.toString()
    }
    fun division(num1: Int, num2: Int){
        var answer= num1/num2
        tvAnswer.text=answer.toString()
    }
    fun validate(){
        var add =etnum1.text.toString()
        var add2=etnum2.text.toString()
        if (add.isBlank()){
            tilNum1.error="Enter a number"

        }
        if (add2.isBlank()){
            tilNum2.error="Enter a number"

        }

    }

}



