public class App {
    
    protected static Gara g1;
    public static void main(String[] args) throws Exception {

        g1=new Gara();

        
        Semaforo spogliatoio=new Semaforo(2);

        Pilota p1=new Pilota(spogliatoio, "pippo", g1);
        Pilota p2=new Pilota(spogliatoio, "pluto", g1);
        Pilota p3=new Pilota(spogliatoio, "minni", g1);
        Pilota p4=new Pilota(spogliatoio, "giovanni", g1);
        Pilota p5=new Pilota(spogliatoio, "niccolo", g1);
        Pilota p6=new Pilota(spogliatoio, "jessica", g1);
        Pilota p7=new Pilota(spogliatoio, "ilary", g1);
        Pilota p8=new Pilota(spogliatoio, "leonardo", g1);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();


    }
   
}
