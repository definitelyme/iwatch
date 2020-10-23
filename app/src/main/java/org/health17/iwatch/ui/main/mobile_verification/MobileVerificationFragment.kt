package org.health17.iwatch.ui.main.mobile_verification

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.health17.iwatch.R

class MobileVerificationFragment : Fragment() {

    companion object {
        fun newInstance() = MobileVerificationFragment()
    }

    private lateinit var viewModel: MobileVerificationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.mobile_verification_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MobileVerificationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}