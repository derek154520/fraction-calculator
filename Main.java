import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the fraction calculator! \nPress the Enter key to get started and q to quit. ");
    Scanner in = new Scanner(System.in);
    Boolean STEVEN = true;
    while(STEVEN == true){
      System.out.print("Enter a Fraction operation: ");
      String answer2 = in.nextLine();
      if(answer2.equals("q")){
        System.out.println("Fraction calculator closed.");
        break;
      }
      if(answer2.indexOf("+") >= 0){
        int par1 = answer2.indexOf("(");
        int par2 = answer2.indexOf(")");
        int slash = answer2.indexOf("/");
        int f1Num = Integer.valueOf(answer2.substring(par1+1,slash));
        int f1Den = Integer.valueOf(answer2.substring((slash+1),par2));
        Fraction f1 = new Fraction(f1Num, f1Den);
        int adding = answer2.indexOf("+");
        int par3 = answer2.substring(adding).indexOf("(");
        int par4 = answer2.substring(adding).indexOf(")");
        int slashTwo = (answer2.substring(adding)).indexOf("/");
        int f2Num = Integer.valueOf(answer2.substring(par3+adding+1,slashTwo+adding));
        int f2Den = Integer.valueOf(answer2.substring((slashTwo+adding+1),par4+adding));
        Fraction f2 = new Fraction(f2Num, f2Den);
        f1.add(f2);
        System.out.println(f1);
      }
      else if(answer2.indexOf("-") >= 0){
        int par1 = answer2.indexOf("(");
        int par2 = answer2.indexOf(")");
        int slash = answer2.indexOf("/");
        int f1Num = Integer.valueOf(answer2.substring(par1+1,slash));
        int f1Den = Integer.valueOf(answer2.substring((slash+1),par2));
        Fraction f1 = new Fraction(f1Num, f1Den);
        int sub = answer2.indexOf("-");
        int par3 = ((answer2.substring(sub)).indexOf("("));
        int par4 = ((answer2.substring(sub)).indexOf(")"));
        int slashTwo = ((answer2.substring(sub)).indexOf("/"));
        int f2Num = Integer.valueOf(answer2.substring(par3+sub+1,slashTwo+sub));
        int f2Den = Integer.valueOf(answer2.substring((slashTwo+sub+1),par4+sub));
        Fraction f2 = new Fraction(f2Num, f2Den);
        f1.subtract(f2);
        System.out.println(f1);
      }
      else if(answer2.indexOf("*") >= 0){
        int par1 = answer2.indexOf("(");
        int par2 = answer2.indexOf(")");
        int slash = answer2.indexOf("/");
        int f1Num = Integer.valueOf(answer2.substring(par1+1,slash));
        int f1Den = Integer.valueOf(answer2.substring((slash+1),par2));
        Fraction f1 = new Fraction(f1Num, f1Den);
        int mul = answer2.indexOf("*");
        int par3 = ((answer2.substring(mul)).indexOf("("));
        int par4 = ((answer2.substring(mul)).indexOf(")"));
        int slashTwo = ((answer2.substring(mul)).indexOf("/"));
        int f2Num = Integer.valueOf(answer2.substring(par3+mul+1,slashTwo+mul));
        int f2Den = Integer.valueOf(answer2.substring((slashTwo+mul+1),par4+mul));
        Fraction f2 = new Fraction(f2Num, f2Den);
        f1.multiply(f2);
        System.out.println(f1);
      }
      else if(answer2.indexOf(")/(") >= 0){
        int par1 = answer2.indexOf("(");
        int par2 = answer2.indexOf(")");
        int slash = answer2.indexOf("/");
        int f1Num = Integer.valueOf(answer2.substring(par1+1,slash));
        int f1Den = Integer.valueOf(answer2.substring((slash+1),par2));
        Fraction f1 = new Fraction(f1Num, f1Den);
        int div = answer2.indexOf(")/"); //5 
        int par3 = ((answer2.substring(div)).indexOf("(")); //2
        int par4 = ((answer2.substring(div+2)).indexOf(")")); //4
        int slashTwo = ((answer2.substring(div+2)).indexOf("/")); //2
        int f2Num = Integer.valueOf(answer2.substring(par3+div+1,slashTwo+div+2));
        int f2Den = Integer.valueOf(answer2.substring((slashTwo+div+3),answer2.length()-1));
        Fraction f2 = new Fraction(f2Num, f2Den);
        f1.divide(f2);
        System.out.println(f1);
      }
      else if(answer2.indexOf("simplify") != -1){
        int par1 = answer2.indexOf("(");
        int par2 = answer2.indexOf(")");
        int slash = answer2.indexOf("/");
        int f1Num = Integer.valueOf(answer2.substring(par1+1,slash));
        int f1Den = Integer.valueOf(answer2.substring((slash+1),par2));
        Fraction f1 = new Fraction(f1Num, f1Den);
        System.out.println(f1);
      }
    }
  }
}