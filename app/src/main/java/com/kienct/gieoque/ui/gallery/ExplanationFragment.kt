package com.kienct.gieoque.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.kienct.gieoque.R

class ExplanationFragment : Fragment() {

    private lateinit var explanationViewModel: ExplanationViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        explanationViewModel =
                ViewModelProvider(this).get(ExplanationViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_explanation, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        explanationViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}