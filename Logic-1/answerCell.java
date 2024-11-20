public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  
    if((isMorning && !isMom) || isAsleep) return false;
    
    return true;
    
  }
  