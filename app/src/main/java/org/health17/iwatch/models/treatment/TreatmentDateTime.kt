package org.health17.iwatch.models.treatment

import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

class TreatmentDuration(var starts: Long, var ends: Long) {
    val cummulative: String get() {
        val duration = ends.minus(starts).let { it1 ->
            TimeUnit.MILLISECONDS.toDays(it1)
        }

        return when {
            duration.toInt() == 1 -> "A day"
            duration.toInt() == 7 -> "1 week"
            duration.toInt() == 14 -> "2 weeks"
            duration.toInt() == 21 -> "3 weeks"
            duration in 27..32 -> "1 month"
            else -> "$duration days"
        }.toString()
    }
}

class TreatmentTime(var hours: Int, var minutes: Int) {
    val  formatted: String get() {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.HOUR_OF_DAY, hours)
        calendar.set(Calendar.MINUTE, minutes)
        return SimpleDateFormat.getTimeInstance(SimpleDateFormat.SHORT).format(calendar.time)
    }
}