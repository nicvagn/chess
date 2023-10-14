/**
 * @Position.java    V0.1    2023-10-13 by Nicolas Vaagen
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

import Chess.pieces.Piece;

/**
 * a position on the chessboard
 */
public class Position {
    private boolean occupied;
    private Piece piece;
    private Coordinate coordinate;

    /**
     * construct an empty position
     * @param coordinateinates
     */
    public Position(Coordinate coordinate){
        occupied = false;
        this.coordinate = coordinate;
    }

    /**
     * construct a position with a piece in it
     * @param piece
     * @param coordinate
     */
    public Position(Piece piece, Coordinate coordinate){
        occupied = true;
        this.coordinate = coordinate;
    }

    public boolean isOccupied(){
        return occupied;
    }

    public Coordinate getcoordinate(){
        return coordinate;
    }

    public Piece getPiece(){
        return piece;
    }

    public void setPiece(Piece piece){
        this.piece = piece;
    }
}
