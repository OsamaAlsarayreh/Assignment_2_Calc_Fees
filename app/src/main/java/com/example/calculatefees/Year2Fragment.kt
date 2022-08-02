package com.example.calculatefees

import android.view.View
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class Year2Fragment: DialogFragment(R.layout.yaer2) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val CC: CheckBox =view.findViewById(R.id.CC)
        val C: CheckBox =view.findViewById(R.id.C)
        val Lab1: CheckBox =view.findViewById(R.id.Lab1)
        val Lab2: CheckBox =view.findViewById(R.id.Lab2)
        val submit2: Button =view.findViewById(R.id.Submit2)
        val cancel2: Button =view.findViewById(R.id.Cancel2)
        var total:Int=0
        var count:  Int=0

        submit2.setOnClickListener{
            if(C.isChecked){
                count++
                total+=330
            }
            if(CC.isChecked){
                count++
                total+=330
            }
            if(Lab1.isChecked){
                count++
                total+=330
            }
            if(Lab2.isChecked){
                count++
                total+=330
            }
            Toast.makeText(context," items has been added", Toast.LENGTH_SHORT).show()
            val m1:MainActivity = activity as MainActivity;
            m1.receiveFeedback(total.toString())
            dismiss()

        }
        cancel2.setOnClickListener{
            dismiss()
        }
    }
}