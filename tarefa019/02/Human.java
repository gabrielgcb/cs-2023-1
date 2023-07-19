package org.example._02;

class Human {
    private String name;
    private String age;
    private String country;
    private String city;
    private String street;
    private String house;
    private String quarter;

    public String getFullAddress() {
        return country +
                ", " +
                city +
                ", " +
                street +
                ", " +
                house +
                " " +
                quarter;
    }
}
