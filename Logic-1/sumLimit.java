public int sumLimit(int a, int b) {
  
    int sumLength = String.valueOf(a+b).length();
    int aLength = String.valueOf(a).length();
    
    if (aLength==sumLength) return (a+b);
    return (a);
  }
  