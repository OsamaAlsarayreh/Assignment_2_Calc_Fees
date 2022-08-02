package com.example.calculatefees

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var options= arrayOf("None","1st discount (70%)","2nd discount (50%)","3rd discount(30%)")
        val spinner_val:Spinner=findViewById(R.id.spinner)
        var flag:String="none"
        val ResTV:TextView=findViewById(R.id.ResultTV)

        val apply:Button=findViewById(R.id.Applybt)
        spinner_val.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)
        spinner_val.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag=options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
        apply.setOnClickListener(){
            var fee:Float=ResTV.text.toString().toFloat()
            if(flag=="1st discount (70%)"){
                fee -= fee * 0.7F
                ResTV.text=fee.toString()

            }
            else if(flag=="2nd discount (50%)"){
                fee -= fee * 0.5F
                ResTV.text=fee.toString()

            }
            else if(flag=="3rd discount(30%)"){
                fee -= fee * 0.3F
                ResTV.text=fee.toString()

            }
            else                ResTV.text=fee.toString()

        }

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater=menuInflater
        inflater.inflate(R.menu.my_first_menu,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var dialog1=CustomDialogFragment()
        var dialog2= Year2Fragment()
        var dialog3=Year3Fragment()
        when(item.itemId){
            R.id.year1->dialog1.show(supportFragmentManager,"Custom Dialog")
            R.id.secondyear->dialog2.show(supportFragmentManager,"Custom Dialog")
            R.id.thirdyear->dialog3.show(supportFragmentManager,"Custom Dialog")

        }


        return super.onOptionsItemSelected(item)
    }
    fun receiveFeedback(feedback: String){
        val view:TextView=findViewById(R.id.ResultTV)
        view.text= feedback
    }
}