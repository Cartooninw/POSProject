package Record;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import java.util.ArrayList;
public class DateFilter extends RowFilter {
    private String searchYear;
    private String searchMonth;
    private String searchDay;

    public DateFilter(String searchYear, String searchMonth, String searchDay) {
        this.searchYear = searchYear;
        this.searchMonth = searchMonth;
        this.searchDay = searchDay;
    }

    @Override
    public boolean include(Entry entry) {
        String dateInCell = entry.getStringValue(3);

        // Split the date into year, month, and day
        ArrayList<String> myA = new ArrayList<>();
        
        System.out.println(dateInCell);
        myA.add(dateInCell.split("/")[0]);
        System.out.println(dateInCell.split("/")[0]);
        myA.add(dateInCell.split("/")[1]);
        System.out.println(dateInCell.split("/")[1]);

        myA.add(dateInCell.split("/")[2]);
        System.out.println(dateInCell.split("/")[2]);

//        System.out.println(myA.get(0)+" "+ " "+dateInCell+ " "+myA);//+" "+parts[2] (debug)
        String cellYear = myA.get(0);
        String cellMonth = myA.get(1);
        String cellDay = myA.get(2);

        boolean yearMatches = searchYear.isEmpty() || cellYear.contains(searchYear);
        boolean monthMatches = searchMonth.isEmpty() || cellMonth.contains(searchMonth);
        boolean dayMatches = searchDay.isEmpty() || cellDay.contains(searchDay);

        return yearMatches && monthMatches && dayMatches;
    }
}