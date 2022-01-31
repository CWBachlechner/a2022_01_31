package com.example.a2022_01_31

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.a2022_01_31.model.AllQuestions

class MainActivity : AppCompatActivity() {

    var trueButton: Button? = null
    var falseButton: Button? = null
    var nextButton: Button? = null
    var questionText: TextView? = null

    var question: Int = 0
    val allQuestions: AllQuestions = AllQuestions()
    val totalQs = allQuestions.allQuestions.size



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)
        nextButton = findViewById(R.id.next_button)
        questionText = findViewById(R.id.question_text)

        trueButton?.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(baseContext, "Clicked True", Toast.LENGTH_SHORT).show()
            }

        })

        falseButton?.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(baseContext, "Clicked False", Toast.LENGTH_SHORT).show()
            }

        })

        nextButton?.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                question = (question+1) % totalQs
                questionText?.setText(allQuestions.allQuestions[question].index)
                Toast.makeText(baseContext, "Clicked Next", Toast.LENGTH_SHORT).show()
            }

        })
    }
}