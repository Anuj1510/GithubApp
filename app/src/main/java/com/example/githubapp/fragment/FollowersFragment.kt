package com.example.githubapp.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.githubapp.R
import com.example.githubapp.databinding.FragmentFollowBinding

class FollowersFragment:Fragment(R.layout.fragment_follow) {

    private var _binding: FragmentFollowBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}