package com.mun.chartsandgraphs.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.mikephil.charting.charts.RadarChart
import com.github.mikephil.charting.data.RadarData
import com.github.mikephil.charting.data.RadarDataSet
import com.github.mikephil.charting.data.RadarEntry
import com.mun.chartsandgraphs.R


class RadarChartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_radar_chart, container, false)
        val radarChart = view.findViewById<RadarChart>(R.id.chart)

        val entries = mutableListOf<RadarEntry>().apply {
            add(RadarEntry(4f))
            add(RadarEntry(6f))
            add(RadarEntry(2f))
            add(RadarEntry(1f))
            add(RadarEntry(7f))
            add(RadarEntry(3.9f))
        }

        val radarDataSet = RadarDataSet(entries, "Radar Data").apply {
            color = Color.CYAN
        }

        radarChart.data = RadarData(radarDataSet)
        radarChart.animateXY(1000, 1000)
        return view
    }
}