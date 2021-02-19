package com.connecxionone.exam.ui.wallet.coin

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.connecxionone.exam.databinding.FragmentListBinding
import com.connecxionone.exam.ui.base.BaseFragment
import com.hi.dhl.binding.databind
import org.koin.android.viewmodel.ext.android.viewModel

class CoinHistoryFragment: BaseFragment<FragmentListBinding, CoinHistoryViewModel>() {

    override val model: CoinHistoryViewModel by viewModel()
    override val binding: FragmentListBinding by databind()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = CoinHistoryAdapter(model)

        binding
            .apply {
                listView.let {
                    it.layoutManager = LinearLayoutManager(requireContext())
                    it.adapter = adapter
                }
            }.also {
                it.model = model
                it.lifecycleOwner = this
            }

        with(model) {
            listData.observe(viewLifecycleOwner) {
                adapter.notifyDataSetChanged()
            }
        }
    }
}