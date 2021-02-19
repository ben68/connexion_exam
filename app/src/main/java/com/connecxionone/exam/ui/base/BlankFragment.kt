package com.connecxionone.exam.ui.base

import android.os.Bundle
import android.view.View
import com.connecxionone.exam.databinding.FragmentBlankBinding
import com.hi.dhl.binding.viewbind
import org.koin.android.viewmodel.ext.android.viewModel

abstract class BlankFragment: BaseFragment<FragmentBlankBinding, BlankViewModel>() {

    abstract val name: String

    override val model: BlankViewModel by viewModel()
    override val binding: FragmentBlankBinding by viewbind()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(model) {
            text.observe(viewLifecycleOwner) {
                binding.textContent.text = it
            }
            setName(name)
        }
    }
}