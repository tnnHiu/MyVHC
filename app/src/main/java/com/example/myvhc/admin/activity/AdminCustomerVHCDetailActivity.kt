package com.example.myvhc.admin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myvhc.R
import com.example.myvhc.admin.bottom_sheet.UpdateCustomerVehicleSheetFragment
import com.example.myvhc.databinding.ActivityAdminCustomerVhcdetailBinding

class AdminCustomerVHCDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAdminCustomerVhcdetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminCustomerVhcdetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnUpdate.setOnClickListener {
            UpdateCustomerVehicleSheetFragment().show(supportFragmentManager, "newTaskTag")
        }

    }
}