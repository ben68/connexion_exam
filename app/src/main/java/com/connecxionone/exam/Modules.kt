package com.connecxionone.exam

import com.connecxionone.exam.repository.AppRepository
import com.connecxionone.exam.ui.base.BlankViewModel
import com.connecxionone.exam.ui.wallet.coin.CoinHistoryViewModel
import com.connecxionone.exam.ui.wallet.coupon.CouponViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    single {
        AppRepository()
    }
    viewModel {
        BlankViewModel()
    }
    viewModel {
        CoinHistoryViewModel(get())
    }
    viewModel {
        CouponViewModel(get())
    }
}