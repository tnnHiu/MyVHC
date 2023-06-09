package com.example.myvhc.admin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myvhc.R
import com.example.myvhc.admin.bottom_sheet.UpdateAgencySheetFragment
import com.example.myvhc.databinding.ActivityAdminAgencyDetailBinding

class AdminAgencyDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAdminAgencyDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminAgencyDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnUpdate.setOnClickListener {
            UpdateAgencySheetFragment().show(supportFragmentManager, "newTaskTag")
        }

    }
}