package com.example.student.hw3

import android.support.v4.app.RemoteActionCompatParcelizer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hw3_3.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var ans:String ="1234"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var user= intent.extras?.get("Name").toString()
        //var user: String =savedInstanceState!!.get("Name").toString()
        textView.setText(user)

        button.setOnClickListener{

            var inputStr =editText.text.toString();

            var nA = 0
            var nB = 0
            for (i in 0..3) {
                for (j in 0..3) {
                    var c = ans.get(i)
                    var d = inputStr.get(j)
                    if (ans.get(i) == inputStr.get(j)) {
                        if (i == j)
                            nA++
                        else
                            nB++

                    }

                }
            }

            var ret : String =nA.toString() + "A"+ nB.toString()+ "B"
            textView.setText(ret)

        }


    }
}