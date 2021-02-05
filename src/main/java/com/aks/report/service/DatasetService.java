package com.aks.report.service;

import java.util.ArrayList;
import java.util.List;

import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.springframework.stereotype.Service;

@Service
public class DatasetService {

    /**
     * Gets the "TOP IDE index" from © Pierre Carbonnelle, 2016.
     * <a href="http://pypl.github.io/IDE.html">http://pypl.github.io/IDE.html</a>
     *
     * @return List of the IDE's and their percentage of use.
     */
    public List<IDEUsage> getTopIDEIndex() {
        List<IDEUsage> list = new ArrayList<>();

        list.add(new IDEUsage("Eclipse", 26.08));
        list.add(new IDEUsage("Visual Studio", 20.14));
        list.add(new IDEUsage("Android Studio", 9.61));
        list.add(new IDEUsage("Vim", 8.31));
        list.add(new IDEUsage("Xcode", 5.54));
        list.add(new IDEUsage("IntelliJ", 4.5));
        list.add(new IDEUsage("Xamarin", 3.8));
        list.add(new IDEUsage("NetBeans", 3.78));
        list.add(new IDEUsage("Sublime Text", 3.15));
        list.add(new IDEUsage("Komodo", 3.15));
        list.add(new IDEUsage("Visual Studio Code", 2.54));
        list.add(new IDEUsage("pyCharm", 1.95));
        list.add(new IDEUsage("Emacs", 1.59));
        list.add(new IDEUsage("Code::Blocks", 1.41));
        list.add(new IDEUsage("PhpStorm", 1.3));
        list.add(new IDEUsage("Light Table", 1.08));
        list.add(new IDEUsage("Cloud9", 0.65));
        list.add(new IDEUsage("Qt Creator", 0.29));
        list.add(new IDEUsage("geany", 0.2));
        list.add(new IDEUsage("JDeveloper", 0.18));
        list.add(new IDEUsage("MonoDevelop", 0.15));
        list.add(new IDEUsage("Aptana", 0.13));
        list.add(new IDEUsage("RubyMine", 0.13));
        list.add(new IDEUsage("JCreator", 0.05));
        list.add(new IDEUsage("Coda 2", 0.05));
        list.add(new IDEUsage("SharpDevelop", 0.05));
        list.add(new IDEUsage("Monkey Studio", 0.04));
        list.add(new IDEUsage("Eric Python", 0.04));
        list.add(new IDEUsage("Julia Studio", 0.03));
        list.add(new IDEUsage("Zend Studio", 0.02));
        list.add(new IDEUsage("DrJava", 0.02));
        list.add(new IDEUsage("SlickEdit", 0.02));

        return list;
    }

    /**
     * Gets the Average Salary for Information Technology (IT) Services Industry
     * in the USA.
     * <a href="https://www.payscale.com/research/US/Industry=Information_Technology_(IT)_Services/Salary">https://www.payscale.com/research/US/Industry=Information_Technology_(IT)_Services/Salary</a>
     *
     * @return List of the IT jobs and their average salary for the USA
     * industry.
     */
    public List<ITServiceAverageSalary> getsAverageSalaryFoITServices() {
        List<ITServiceAverageSalary> list = new ArrayList<>();

        list.add(new ITServiceAverageSalary("Software Engineer", 81496));
        list.add(new ITServiceAverageSalary("Project Manager, Information Technology", 87488));
        list.add(new ITServiceAverageSalary("Network Engineer", 66526));
        list.add(new ITServiceAverageSalary("Project Manager, (General)", 79219));
        list.add(new ITServiceAverageSalary("Information Technology Manager", 90877));

        return list;
    }

