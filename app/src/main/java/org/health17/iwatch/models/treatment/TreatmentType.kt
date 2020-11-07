package org.health17.iwatch.models.treatment

class TreatmentType(var name: TYPE, var description: String = "Treatment description")

enum class TYPE {
    GEL,
    PILL
}
