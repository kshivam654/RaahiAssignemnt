package app.sharma.raahiassignemnt;

public class Trips {
    public  String tripID, userId, locationId;

    public String getTripID() {
        return tripID;
    }

    public void setTripID(String tripID) {
        this.tripID = tripID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public Trips() {
    }

    public Trips(String tripID, String userId, String locationId) {
        this.tripID = tripID;
        this.userId = userId;
        this.locationId = locationId;
    }

}
