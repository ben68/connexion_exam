package com.connecxionone.exam.ui.wallet.coin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.connecxionone.exam.R
import com.connecxionone.exam.data.CoinHistoryListItem
import com.connecxionone.exam.databinding.LiCoinHistoryBinding
import com.connecxionone.exam.load

class CoinHistoryListItemViewHolder(private val binding: LiCoinHistoryBinding):
    RecyclerView.ViewHolder(binding.root) {

    fun bind(data: CoinHistoryListItem) {
        with(binding) {
            icon.load(
                url = data.iconUrl,
                placeholder = R.drawable.ic_stars
            )
            item = data
            executePendingBindings()
        }
    }

    companion object {
        fun from(parent: ViewGroup): CoinHistoryListItemViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            return LiCoinHistoryBinding.inflate(
                inflater,
                parent,
                false
            ).let {
                CoinHistoryListItemViewHolder(it)
            }
        }
    }
}