package com.hyosik.android.customviewpractice.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.hyosik.android.customviewpractice.R
import com.hyosik.android.customviewpractice.databinding.DialogBottomSheetBinding

class CustomBottomSheet() : BottomSheetDialogFragment() {

    private lateinit var binding : DialogBottomSheetBinding

    init {
        setStyle(STYLE_NORMAL , R.style.Theme_CustomBottomSheet)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.dialog_bottom_sheet,container,false)
        return binding.root
    }

}