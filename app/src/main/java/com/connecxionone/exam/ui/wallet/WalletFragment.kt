package com.connecxionone.exam.ui.wallet

import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentActivity
import com.connecxionone.exam.R
import com.connecxionone.exam.databinding.FragmentWalletBinding
import com.connecxionone.exam.ui.base.BaseFragment
import com.google.android.material.tabs.TabLayoutMediator
import com.hi.dhl.binding.viewbind
import org.koin.android.viewmodel.ext.android.viewModel

class WalletFragment: BaseFragment<FragmentWalletBinding, WalletViewModel>() {

    override val model: WalletViewModel by viewModel()
    override val binding: FragmentWalletBinding by viewbind()

    private val tabTitles: Array<String>
        get() = arrayOf(
            getString(R.string.coinHistory),
            getString(R.string.coupon)
        )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            pageView.apply {
                adapter = WalletFragmentAdapter(activity as FragmentActivity)
            }

            TabLayoutMediator(tabView, pageView) { tab, position ->
                tab.text = tabTitles[position]
            }.attach()
        }
    }
}