package com.example.retrafit2.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrafit2.databinding.FragmentHomeBinding
import com.example.retrafit2.view.adapter.DataAdapter
import com.example.retrafit2.viewModel.DataViewMadelFactory
import com.example.retrafit2.viewModel.DataViewModel
import com.example.retrafit2.viewModel.app.DataBaseApplication
import kotlinx.coroutines.*


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    lateinit var adapter: DataAdapter

 /*private val viewModel: DataViewModel by viewModels {
        DataViewMadelFactory((requireContext().applicationContext as DataBaseApplication).database.dataDao())
}*/
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
val viewModel=ViewModelProvider(this)[DataViewModel::class.java]
        lifecycleScope.launch {
delay(3000)
        viewModel.insert()
        }
        viewModel.getAllItem().observe(viewLifecycleOwner) {

            adapter = DataAdapter()
            binding.rec.adapter = adapter
            binding.rec.layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            adapter.submitList(it)
        }
    }
}
