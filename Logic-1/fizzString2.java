public String fizzString2(int n) {
    int f = n%3;
    int b = n%5;
    
    if (f==0 && b==0)
      return "FizzBuzz!";
    else if (f==0)
      return "Fizz!";
    else if (b==0)
      return "Buzz!";
    else
      return n + "!";
  }
  