package de.mickinn.zeiterfassung

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.*

class MainActivity : AppCompatActivity() {

    private var buttonStartStopWork: Button? = null
    private var buttonStartStopBreak: Button? = null
    private var textViewStartTime: TextView? = null
    private var textViewEndTime: TextView? = null
    private var textViewDate: TextView? = null
    private var timeFormatter: DateTimeFormatter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonStartStopWork = findViewById(R.id.buttonStartStopWork)
        buttonStartStopBreak = findViewById(R.id.buttonStartStopBreak)
        textViewStartTime = findViewById(R.id.textViewStartTime)
        textViewEndTime = findViewById(R.id.textViewEndTime)
        textViewDate = findViewById(R.id.textViewDate)
        timeFormatter = DateTimeFormatter.ofPattern("HH:mm")

        buttonStartStopWork!!.setOnClickListener{
            textViewStartTime?.setText(LocalTime.now().format(timeFormatter))
        }

        buttonStartStopBreak!!.setOnClickListener{

        }
        setCurrentDate()
    }

    private fun setCurrentDate() {
        var dateFormatter = DateTimeFormatter.ofPattern("dd. MMMM yyyy")
        textViewDate?.setText(LocalDate.now().format(dateFormatter))
    }
}