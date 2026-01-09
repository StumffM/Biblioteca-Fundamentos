package Biblioteca;
public class MetrizInt {
    /*                                                                                   MATRIZ INT                                                                                                   */
    public static void imprimeM(int[][]m){// Método para impressão de uma mriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("["+ m[i][j]+"]" + " " );
            }
            System.out.println();
        }
    }
    public static void imprimeC(char[][]m){// Método para impressão de uma mriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("["+ m[i][j]+"]" + " " );
            }
            System.out.println();
        }
    }
    public   int SomaM(int[][]m){// Método para saber a soma todos os elementos
        int soma=0;
        int tam=m.length;
        for(int i=0;i<tam;i++){
            soma= soma+m[i][i]+m[i][(tam-i)-i];
        }
        return soma;
    }
    public static int contdiagonal(int[][]m){// Método para contar a quantidade de elementos nas diagonais
        int cont=0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                if(i == j){cont++;}
            }
        }
        return cont;
    }
    public    int somaDiagonal1(int[][]m){// Método para saber a soma dos n° da linha diagonal 1
        int soma=0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                if(i == j){soma = soma + m[i][j];}
            }
        }
        return soma;
    }
    public static int[] vetDeDiag1(int[][]m){// Método para formar um vetor com os elementos da diagonal 1
        int [] diag = new int[contdiagonal(m)];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                if(i == j){diag[i]= m[i][j];}
            }
        }
        return diag;
    }
    public    void imprimeDiag1(int[][]m){// Método para a imprimir um vetor com os elementos da diagonal 1 de uma m
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                if(i == j){System.out.print("["+m[i][j]+"]");}
            }
        }
        System.out.println();
    }
    public    int somaDiagonal2(int[][]m){// Método para saber a soma dos n° da linha diagonal 2
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for(int j= m[0].length - 1;j>=0;j--){
                soma = soma + m[i][j];
                i++;
            }
        }
        return soma;
    }
    public     int[] vetDeDiag2(int[][]m){// Método para formar um vetor com os elementos da diagonal2
        int [] diag = new int[contdiagonal(m)];
        for(int i = 0; i < m.length;){
            for(int j = m[0].length - 1; j >=0 ; j--){
                diag[i]= m[i][j];
                i++;
            }
        }
        return diag;
    }
    public    void imprimeDiag2(int[][]m){// Método para a imprimir um vetor com os elementos da diagonal 2 de uma m
        for(int i = 0; i < m.length; i++){
            for(int j = m[0].length;j>=0; j--){
                System.out.print("["+m[i][j]+"]");
                i++;
            }
        }
        System.out.println();
    }
    public    int produtoM(int[][]m){// Método para saber o produto dos elementos
        int prod=0;
        int tam=m.length;
        for(int i=0;i<tam;i++){
            prod= prod*m[i][i]*m[i][(tam-i)-i];
        }
        return prod;
    }
    public   void maiorInd(int[][] m) {
        int maior = 0;
        int maiorI = 0;
        int maiorJ = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (maior < m[i][j]) {
                    maior = m[i][j];
                    maiorI = i;
                    maiorJ = j;
                }
            }
        }
        System.out.println("O maior numero é: " + maior + " e sua posição é: [" + maiorI + "][" + maiorJ + "]");
    }
    public   void menorInd(int[][] m) {
        int menor = m[0][0];
        int menorI = 0;
        int menorJ = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (menor > m[i][j]) {
                    menor = m[i][j];
                    menorI = i;
                    menorJ = j;
                }
            }
        }
        System.out.println("O menor numero é: " + menor + " e sua posição é: [" + menorI + "][" + menorJ + "]");
    }
    public    int divisaoM(int[][]m){// Método para saber a divisao dos elementos
        int prod=0;
        int tam=m.length;
        for(int i=0;i<tam;i++){
            prod= prod*m[i][i]/m[i][(tam-i)-i];
        }
        return prod;
    }
    public     int[] jogaNoVetor(int[][]m){// Método para retornar um vetor a partir de uma matriz
        int x=m.length;
        int y=m[0].length;
        int tam=x*y;
        int[] v=new int[tam];
        int aux = 0;
        for (int i = 0;i<x;i++){
            for(int j = 0;j<y;j++){
                v[aux]=m[i][j];
                aux++;
            }
        }
        return v;
    }
    public    int[][] jogaNam(int[] v, int li, int co){// Método para retornar um matriz a partir de uma vetor
        int [][] m=new int[li][co];
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