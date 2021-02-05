package com.aks.report.controller.rest;

import com.aks.report.service.DatasetService;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Locale;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.ui.RectangleInsets;
import org.jfree.chart.ui.TextAnchor;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.xy.XYDataset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/chart")
public class ChartRestService {

    @Autowired
    private DatasetService datasetService;

    /**
     * Build a PNG image of a pie chart example about the "Top IDE index".
     *
     * @param width Width of the image.
     * @param height Height of the image.
     * @param response HTTP Response.
     * @throws IOException
     */
    @RequestMapping(path = "/pie/{width}/{height}", method = RequestMethod.GET)
    public void buildPieChart(@PathVariable("width") int width, @PathVariable("height") int height, HttpServletResponse response) throws IOException {
        final PieDataset pieDataset = buildTopIDEIndexPieDataset();
        final String title = "Top IDE index";
        final boolean legend = true;
        final boolean tooltips = true;

        final PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("{0} = {2}");

        final JFreeChart pieChart3D = ChartFactory.createPieChart3D(title, pieDataset, legend, tooltips, Locale.getDefault());
        final PiePlot3D piePlot3D = (PiePlot3D) pieChart3D.getPlot();
        piePlot3D.setLabelGenerator(labelGenerator);

        writeChartAsPNGImage(pieChart3D, width, height, response);
    }

    /**
     * Build a PNG image of a bar chart example about average salary for the IT
     * industry in USA.
     *
     * @param width Width of the image.
     * @param height Height of the image.
     * @param response HTTP Response.
     * @throws IOException
     */
    @RequestMapping(path = "/bar/{width}/{height}", method = RequestMethod.GET)
    public void buildBarChart(@PathVariable("width") int width, @PathVariable("height") int height, HttpServletResponse response) throws IOException {
        final DefaultCategoryDataset categoryDataset = buildITServiceAverageSalaryCategoryDataset();
        final String title = "Average Salary for Information Technology (IT) Services Industry";
        final String categoryAxisLabel = "Jobs";
        final String valueAxisLabel = "Average Salary (USD)";
        final boolean legend = true;
        final boolean tooltips = true;
        final boolean urls = true;

        final JFreeChart barChart = ChartFactory.createBarChart(title, categoryAxisLabel, valueAxisLabel, categoryDataset, PlotOrientation.VERTICAL, legend, tooltips, urls);
        final CategoryPlot categoryPlot = (CategoryPlot) barChart.getPlot();
        final CategoryItemRenderer categoryItemRenderer = categoryPlot.getRenderer();
        categoryItemRenderer.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        categoryItemRenderer.setDefaultItemLabelsVisible(true);

        final ItemLabelPosition position = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.TOP_CENTER);
        categoryItemRenderer.setDefaultPositiveItemLabelPosition(position);

