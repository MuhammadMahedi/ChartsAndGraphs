package com.mun.chartsandgraphs.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.mun.chartsandgraphs.R


class BarChartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_bar_chart, container, false)
        val barChart = view.findViewById<BarChart>(R.id.chart)

        val entries = mutableListOf<BarEntry>().apply {
            add(BarEntry(0f, 2f))
            add(BarEntry(1f, 4f))
            add(BarEntry(2f, 6f))
            add(BarEntry(3f, 5f))
            add(BarEntry(4f, 3f))
            add(BarEntry(5f, 6f))
        }

        val barDataSet = BarDataSet(entries, "Bar Data").apply {
            colors = listOf(
                Color.parseColor("#FFC12552"), // Replace with your actual color hex code
                Color.parseColor("#FFA500"),   // Example color for segment B
                Color.parseColor("#00FF00")    // Example color for segment C
            )
        }

        barChart.data = BarData(barDataSet)
        barChart.animateY(2000)
        return view
    }
}