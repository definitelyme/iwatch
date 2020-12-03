package org.health17.iwatch.models.treatment

import org.health17.iwatch.R

class TreatmentTypes (
    var name: String,
    var image: Int = R.drawable.medicine
) {
    companion object{
        val items = arrayListOf(
            TreatmentTypes(
                "Capsules",
                image = R.drawable.pill,
            ),
            TreatmentTypes(
                "Tablets",
                image = R.drawable.pills,
            ),
            TreatmentTypes(
                "Drops",
                image = R.drawable.pill,
            ),
            TreatmentTypes(
                "Creams",
                image = R.drawable.pills,
            ),
            TreatmentTypes(
                "Solubles",
                image = R.drawable.pill,
            ),
            TreatmentTypes(
                "Injection",
                image = R.drawable.pills,
            ),
        )
    }
}


