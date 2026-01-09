package Biblioteca;
public class Boolean {
    Int in = new Int();
    /*                                                                                         VERIFICA                                                                                                     */
    public   boolean parImpar(int x){//Método verifica par ou impar
        boolean y = true;
        if(x%2!=0){y=false;}
        return y;
    }
    public      boolean primo(int x){//Método verifica Primo
        boolean primos= true;
        for(int j=1;j<x;j++){
            if(x!=1 || x!=0 && x%j==0){primos=false;}
        }
        return primos;
    }
    public      boolean multiplos(int x, int y){ //Método verifica se 1° n° é multiplo do 2° n°
        boolean divSim= false;
        if(x%y==0){divSim=true;}
        return divSim;
    }
    public      boolean amigos(int x, int y){//Método verifica n°amigos(cada um deles é a soma dos divisores do outro)
        boolean numAmg = false;
        if(in.somDivSemNum(x)==y && in.somDivSemNum(y)==x){numAmg=true;}
        return numAmg;
    }
    public       boolean perfeito(int x, int y){//Método verifica n°perfeito
        boolean pft = false;
        if(in.somDivSemNum(x)==x && in.somDivSemNum(y)==y){pft=true;}
        return pft;
    }
    public       boolean abundante(int x, int y){//Método verica n°abundante(soma maior que a soma dos divisores próprios)
        boolean abund=false;
        if(in.somDivSemNum(x)>x && in.somDivSemNum(y)>y){abund=true;}
        return abund;
    }
    public       boolean deficiente(int x, int y){//Método verifica n° deficiente(soma menor que a soma dos divisores próprios)
        boolean def=false;
        if(in.somDivSemNum(x)<x && in.somDivSemNum(y)<y){def=true;}
        return def;
    }
    /*
    public       boolean CharCont(String w,char y){//Método verifica CharContido
        boolean contido = false;
        for(int i=0;i<w.length();i++){
            if(w.charAt(i)==y){contido=true;}
        }
        return contido;
    }
    public       boolean Palindromo(String x){//Método Palindromo
        boolean palin = false;
        for (int i = 0, j = x.length() - 1; i < j; i++, j--) {
            if (x.charAt(i) == x.charAt(j)) {palin=true;}
        }
        return palin;
    }
    public     void imprimeB(boolean[] vetor){//Método de impressão dos elementos do vetor
        for(int i=0;i< vetor.length;i++){
            System.out.print("["+vetor[i]+"]");
        }
        System.out.println();
        }
     */
}
