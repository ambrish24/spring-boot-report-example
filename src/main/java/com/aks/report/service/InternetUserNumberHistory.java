package com.aks.report.service;

public class InternetUserNumberHistory {

    private final int year;
    private final int millionsOfUsers;

    /**
     * Constructor.
     *
     * @param year Year.
     * @param millionsOfUsers Number of users, in millions.
     */
    InternetUserNumberHistory(int year, int millionsOfUsers) {
        this.year = year;
        this.millionsOfUsers = millionsOfUsers;
    }

    /**
     * Gets the year.
     *
     * @return Year.
     */
    public int getYear() {
        return year;
    }

    /**
     * Gets the number of users, in millions.
     *
     * @return Millions of users.
     */
    public int getMillionsOfUsers() {
        return millionsOfUsers;
    }

}
