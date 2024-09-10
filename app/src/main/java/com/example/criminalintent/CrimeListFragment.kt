package com.example.criminalintent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.FragmentActivity

private const val TAG = "CrimeListFragment"
class CrimeListFragment: Fragment(){

    private val crimeListViewModel:CrimeListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "Total crimes: ${crimeListViewModel.crimes.size}")
    }}




