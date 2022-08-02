package com.example.calculatefees
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class Year3Fragment: DialogFragment(R.layout.year3) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val DS: CheckBox =view.findViewById(R.id.DS)
        val Algo: CheckBox =view.findViewById(R.id.Algo)
        val Kot: CheckBox =view.findViewById(R.id.Kot)
        val web: CheckBox =view.findViewById(R.id.web)
        val submit3: Button =view.findViewById(R.id.submit3)
        val cancel3: Button =view.findViewById(R.id.Cancel3)
        var total:Int=0
        var count:Int=0

        submit3.setOnClickListener{
            if(Algo.isChecked){
                count++
                total+=330
            }
            if(DS.isChecked){
                count++
                total+=330
            }
            if(Kot.isChecked){
                count++
                total=total+330
            }
            if(web.isChecked){
                count++
                total+=330
            }
            Toast.makeText(context," items has been added", Toast.LENGTH_SHORT).show()
            val m1:MainActivity = activity as MainActivity;
            m1.receiveFeedback(total.toString())
            dismiss()

        }
        cancel3.setOnClickListener{
            dismiss()
        }
    }
}
