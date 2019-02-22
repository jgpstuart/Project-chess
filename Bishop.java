public class Bishop extends Piece{
    public Bishop(boolean white){
        super(Type.Bishop, white);
    }

    @Override
    public boolean is_valid(Piece[][] board, Cord from, Cord to){
        int dx = abs(from.get_x() - to.get_x());
        int dy = abs(from.get_y() - to.get_y());
        if(dx == dy) return true;
        return false;
    }

    @Override
    public char to_char(){
        return is_white? 'B' : 'b';
    }
}