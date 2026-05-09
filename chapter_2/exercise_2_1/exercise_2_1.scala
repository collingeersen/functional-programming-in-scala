@main def printFib(): Unit =
  println(fib(11)) // 34


// Calculates the nth fibonacci value (0, 1, 1, 2, 3, 5, 8...)
def fib(n: Int): Int =
  // Uses an inner function to create a recursive loop
  // This uses tail recursion, so does not create new frames (performs equal to while-loop)
  @annotation.tailrec
  def loop(n: Int, currentValue: Int, nextValue: Int): Int =
    if n <= 1 then currentValue
    else loop(n-1, nextValue, currentValue+nextValue)
  // Calls the inner loop with initial values for current and next
  loop(n, 0, 1)