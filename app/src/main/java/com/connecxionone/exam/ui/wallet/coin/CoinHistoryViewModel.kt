package com.connecxionone.exam.ui.wallet.coin

import androidx.lifecycle.viewModelScope
import com.connecxionone.exam.data.CoinHistoryListItem
import com.connecxionone.exam.repository.AppRepository
import com.connecxionone.exam.ui.base.ListViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CoinHistoryViewModel(private val repository: AppRepository):
    ListViewModel<CoinHistoryListItem>(repository) {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            delay(1000)
            getData()
        }
    }

    override fun getData() = repository.getCoinHistoryData(callback)

}
