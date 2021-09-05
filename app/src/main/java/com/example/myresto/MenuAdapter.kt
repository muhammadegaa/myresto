package com.example.myresto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MenuAdapter(private val menuData: List<Menu>) :
    RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.menu_layout, parent,false)
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val element = menuData[position]
        holder.txtName.text = element.name
        holder.txtDetail.text = element.detail

        Glide.with(holder.itemView.context)
            .load(element.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.ivMenu)

        Toast.makeText(holder.itemView.context, element.photo, Toast.LENGTH_LONG).show()

        holder.parentLayout.setOnClickListener {
            if(holder.itemView.context is MenuActivity){
                (holder.itemView.context as MenuActivity).numIncrease()
            }
        }
    }

    override fun getItemCount(): Int {
        return menuData.size
    }

    class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtName = itemView.findViewById(R.id.tv_item_name) as TextView
        val txtDetail= itemView.findViewById(R.id.tv_item_detail) as TextView
        val ivMenu = itemView.findViewById(R.id.img_item_photo) as ImageView
        val parentLayout = itemView.findViewById(R.id.parent_layout) as RelativeLayout
    }
}