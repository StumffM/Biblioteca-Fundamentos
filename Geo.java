package Biblioteca;

public class Geo {
    public    double areaQuadrado (double lado){
        return lado*lado;
    }
    public    double areaRetangulo (double lado1, double lado2){
        return lado1*lado2;
    }
    public    double areaCirculo (double raio){
        return Math.PI*raio*raio;
    }
    public    double areaTriangulo (double base, double altura){
        return (base*altura)/2.;
    }
    public    double volumeParalelepipedo(double lado1, double lado2,double lado3){
        return (lado1*lado2*lado3);
    }
    public    double volumePiramide(double ladobase1,double ladobase2,double altura){
        return (ladobase1*ladobase2*altura)/3.;
    }
    public    double volumeCilindro(double raio,double altura){return (Math.PI*Math.pow(raio,2)*altura);}
    public   double volumeEsfera(double raio){
        return (4*Math.PI*Math.pow(raio,3)/3);
    }
    public   double superficieParalelepipedo(double lado1, double lado2,double lado3){
        return (2*lado1*lado2+2*lado1*lado3+2*lado2*lado3);
    }
    public    double superficiePiramide(double ladobase1,double ladobase2,double altura){
        double alturaLado1 = Math.sqrt( Math.pow(ladobase1/2.,2) + Math.pow(altura,2));
        double alturaLado2 = Math.sqrt( Math.pow(ladobase2/2.,2) + Math.pow(altura,2));
        double areaTriangulo1 = (alturaLado1*ladobase1)/2.;
        double areaTriangulo2 = (alturaLado2*ladobase2)/2.;
        return (2*(areaTriangulo1)+2*(areaTriangulo2)+ ladobase1*ladobase2);
    }
    public   double superficieCilindro(double raio,double altura){
        return (2*Math.PI*Math.pow(raio,2)+2*Math.PI*raio*altura);
    }
    public   double superficieEsfera(double raio){
        return (4*Math.PI*Math.pow(raio,2));
    }
}
