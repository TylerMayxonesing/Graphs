package com.example.graphs

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.*

class BarChart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bar_chart)

        var barChart = findViewById<BarChart>(R.id.BarChart)

        var visitors = ArrayList<BarEntry>()
        visitors.add(BarEntry(1F, 10F))
        visitors.add(BarEntry(2F, 15f))
        visitors.add(BarEntry(3F, 5f))
        visitors.add(BarEntry(4F, 21f))
        visitors.add(BarEntry(5F, 13f))
        visitors.add(BarEntry(6F, 16f))
        visitors.add(BarEntry(7F, 19f))
        visitors.add(BarEntry(8F, 8f))

        var dataSet: BarDataSet = BarDataSet(visitors, "Visitors")


        dataSet.setValueTextColor(Color.BLACK)
        dataSet.setValueTextSize(16f)

        var data: BarData = BarData(dataSet)

        barChart.data = data
        barChart.setBackgroundColor(Color.WHITE)
        barChart.description.isEnabled = false
        barChart.legend.isEnabled = false


        barChart.animate()
    }
}