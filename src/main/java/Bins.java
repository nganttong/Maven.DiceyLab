
public class Bins {
    Integer[] bins;

    public Bins(Integer lowIndex, Integer highIndex) {
        this.bins = new Integer[highIndex+1];
        for(int i=lowIndex;i<highIndex+1;i++) bins[i]=0;
    }

    public Integer getBin(Integer bin) {
        return this.bins[bin];
    }

    public void incrementBin(Integer bin) {
        this.bins[bin]++;
    }

}
