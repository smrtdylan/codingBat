public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    if(equalOk==false) return ((a<b && b<c && c>a));
    return ((a<=b && b<=c && c>=a));
  }
  