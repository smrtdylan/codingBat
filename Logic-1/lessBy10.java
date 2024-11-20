public boolean lessBy10(int a, int b, int c) {
    int ab = Math.abs(a-b);
    int ac = Math.abs(a-c);
    int bc = Math.abs(b-c);
    
    
    return(ab>=10||ac>=10||bc>=10);
  }
  