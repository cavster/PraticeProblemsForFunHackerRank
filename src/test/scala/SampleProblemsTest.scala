/**
 * Created by Colm on 27/04/2016.
 */
import org.scalatest._
import SampleProblems._
class SampleProblemsTest extends FlatSpec {

  "Most Pop" should "return the most popular character " in {
    assert("a" == mostPop("aab"))
  }
  it should "in the case of a draw return the highest value of the char a over b etc " in {
    assert("a" == mostPop("aabbcdesghtt"))
  }
  "isReverse" should "return 1 if the string is the same front and back" in {
    assert(1 == isReverse("aa"))
  }
  it should "return 0 if this is not case" in {
    assert(0 == isReverse("aax"))
  }

  "scoreString" should "return the score of a string where letters" +
    " are numbers a= 1 b =2 and add them up" in {
    assert(0 == scoreString(""))
    assert(1 == scoreString("a"))
    assert(3 == scoreString("ab"))
  }
  it should "in the case of adjacent letters the words score is doubled for each pair" in {
  assert(8 == scoreString("bb"))
 assert(3786 == scoreString("This word needlessly contains two sets of double letters"))
  }
}

