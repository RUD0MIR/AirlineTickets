package com.rud.tickets_search_presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rud.tickets_search_presentation.databinding.FragmentBackButtonBinding

class BackButtonFragment : Fragment() {

    private lateinit var binding: FragmentBackButtonBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBackButtonBinding.inflate(inflater, container, false)

        binding.btnBack.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }

        return binding.root
    }
}