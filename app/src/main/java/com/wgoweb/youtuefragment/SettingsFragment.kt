package com.wgoweb.youtuefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wgoweb.youtuefragment.databinding.FragmentPhotosBinding
import com.wgoweb.youtuefragment.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {

    private var fragmentBinding : FragmentSettingsBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentSettingsBinding.bind(view)
        fragmentBinding = binding

        // Code here
    }

}
