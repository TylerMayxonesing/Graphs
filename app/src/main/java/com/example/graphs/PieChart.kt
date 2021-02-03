package com.example.graphs

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate

class PieChart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie_chart)

        var pieChart = findViewById<PieChart>(R.id.PieChart)

        var visitors = ArrayList<PieEntry>()
        visitors.add(PieEntry(25.0F, "Pitbull"))
        visitors.add(PieEntry(35.0F, "Terrier"))
        visitors.add(PieEntry(120.0F, "Golden Retriever"))
        visitors.add(PieEntry(20.0F, "Pug"))
        visitors.add(PieEntry(120.0F, "Daschund"))
        visitors.add(PieEntry(20.0F, "Boxer"))
        visitors.add(PieEntry(120.0F, "Grey Hound"))
        visitors.add(PieEntry(20.0F, "Labrador"))

        var dataSet: PieDataSet = PieDataSet(visitors, "Visitors")

        
        dataSet.setValueTextColor(Color.BLACK)
        dataSet.setValueTextSize(16f)

        var data: PieData = PieData(dataSet)

        pieChart.data = data
        pieChart.setBackgroundColor(Color.WHITE)
        pieChart.description.isEnabled = false
        pieChart.legend.isEnabled = false

        pieChart.centerText = "Animals\nData"
        pieChart.setCenterTextSize(20f)

        pieChart.animate()

    }
}