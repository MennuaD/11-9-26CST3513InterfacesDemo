package Disk;

public class CompactDisc implements RetailItem{
    private String title, artist;
    private double retailPrice;

    public CompactDisc(String cdTitle, String cdArtist, double cdPrice){
        title= cdTitle;
        artist = cdArtist;
        retailPrice = cdPrice;
    }

    public String getArtist() {
        return artist;
    }
            //Mennua Netri Herta Davis
    @Override
    public double getRetailPrice() { //required getRetailPrice method from abstract RetailItem
        return retailPrice;
    }

    public String getTitle() {
        return title;
    }
}
