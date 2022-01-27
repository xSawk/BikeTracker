package com.luk.biketracker.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import kotlinx.android.synthetic.main.fragment_wlc.*
import luk.biketracker.R

class WelcomeFragment : Fragment(R.layout.fragment_wlc) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        b1.setOnClickListener {
            findNavController().navigate(R.id.action_setupFragment_to_settingsFragment)
        }
    }

}