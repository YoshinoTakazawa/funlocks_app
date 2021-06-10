package com.example.motyokoiapplication.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "食堂の収容人数　38人/89人"
    }
        private val _text2 = MutableLiveData<String>().apply {
            value = "購買は混雑しています"
        }

    val textview: MutableLiveData<String> =  MutableLiveData("")
    
    val text: LiveData<String> = _text
    val text2: LiveData<String> = _text2

    fun settextview(text:String){
        textview.value =text
    }
}