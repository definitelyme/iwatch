package org.health17.iwatch.models.treatment

import java.util.*

enum class TreatmentFrequency {
    CUSTOM,
    HOURLY,
    DAILY,
    WEEKLY,
    BI_WEEKLY,
    MONTHLY,
    BI_MONTHLY,
    YEARLY;

    override fun toString(): String {
        if (this.name.contains("_")) {
            val split = name.split("_")
            return split.reduce { p, c ->
                p.toLowerCase(Locale.getDefault()).capitalize(Locale.getDefault()) +
                        "-" + c.toLowerCase(Locale.getDefault()).capitalize(Locale.getDefault())
            }
        }
        return this.name.toLowerCase(Locale.getDefault()).capitalize(Locale.getDefault())
    }
}