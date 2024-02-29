package org.example;

public class Complex {
    int real;
    int img;
    Complex(int real, int img){
        this.real=real;
        this.img=img;
    }

    Complex addition(Complex complex){
        return (new Complex(this.real+complex.real, this.img+complex.img));
    }
    Complex subtraction(Complex complex){
        return (new Complex(this.real-complex.real, this.img-complex.img));
    }
}
