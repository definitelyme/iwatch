package org.health17.iwatch

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_on_boarding.*

class OnBoardingActivity : AppCompatActivity() {
    private var currentPosition = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_on_boarding)

        vp_on_boarding.apply {
            adapter = SliderAdapter(context)
            addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
                override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
                ) {

                }

                override fun onPageSelected(position: Int) {
                    addDots(position)

                    currentPosition = position
                    when (position) {
                        0 -> btn_get_started.visibility = View.INVISIBLE
                        1 -> btn_get_started.visibility = View.INVISIBLE
                        2 -> btn_get_started.visibility = View.INVISIBLE
                        else -> {
                            val animation =
                                AnimationUtils.loadAnimation(context, R.anim.bottom_anim)
                            btn_get_started.animation = animation
                            btn_get_started.visibility = View.VISIBLE

                        }

                    }
                }

                override fun onPageScrollStateChanged(state: Int) {

                }

            })
        }

        addDots(0)


    }

    private fun addDots(position: Int) {

        val dots: Array<TextView?> = arrayOfNulls(4)

        dots_layout.removeAllViews()

        for (i in dots.indices) {
            dots[i] = TextView(this)
            dots[i]?.text = Html.fromHtml("&#8226;")
            dots[i]?.textSize = 35F

            dots_layout.addView(dots[i])
        }

        if (dots.isNotEmpty()) {
            dots[position]?.setTextColor(resources.getColor(R.color.colorPrimaryDark))
        }


    }


    fun skip(view: View) {
        startActivity(Intent(applicationContext, LoginActivity::class.java))
        finish()
    }

    fun next(view: View) {
        vp_on_boarding.currentItem = currentPosition + 1
    }
}