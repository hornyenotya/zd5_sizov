package com.example.zd5_sizov

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {
    private val crimeRerository = CrimeRepository.get()
    val crimesListLiveData = crimeRerository.getCrimes()
}