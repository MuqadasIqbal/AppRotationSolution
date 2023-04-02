package com.example.approtationsolution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.approtationsolution.MainViewModel as MainViewModel1

class MainActivity : AppCompatActivity() {

    lateinit var textview1: TextView
    lateinit var textView2: TextView
    lateinit var textView3: TextView
    lateinit var viewModel: com.example.approtationsolution.MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel=ViewModelProvider(this).get(com.example.approtationsolution.MainViewModel::class.java)
        textview1=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2)
        textView3=findViewById(R.id.textView3)
        setText()
        setText2()
        setText3()

    }

    private fun setText3() {
        textView3.setText(viewModel.count3.toString())
    }

    private fun setText2() {
        textView2.setText(viewModel.count2.toString())
    }


    private fun setText() {

      /* textview1.text=count.toString();*/
        textview1.setText(viewModel.count.toString())


    }
    fun Increament(v:View) {
        viewModel.Increament()
        setText()

    }

    fun Increment2(view: View) {
        viewModel.Increament2()
        setText2()
    }
    fun Increament3(view: View) {
        viewModel.Increament3()
        setText3()
    }

}
