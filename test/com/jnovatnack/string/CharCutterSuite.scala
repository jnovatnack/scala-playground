package com.jnovatnack.string

import org.scalatest.FunSuite

class CharCutterSuite extends FunSuite {
    test("Simple cut from object") {
        assert(new CharCutter().cut("Foo;Bar", ';') == "FooBar")
    }
}
