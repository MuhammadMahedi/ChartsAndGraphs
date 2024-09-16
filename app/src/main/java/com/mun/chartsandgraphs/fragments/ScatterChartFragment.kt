package com.mun.chartsandgraphs.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.mikephil.charting.charts.ScatterChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.ScatterData
import com.github.mikephil.charting.data.ScatterDataSet
import com.mun.chartsandgraphs.R



class ScatterChartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_scatter_chart, container, false)
        val scatterChart = view.findViewById<ScatterChart>(R.id.chart)

        val entries = mutableListOf<Entry>().apply {
            add(Entry(1f, 2f))
            add(Entry(2f, 3f))
            add(Entry(3f, 5f))
            add(Entry(4f, 2f))
            add(Entry(5f, 3f))
            add(Entry(6f, 5f))
        }

        val scatterDataSet = ScatterDataSet(entries, "Scatter Data").apply {
            colors = listOf(
                Color.parseColor("#FFC12552"), // Replace with your actual color hex code
                Color.parseColor("#FFA500"),   // Example color for segment B
                Color.parseColor("#00FF00")    // Example color for segment C
            )
            scatterShapeSize = 20f
        }

        scatterChart.data = ScatterData(scatterDataSet)
        scatterChart.animateX(1000)
        return view
    }
}