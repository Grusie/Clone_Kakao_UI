package com.grusie.clone_kakao_ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.grusie.clone_kakao_ui.databinding.RecyclerviewMyprofileItemsBinding

class UserAdapter(val datas : MutableList<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder = UserViewHolder(
        RecyclerviewMyprofileItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as UserViewHolder).binding
        binding.textMyname.text = datas[position]
    }

    override fun getItemCount(): Int {
        return datas.size
    }

}