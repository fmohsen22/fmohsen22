package org.module4.project;

public class DataObject {

    private String fullName;
    private String district;
    private String city;
    private String country;
    private String accountId;
    private String date;
    private boolean active;
    private String ipAddress;
    private int id;

    public DataObject(String fullName,
                      String district,
                      String city,
                      String country,
                      String accountId,
                      String date,
                      boolean active,
                      String ipAddress,
                      int id) {
        this.fullName = fullName;
        this.district = district;
        this.city = city;
        this.country = country;
        this.accountId = accountId;
        this.date = date;
        this.active = active;
        this.ipAddress = ipAddress;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDistrict() {
        return district;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getDate() {
        return date;
    }

    public boolean isActive() {
        return active;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "DataObject{" +
                "fullName='" + fullName + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", accountId='" + accountId + '\'' +
                ", date='" + date + '\'' +
                ", active=" + active +
                ", ipAddress='" + ipAddress + '\'' +
                ", id=" + id +
                '}';
    }
}
