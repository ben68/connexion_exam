package com.connecxionone.exam

import android.widget.ImageView
import androidx.constraintlayout.widget.Placeholder
import com.bumptech.glide.Glide

fun Int.addCommas(): String = when {
    this > 1000 -> {
        (this / 1000).addCommas() + "," + (this % 1000).toString()
    }
    else -> this.toString()
}

fun Float.withoutInteger(): String =
    "." + this.toString().split(".")[1]

fun ImageView.load(url: String, placeholder: Int) =
    Glide.with(this.context)
        .load(url)
        .placeholder(placeholder)
        .into(this)

fun ImageView.load(url: String) =
    Glide.with(this.context)
        .load(url)
        .into(this)