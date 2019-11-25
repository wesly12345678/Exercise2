package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(){
            val height:Double = editHeight.text.toString().toDouble();
            val weight:Double = editWeight.text.toString().toDouble();

            val bmi:Double = weight / Math.pow(height,2.0);

            if(bmi < 18.5){

                textValue.text = "UnderWeight: %.2f".format(bmi);

                imageView2.setImageResource(R.drawable.under);
            }else if (bmi >= 18.5 && bmi <=24.9 ){

                imageView2.setImageResource(R.drawable.normal);
                textValue.text = "Normal: %.2f".format(bmi);
            }else{

                imageView2.setImageResource(R.drawable.over);
                textValue.text = "OverWeight: %.2f".format(bmi);
            }
        }
        button2.setOnClickListener {
            editHeight.setText("");
            editWeight.setText("");
            textValue.setText("");
            imageView2.setImageResource(R.drawable.empty);
        }
    }
}
