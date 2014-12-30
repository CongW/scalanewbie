/*reverse a list*/
package com.twitter.scalanewbie.reverse

import scala.annotation.tailrec

object Reverse {

	def lreverse(orig: List[Int]): List[Int] = {
		@tailrec
		def lreverseHelper(reminder: List[Int], acc: List[Int]): List[Int]=
		{
			if (reminder.isEmpty) {
				acc
			}
			else {
				lreverseHelper(reminder.tail, reminder.head::acc)
			}
		}

		lreverseHelper(orig, Nil)
	}

	def main(args: Array[String]): Unit = {
		val l1 = List(1, -2, 3, -4, 5)
		println("Original = " + l1)
		println("Reversed = " + lreverse(l1))
	}
}

