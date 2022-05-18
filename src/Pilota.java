public class Pilota extends Thread{

    private String nomeP;
    private static int n;
    private Semaforo spogliatoio;
    private int tempo;
    private int Npilota;
    private Gara g1;
    

    public Pilota(Semaforo spogliatoio, String nomeP, Gara g){

        this.spogliatoio=spogliatoio;
        this.nomeP=nomeP;
        Npilota=n;
        //n++;
        this.g1=g;

    }
    
    
    public int getNpilota() {
        return Npilota;
    }
    public void setTempo(long l) {
        this.tempo = (int) l;
    }
    public int getTempo() {
        return tempo;
    }
    public String getNomeP() {
        return nomeP;
    }



    @Override
    public void run() {
        //entra spogliatoio

        spogliatoio.P();

        try {
            Thread.sleep((long)(Math.random() * 1000));//tempo per cambiarsi
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        spogliatoio.V(); //esce spogliatoio

        long start = System.nanoTime();//entra in pista

        for(int i=0; i<15; i++){//15 giri in pista

            try {
                Thread.sleep((long)(Math.random() * 1000));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


        }
        long stop = System.nanoTime();//esce

        setTempo( (stop-start) / 1000000);//cronometro

        g1.addClassifica(this);//salvo tempo

        spogliatoio.P();//entra spogliatoio

        try {//tempo per cambiarsi
            Thread.sleep((long)(Math.random() * 1000));
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        spogliatoio.V(); //esce spogliatoio



        
    }




    
}
