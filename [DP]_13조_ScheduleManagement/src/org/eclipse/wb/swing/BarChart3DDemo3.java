package org.eclipse.wb.swing;

import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;


public class BarChart3DDemo3 extends ApplicationFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
     * Creates a new demo.
     *
     * @param title  the frame title.
     */
    public BarChart3DDemo3(final String title) {

        super(title);
        
        final CategoryDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);

    }

    // ****************************************************************************
    // * JFREECHART DEVELOPER GUIDE                                               *
    // * The JFreeChart Developer Guide, written by David Gilbert, is available   *
    // * to purchase from Object Refinery Limited:                                *
    // *                                                                          *
    // * http://www.object-refinery.com/jfreechart/guide.html                     *
    // *                                                                          *
    // * Sales are used to provide funding for the JFreeChart project - please    * 
    // * support us so that we can continue developing free software.             *
    // ****************************************************************************
    
    /**
     * Creates a sample dataset.
     *
     * @return a sample dataset.
     */
   private CategoryDataset createDataset() {

        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // (개수, 이름, 그룹)
        
        dataset.addValue(25.0, "Complete", "Checking");   
        dataset.addValue(19.0, "Doing", "Checking");   
        dataset.addValue(41.0, "To Other", "Checking");  
        dataset.addValue(41.0, "Delay", "Checking");   
        dataset.addValue(41.0, "Cancel", "Checking");    
       // dataset.addValue(41.0, "Series 3", "Category 2");    // 그룹을 다르게 하여 다른 영역을 나타낼 수 있다
        return dataset;

    }
    
    /**
     * Creates a chart.
     * 
     * @param dataset  the dataset.
     * 
     * @return The chart.
     */
    private JFreeChart createChart(final CategoryDataset dataset) {
        
        final JFreeChart chart = ChartFactory.createBarChart3D(
            "3D ScoreBoard",      // chart title
            "Checking Number",               // domain axis label
            "Checking Area",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips
            false                     // urls
        );

        final CategoryPlot plot = chart.getCategoryPlot();
        final CategoryAxis axis = plot.getDomainAxis();
        axis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 8.0)
        );
        
        final CategoryItemRenderer renderer = plot.getRenderer();
        renderer.setItemLabelsVisible(true);
        final BarRenderer r = (BarRenderer) renderer;
        r.setMaximumBarWidth(0.05);
        
        return chart;

    }
    
    
    /**
     * Starting point for the demonstration application.
     *
     * @param args  ignored.
     */
    public static void main(final String[] args) {

        final BarChart3DDemo3 demo = new BarChart3DDemo3("3D ScoreBoard");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }
    

    
}
