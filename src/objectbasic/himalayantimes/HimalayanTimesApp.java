package objectbasic.himalayantimes;

public class HimalayanTimesApp {
    public static void main(String[] args) {

        Category kathmandu = new Category();
        kathmandu.categoryId = 1;
        kathmandu.categoryName = "Kathmandu";
        kathmandu.order = 1;
        kathmandu.isDeleted = false;
        kathmandu.isDisabled = false;
        kathmandu.createdAt = "2024-02-01";
        kathmandu.updatedAt = "2024-02-01";
        System.out.println(kathmandu);

        Category nepal = new Category();
        nepal.categoryId = 2;
        nepal.categoryName = "Nepal";
        nepal.order = 2;
        nepal.isDeleted = false;
        nepal.isDisabled = false;
        nepal.createdAt = "2024-02-17";
        nepal.updatedAt = "2024-02-17";
        System.out.println(nepal);

        Covid19 covid19=new Covid19();
        covid19.numberOfCovid19cases=54;
        covid19.isVaccineAvailable=true;
        covid19.noOfFatalitiesreportedInNepalIn24Hrs=15;
        covid19.numberOfDeathsWorldwide="6 million";
        System.out.println(covid19);

        CovidConnect covidConnect=new CovidConnect();
        covidConnect.isCovid19HelpDesksAvailable = true;
        covidConnect.isThere24hrCovidHotlineService=true;
        covidConnect.isVaccineAvailableToPersonWIthDisabilities=true;
        System.out.println(covidConnect);

        Category world=new Category();
        world.categoryId = 7;
        world.categoryName = "World";
        world.order = 8;
        world.isDeleted = false;
        world.isDisabled = false;
        world.createdAt = "2024-02-21";
        world.updatedAt = "2024-02-21";
        System.out.println(world);

        Category opinion=new Category();
        opinion.categoryId = 9;
        opinion.categoryName = "Opinion";
        opinion.order = 10;
        opinion.isDeleted = false;
        opinion.isDisabled = false;
        opinion.createdAt = "2024-02-22";
        opinion.updatedAt = "2024-02-22";
        System.out.println(opinion);

        Category business=new Category();
        business.categoryId = 11;
        business.categoryName = "Business";
        business.order = 12;
        business.isDeleted = false;
        business.isDisabled = false;
        business.createdAt = "2024-02-23";
        business.updatedAt = "2024-02-23";
        System.out.println(business);

        Category sports=new Category();
        sports.categoryId = 13;
        sports.categoryName = "Sports";
        sports.order = 14;
        sports.isDeleted = false;
        sports.isDisabled = false;
        sports.createdAt = "2024-02-24";
        sports.updatedAt = "2024-02-24";
        System.out.println(sports);

        Category entertainment=new Category();
        entertainment.categoryId = 15;
        entertainment.categoryName = "Entertainment";
        entertainment.order = 16;
        entertainment.isDeleted = false;
        entertainment.isDisabled = false;
        entertainment.createdAt = "2024-02-25";
        entertainment.updatedAt = "2024-02-25";
        System.out.println(entertainment);

        Category lifestyle=new Category();
        lifestyle.categoryId = 17;
        lifestyle.categoryName = "Lifestyle";
        lifestyle.order = 18;
        lifestyle.isDeleted = false;
        lifestyle.isDisabled = false;
        lifestyle.createdAt = "2024-02-26";
        lifestyle.updatedAt = "2024-02-26";
        System.out.println(lifestyle);

        Category scienceAndTech=new Category();
        scienceAndTech.categoryId = 19;
        scienceAndTech.categoryName = "ScienceAndTech";
        scienceAndTech.order = 20;
        scienceAndTech.isDeleted = false;
        scienceAndTech.isDisabled = false;
        scienceAndTech.createdAt = "2024-02-27";
        scienceAndTech.updatedAt = "2024-02-27";
        System.out.println(scienceAndTech);

        Category blog=new Category();
        blog.categoryId = 21;
        blog.categoryName = "Blog";
        blog.order = 22;
        blog.isDeleted = false;
        blog.isDisabled = false;
        blog.createdAt = "2024-02-28";
        blog.updatedAt = "2024-02-28";
        System.out.println(blog);

        Category environment=new Category();
        environment.categoryId = 23;
        environment.categoryName = "Environment";
        environment.order = 24;
        environment.isDeleted = false;
        environment.isDisabled = false;
        environment.createdAt = "2024-02-29";
        environment.updatedAt = "2024-02-29";
        environment.isEnvironmentWeatherBad= true;
        System.out.println(environment);

        Category health=new Category();
        health.categoryId = 25;
        health.categoryName = "Health";
        health.order = 26;
        health.isDeleted = false;
        health.isDisabled = false;
        health.createdAt = "2024-03-01";
        health.updatedAt = "2024-03-01";
        System.out.println(health);

        Province1 province=new Province1();
        province.provinceAddress="125 williams st";
        province.provinceNumber=25;
        province.isFallUnderProvince=false;
        System.out.println(province);



    }
}