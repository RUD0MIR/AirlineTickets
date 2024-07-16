package com.rud.tickets_search_presentation

import android.annotation.SuppressLint
import android.view.MotionEvent
import android.view.View
import android.widget.EditText
import android.widget.TextView

@SuppressLint("ClickableViewAccessibility")
fun EditText.onRightCompoundDrawableClick(onClick: () -> Unit) {
    this.setOnTouchListener(View.OnTouchListener { v, event ->
        val rightDrawableId = 2
        if (event.action == MotionEvent.ACTION_UP) {
            if (
                event.rawX >= (this.right - this.compoundDrawables[rightDrawableId].bounds.width())
            ) {
                onClick()
                return@OnTouchListener true
            }
        }
        false
    })
}

@SuppressLint("ClickableViewAccessibility")
fun TextView.onRightCompoundDrawableClick(onClick: () -> Unit) {
    this.setOnTouchListener(View.OnTouchListener { v, event ->
        val rightDrawableId = 2
        if (event.action == MotionEvent.ACTION_UP) {
            if (
                event.rawX >= (this.right - this.compoundDrawables[rightDrawableId].bounds.width())
            ) {
                onClick()
                return@OnTouchListener true
            }
        }
        false
    })
}

fun Int.addSpaces(): String {
    val initialNumber = this.toString()
    if (initialNumber.length <= 3) {
        return initialNumber
    }

    var formattedNumber = ""
    var buffer = ""
    initialNumber.reversed().forEach {
        buffer += it
        formattedNumber += it

        if (buffer.length == 3) {
            formattedNumber += " "
            buffer = ""
        }
    }

    return formattedNumber.reversed().trim()
}