    /**
     * Gets the history of the number of users of Internet worldwide, year by
     * year from 1995.
     * <a href="http://www.internetworldstats.com/emarketing.htm">http://www.internetworldstats.com/emarketing.htm</a>
     *
     * @return List of every year from 1995 with their number of users of
     * Internet (in millions).
     */
    public List<InternetUserNumberHistory> getsHistoryOfInternetUsers() {
        List<InternetUserNumberHistory> list = new ArrayList<>();

        list.add(new InternetUserNumberHistory(1995, 16));
        list.add(new InternetUserNumberHistory(1996, 36));
        list.add(new InternetUserNumberHistory(1997, 70));
        list.add(new InternetUserNumberHistory(1998, 147));
        list.add(new InternetUserNumberHistory(1999, 248));
        list.add(new InternetUserNumberHistory(2000, 361));
        list.add(new InternetUserNumberHistory(2001, 513));
        list.add(new InternetUserNumberHistory(2002, 587));
        list.add(new InternetUserNumberHistory(2003, 719));
        list.add(new InternetUserNumberHistory(2004, 817));
        list.add(new InternetUserNumberHistory(2005, 1018));
        list.add(new InternetUserNumberHistory(2006, 1093));
        list.add(new InternetUserNumberHistory(2007, 1319));
        list.add(new InternetUserNumberHistory(2008, 1574));
        list.add(new InternetUserNumberHistory(2009, 1802));
        list.add(new InternetUserNumberHistory(2010, 1971));
        list.add(new InternetUserNumberHistory(2011, 2267));
        list.add(new InternetUserNumberHistory(2012, 2497));
        list.add(new InternetUserNumberHistory(2013, 2802));
        list.add(new InternetUserNumberHistory(2014, 3079));
        list.add(new InternetUserNumberHistory(2015, 3366));
        list.add(new InternetUserNumberHistory(2016, 3696));
        list.add(new InternetUserNumberHistory(2017, 3885));

        return list;
    }

    public XYDataset createXYDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();

        //Boys (Age,weight) series
        XYSeries series1 = new XYSeries("Boys");
        series1.add(1, 72.9);
        series1.add(2, 81.6);
        series1.add(3, 88.9);
        series1.add(4, 96);
        series1.add(5, 102.1);
        series1.add(6, 108.5);
        series1.add(7, 113.9);
        series1.add(8, 119.3);
        series1.add(9, 123.8);
        series1.add(10, 124.4);

        dataset.addSeries(series1);

        //Girls (Age,weight) series
        XYSeries series2 = new XYSeries("Girls");
        series2.add(1, 72.5);
        series2.add(2, 80.1);
        series2.add(3, 87.2);
        series2.add(4, 94.5);
        series2.add(5, 101.4);
        series2.add(6, 107.4);
        series2.add(7, 112.8);
        series2.add(8, 118.2);
        series2.add(9, 122.9);
        series2.add(10, 123.4);

        dataset.addSeries(series2);

        return dataset;
    }

    public XYDataset createXYSplineData() {
        XYSeries xyseries = new XYSeries("Series 1");
        xyseries.add(2D, 56.270000000000003D);
        xyseries.add(3D, 41.32D);
        xyseries.add(4D, 31.449999999999999D);
        xyseries.add(5D, 30.050000000000001D);
        xyseries.add(6D, 24.690000000000001D);
        xyseries.add(7D, 19.780000000000001D);
        xyseries.add(8D, 20.940000000000001D);
        xyseries.add(9D, 16.73D);
        xyseries.add(10D, 14.210000000000001D);
        xyseries.add(11D, 12.44D);
        XYSeriesCollection xyseriescollection = new XYSeriesCollection(xyseries);
        XYSeries xyseries1 = new XYSeries("Series 2");
        xyseries1.add(11D, 56.270000000000003D);
        xyseries1.add(10D, 41.32D);
        xyseries1.add(9D, 31.449999999999999D);
        xyseries1.add(8D, 30.050000000000001D);
        xyseries1.add(7D, 24.690000000000001D);
        xyseries1.add(6D, 19.780000000000001D);
        xyseries1.add(5D, 20.940000000000001D);
        xyseries1.add(4D, 16.73D);
        xyseries1.add(3D, 14.210000000000001D);
        xyseries1.add(2D, 12.44D);
        xyseriescollection.addSeries(xyseries1);

        return xyseriescollection;
    }
}
