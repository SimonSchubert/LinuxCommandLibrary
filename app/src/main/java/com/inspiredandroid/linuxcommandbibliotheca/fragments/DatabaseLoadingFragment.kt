package com.inspiredandroid.linuxcommandbibliotheca.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.inspiredandroid.linuxcommandbibliotheca.R

/**
 * Created by Simon Schubert
 */
class DatabaseLoadingFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_database_loading, container, false)
    }
}
