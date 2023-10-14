package Chess.board;

public class Coordinate {
    private String algabraicRep;
    private int xcoordinate;
    private int ycoordinate;

    /**
     * Cunstruct a new coordinateinate with it's string rep.
     * @param xcoordinate
     * @param ycoordinate
     */
    public Coordinate(int xcoordinate, int ycoordinate){
        this.xcoordinate = xcoordinate;
        this.ycoordinate = ycoordinate;
        String letter = String.valueOf((char)(xcoordinate + 'A' - 1));
        letter.concat(String.valueOf(ycoordinate));
    }

    /**
     * Get the coordinateinate in algebraic notation
     * @return Algabraic notation of coordinateinate
     */
    public String getAlgabraicRepresentation(){
        return algabraicRep;   
    }
}
