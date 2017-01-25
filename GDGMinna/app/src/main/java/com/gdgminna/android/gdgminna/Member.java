package com.gdgminna.android.gdgminna;



/**
 * Created by MAGANI on 30/12/2016.
 */

public class Member {

    String name;
    String office;
    String email;
    int photoID;

    Member(String name, String office, String email, int photoID) {
        this.name = name;
        this.office = office;
        this.email = email;
        this.photoID = photoID;
    }

    public String getName() {
        return name;
    }
    public String getOffice() {
        return office;
    }
    public String getEmail() {
        return email;
    }
    public int getPhotoID() {
        return photoID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }
}
