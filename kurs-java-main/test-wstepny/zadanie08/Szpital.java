package zadanie08;

import java.util.ArrayList;
import java.util.List;

public class Szpital {
    private List<Osoba> listaOsob;

    public Szpital() {
        this.listaOsob = new ArrayList<>();
    }

    public void addOsoba (Osoba o1){
        if (listaOsob==null||!listaOsob.contains(o1)){
            listaOsob.add(o1);
        }
    }
}
