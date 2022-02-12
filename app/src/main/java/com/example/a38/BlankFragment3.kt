package com.example.a38

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class BlankFragment3 : Fragment() {
    // ...
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View=inflater.inflate(R.layout.fragment3, container, false)
        // ============= Button обработчик, способ записи 1
        view.findViewById<Button>(R.id.button3_5).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_blankFragment3_to_mainActivity2))
        view.findViewById<Button>(R.id.button3_6).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_blankFragment3_to_blankFragment6))
        view.findViewById<Button>(R.id.button3_back).setOnClickListener(View.OnClickListener { view -> view.findNavController().popBackStack()})
        return view
    }
// ...
}