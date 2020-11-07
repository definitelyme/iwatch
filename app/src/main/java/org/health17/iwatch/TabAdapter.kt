package org.health17.iwatch

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import org.health17.iwatch.fragments.email_verification.EmailVerificationFragment
import org.health17.iwatch.fragments.mobile_verification.MobileVerificationFragment

class TabAdapter(private val mContext: Context, fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                MobileVerificationFragment()
            }
            1 -> {
                EmailVerificationFragment()
            }
            else -> MobileVerificationFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> {
                mContext.getString(R.string.mobile)

            }
            1 -> {
                mContext.getString(R.string.email)
            }
            else -> mContext.getString(R.string.mobile)
        }
    }
}