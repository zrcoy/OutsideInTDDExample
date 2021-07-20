package com.zrcoy.outsideintddexample.acceptancetests

import com.zrcoy.outsideintddexample.Car
import com.zrcoy.outsideintddexample.Engine
import junit.framework.Assert.assertEquals
import org.junit.Test

class CarFeature {
    val engine = Engine();
    val car = Car(5.0,engine);

    @Test
    fun carIsLosingFuelWhenTurnOn(){
        car.turnOn();

        assertEquals(4.5,car.fuel);
    }

    @Test
    fun carIsTurningOnItsEngineAndIncreasingTemperature(){
        car.turnOn();

        assertEquals(true,car.engine.isTurnedOn);
        assertEquals(95,car.engine.temperature)
    }
}