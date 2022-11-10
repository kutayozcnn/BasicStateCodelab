package com.example.basicstatecodelab

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class WellnessTask(
    val id:Int,
    val label :String,
    initalChecked: Boolean = false
){
 var checked by mutableStateOf(initalChecked)
}

