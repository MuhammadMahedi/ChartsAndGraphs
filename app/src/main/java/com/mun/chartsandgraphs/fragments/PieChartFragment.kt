package com.mun.chartsandgraphs.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate
import com.mun.chartsandgraphs.R



class PieChartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pie_chart, container, false)
        val pieChart = view.findViewById<PieChart>(R.id.chart)

        val entries = mutableListOf<PieEntry>().apply {
            add(PieEntry(30f, "A"))
            add(PieEntry(40f, "B"))
            add(PieEntry(30f, "C"))
        }

        val pieDataSet = PieDataSet(entries, "Pie Data").apply {
            //colors = ColorTemplate.createColors(requireContext().resources, ColorTemplate.COLORFUL_COLORS)
            colors = listOf(
                Color.parseColor("#FFC12552"), // Replace with your actual color hex code
                Color.parseColor("#FFA500"),   // Example color for segment B
                Color.parseColor("#00FF00")    // Example color for segment C
            )
        }

        pieChart.data = PieData(pieDataSet)
        pieChart.animateXY(1500, 1500)
        return view
    }
}