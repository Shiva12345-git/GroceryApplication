package com.example.groceryapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1- adapter: RecyclerView.Adapter
        val recyclerView: RecyclerView= findViewById(R.id.recyclerview)
        recyclerView.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        //2-Data Source: List of ItemModel Objects
        var groceryItems: ArrayList<ItemModel> = ArrayList()

        val v1 = ItemModel("Fruits","Fruits are good for health",R.drawable.fruit)
        val v2 = ItemModel("Vegetables","Vegetables are good for health",R.drawable.vegitables)
        val v3 = ItemModel("Bakery","Bread, wheat and beans",R.drawable.bread)
        val v4 = ItemModel("Beverage","Juice, Tea, Coffee and Soda.",R.drawable.beverage)
        val v5 = ItemModel("Milk","Milk, Yogurt and Cheese are good",R.drawable.milk)
        val v6 = ItemModel("Snacks","Pop Corn, Donut and Drinks",R.drawable.popcorn)

        groceryItems.add(v1)
        groceryItems.add(v2)
        groceryItems.add(v3)
        groceryItems.add(v4)
        groceryItems.add(v5)
        groceryItems.add(v6)

        // 3- Adapter: RecyclerView.Adapter

        val adapter = MyAdaptar(groceryItems)
        recyclerView.adapter = adapter

        }
}