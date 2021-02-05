package com.aks.report.service;

/**
 * Average Salary for Industry: Information Technology (IT) Services.
 *
 * @author Jorge Alfonso García Espinosa
 * @since 1.8
 * @version 12/03/2017
 */
public class ITServiceAverageSalary {

    private final String job;
    private final double averageSalary;

    /**
     * Constructor.
     *
     * @param job Job.
     * @param averageSalary Average salary.
     */
    ITServiceAverageSalary(String job, double averageSalary) {
        this.job = job;
        this.averageSalary = averageSalary;
    }

    /**
     * Gets the job name.
     *
     * @return Job name.
     */
    public String getJob() {
        return job;
    }

    /**
     * Gets the average salary.
     *
     * @return Average salary.
     */
    public double getAverageSalary() {
        return averageSalary;
    }

}
