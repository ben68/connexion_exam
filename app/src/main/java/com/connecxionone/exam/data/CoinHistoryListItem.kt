package com.connecxionone.exam.data

import com.connecxionone.exam.addCommas
import com.connecxionone.exam.withoutInteger

data class CoinHistoryListItem(
    val title: String,
    val subTitle: String,
    val iconUrl: String,
    val total: Int,
    val rate: Float,
    val totalDays: Int,
    val remainingDays: Int,
    val interactionRewards: Float,
    val socialRewards: Float,
    val revenue: Float
) {
    val totalWithComma = total.addCommas()
    val rateWithout0 = rate.withoutInteger()
    val remainingDaysWithText: String = "$remainingDays 天後過期"
    val progress: Int = (remainingDays / totalDays.toDouble() * 100).toInt()
    val interactionRewardsInteger: String
    val interactionRewardsDecimal: String
    val socialRewardsInteger: String
    val socialRewardsDecimal: String
    val revenueInteger: String
    val revenueDecimal: String
    init {
        interactionRewards.toString().split(".").let {
            interactionRewardsInteger = "+" + it[0].toInt().addCommas()
            interactionRewardsDecimal = "." + it[1]
        }
        socialRewards.toString().split(".").let {
            socialRewardsInteger = "+" + it[0].toInt().addCommas()
            socialRewardsDecimal = "." + it[1]
        }
        revenue.toString().split(".").let {
            revenueInteger = "+" + it[0].toInt().addCommas()
            revenueDecimal = "." + it[1]
        }
    }
}