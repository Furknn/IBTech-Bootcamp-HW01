package com.bootcamphw.hw02;

public class Test {
    public static void main(String[] args) {
        FunctionDrawer fd = new FunctionDrawer();
        fd.draw(new IdentityFunction(),10,15,100);
        fd.draw(new QuadraticPolynomial(-5,5,100), 0, 1, 100);
        fd.draw(new SinusoidalPolynomial(-Math.PI,Math.PI,100), 0, 1, 100);
    }
}