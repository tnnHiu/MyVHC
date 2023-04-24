package com.example.myvhc.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myvhc.databinding.FragmentHomeBinding
import com.example.myvhc.databinding.ItemCustomerVehicleBinding
import com.example.myvhc.databinding.ItemMyVehicleListBinding
import com.example.myvhc.models.CustomerVehicle

class CustomerVehicleAdapter(private val customerVehicleList: ArrayList<CustomerVehicle>) :
    RecyclerView.Adapter<CustomerVehicleAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemCustomerVehicleBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemCustomerVehicleBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return customerVehicleList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val holderBinding = holder.binding
        holderBinding.txtVehicleModel.text = customerVehicleList[position].vehicleId
    }


}