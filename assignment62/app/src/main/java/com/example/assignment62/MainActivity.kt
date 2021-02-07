package com.example.assignment62

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var total0: TextView = findViewById(R.id.totalcre)
        var gpa: TextView = findViewById(R.id.gpa)
        var sub1: EditText =findViewById(R.id.subject1)
        var sub2: EditText =findViewById(R.id.subject2)
        var sub3: EditText =findViewById(R.id.subject3)
        var sub4: EditText =findViewById(R.id.subject4)
        var sub5: EditText =findViewById(R.id.subject5)
        var cre1: EditText =findViewById(R.id.credit1)
        var cre2: EditText =findViewById(R.id.credit2)
        var cre3: EditText =findViewById(R.id.credit3)
        var cre4: EditText =findViewById(R.id.credit4)
        var cre5: EditText =findViewById(R.id.credit5)
        var point1: EditText =findViewById(R.id.point1)
        var point2: EditText =findViewById(R.id.point2)
        var point3: EditText =findViewById(R.id.point3)
        var point4: EditText =findViewById(R.id.point4)
        var point5: EditText =findViewById(R.id.point5)
        var btnok: Button =findViewById(R.id.ok)
        var btnclear: Button =findViewById(R.id.clear)
        btnok.setOnClickListener(){
            var sub1 = sub1.text.toString()
            var sub2 = sub2.text.toString()
            var sub3 = sub3.text.toString()
            var sub4 = sub4.text.toString()
            var sub5 = sub5.text.toString()
            var cre1 = cre1.text.toString()
            var cre2 = cre2.text.toString()
            var cre3 = cre3.text.toString()
            var cre4 = cre4.text.toString()
            var cre5 = cre5.text.toString()
            var point1 = point1.text.toString()
            var point2 = point2.text.toString()
            var point3 = point3.text.toString()
            var point4 = point4.text.toString()
            var point5 = point5.text.toString()
            var total1 = 0.00
            var total2 = 0.00
            var total3 = 0.00
            var total4 = 0.00
            var total5 = 0.00
            var total = 0.000
            var totalcre =0.00
            if(sub1 == "" || sub2 == "" || sub3 == "" || sub4 == "" || sub5 == "" ||
                cre1 == "" || cre2 == "" || cre3 == "" || cre4 == "" || cre5 == "" ||
                point1 == "" || point2 == "" || point3 == "" || point4 == "" || point5 == ""  ){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ข้อมูลให้ครบ", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total1=cre1.toDouble()*point1.toDouble()
                total2=cre2.toDouble()*point2.toDouble()
                total3=cre3.toDouble()*point3.toDouble()
                total4=cre4.toDouble()*point4.toDouble()
                total5=cre5.toDouble()*point5.toDouble()
                totalcre =cre1.toDouble()+cre2.toDouble()+cre3.toDouble()+cre4.toDouble()+cre5.toDouble()
                    total = (total1+total2+total3+total4+total5)/totalcre
                total0.setText(totalcre.toString())
                gpa.setText(total.toString())
            }
        }
        btnclear.setOnClickListener(){
             total0.setText("")
             gpa.setText("")
             sub1.setText("")
             sub2.setText("")
             sub3.setText("")
             sub4.setText("")
             sub5.setText("")
             cre1.setText("")
             cre2.setText("")
             cre3.setText("")
             cre4.setText("")
             cre5.setText("")
             point1.setText("")
             point2.setText("")
             point3.setText("")
             point4.setText("")
             point5.setText("")
        }
    }
}