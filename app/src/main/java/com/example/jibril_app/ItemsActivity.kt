package com.example.jibril_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()

        items.add(Item(1, "sofa", "Диван", "orem ipsum orem ipsum orem ipsumorem ipsum orem ipsum orem ipsum orem ipsumorem ipsum ", "gasdasdasdasd", 100))
        items.add(Item(2, "light", "Свет", "orem ipsum orem ipsum orem ipsumorem ipsum orem ipsum orem ipsum orem ipsumorem ipsum ", "gasdasdasdasd", 50))
        items.add(Item(3, "kitchen", "Кухня", "orem ipsum orem ipsum orem ipsumorem ipsum orem ipsum orem ipsum orem ipsumorem ipsum ", "gasdasdasdasd", 200))

        itemsList.layoutManager= LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}