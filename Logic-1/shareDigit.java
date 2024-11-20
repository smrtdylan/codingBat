public boolean shareDigit(int a, int b) {
    int a01 = a % 10;
    int a1 = a / 10;
    int b01 = b % 10;
    int b1 = b / 10;
    
    if (a01==b01 || a01==b1 || a1==b01 || a1==b1) return true;
    return false;
    
  }
  