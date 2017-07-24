public class Word {

    private String word;
    private double sw;  //Starting word probability
    private double fw;  //Finishing word probability

    public Word(String word, double sw, double fw){
        this.setWord(word);
        this.setSw(sw);
        this.setFw(fw);
    }

    private double percentageLimits(double percentage){
        double returnPercentage = 0;
        if(percentage > 1){
            returnPercentage = 1;
        }else if(percentage > 0 && percentage < 1){
            returnPercentage = percentage;
        }
        return returnPercentage;
    }
    
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public double getSw() {
        return sw;
    }

    public void setSw(double sw) {
        this.sw = percentageLimits(sw);
    }

    public double getFw() {
        return fw;
    }

    public void setFw(double fw) {
        this.fw = percentageLimits(fw);
    }
}
