package com.example.projectx.fragment

import android.app.Notification
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.projectx.R

class Notifications:Fragment(R.layout.layout_notifications) {

    private lateinit var textview: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textview = view.findViewById(R.id.textView2)

        textview.text = NotificationsArgs.fromBundle(requireArguments()).amount.toString()

    }
}