package com.example.myapplication.components

import android.app.Activity
import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.text.format.DateFormat
import android.widget.TimePicker
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import java.util.*


class TimePickerFragment ( var hora:Int, var min: Int): DialogFragment(), TimePickerDialog.OnTimeSetListener{
    private var mListener: OnCompleteListener? = null
    var hour = hora
    var minute = min

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Use the current time as the default values for the picker
        /*val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)*/

        // Create a new instance of TimePickerDialog and return it
        return TimePickerDialog(activity, this, hour, minute, DateFormat.is24HourFormat(activity))
    }

    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {
        // Do something with the time chosen by the user
        //Toast.makeText(requireContext(), "" + hourOfDay + ":" + minute, Toast.LENGTH_LONG).show()
        mListener!!.onComplete("" + hourOfDay + ":" + minute)
    }

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        try {
            this.mListener = activity as OnCompleteListener
        } catch (e: ClassCastException) {
            throw ClassCastException("$activity must implement OnCompleteListener")
        }
    }


}

interface OnCompleteListener {
    fun onComplete(time: String?)
}



/*
private val mListener =
// make sure the Activity implemented it
    @Override onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.mListener = (OnCompleteListener)activity;
        } catch (final ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnCompleteListener");
        }
    }
        : OnCompleteListener? = null
        */
