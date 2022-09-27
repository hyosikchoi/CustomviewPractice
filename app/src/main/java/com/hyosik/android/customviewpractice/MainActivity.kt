package com.hyosik.android.customviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.hyosik.android.customviewpractice.bottomsheet.CustomBottomSheet
import com.hyosik.android.customviewpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private val customBottomSheet = CustomBottomSheet()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        initView()
    }

    private fun initView() = with(binding) {
        btnShowBottomSheet.setOnClickListener {
            customBottomSheet.show(supportFragmentManager, customBottomSheet.tag)
        }
    }

}