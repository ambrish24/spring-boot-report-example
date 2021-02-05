package com.aks.report.service;

public class IDEUsage {

    private final String ide;
    private final Double percentage;

    /**
     * Constructor.
     *
     * @param ide Name of the IDE.
     * @param percent Percentage of use.
     */
    IDEUsage(String ide, Double percent) {
        this.ide = ide;
        this.percentage = percent;
    }

    /**
     * Gets the name of the IDE.
     *
     * @return Name.
     */
    public String getIde() {
        return ide;
    }

    /**
     * Gets the percentage of use.
     *
     * @return Percentage.
     */
    public Double getPercentage() {
        return percentage;
    }

}
