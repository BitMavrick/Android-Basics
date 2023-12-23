package com.github.viewmodelconfchanges

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class ContactsViewModel : ViewModel(){
    var backgroundColor by mutableStateOf(Color.White)
        private set
    fun changeBackGroundColor(){
        backgroundColor = Color.Red
    }
}