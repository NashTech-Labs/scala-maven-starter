package edu.knoldus

import org.scalatest.funsuite.AnyFunSuite


/**
 * Unit test for simple App.
 */
class HelloTest extends AnyFunSuite {

    test("print hello World") {
        val result = Hello.printHello()
        assert(result == "Hello World")
    }

}
