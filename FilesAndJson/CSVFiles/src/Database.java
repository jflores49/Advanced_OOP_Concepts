public class Database {
    private String[] colNames;
    private int numRows;
    private String[][] data;

    public String[] getColNames() {
        return colNames;
    }

    public void setColNames(String[] colNames) {
        this.colNames = colNames;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public Database(String contents) {
/* TODO 
This constructor should take the contents of a CSV file and initialize the memember variables of the Database class.
*/
        String[] file = contents.split("\n");
        this.colNames = file[0].split(",");
        this.numRows = file.length-1;
        this.data = new String[numRows][colNames.length];

        for (int i = 1; i < file.length ; i++) {
            data[i-1] = file[i].split(",");
        }

    }

    public String getValue(String columnName,int row){
/* TODO
This method should return the data contained on row "row" and the column matching  @columname*/
        String val = "";
        for(int i = 0; i<colNames.length; i++){
            if(columnName.equals(colNames[i])){
                val = data[row][i];
            }
        }
        return val;
    }

}


