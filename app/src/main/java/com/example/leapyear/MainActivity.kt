package com.example.leapyear

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
          val resultBTN:Button=findViewById(R.id.resultBTN)
          val numb:EditText=findViewById(R.id.eduNum)
          val resultTxt:TextView=findViewById(R.id.textResult)


resultBTN.setOnClickListener {
    val y=numb.text.toString().toInt()
    if(leap_year(y)){
        resultTxt.text=y.toString()+"is a leap year"
    }else{
        resultTxt.text=y.toString()+"is not a leap year"
    }
}
    }
}
public fun leap_year(y:Int):Boolean{
    if (y%400==0){
        return true;
    }else if(y%100==0){
        return false
    }else if (y%4==0){
        return true
    }else{
        return false
    }

}