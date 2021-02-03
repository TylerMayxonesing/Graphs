package com.example.graphs

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.*

class LineChart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_line_chart)

        var lineChart = findViewById<LineChart>(R.id.LineChart)

        var visitors = ArrayList<Entry>()
        visitors.add(Entry(1F, 10F))
        visitors.add(Entry(2F, 15f))
        visitors.add(Entry(3F, 5f))
        visitors.add(Entry(4F, 21f))
        visitors.add(Entry(5F, 13f))
        visitors.add(Entry(6F, 16f))
        visitors.add(Entry(7F, 19f))
        visitors.add(Entry(8F, 8f))

        var dataSet: LineDataSet = LineDataSet(visitors, "Visitors")


        dataSet.setFillAlpha(110)
        dataSet.setValueTextColor(Color.BLACK)
        dataSet.setValueTextSize(16f)

        var data: LineData = LineData(dataSet)

        lineChart.data = data
        lineChart.setBackgroundColor(Color.WHITE)
        lineChart.description.isEnabled = false
        lineChart.legend.isEnabled = false


        lineChart.animate()
    }
}