package com.chirikualii.materi_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.chirikualii.materi_recyclerview.databinding.ItemProfileBinding
import com.chirikualii.materi_recyclerview.databinding.ProfileHandleBinding
import kotlinx.coroutines.NonDisposableHandle.parent
import java.text.FieldPosition


class ListProfileAdabter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val ListPRofile = mutableListOf<Profile>()
    private var viewType = -1

    class holder(val binding: ItemProfileBinding) :RecyclerView.ViewHolder(binding.root){
        fun bindView(data:Profile){
        binding.tvName.text=data.name
        binding.tvPhone.text=data.phone
        Glide.with(itemView.context).load(data.Image).circleCrop().into(binding.ivProfile)
        }
    }

    class HolderHeader(val binding: ProfileHandleBinding) :RecyclerView.ViewHolder(binding.root){
        fun bindView(data: Profile){
            binding.tvName.text=data.name
            binding.tvPhone.text=data.phone
            Glide.with(itemView.context).load(data.Image).into(binding.ivProfile)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        when(viewType){
            0 -> {
                val binding =ProfileHandleBinding.inflate(layoutInflater,parent,false)
                return HolderHeader(binding)
            }
            1 -> {
                val binding = ItemProfileBinding.inflate(layoutInflater,parent,false)
                return holder(binding)
            }
            else -> {
                return null!!
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val profile = ListPRofile[position]

        when(viewType){
            0 -> {
                val holderProfileHeader = holder as HolderHeader
                holderProfileHeader.bindView(profile)
            }
            1 -> {
                val HolderProfile = holder as holder
                HolderProfile.bindView(profile)
            }
        }


    }

    override fun getItemCount(): Int {
    return ListPRofile.size
    }

    override fun getItemViewType(position: Int): Int {
        if (position == 0) {
            viewType=0
            return viewType
        }else
        {
            viewType=1
            return viewType
        }
    }

    fun addList(ListData : List<Profile>){
        ListPRofile.clear()
        ListPRofile.addAll(ListData)
        notifyDataSetChanged()
    }
}