package com.jnovatnack.string

import org.scalatest.FunSuite
import com.jnovatnack.string.CharCutter.String2CharCutter

class CharCutterSuite extends FunSuite {
    test("Simple cut from CharCutter object") {
        assert(new CharCutter("Foo;Bar").cut(';') == "FooBar")
    }

    test("Implict conversion from string") {
        val s = "John/Novatnack"
        assert(s.cut('/') == "JohnNovatnack")
    }
}
