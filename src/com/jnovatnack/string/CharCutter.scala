package com.jnovatnack.string

object CharCutter {
    implicit def String2CharCutter(str: String): CharCutter = {
        return new CharCutter(str);
    }
}

class CharCutter(str: String) {
    def cut(to_cut:Char):String = {
        return str.filter { c => c != to_cut}.mkString
	}
}


