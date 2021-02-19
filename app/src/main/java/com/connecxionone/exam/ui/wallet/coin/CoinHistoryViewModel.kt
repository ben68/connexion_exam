package com.connecxionone.exam.ui.wallet.coin

import com.connecxionone.exam.data.CoinHistoryListItem
import com.connecxionone.exam.repository.AppRepository
import com.connecxionone.exam.ui.base.ListViewModel

class CoinHistoryViewModel(private val repository: AppRepository):
    ListViewModel<CoinHistoryListItem>(repository) {

    init {
        getData()
    }

    override fun getData() = repository.getCoinHistoryData(callback)

}
