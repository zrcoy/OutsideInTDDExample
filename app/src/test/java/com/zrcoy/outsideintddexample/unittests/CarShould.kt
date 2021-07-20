package com.zrcoy.outsideintddexample.unittests


import com.zrcoy.outsideintddexample.Car
import com.zrcoy.outsideintddexample.Engine
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.*


class CarShould {
    val engine = mock(Engine::class.java)

    val car = Car(4.5,engine);


    @Test
    fun loseFuelWhenTurnOn(){
        car.turnOn();

        assertEquals(4.0,car.fuel);
    }

    @Test
    fun turnOnItsEngine(){
        car.turnOn();

        verify(engine, times(1)).turnOn()
    }
}