package org.health17.iwatch.fragments.email_verification

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.mobile_verification_fragment.*
import org.health17.iwatch.R
import org.health17.iwatch.VerificationActivity

class EmailVerificationFragment : Fragment() {

    companion object {
        fun newInstance() = EmailVerificationFragment()
    }

    private lateinit var viewModel: EmailVerificationViewModel
    private lateinit var activity: AppCompatActivity

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        get_code_button_id.setOnClickListener {
            activity.startActivity(
                Intent(
                    activity,
                    VerificationActivity::class.java
                )
            )
        }
    }

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

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity = getActivity() as AppCompatActivity
    }
}