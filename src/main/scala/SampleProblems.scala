/**
 * Created by Colm on 27/04/2016.
 */
object SampleProblems {


  def mostPop(input:String):String = {
    val charToOccurances = input.groupBy(_.toString).map(c => c._1 -> c._2.length).toMap
    val LargestValue = charToOccurances.valuesIterator.max
    val charThatHaveMostOccurances = charToOccurances.filter(_._2 == LargestValue)
    charThatHaveMostOccurances.keysIterator.min
  }

  def isReverse(input:String):Int ={
    if(input == input.reverse)1
    else 0
  }

  def scoreString(input:String):Int = {
   val alfabet  = " abcdefghijklmnopqrstuvwxyz"
    val inputAsNum = input.map(c => alfabet.indexOf(c.toLower))
    val elementsAsTwo = input.sliding(2).toList
     val numOfAjentElements =elementsAsTwo.count(b => b.head == b(1))
    if(numOfAjentElements > 0)
      inputAsNum.sum * 2 * numOfAjentElements
    else inputAsNum.sum
  }

}
