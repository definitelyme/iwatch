package org.health17.iwatch.models.treatment

import org.health17.iwatch.R

class Treatment(
    var name: String,
    var amount: String,
    var image: Int = R.drawable.medicine,
    var frequency: TreatmentFrequency,
    var type: TreatmentType,
    var time: TreatmentTime,
    var duration: TreatmentDuration,
) {
    companion object {
        val items = arrayListOf(
            Treatment(
                "Atenolol",
                "3 pills/day",
                image = R.drawable.pills,
                frequency = TreatmentFrequency.DAILY,
                type = TreatmentType(TYPE.PILL, ""),
                time = TreatmentTime(10, 12),
                duration = TreatmentDuration(1602028800000, 1603411200000),
            ),
            Treatment(
                "Aspirin",
                "10 pills/week",
                frequency = TreatmentFrequency.WEEKLY,
                type = TreatmentType(TYPE.GEL, ""),
                time = TreatmentTime(17, 44),
                duration = TreatmentDuration(1602460800000, 1603670400000),
            ),
            Treatment(
                "Ciprotab",
                "2 pills/month",
                image = R.drawable.pill,
                frequency = TreatmentFrequency.MONTHLY,
                type = TreatmentType(TYPE.PILL, ""),
                time = TreatmentTime(1, 57),
                duration = TreatmentDuration(1601510400000, 1604016000000),
            ),
        )
    }
}