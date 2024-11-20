public int maxMod5(int a, int b) {
    int aMod = a%5;
    int bMod = b%5;
    if (a == b)
      return 0;
      
    else if (aMod== bMod)
      return Math.min(a,b);
    
    return Math.max(a,b);
  }
  