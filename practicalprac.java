import java.util.*;
public class QuadraticProgram {
public static void main(String[] args) {
int root1, root2;
Scanner s = new Scanner(System.in);
// read inputs
System.out.print("Enter coefficients " + "(a, b, and c values): ");
int a = s.nextInt();
int b = s.nextInt();
int c = s.nextInt();

// display Quadratic equation
System.out.print("The quadratic equation: ");
System.out.format("%d*x^2 + %d*x + %d = 0\n",a, b, c);

// calculate discriminant
int d = (b*b) - (4*a*c);

// find roots
if(d > 1) {         // both roots are real and different
root1=(-b+(int)Math.sqrt(d))/2*a;
root2=(-b-(int)Math.sqrt(d))/2*a;
System.out.println("Roots are real and different = "+ root1 + ", "+ root2);
}
else if(d == 0) {   // both roots are real and equal
root1=(-b+(int)Math.sqrt(d))/2*a;
root2 = root1;
// display roots
System.out.println("Roots are real and equal = "+ root1+ ", "+ root2);
}
else {
// roots are complex and different
int realPart = -b/(2*a);
int imaginaryPart=(int)Math.sqrt(-d)/(2*a);
System.out.format("root1 = %d + i(%d)\n", realPart, imaginaryPart);
System.out.format("root2 = %d - i(%d)\n",realPart, imaginaryPart);
}
}
}
