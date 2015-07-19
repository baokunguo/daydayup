/*case and match*/

/* function combined */

val fComposeG = f _ compose g _

fComposeG(" yay ")
f(" yag ")

val fAndThenG = f _ andThen g _

fAndThenG(" yag ")


def f(s: String) : String = {
  " f( " + s + " ) "
}

def g(s: String) : String = {
  " g( " + s + " ) "
}

/*Partial Function*/
val one: PartialFunction[Int,String] = {case 1 => "One shit "}

one.isDefinedAt(1)
one.isDefinedAt(2)
one(1)


