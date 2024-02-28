package objectbasic.himalayantimes;

public class Province1 {
    int provinceNumber;
    String provinceAddress;
    boolean isFallUnderProvince;

    @Override
    public String toString() {
        return "Province1{" +
                "provinceNumber=" + provinceNumber +
                ", provinceAddress='" + provinceAddress + '\'' +
                ", isFallUnderProvince=" + isFallUnderProvince +
                '}';
    }
}
