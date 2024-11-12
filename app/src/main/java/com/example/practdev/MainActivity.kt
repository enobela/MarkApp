package com.example.practdev
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private val Modules = arrayOf("MAST5112", "WEDE5020", "IPRG5111", "IMAD5112")
    private val Marks = arrayOf(75, 60, 50, 80)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val totalMark = Marks.sum()

        // total the TextView
        val totalTextView: TextView = findViewById(R.id.MarktotalTextView)
        totalTextView.text = "Total Marks: $totalMark"


        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = marksAdapter(Modules, Marks)


    }
}