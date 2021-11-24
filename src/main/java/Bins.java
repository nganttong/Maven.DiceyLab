
public class Bins {
    private Integer[] sums;

    public Bins(Integer startIndex, Integer endIndex) {
        sums = newBin(startIndex, endIndex);
    }

    public void incrementBin(Integer index){
        sums[index]++;
    }

    public Integer[] newBin(Integer startIndex, Integer endIndex) {
        Integer[] bin = new Integer[endIndex+1];
        for (Integer i = 0; i <= endIndex; i++) {
            bin[i] = 0;
        }
        return bin;
    }

    public Integer[] getSums() {
        return sums;
    }

}
