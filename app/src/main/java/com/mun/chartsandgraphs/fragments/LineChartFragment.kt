package com.mun.chartsandgraphs.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.mun.chartsandgraphs.R

class LineChartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_line_chart, container, false)
        val lineChart = view.findViewById<LineChart>(R.id.line_chart)

        val entries = mutableListOf<Entry>().apply {
            add(Entry(0f, 1f))
            add(Entry(1f, 3f))
            add(Entry(2f, 6f))
            add(Entry(3f, 8f))
            add(Entry(4f, 4f))
            add(Entry(5f, 6f))
            add(Entry(6f, 1f))
            add(Entry(7f, 3f))
            add(Entry(8f, 6f))
        }

        val lineDataSet = LineDataSet(entries, "Line Data").apply {
            colors = listOf(
                Color.parseColor("#FFC12552"), // Replace with your actual color hex code
                Color.parseColor("#FFA500"),   // Example color for segment B
                Color.parseColor("#00FF00")    // Example color for segment C
            )
            setDrawCircles(true)
            setDrawFilled(true)
        }

        lineChart.data = LineData(lineDataSet)
        lineChart.animateX(1500)
        lineChart.setTouchEnabled(true)

        return view
    }
}