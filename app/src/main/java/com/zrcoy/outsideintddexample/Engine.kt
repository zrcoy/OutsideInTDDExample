package com.zrcoy.outsideintddexample

class Engine(
    var temperature : Int = 15,
    var isTurnedOn : Boolean = false,
) {
    fun turnOn(){
        temperature = 95;
        isTurnedOn = true;
    }
}