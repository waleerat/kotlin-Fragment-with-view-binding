package com.wgoweb.youtuefragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.wgoweb.youtuefragment.databinding.FragmentCameraBinding
import com.wgoweb.youtuefragment.databinding.FragmentPhotosBinding


class PhotosFragment : Fragment() {

    private var fragmentBinding: FragmentPhotosBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_photos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentPhotosBinding.bind(view)
        fragmentBinding = binding


        binding.buttonHome.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.next_action)
        }

        arguments?.let {
            val safeArgs = PhotosFragmentArgs.fromBundle(it)
            binding.textViewNum.text = "Number of photos: ${safeArgs.numOfPhotos}"
        }
    }

}
