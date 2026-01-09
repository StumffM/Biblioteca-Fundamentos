package Biblioteca;
public class Int {
    /*                                                                                         NUMEROS                                                                                                      */
    public int soma(int x, int y){ //retorna soma
        int s = x+y;
        return s;
    }
    public int subtracao(int x, int y){ //retorna subtração
        int s = x-y;
        return s;
    }
    public int multiplicao(int x, int y){ //retorna multiplicação
        int s = x*y;
        return s;
    }
    public int divisao(int x, int y){ //retorna divisão
        int s = x/y;
        return s;
    }
    public int maior3(int a, int b, int c){ //retorna o maior número entre 3 valores
        int aux = a;
        int[]v= new int[3];
        v[0]=a;
        v[1]=b;
        v[2]=c;
        for(int i=0;i<v.length;i++){
            if(aux<v[i]){aux=v[i];}
        }
        return aux;
    }
    public int menor3(int a, int b, int c){ //retorna o menor número entre 3 valores
        int aux = a;
        int[]v= new int[3];
        v[0]=a;
        v[1]=b;
        v[2]=c;
        for(int i=0;i<v.length;i++){
            if(aux>v[i]){aux=v[i];}
        }
        return aux;
    }
    public     int maior2(int x1, int x2){//Método que retorna o maior numero entre os n°
        int x= x1;
        if(x1<x2){x=x2;}
        return x;
    }
    public     int menor2(int x1, int x2){//Método que retorna o menor numero entre os n°
        int x= x1;
        if(x1>x2){x=x2;}
        return x;
    }
    public      int somaDiv(int num){//Método Soma do Divisores
        int soma=0;
        for(int i = 1;i<=num;i++){
            if(num%i==0){soma=soma+i;}
        }
        return soma;
    }
    public     int somDivSemNum(int x){//Método Sem o n°
        int soma=0;
        for(int i = 1;i<x;i++){
            if(x%i==0){soma=soma+i;}
        }
        return soma;
    }
    public       int numFatorial(int x){//Método de fatorial!
        int numF=1;
        for(int i = x; i>=1;i--){
            numF = numF*i;
        }
        return numF;
    }
}