package org.health17.iwatch.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclerview_main_activity.view.*
import org.health17.iwatch.R
import org.health17.iwatch.models.treatment.Treatment
import org.health17.iwatch.utils.inflate

class TreatmentRecyclerAdapter(private val treatments: ArrayList<Treatment>) :
    RecyclerView.Adapter<TreatmentRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(parent.inflate(R.layout.recyclerview_main_activity, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bind(treatments[position], position)

    override fun getItemCount(): Int = treatments.size


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var view: View = itemView

        fun bind(treatment: Treatment, pos: Int) {
            view.treatment_name_id.text = treatment.name
            view.treatment_time_id.text = treatment.time.formatted
            view.treatment_prescription_id.text = treatment.amount
            view.treatment_image_id.setImageResource(treatment.image)
        }
    }
}
