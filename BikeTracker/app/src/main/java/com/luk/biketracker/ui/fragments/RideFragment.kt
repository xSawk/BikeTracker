package com.luk.biketracker.ui.fragments

import android.Manifest
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager

import com.luk.biketracker.adapters.RideAdapter
import com.luk.biketracker.other.Constants.REQUEST_CODE_LOCATION_PERMISSION
import com.luk.biketracker.other.TrackingUtility
import com.luk.biketracker.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_ride.*
import luk.biketracker.R
import pub.devrel.easypermissions.AppSettingsDialog
import pub.devrel.easypermissions.EasyPermissions

@AndroidEntryPoint
class RideFragment : Fragment(R.layout.fragment_ride) {

    private val viewModel: MainViewModel by viewModels()

    private lateinit var rideAdapter: RideAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecycleView()

        viewModel.runsSortedbydata.observe(viewLifecycleOwner, Observer {
            rideAdapter.submitList(it)
        })

    }

    private fun setupRecycleView() = rvRuns.apply {
        rideAdapter = RideAdapter()
        adapter = rideAdapter
        layoutManager = LinearLayoutManager(requireContext())

    }


}






