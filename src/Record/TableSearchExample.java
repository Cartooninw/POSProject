import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.Document;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TableSearchExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table Search Example");
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{{1, "John", 25}, {2, "Jane", 30}, {3, "Bob", 22}},
                new Object[]{"ID", "Name", "Age"}
        );

        JTable table = new JTable(model);
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(model);
        table.setRowSorter(rowSorter);

        JTextField searchField = new JTextField();
        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateFilter();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateFilter();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateFilter();
            }

            private void updateFilter() {
                String text = searchField.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    try {
                        int columnIndex = 1; 
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, columnIndex));
                    } catch (java.util.regex.PatternSyntaxException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(searchField);
        frame.add(new JScrollPane(table));

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}