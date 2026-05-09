class Complex {
    double real, imag;
    Complex(double r, double i) { this.real = r; this.imag = i; }
}

public class AddComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);
        System.out.println((c1.real + c2.real) + " + " + (c1.imag + c2.imag) + "i");
    }
}