public int withoutDoubles(int die1, int die2, boolean noDoubles) {
    if (noDoubles) {
      if (die1 == 6 && die1==die2)
        return (die1+1);
      else if (die1==die2)
        return (die1+die2+1);
      return (die1+die2);
    }
    else
      if (die1!=die2)
        return (die1+die2);
    return (die1+die2);
  }
  