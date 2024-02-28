package objectbasic.himalayantimes;

public class Covid19 {
    int numberOfCovid19cases;
    boolean isVaccineAvailable;
    String numberOfDeathsWorldwide;
    int noOfFatalitiesreportedInNepalIn24Hrs;

    @Override
    public String toString() {
        return "Covid19{" +
                "numberOfCovid19cases=" + numberOfCovid19cases +
                ", isVaccineAvailable=" + isVaccineAvailable +
                ", numberOfDeathsWorldwide=" + numberOfDeathsWorldwide +
                ", noOfFatalitiesreportedInNepalIn24Hrs=" + noOfFatalitiesreportedInNepalIn24Hrs +
                '}';
    }
}
