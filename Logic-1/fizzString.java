public String fizzString(String str) {
    boolean f = str.startsWith("f");
    boolean b = str.endsWith("b");
    
    if(f&&b) return "FizzBuzz";
    else if(f) return "Fizz";
    else if (b) return "Buzz";
    return str;
  }
  