package hu.petrik.lancoltlista;

public class LancoltLista<T> {
    private ListaElem elso;
    private ListaElem utolso;


    public void hozzaAd(T ertek) {
        if (this.elso == null) {
            ListaElem ujElem = new ListaElem(ertek);
            this.elso = ujElem;
            this.utolso = ujElem;
        } else {
            ListaElem ujUtolso = new ListaElem(ertek);
            ujUtolso.setElozo(this.utolso);
            this.utolso.setKovetkezo(ujUtolso);
            this.utolso = ujUtolso;
        }

    }

    private class ListaElem {
        private T ertek;
        private ListaElem kovetkezo;
        private ListaElem elozo;

        public ListaElem(T ertek) {
            this.ertek = ertek;
            this.kovetkezo = null;
            this.elozo = null;
        }

        public ListaElem getKovetkezo() {
            return kovetkezo;
        }

        public void setKovetkezo(ListaElem kovetkezo) {
            this.kovetkezo = kovetkezo;
        }

        public ListaElem getElozo() {
            return elozo;
        }

        public void setElozo(ListaElem elozo) {
            this.elozo = elozo;
        }

        public void hozzaAd(T ertek) {
            if (this.kovetkezo == null) {
                this.kovetkezo = new ListaElem(ertek);
            } else {
                this.kovetkezo.hozzaAd(ertek);
            }
        }
    }
}
