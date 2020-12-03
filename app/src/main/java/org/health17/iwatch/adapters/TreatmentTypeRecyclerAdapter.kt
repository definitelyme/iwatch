package org.health17.iwatch.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclerview_add_treatement_activity.view.*
import kotlinx.android.synthetic.main.recyclerview_main_activity.view.*
import org.health17.iwatch.R
import org.health17.iwatch.models.treatment.TreatmentTypes
import org.health17.iwatch.utils.inflate

class TreatmentTypeRecyclerAdapter(private val treatmentTypes: ArrayList<TreatmentTypes>) :
    RecyclerView.Adapter<TreatmentTypeRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(parent.inflate(R.layout.recyclerview_add_treatement_activity, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bind(treatmentTypes[position], position)

    override fun getItemCount(): Int = treatmentTypes.size


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var view: View = itemView

        fun bind(treatmentTypes: TreatmentTypes, pos: Int) {

            view.treatment_image.setImageResource(treatmentTypes.image)
        }
    }

}