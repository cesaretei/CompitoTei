import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Gara {

    private static ArrayList<Pilota> lista;

    public Gara(){

        lista=new ArrayList<Pilota>();
    }
    public static class ComperatoreTempo implements Comparator<Pilota>{

        @Override
        public int compare(Pilota arg0, Pilota arg1) {//ordinamento classifica
            // TODO Auto-generated method stub
            int x=arg0.getTempo()-arg1.getTempo();
            return x;
        }}
    public static void addClassifica(Pilota x){
        //add

        lista.add(x);//aggiunge

        if(lista.size()==8){

        Collections.sort(lista, new Gara.ComperatoreTempo());//ordina
       

        for(int i=0; i<8; i++){//stampa

            System.out.println("Pilota :" +lista.get(i).getNomeP()+"Tempo:"+lista.get(i).getTempo()+"");
            
        }
    }
    
    }


    
}
