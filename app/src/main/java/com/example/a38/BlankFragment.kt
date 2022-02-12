package com.example.a38

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController

class BlankFragment : Fragment() {
    // ...
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View=inflater.inflate(R.layout.fragment1, container, false)
        // ============= Button обработчик, способ записи 1
        var btn: Button =view.findViewById(R.id.button1_2)
        btn.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if (p0 != null) {
                    p0.findNavController().navigate(R.id.action_blankFragment_to_blankFragment2)
                }
            }
        })
        // ============= Button3 обработчик, способ записи 2
        var btn3:Button=view.findViewById(R.id.button1_3)
        btn3.setOnClickListener(View.OnClickListener { view -> view.findNavController().navigate(R.id.action_blankFragment_to_blankFragment3) })
        // ============= Button5 обработчик, способ записи 3
        view.findViewById<Button>(R.id.button1_4).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_blankFragment_to_blankFragment4))
        return view
    }
// ...
}