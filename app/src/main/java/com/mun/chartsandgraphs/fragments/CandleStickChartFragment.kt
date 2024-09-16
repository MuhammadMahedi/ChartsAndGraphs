package com.mun.chartsandgraphs.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.mikephil.charting.charts.CandleStickChart
import com.github.mikephil.charting.data.CandleData
import com.github.mikephil.charting.data.CandleDataSet
import com.github.mikephil.charting.data.CandleEntry
import com.mun.chartsandgraphs.R


class CandleStickChartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_candle_stick_chart, container, false)
        val candleStickChart = view.findViewById<CandleStickChart>(R.id.chart)

        val entries = mutableListOf<CandleEntry>().apply {
            add(CandleEntry(1f, 10f, 6f, 8f, 9f))
            add(CandleEntry(2f, 12f, 7f, 9f, 11f))
            add(CandleEntry(3f, 8f, 7f, 9f, 11f))
            add(CandleEntry(4f, 9f, 7f, 9f, 11f))
            add(CandleEntry(5f, 13f, 7f, 9f, 11f))
        }

        val candleDataSet = CandleDataSet(entries, "CandleStick Data").apply {
            color = Color.BLACK
        }

        candleStickChart.data = CandleData(candleDataSet)
        candleStickChart.animateX(1500)
        return view
    }
}