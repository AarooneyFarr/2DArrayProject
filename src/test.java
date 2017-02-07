import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class test extends JFrame
{
    public test()
    {
        ImageIcon aboutIcon = new ImageIcon(getClass().getResource("/grid/view/images/HaiShen.png"));
        ImageIcon addIcon = new ImageIcon("KittyFace.png");
        ImageIcon copyIcon = new ImageIcon("Bertha.png");

        String[] columnNames = {"Picture", "Description"};
        Object[][] data =
        {
            {aboutIcon, "About"},
            {addIcon, "Add"},
            {copyIcon, "Copy"},
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable( model )
        {
            //  Returning the Class of each column will allow different
            //  renderers to be used based on Class
            public Class getColumnClass(int column)
            {
                return getValueAt(0, column).getClass();
            }
        };
        table.setPreferredScrollableViewportSize(table.getPreferredSize());

        JScrollPane scrollPane = new JScrollPane( table );
        getContentPane().add( scrollPane );
    }

    public static void main(String[] args)
    {
        test frame = new test();
        frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible(true);
    }

}