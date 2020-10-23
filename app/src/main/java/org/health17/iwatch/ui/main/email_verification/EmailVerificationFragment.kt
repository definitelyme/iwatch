package org.health17.iwatch.ui.main.email_verification

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.health17.iwatch.R

class EmailVerificationFragment : Fragment() {

    companion object {
        fun newInstance() = EmailVerificationFragment()
    }

    private lateinit var viewModel: EmailVerificationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.email_verification_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(EmailVerificationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}