package com.wgoweb.youtuefragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.wgoweb.youtuefragment.databinding.FragmentCameraBinding
import java.util.*


class CameraFragment : Fragment() {

    private var fragmentBinding: FragmentCameraBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_camera, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentCameraBinding.bind(view)
        fragmentBinding = binding

        //binding.cameraTitle.text = "Testing"

        binding.buttonPhotos.setOnClickListener {
            val random = Random()

            val nextAction = CameraFragmentDirections.nextAction()
            nextAction.setNumOfPhotos(random.nextInt(100))

            Navigation.findNavController(it).navigate(nextAction)
        }
    }

    override fun onDestroyView() {
        // Consider not storing the binding instance in a field
        // if not needed.
        fragmentBinding = null
        super.onDestroyView()
    }
}
