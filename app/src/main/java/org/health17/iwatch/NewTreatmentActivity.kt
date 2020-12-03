package org.health17.iwatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_new_treatment.*
import org.health17.iwatch.adapters.TreatmentRecyclerAdapter
import org.health17.iwatch.adapters.TreatmentTypeRecyclerAdapter
import org.health17.iwatch.models.treatment.Treatment
import org.health17.iwatch.models.treatment.TreatmentTypes

class NewTreatmentActivity : AppCompatActivity() {

    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var adapter: TreatmentTypeRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_treatment)

        adapter = TreatmentTypeRecyclerAdapter(TreatmentTypes.items)
        layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        treatment_icons_recyclerView.layoutManager = layoutManager
        treatment_icons_recyclerView.adapter = adapter

        add_new_treatment_btn.setOnClickListener {
            showSuccessDialog();
        }
        backImageView.setOnClickListener {
            finish()
        }
    }

    private fun showSuccessDialog() {
        val builder = MaterialAlertDialogBuilder(this)
        val inflater = this.layoutInflater
        val dialogView = inflater.inflate(R.layout.new_treatement_created_dialog, null)

        builder.setView(dialogView)
        val dialog = builder.create()
        dialog.show()
    }
}