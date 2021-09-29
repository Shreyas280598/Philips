package com.example.philips

import junit.framework.TestCase

class CalculatorTest : TestCase(){
    fun test_add(){
        var calc = Calculator()
        var expected = 30
        var actual = calc.add(10,20)
        assertEquals(expected,actual)
    }

    fun test_minus(){
        var calc = Calculator()
        var expected = 10
        var actual = calc.minus(30,10)
        assertEquals(expected,actual)
    }

    fun test_mult(){
        var calc = Calculator()
        var expected = 300
        var actual = calc.mult(30,10)
        assertEquals(expected,actual)
    }
}