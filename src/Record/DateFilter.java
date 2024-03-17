package Record;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import java.util.ArrayList;
public class DateFilter extends RowFilter {
    private String searchYear;
    private String searchMonth;
    private String searchDay;
    private String Username;
    public DateFilter(String searchDay, String searchMonth, String searchYear , String Username ) {
        this.searchYear = searchYear;
        this.searchMonth = searchMonth;
        this.searchDay = searchDay;
        this.Username = Username;
    }

    @Override
    public boolean include(Entry entry) {
        String dateInCell = entry.getStringValue(2);
        String usercell = entry.getStringValue(0);

        // Split the date into year, month, and day
        ArrayList<String> myA = new ArrayList<>();
//        
//        System.out.println(dateInCell);
        myA.add(dateInCell.split("/")[0]);
//        System.out.println(dateInCell.split("/")[0]);
        myA.add(dateInCell.split("/")[1]);
//        System.out.println(dateInCell.split("/")[1]);

        myA.add(dateInCell.split("/")[2]);
//        System.out.println(dateInCell.split("/")[2]);

//        System.out.println(myA.get(0)+" "+ " "+dateInCell+ " "+myA);//+" "+parts[2] (debug)
        String  cellDay= myA.get(0);
        String cellMonth = myA.get(1);
        String  cellYear= myA.get(2);
        System.out.println(cellDay.contains(searchDay));
        
        boolean yearMatches = searchYear.isEmpty() || cellYear.contains(searchYear);
        boolean monthMatches = searchMonth.isEmpty() || cellMonth.contains(searchMonth);
        boolean dayMatches = searchDay.isEmpty() || cellDay.contains(searchDay);
        boolean userMatches = Username.isEmpty() || usercell.contains(Username);

        return yearMatches && monthMatches && dayMatches && userMatches;
    }
}