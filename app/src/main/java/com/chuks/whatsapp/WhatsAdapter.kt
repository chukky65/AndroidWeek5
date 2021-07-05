package com.chuks.whatsapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chuks.whatsapp.databinding.CountryItemBinding

class WhatsAdapter(val groupList: List<Properties>, var clickListener: OnWhatsAppClickListener) :
    RecyclerView.Adapter<WhatsAdapter.WhatsappViewHolder>() {


    class WhatsappViewHolder(private val binding: CountryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(assessment: Properties) {
            binding.imageView.setImageResource(assessment.imageRes)
            binding.textView1.text = assessment.firstText
            binding.textView2.text = assessment.SecondText
        }

        fun initialize(groupList: Properties, action: OnWhatsAppClickListener) {
            binding.textView1.text = groupList.firstText
            binding.textView2.text = groupList.SecondText
            binding.imageView.setImageResource(groupList.imageRes)

            binding.root.setOnClickListener {
                action.onWhatsAppClick(groupList, adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WhatsappViewHolder {
        var binding = CountryItemBinding.inflate(LayoutInflater.from(parent.context))
        return WhatsappViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return groupList.size
    }

    override fun onBindViewHolder(holder: WhatsappViewHolder, position: Int) {
        val assessment = groupList[position]
        holder.bind(assessment)
        holder.initialize(groupList[position], clickListener)
    }
}

interface OnWhatsAppClickListener {
    fun onWhatsAppClick(groupList: Properties, position: Int)
}