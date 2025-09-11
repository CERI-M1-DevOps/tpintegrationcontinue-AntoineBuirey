package liste;

 class Noeud {
    private Object element;
    private Noeud suivant;

     Noeud(int e, Noeud suivant) {
        element = e;
        this.suivant = suivant;
    }

     Object getElement() {
        return element;
    }

     void setElement(Object element) {
        this.element = element;
    }

     Noeud getSuivant() {
        return suivant;
    }

     void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }

     String toString() {
        return "Noeud(" + element + ")";
    }
}
