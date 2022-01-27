package com.luk.biketracker.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.luk.biketracker.database.Ride
import com.luk.biketracker.other.TrackingUtility
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_ride.view.*
import luk.biketracker.R
import java.text.SimpleDateFormat
import java.util.*

class RideAdapter : RecyclerView.Adapter<RideAdapter.RunViewHolder>() {

    inner class RunViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    val diffCallback = object : DiffUtil.ItemCallback<Ride>(){
        override fun areItemsTheSame(oldItem: Ride, newItem: Ride): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Ride, newItem: Ride): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }
    }

    val differ  = AsyncListDiffer(this,diffCallback)

    fun submitList(list : List<Ride>) = differ.submitList(list)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RunViewHolder {
        return RunViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_ride,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RunViewHolder, position: Int) {
        val run = differ.currentList[position]
        holder.itemView.apply {
            Glide.with(this).load(run.img).into(ivRunImage)
            val calander = Calendar.getInstance().apply {
                timeInMillis = run.timestamp
            }
            val dateFormat = SimpleDateFormat("dd.MM.yy",Locale.getDefault())
            tvDate.text = dateFormat.format(calander.time)

            val avgspeed = "${run.avgSpeedInKMH}km/h"
            tvAvgSpeed.text = avgspeed

            val distanceinkm = "${run.distanceInMeters/ 1000f}km"
            tvDistance.text = distanceinkm

            tvTime.text = TrackingUtility.getFormattedStopWatchTime(run.timeInMillis)

            val caloriesBurned = "${run.caloriesBurned}kcal"
            tvCalories.text = caloriesBurned
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}