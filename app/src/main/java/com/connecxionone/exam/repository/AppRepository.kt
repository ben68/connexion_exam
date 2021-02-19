package com.connecxionone.exam.repository

import com.connecxionone.exam.data.CoinHistoryListItem

class AppRepository {

    private val item = CoinHistoryListItem(
        "容幣",
        "XNC (無限錢包)",
        "https://s2.coinmarketcap.com/static/img/coins/200x200/2099.png",
        9102619,
        .123f,
        400,
        328,
        1.849f,
        681.213f,
        1793.729f
    )

    fun getCoinHistoryData(callback: Callback<CoinHistoryListItem>) {
        mutableListOf<CoinHistoryListItem>().apply {
            for (i in 1..3) {
                add(item)
            }
            callback.onResult(this)
        }
    }

    fun getCouponData(callback: Callback<CoinHistoryListItem>) {
        mutableListOf<CoinHistoryListItem>().apply {
            callback.onResult(this)
        }
    }

    interface Callback<T: Any> {
        fun onResult(items: List<T>)
    }
}