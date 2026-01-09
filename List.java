package Biblioteca;
public class List {
    /*                                                              LISTA                                                                             */
    private int TAMANHO = 3;
    private int[] base;
    private int[] baseAux;
    private int proxLivre;

    public List() {
        base = new int[TAMANHO];
        proxLivre = 0;
    }
    public void AumentaLista(){
        baseAux = new int[TAMANHO];
        for (int i = 0; i<TAMANHO;i++){
            baseAux[i] = base[i];
        }
        TAMANHO++;
        base = new int[TAMANHO];
        for (int i = 0; i<TAMANHO-1;i++){
            base[i] = baseAux[i];
        }
    }
    public int size() {
        return proxLivre;
    }
    public int Capacidade() {
        return TAMANHO;
    }
    public boolean InsereInicio(int valor) {
        int aux;
        if (proxLivre == TAMANHO) {
            AumentaLista();
        }
        for(int i = base.length-1;i>0; i--){
            base[i] = base[i-1];
        }
        base[0]=valor;
        proxLivre++;
        return true;
    }
    public boolean InsereFinal(int valor) {
        if (proxLivre == TAMANHO) {
            AumentaLista();
        }
        base[proxLivre] = valor;
        proxLivre++;
        return true;
    }
    public int GetValor(int i) {
        if (i < 0 || i >= proxLivre) {
            return -999999;
        } else {
            return base[i];
        }
    }
    public boolean remove(int indice) {
        if (indice < 0 || indice >= proxLivre) {
            return false;
        } else {
            for (int i = indice; i < proxLivre - 1; i++) {
                base[i] = base[i + 1];
            }
            proxLivre--;
            return true;
        }
    }
    public java.lang.String toString() {
        java.lang.String aux;
        if (proxLivre == 0) {
            return "";
        }
        aux = "[";
        for (int i = 0; i < proxLivre - 1; i++) {
            aux += base[i] + ", ";
        }
        aux += base[proxLivre - 1] + " ]";
        return aux;
    }
}