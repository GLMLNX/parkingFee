public class feeCount {

    public String calcAll(int hE, int mE, int hS, int mS){
        int h,m,valor;
        int procE=hE*60+mE;
        int procS=hS*60+mS;
        int time=procS-procE;
        if (time<0){
            time+=(60*24);
        }
            h= (time/60);
            m= (time%60);
        switch (h){
            case 0:valor=0;
                break;
            case 1:valor=4;
                break;
            case 2:valor=6;
                break;
            default:valor=6;
                for (int i = 0; i < h-2; i++) {
                    valor+=1;
                }
                break;
        }
            return "Time elapsed "+h+"h:"+m+"m e R$"+valor;
    }
}
