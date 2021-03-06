package sk.upjs.ics.paz1c.debilnicek;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

class ZoznamUloh {

    private List<Uloha> ulohy = new ArrayList<>();

    public ZoznamUloh() {
        Uloha uloha1 = new Uloha();
        uloha1.setPopis("Naprogramovat test");
        uloha1.setTermin(new Date((2016-1900),Calendar.SEPTEMBER,28));
        ulohy.add(uloha1);
        
        Uloha uloha2 = new Uloha();
        uloha2.setPopis("Naprogramovat GUI");
        uloha2.setTermin(new Date((2016-1900),Calendar.OCTOBER,5));
        ulohy.add(uloha2);
    }
    
    List<Uloha> dajUlohy() {
        return ulohy;
    }

    void pridaj(Uloha uloha) {
        ulohy.add(uloha);
    }

    List<Uloha> dajUlohyDoTerminu(Date date) {
       List<Uloha> ulohyDoTerminu = new ArrayList<>();
       for(Uloha uloha : ulohy){
           if(uloha.getTermin().before(date)){
               ulohyDoTerminu.add(uloha);
           }
       }
       return ulohyDoTerminu;
    }
    
}