        writeChartAsPNGImage(barChart, width, height, response);
    }

    /**
     * Build a PNG image of a line chart example about the history of number of
     * users (in millions) of Internet worldwide from 1995.
     *
     * @param width Width of the image.
     * @param height Height of the image.
     * @param response HTTP Response.
     * @throws IOException
     */
    @RequestMapping(path = "/line/{width}/{height}", method = RequestMethod.GET)
    public void buildLineChart(@PathVariable("width") int width, @PathVariable("height") int height, HttpServletResponse response) throws IOException {
        final DefaultCategoryDataset categoryDataset = buildHistoryOfInternetUsersCategoryDataset();
        final String title = "History of users of the Internet from 1995";
        final String categoryAxisLabel = "Year";
        final String valueAxisLabel = "Num. of Users (in millions)";
        final boolean legend = true;
        final boolean tooltips = true;
        final boolean urls = true;

        final JFreeChart lineChart = ChartFactory.createLineChart(title, categoryAxisLabel, valueAxisLabel, categoryDataset, PlotOrientation.VERTICAL, legend, tooltips, urls);
        final CategoryPlot categoryPlot = (CategoryPlot) lineChart.getPlot();
        final CategoryItemRenderer categoryItemRenderer = categoryPlot.getRenderer();
        categoryItemRenderer.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        categoryItemRenderer.setDefaultItemLabelsVisible(true);

        final ItemLabelPosition position = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.TOP_LEFT);
        categoryItemRenderer.setDefaultPositiveItemLabelPosition(position);

        writeChartAsPNGImage(lineChart, width, height, response);
    }

    @RequestMapping(path = "/spline/{width}/{height}", method = RequestMethod.GET)
    public void buildSplineChart(@PathVariable("width") int width, @PathVariable("height") int height, HttpServletResponse response) throws IOException {

        // Create dataset
        XYDataset dataset = datasetService.createXYSplineData();

        NumberAxis numberaxis = new NumberAxis("X");
        numberaxis.setAutoRangeIncludesZero(false);
        NumberAxis numberaxis1 = new NumberAxis("Y");
        numberaxis1.setAutoRangeIncludesZero(false);
        XYSplineRenderer xysplinerenderer = new XYSplineRenderer();
        XYPlot xyplot = new XYPlot(dataset, numberaxis, numberaxis1, xysplinerenderer);
        xyplot.setBackgroundPaint(Color.lightGray);
        xyplot.setDomainGridlinePaint(Color.white);
        xyplot.setRangeGridlinePaint(Color.white);
        xyplot.setAxisOffset(new RectangleInsets(4D, 4D, 4D, 4D));
        JFreeChart jfreechart = new JFreeChart("XYSplineRenderer", JFreeChart.DEFAULT_TITLE_FONT, xyplot, true);

        writeChartAsPNGImage(jfreechart, width, height, response);
    }

    @RequestMapping(path = "/scattered/{width}/{height}", method = RequestMethod.GET)
    public void buildScatteredChart(@PathVariable("width") int width, @PathVariable("height") int height, HttpServletResponse response) throws IOException {
        // Create dataset
        XYDataset dataset = datasetService.createXYDataset();
        final String title = "Boys VS Girls weight comparison chart";
        final String categoryAxisLabel = "Year";
        final String valueAxisLabel = "Num. of Users (in millions)";
        final boolean legend = true;
        final boolean tooltips = true;
        final boolean urls = true;

        // Create chart
        JFreeChart scatterChart = ChartFactory.createScatterPlot(title,"X-Axis", "Y-Axis", dataset);


        //Changes background color
        XYPlot plot = (XYPlot)scatterChart.getPlot();
        plot.setBackgroundPaint(Color.WHITE);

        writeChartAsPNGImage(scatterChart, width, height, response);
    }

    private PieDataset buildTopIDEIndexPieDataset() {
        final DefaultPieDataset pieDataset = new DefaultPieDataset();
        datasetService.getTopIDEIndex().forEach((usage) -> pieDataset.setValue(usage.getIde(), usage.getPercentage()));

        return pieDataset;
    }

    private DefaultCategoryDataset buildITServiceAverageSalaryCategoryDataset() {
        final Comparable<String> rowKey = "USA";
        final DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        datasetService.getsAverageSalaryFoITServices().forEach((averageSalary) -> categoryDataset.setValue(averageSalary.getAverageSalary(), rowKey, averageSalary.getJob()));

        return categoryDataset;
    }

    private DefaultCategoryDataset buildHistoryOfInternetUsersCategoryDataset() {
        final Comparable<String> rowKey = "Num. of Users";
        final DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        datasetService.getsHistoryOfInternetUsers().forEach((history) -> categoryDataset.setValue(history.getMillionsOfUsers(), rowKey, Integer.valueOf(history.getYear())));

        return categoryDataset;
    }

    private void writeChartAsPNGImage(final JFreeChart chart, final int width, final int height, HttpServletResponse response) throws IOException {
        final BufferedImage bufferedImage = chart.createBufferedImage(width, height);

        response.setContentType(MediaType.IMAGE_PNG_VALUE);
        ChartUtils.writeBufferedImageAsPNG(response.getOutputStream(), bufferedImage);
    }
}
