package com.jnovatnack.string

import scala.collection.mutable.LinkedList

class CharCutter {
    def cut(string:String, to_cut:Char):String = {
        return string.filter { c => c != to_cut}.mkString
	}
}

