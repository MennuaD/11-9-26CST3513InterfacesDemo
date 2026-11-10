package Disk;

public class DvdMovie implements RetailItem{
    private String title;
    private int runningTime;
    private double retailPrice;

    public DvdMovie(String dvdTitle, int runTime, double dvdPrice){
        title = dvdTitle;
        runningTime = runTime;
        retailPrice = dvdPrice;
    }

    public String getTitle() {
        return title;
    }
            //Mennua Netri Herta Davis
    public int getRunningTime() {
        return runningTime;
    }

    @Override
    public double getRetailPrice() { //required getRetailPrice method from abstract RetailItem
        return retailPrice;
    }

}
