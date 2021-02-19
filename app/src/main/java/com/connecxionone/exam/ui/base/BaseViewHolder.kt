package com.connecxionone.exam.ui.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.connecxionone.exam.databinding.LiCoinHistoryBinding
import com.hi.dhl.binding.inflateMethod

abstract class BaseViewHolder(binding: LiCoinHistoryBinding):
    RecyclerView.ViewHolder(binding.root) {

    companion object {
        inline fun <reified V: ViewBinding> takeBindingFrom(parent: ViewGroup): ViewBinding {
            val inflater = LayoutInflater.from(parent.context)
            return (V::class.java.inflateMethod().invoke(null, inflater) as V)
        }
    }
}