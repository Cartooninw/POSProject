package Record;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;

public class DateFilter extends RowFilter<TableModel, Integer> {
    private String searchYear;
    private String searchMonth;
    private String searchDay;

    public DateFilter(String searchYear, String searchMonth, String searchDay) {
        this.searchYear = searchYear;
        this.searchMonth = searchMonth;
        this.searchDay = searchDay;
    }

    @Override
    public boolean include(Entry<? extends TableModel, ? extends Integer> entry) {
        // Assuming column 0 represents the date in "yy/mm/dd" format
        String dateInCell = entry.getStringValue(3);

        // Split the date into year, month, and day
        String[] parts = dateInCell.split("/");
        System.out.println(parts[0]+" "+parts[1]+" "+parts[2]);
        String cellYear = parts[0];
        String cellMonth = parts[1];
        String cellDay = parts[2];

        // Check if the year, month, and day match the search criteria
        boolean yearMatches = searchYear.isEmpty() || cellYear.equals(searchYear);
        boolean monthMatches = searchMonth.isEmpty() || cellMonth.equals(searchMonth);
        boolean dayMatches = searchDay.isEmpty() || cellDay.equals(searchDay);

        // Return true if all the criteria match
        return yearMatches && monthMatches && dayMatches;
    }
}