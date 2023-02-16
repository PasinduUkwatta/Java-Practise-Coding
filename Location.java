public class Location {
    private String locationID;
    private String  discription;

    public Location(String locationID, String discription) {
        this.locationID = locationID;
        this.discription = discription;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
