package com.umutcansahin.recyclerviewsssss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.umutcansahin.recyclerviewsssss.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageList = ArrayList<ImageModel>().apply {
            add(ImageModel("create", R.drawable.baseline_create_24))
            add(ImageModel("car_repair", R.drawable.baseline_car_repair_24))
            add(ImageModel("chat_bubble", R.drawable.baseline_chat_bubble_24))
            add(ImageModel("construction", R.drawable.baseline_construction_24))
            add(ImageModel("cloud_done", R.drawable.baseline_cloud_done_24))
            add(ImageModel("currency_lira", R.drawable.baseline_currency_lira_24))
            add(ImageModel("delete_forever", R.drawable.baseline_delete_forever_24))
        }

        val adapter = CarouselAdapter(imageList)
        binding.apply {
            carouselRecyclerview.adapter = adapter
            carouselRecyclerview.set3DItem(true)
            carouselRecyclerview.setAlpha(true)
            carouselRecyclerview.setInfinite(true)
        }
    }
}