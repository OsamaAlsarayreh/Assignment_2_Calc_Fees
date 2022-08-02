package com.example.calculatefees
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.fragment.app.DialogFragment
import android.widget.*
class CustomDialogFragment : DialogFragment(R.layout.year1) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val Intro: CheckBox =view.findViewById(R.id.intro)
        val english: CheckBox =view.findViewById(R.id.English)
        val arabic: CheckBox =view.findViewById(R.id.Arabic)
        val physics: CheckBox =view.findViewById(R.id.Physics)
        val submit: Button =view.findViewById(R.id.Submit)
        val cancel: Button =view.findViewById(R.id.Cancel)
        var total:Int=0
        var count:  Int=0

        submit.setOnClickListener{
            if(Intro.isChecked){
                count++
                total+=330
            }
            if(english.isChecked){
                count++
                total+=330
            }
            if(arabic.isChecked){
                count++
                total+=330
            }
            if(physics.isChecked){
                count++
                total+=330
            }
            Toast.makeText(context," items has been added", Toast.LENGTH_SHORT).show()
            val m1:MainActivity = activity as MainActivity;
            m1.receiveFeedback(total.toString())
            dismiss()

        }
        cancel.setOnClickListener{
            dismiss()
        }
    }
}

