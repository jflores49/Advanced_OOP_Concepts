public class BingoChip<T, U>{/* TODO
Implement this class.
Use the instructions and check how it is used in Task.java*/

    T col;
    U row;

    public BingoChip(T c, U r){
        this.col = c;
        this.row = r;
    }

    @Override
    public String toString(){
        String s = "Chip:" + col.toString() + "-" + row.toString();
        return s;
    }


}