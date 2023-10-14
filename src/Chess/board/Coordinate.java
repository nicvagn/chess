/**
 * @Coordinate.java    V0.1    2023-10-13 by Nicolas Vaagen
 * 
 *  This program is free software: you can redistribute it and/or modify it under the terms of
 *  the GNU General Public License as published by the Free Software Foundation, either
 *  version 3 of the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT ANY 
 *  WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 *  A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License along with this
 *  program. If not, see <https://www.gnu.org/licenses/>. 
 */

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
