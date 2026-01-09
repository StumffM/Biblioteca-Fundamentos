package Biblioteca;
public class String {
    /*                                                                                            STRING                                                                                                    */
    public     void imprimeS(java.lang.String[] vetor){//Método de impressão dos elementos do vetor
        for(int i=0;i< vetor.length;i++){
            System.out.print("["+vetor[i]+"]");
        }
        System.out.println();
    }
    public       int ContaChar(java.lang.String w, char y){//Método quantidade de Char
        int cont = 0;
        for(int i=0;i<w.length();i++){
            if(w.charAt(i)==y){cont++;}
        }
        return cont;
    }
    public       void TemString(java.lang.String x, java.lang.String y){ //Método verifica String Contido
        System.out.println(x.contains(y) ? "true" : "false");
    }
    public java.lang.String MenorWord(java.lang.String x, java.lang.String y){//Método Menor String
        java.lang.String menor=y;
        if(y.length()>x.length()){menor=x;}
        return menor;
    }
    public java.lang.String MaiorWord(java.lang.String x, java.lang.String y){//Método Maior String
        java.lang.String maior=y;
        if(y.length()<x.length()){maior=x;}
        return maior;
    }
}