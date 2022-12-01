package hu.petrik.lancoltlista;

public class LancoltLista<T> {
    private class ListaElem {
        private T ertek;
        private ListaElem kovetkezo;
    }
}
