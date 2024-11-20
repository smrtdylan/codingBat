public boolean nearTen(int num) {
    //0,1,2,8,9
    
    int convert = num % 10;
    return(convert==0 || convert == 1 || convert == 2 || convert == 8 || convert ==9);
    
  }
  