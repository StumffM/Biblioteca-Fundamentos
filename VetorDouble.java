package Biblioteca;
public class VetorDouble {
    /*                                                                                   VETOR DOUBLE                                                                                                      */
    public     void imprime(double[] vetor){//Método de impressão dos elementos do vetor
        for(int i=0;i< vetor.length;i++){
            System.out.print("["+vetor[i]+"]");
        }
        System.out.println();
    }
    public   int maiorInd(double[]vet,double[]vet1){//Método de maior indice entre dois vetores
        int maior=vet.length;
        if(vet.length<vet1.length){maior=vet1.length;}
        return maior;
    }
    public     double[] somV(double[]vet, double[]vet1){//Método de Soma
        double[] vet2=new double[vet.length];
        for(int i=0;i< vet.length;i++){
            vet2[i]=vet[i]+vet1[i];
        }
        return vet2;
    }
    public static double SomDelemento(double[]vet){
        double soma=0;
        for(int i=0;i<vet.length;i++){
            soma= soma+vet[i];
        }
        return soma;
    }
    public static double ProdDelementos(double[]vet){
        double soma=1;
        for(int i=0;i<vet.length;i++){
            soma= soma*vet[i];
        }
        return soma;
    }
    public     double[] subV(double[] vet, double[] vet1){//Método de Subtração
        double[] vet2=new double[vet.length];
        for(int i=0;i< vet.length;i++){
            vet2[i]=vet[i]-vet1[i];
        }
        return vet2;
    }
    public     double menorV(double[] vet){//Método para saber o menor elemento do vetor
        double menor=vet[0];
        for(int i=1;i< vet.length;i++){
            if (menor > vet[i]){menor=vet[i];}
        }
        return menor;
    }
    public     double maiorV(double[] vet){//Método de maior elemento do vetor
        double maior=vet[0];
        for(int i=1;i< vet.length;i++){
            if (maior < vet[i]) { maior=vet[i];}
        }
        return maior;
    }
    public       double divDVet(double[]vet1,double[]vet2){//Método de divisão dos elementos dos vetores
        double[]vet3=new double[vet1.length];
        for(int i=0;i<vet3.length;i++){
            vet3[i]=vet1[i]/vet2[i];
        }
        return vet3[vet1.length];
    }
    public       double multDVet(double[]vet1,double x){//Método de multiplicação de vetores
        double[]vet2=new double[vet1.length];
        for(int i=0;i<vet2.length;i++){
            vet2[i]=vet1[i]*x;
        }
        return vet2[vet1.length];
    }
    public static double verifica( double x, double[] vetor, double tam){//Método de verificação de elementos semelhantes no vetor
        double aux=0;
        for(int i=0;i<tam;i++){if (vetor[i]==x){aux=1;}}
        return aux;
    }
    public    double uniao(double[]vet, double []vet1){//Método de união dos elementos dos vetores
        int x= vet.length+vet1.length;
        double []vet2= new double[x];
        int aux=0;
        for(int i=0; i<vet.length;i++){vet2[aux++]=vet[i];}
        for(int i=0; i<vet1.length;i++){if (0==verifica(vet1[i],vet2,aux)){vet2[aux++]=vet1[i];}}
        return vet2[x];
    }
    public     double intersecção(double []vet, double[]vet1){//Método de intersecção de elementos dos vetores
        int x= (maiorInd(vet,vet1));
        double []vet2= new double[x];
        for(int i=0; i<vet.length; i++){
            for(int j=0; j<vet1.length; j++){
                if(vet[i] == vet1[j]){vet2[i] = vet[i];}
            }
        }
        return vet2[x];
    }
    public     double produtoEscalar(double[]vet,double[]vet1){//Método de produto escalar
        double x= maiorInd(vet,vet1);
        double prodEsc= 0;
        for(int i=0;i<x;i++){
            prodEsc=(vet[i]*vet1[i])+prodEsc;
        }
        return prodEsc;
    }
}