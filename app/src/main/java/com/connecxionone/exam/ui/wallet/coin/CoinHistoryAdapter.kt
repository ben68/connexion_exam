package com.connecxionone.exam.ui.wallet.coin

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.connecxionone.exam.data.CoinHistoryListItem
import com.connecxionone.exam.ui.base.ListViewModel

class CoinHistoryAdapter(private val model: ListViewModel<CoinHistoryListItem>):
    RecyclerView.Adapter<CoinHistoryListItemViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CoinHistoryListItemViewHolder {
        return CoinHistoryListItemViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: CoinHistoryListItemViewHolder, position: Int) {
        model.listData.value
            ?.get(position)
            ?.let {
                holder.bind(it)
            }
    }

    override fun getItemCount(): Int {
        return model.listData.value?.count()?: 0
    }
}