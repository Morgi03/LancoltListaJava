package hu.petrik.lancoltlista;

public class Main {
    public static void main(String[] args) {
        LancoltLista<Integer> lista = new LancoltLista<>();
        int elemekSzama = 1200000;
        int legkisebb = 1;
        int legnagyobb = 420;
        for (int i = 0; i < elemekSzama; i++) {
            int ertek = (int) (Math.random() * (legnagyobb - legkisebb + 1));
            lista.hozzaAd(ertek);
        }

    }
}
