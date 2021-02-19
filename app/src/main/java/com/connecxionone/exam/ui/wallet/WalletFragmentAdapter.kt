package com.connecxionone.exam.ui.wallet

import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.connecxionone.exam.ui.wallet.coin.CoinHistoryFragment
import com.connecxionone.exam.ui.wallet.coupon.CouponFragment

class WalletFragmentAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount() = 2
    override fun createFragment(position: Int) = when(position) {
        0 -> CoinHistoryFragment()
        else -> CouponFragment()
    }
}