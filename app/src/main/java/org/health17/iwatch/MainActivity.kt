package org.health17.iwatch

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import org.health17.iwatch.adapters.TreatmentRecyclerAdapter
import org.health17.iwatch.models.treatment.Treatment

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var adapter: TreatmentRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = TreatmentRecyclerAdapter(Treatment.items)
        layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        main_act_treatment_recyclerView.layoutManager = layoutManager
        main_act_treatment_recyclerView.adapter = adapter

        sidebar_menu_button.setOnClickListener { sidebar_nav_drawer.openDrawer(GravityCompat.START) }
        sidebar_navigation_view.setNavigationItemSelectedListener(this)
        sidebar_navigation_view.setCheckedItem(R.id.sidebar_nav_home)
    }

    override fun onBackPressed() {
        if (sidebar_nav_drawer.isDrawerOpen(GravityCompat.START)) {
            sidebar_nav_drawer.closeDrawer(GravityCompat.START)
        }
        super.onBackPressed()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.sidebar_nav_home -> println("Hello Home view")
            R.id.sidebar_nav_calendar -> println("Calendar clicked")
            R.id.sidebar_nav_meds -> println("Programs clicked")
            R.id.sidebar_nav_settings -> println("Settings clicked")
            R.id.sidebar_nav_help -> println("Help button clicked")
            R.id.sidebar_nav_logout -> println("User about to Logout")
        }
        sidebar_nav_drawer.closeDrawer(GravityCompat.START)
        return true
    }
}