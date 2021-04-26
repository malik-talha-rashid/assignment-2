package Hafiz2;

public class Text {
    protected String[] para = new String[1024];
    protected int currentPara = 0;

    public void addPara(String para){
        this.para[currentPara] = para;
        currentPara ++;
    }

    public int getCurrentPara(){
        return this.currentPara;
    }

    public void resetCurrentPar(){
        this.currentPara = 0;
    }
}
