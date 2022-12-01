package hu.petrik.lancoltlista;

public class LancoltLista<T extends Comparable<T>> {
    private ListaElem elso;
    private ListaElem utolso;


    public void hozzaAd(T ertek) {
        ListaElem ujElem = new ListaElem(ertek);
        ujElem.setElozo(this.utolso);
        if (this.elso == null) {
            this.elso = ujElem;
            this.utolso = ujElem;
        } else {
            ujElem.setElozo(this.utolso);
            this.utolso.setKovetkezo(ujElem);
        }
        this.utolso = ujElem;

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListaElem jelenlegiElem = this.elso;
        if (jelenlegiElem != null) {
            builder.append(jelenlegiElem);
            jelenlegiElem = jelenlegiElem.getKovetkezo();
        }
        while (jelenlegiElem != null) {
            builder.append(", ").append(jelenlegiElem);
            jelenlegiElem = jelenlegiElem.getKovetkezo();
        }
        return builder.toString();
    }

    public boolean contain(T keresettElem) {
        boolean containing = false;
        ListaElem jelenlegiElem = this.elso;
        while (jelenlegiElem != null) {
            if (jelenlegiElem.ertek.compareTo(keresettElem) == 0) {
                containing = true;
                break;
            } else {
                jelenlegiElem = jelenlegiElem.getKovetkezo();
            }
        }
        return containing;
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

        @Override
        public String toString() {
            return this.ertek.toString();
        }
    }
}
