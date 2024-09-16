package com.mun.chartsandgraphs

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.mun.chartsandgraphs.databinding.ActivityMainBinding
import com.mun.chartsandgraphs.fragments.BarChartFragment
import com.mun.chartsandgraphs.fragments.CandleStickChartFragment
import com.mun.chartsandgraphs.fragments.LineChartFragment
import com.mun.chartsandgraphs.fragments.PieChartFragment
import com.mun.chartsandgraphs.fragments.RadarChartFragment
import com.mun.chartsandgraphs.fragments.ScatterChartFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnLineChart.setOnClickListener{
                openFragment(LineChartFragment())
            }

            btnBarChart.setOnClickListener{
                openFragment(BarChartFragment())
            }
            btnPieChart.setOnClickListener{
                openFragment(PieChartFragment())
            }
            btnScatterChart.setOnClickListener{
                openFragment(ScatterChartFragment())
            }
            btnCandleStickChart.setOnClickListener{
                openFragment(CandleStickChartFragment())
            }
            btnRadarChart.setOnClickListener{
                openFragment(RadarChartFragment())
            }

        }

    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .addToBackStack(null)
            .commit()
    }
}