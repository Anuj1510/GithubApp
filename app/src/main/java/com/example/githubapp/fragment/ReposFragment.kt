package com.example.githubapp.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.githubapp.R
import com.example.githubapp.databinding.FragmentFollowBinding
import com.example.githubapp.databinding.FragmentReposBinding

class ReposFragment:Fragment(R.layout.fragment_repos) {

    private var _binding: FragmentReposBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}