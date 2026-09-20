package com.example.groceryapplication

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import java.util.ArrayList
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast




class MyAdaptar(val itemsList:ArrayList<ItemModel>): RecyclerView.Adapter<MyAdaptar.MyViewHolder>() {

    //ViewHolder: holding references to the views for a single item in the 'RecyclerView'
    //itemView: the view representing a single item in the 'RecyclerView'

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        var itemImg: ImageView
        var itemTitle: TextView
        var itemDesc: TextView

        init {
            itemImg = itemView.findViewById(R.id.imageView)
            itemTitle = itemView.findViewById(R.id.title_txt)
            itemDesc = itemView.findViewById(R.id.description_text)

            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "You choose: ${itemsList[adapterPosition].name}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {

        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return MyViewHolder(v)
    }

    override fun onBindViewHolder(
        holder: MyViewHolder,
        position: Int
    ) {

        holder.itemTitle.setText(itemsList[position].name)
        holder.itemDesc.setText(itemsList[position].desc)
        holder.itemImg.setImageResource(itemsList[position].img)
    }

    override fun getItemCount(): Int {

        return itemsList.size
    }

    }
