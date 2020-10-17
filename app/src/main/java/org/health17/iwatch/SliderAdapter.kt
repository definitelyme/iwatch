package org.health17.iwatch

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager.widget.PagerAdapter

class SliderAdapter(private val context: Context) : PagerAdapter() {

    private val images  = arrayOf(
        R.drawable.ic_calendar,
        R.drawable.ic_doc_pills,
        R.drawable.ic_doctors,
        R.drawable.ic_pharmacy)



    private val headings = arrayOf(
        context.getString(R.string.on_boarding_heading_1),
        "A whole team of doctors at your disposal",
        "Knowldege is power",
       "Buys Meds Online"
    )

    private val descriptions = arrayOf(
        context.getString(R.string.on_boarding_description_1),
        "Mediplan gives you the opportunity to get free consultation from research done by a big team of qualified doctors",
        "With the correct information regarding your problem you can protect yourself against major diseases",
        "With a number of pharmacy also available you can order your prescriptions directly from the app"
    )

    override fun getCount(): Int {
        return images.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as ConstraintLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layoutInflater = LayoutInflater.from(context).inflate(R.layout.slides_layout,container,false)

        val imageView = layoutInflater.findViewById<ImageView>(R.id.img_slider)
        val textTitle = layoutInflater.findViewById<TextView>(R.id.txt_slider_heading)
        val txtDescription = layoutInflater.findViewById<TextView>(R.id.txt_slider_description)

        imageView.setImageResource(images[position])
        textTitle.setText(headings[position])
        txtDescription.setText(descriptions[position])

        container.addView(layoutInflater)

        return layoutInflater
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as ConstraintLayout)
    }
}