package Biblioteca;
public class VetorInt {
    /*                                                                                   VETOR INT                                                                                                         */
    public     void imprime(int[] vetor){//Método de impressão dos elementos do vetor
        for(int i=0;i< vetor.length;i++){
            System.out.print("["+vetor[i]+"]");
        }
        System.out.println();
    }
    public   int maiorInd(int[]vet,int[]vet1){//Método de maior indice entre dois vetores
        int maior=vet.length;
        if(vet.length<vet1.length){maior=vet1.length;}
        return maior;
    }
    public     int[] somV(int[]vet, int[]vet1){//Método de Soma
        int[] vet2=new int[vet.length];
        for(int i=0;i< vet.length;i++){
            vet2[i]=vet[i]+vet1[i];
        }
        return vet2;
    }
    public static int SomDelemento(int[]vet){
        int soma=0;
        for(int i=0;i<vet.length;i++){
            soma= soma+vet[i];
        }
        return soma;
    }
    public static int ProdDelementos(int[]vet){
        int soma=1;
        for(int i=0;i<vet.length;i++){
            soma= soma*vet[i];
        }
        return soma;
    }
    public     int[] subV(int[] vet, int[] vet1){//Método de Subtração
        int[] vet2=new int[vet.length];
        for(int i=0;i< vet.length;i++){
            vet2[i]=vet[i]-vet1[i];
        }
        return vet2;
    }
    public     int menorV(int[] vet){//Método para saber o menor elemento do vetor
        int menor=vet[0];
        for(int i=1;i< vet.length;i++){
            if (menor > vet[i]){menor=vet[i];}
        }
        return menor;
    }
    public     int maiorV(int[] vet){//Método de maior elemento do vetor
        int maior=vet[0];
        for(int i=1;i< vet.length;i++){
            if (maior < vet[i]) { maior=vet[i];}
        }
        return maior;
    }
    public       int divDVet(int[]vet1,int[]vet2){//Método de divisão dos elementos dos vetores
        int[]vet3=new int[vet1.length];
        for(int i=0;i<vet3.length;i++){
            vet3[i]=vet1[i]/vet2[i];
        }
        return vet3[vet1.length];
    }
    public       int multDVet(int[]vet1,int x){//Método de multiplicação de vetores
        int[]vet2=new int[vet1.length];
        for(int i=0;i<vet2.length;i++){
            vet2[i]=vet1[i]*x;
        }
        return vet2[vet1.length];
    }
    public static int verifica( int x, int[] v, int tam){//Método de verificação de elementos semelhantes no vetor
        int aux=0;
        for(int i=0;i<tam;i++){if (v[i]==x){aux=1;}}
        return aux;
    }
    public    int uniao(int[]vet, int []vet1){//Método de união dos elementos dos vetores
        int x= vet.length+vet1.length;
        int []vet2= new int[x];
        int aux=0;
        for(int i=0; i<vet.length;i++){vet2[aux++]=vet[i];}
        for(int i=0; i<vet1.length;i++){if (0==verifica(vet1[i],vet2,aux)){vet2[aux++]=vet1[i];}}
        return vet2[x];
    }
    public     int inter(int []vet, int[]vet1){//Método de intercção de elementos dos vetores
        int x= (maiorInd(vet,vet1));
        int []vet2= new int[x];
        for(int i=0; i<vet.length; i++){
            for(int j=0; j<vet1.length; j++){
                if(vet[i] == vet1[j]){vet2[i] = vet[i];}
            }
        }
        return vet2[x];
    }
    public     int produtoEscalar(int[]vet,int[]vet1){//Método de produto escalar
        int x= maiorInd(vet,vet1);
        int prodEsc= 0;
        for(int i=0;i<x;i++){
            prodEsc=(vet[i]*vet1[i])+prodEsc;
        }
        return prodEsc;
    }
}