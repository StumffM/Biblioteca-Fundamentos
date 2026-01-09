package Biblioteca;
public class MatrizDouble {
    /*                                                                                   MATRIZ DOUBLE                                                                                                */
    public static void imprimeM(double[][]m){// Método para impressão de uma mriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("["+ m[i][j]+"]" + " " );
            }
            System.out.println();
        }
    }
    public   double SomaM(double[][]m){// Método para saber a soma todos os elementos
        double soma=0;
        int tam=m.length;
        for(int i=0;i<tam;i++){
            soma= soma+m[i][i]+m[i][(tam-i)-i];
        }
        return soma;
    }
    public static int contdiagonal(double[][]m){// Método para contar a quantidade de elementos nas diagonais
        int cont=0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                if(i == j){cont++;}
            }
        }
        return cont;
    }
    public    double somaDiagonal1(double[][]m){// Método para saber a soma dos n° da linha diagonal 1
        double soma=0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                if(i == j){soma = soma + m[i][j];}
            }
        }
        return soma;
    }
    public static double[] vetDeDiag1(double[][]m){// Método para formar um vetor com os elementos da diagonal 1
        double [] diag = new double[contdiagonal(m)];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                if(i == j){diag[i]= m[i][j];}
            }
        }
        return diag;
    }
    public    void imprimeDiag1(double[][]m){// Método para a imprimir um vetor com os elementos da diagonal 1 de uma m
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                if(i == j){System.out.print("["+m[i][j]+"]");}
            }
        }
        System.out.println();
    }
    public    double somaDiagonal2(double[][]m){// Método para saber a soma dos n° da linha diagonal 2
        double soma = 0;
        for (int i = 0; i < m.length; i++) {
            for(int j= m[0].length - 1;j>=0;j--){
                soma = soma + m[i][j];
                i++;
            }
        }
        return soma;
    }
    public     double[] vetDeDiag2(double[][]m){// Método para formar um vetor com os elementos da diagonal2
        double [] diag = new double[contdiagonal(m)];
        for(int i = 0; i < m.length;){
            for(int j = m[0].length - 1; j >=0 ; j--){
                diag[i]= m[i][j];
                i++;
            }
        }
        return diag;
    }
    public    void imprimeDiag2(double[][]m){// Método para a imprimir um vetor com os elementos da diagonal 2 de uma m
        for(int i = 0; i < m.length; i++){
            for(int j = m[0].length;j>=0; j--){
                System.out.print("["+m[i][j]+"]");
                i++;
            }
        }
        System.out.println();
    }
    public    double produtoM(double[][]m){// Método para saber o produto dos elementos
        double prod=0;
        int tam=m.length;
        for(int i=0;i<tam;i++){
            prod= prod*m[i][i]*m[i][(tam-i)-i];
        }
        return prod;
    }
    public    double divisaoM(double[][]m){// Método para saber a divisao dos elementos
        double prod=0;
        int tam=m.length;
        for(int i=0;i<tam;i++){
            prod= prod*m[i][i]/m[i][(tam-i)-i];
        }
        return prod;
    }
    public     double[] jogaNoVetor(double[][]m){// Método para retornar um vetor a partir de uma matriz
        int x=m.length;
        int y=m[0].length;
        int tam=x*y;
        double[] v=new double[tam];
        int aux = 0;
        for (int i = 0;i<x;i++){
            for(int j = 0;j<y;j++){
                v[aux]=m[i][j];
                aux++;
            }
        }
        return v;
    }
    public    double[][] jogaNam(double[] v, int li, int co){// Método para retornar um matriz a partir de uma vetor
        double [][] m=new double[li][co];
        int aux=0;
        for (int i = 0;i<li;i++){
            for(int j = 0;j<co;j++){
                m[i][j] = v[aux];
                aux++;
            }
        }
        return m;
    }
}
