package com.zrcoy.outsideintddexample.unittests

import com.zrcoy.outsideintddexample.Engine
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.junit.Test

class EngineShould {

    val engine = Engine();

    @Test
    fun turnOn(){
        engine.turnOn();

        assertTrue(engine.isTurnedOn)
    }

    @Test
    fun riseTheTemperatureWhenItTurnsOn(){
        engine.turnOn();

        assertEquals(95, engine.temperature);
    }


}