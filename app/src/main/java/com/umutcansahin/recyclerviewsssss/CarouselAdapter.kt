package com.umutcansahin.recyclerviewsssss

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.umutcansahin.recyclerviewsssss.databinding.CarouselItemBinding

class CarouselAdapter(private val imageList: List<ImageModel>) :
    RecyclerView.Adapter<CarouselAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: CarouselItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            CarouselItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = imageList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            Glide.with(viewImage).load(imageList[position].image).into(viewImage)
            imageName.text = imageList[position].name
            viewImage.setOnClickListener {
                Toast.makeText(
                    holder.binding.root.context,
                    imageList[position].name,
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}