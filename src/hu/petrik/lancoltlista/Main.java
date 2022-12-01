package hu.petrik.lancoltlista;

public class Main {
    public static void main(String[] args) {
        LancoltLista<Integer> lista = new LancoltLista<>();
        int elemekSzama = 10;
        int legkisebb = 1;
        int legnagyobb = 8;
        for (int i = 0; i < elemekSzama; i++) {
            int ertek = (int) (Math.random() * (legnagyobb - legkisebb + 1));
            lista.hozzaAd(ertek);
        }
        System.out.println(lista);
        System.out.println(lista.contain(4));

    }
}
