public class Fraction{
  private int numerator;
  private int denominator;

  public Fraction(int numerator, int denominator){
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public void setNumerator(int numerator){
    this.numerator = numerator;
  }

  public void setDenominator(int denominator){
    this.denominator = denominator;
  }

  public void add(Fraction f2){
    this.numerator = this.getNumerator() * f2.getDenominator() + f2.getNumerator() * this.getDenominator();
    this.denominator = this.getDenominator() * f2.getDenominator();
  }

  public void subtract(Fraction f2){
    this.numerator = this.getNumerator() * f2.getDenominator() - f2.getNumerator() * this.getDenominator();
    this.denominator = this.getDenominator() * f2.getDenominator();
  }

  public void multiply(Fraction f2){
    this.numerator = this.getNumerator() * f2.getNumerator();
    this.denominator = this.getDenominator() * f2.getDenominator();
  }

  public void divide(Fraction f2){
    this.numerator = this.getNumerator() * f2.getDenominator();
    this.denominator = this.getDenominator() * f2.getNumerator();
  }

  public String toString(){
    return Simplify();
  }
  
  public String Simplify(){
    boolean looping = true;
    boolean isNegative = false;
    
    int num = this.numerator;
    int den = this.denominator;
    
    String numerator = "";
    String denominator = "";

    if ((num < 0 || den < 0) && !(num < 0 && den < 0)){
      isNegative = true;
    }

    num = Math.abs(num);
    den = Math.abs(den);

    if(num > den){
      for(int k = den; k >= 1 && looping; k--){
        if(num % k == 0 && den % k == 0){
          num = num / k;
          den = den / k;
          looping = false;
        }
      } 

      if(isNegative){
        numerator = Integer.toString(num);
        denominator = Integer.toString(den);
        return "-" + numerator + "/" + denominator;
      }
      else if(!isNegative){
        numerator = Integer.toString(num);
        denominator = Integer.toString(den);
        return numerator + "/" + denominator;
      }
    }

    else if(den > num){
      for(int j = num; j >= 1 && looping; j--){
        if(num % j == 0 && den % j == 0){
          num = num / j;
          den = den / j;
          looping = false;
        }
      }
  
      if(isNegative){
        numerator = Integer.toString(num);
        denominator = Integer.toString(den);
        return "-" + numerator + "/" + denominator;
      }
      else if(!isNegative){
        numerator = Integer.toString(num);
        denominator = Integer.toString(den);
        return numerator + "/" + denominator;
      }
    }
    return "1";
  }
}