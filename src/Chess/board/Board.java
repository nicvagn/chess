/*
 * @Board.java    V0.1    2023-10-13 by Nicolas Vaagen
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

import Chess.pieces.Bishop;
import Chess.pieces.King;
import Chess.pieces.Knight;
import Chess.pieces.Piece;
import Chess.pieces.Queen;
import Chess.pieces.Rook;
import Chess.pieces.Pawn;

/**
 * a Chess Board
 */
public class Board {
	private Position[][] board; //the internal rep. of the board

	/**
	 * Initialize the board for a standard game of chess
	 */
	public void initStandardChess(){
		//white pieces
		Rook a1 = new Rook(true);
		Knight b1 = new Knight(true);
		Bishop c1 = new Bishop(true);
		King d1 = new King(true);
		Queen e1 = new Queen(true);
		Bishop f1 = new Bishop(true);
		Knight g1 = new Knight(true);
		Rook h1 = new Rook(true);

		Pawn a2 = new Pawn(true);
		Pawn b2 = new Pawn(true);
		Pawn c2 = new Pawn(true);
		Pawn d2 = new Pawn(true);
		Pawn e2 = new Pawn(true);
		Pawn f2 = new Pawn(true);
		Pawn g2 = new Pawn(true);
		Pawn h2 = new Pawn(true);

		//black pieces
		Rook a8 = new Rook(false);
		Knight b8 = new Knight(false);
		Bishop c8 = new Bishop(false);
		King d8 = new King(false);
		Queen e8 = new Queen(false);
		Bishop f8 = new Bishop(false);
		Knight g8 = new Knight(false);
		Rook h8 = new Rook(false);

		Pawn a7 = new Pawn(false);
		Pawn b7 = new Pawn(false);
		Pawn c7 = new Pawn(false);
		Pawn d7 = new Pawn(false);
		Pawn e7 = new Pawn(false);
		Pawn f7 = new Pawn(false);
		Pawn g7 = new Pawn(false);
		Pawn h7 = new Pawn(false);

		//setup board
		//1st row
		board[0][0] = new Position(a1, new Coordinate(0, 0));
		board[1][0] = new Position(b1, new Coordinate(1, 0));
		board[2][0] = new Position(c1, new Coordinate(2, 0));
		board[3][0] = new Position(d1, new Coordinate(3, 0));		
		board[4][0] = new Position(e1, new Coordinate(4, 0));
		board[5][0] = new Position(f1, new Coordinate(5, 0));		
		board[6][0] = new Position(g1, new Coordinate(6, 0));
		board[7][0] = new Position(h1, new Coordinate(7, 0));
		//2nd row
		board[0][1] = new Position(a2, new Coordinate(0, 1));
		board[1][1] = new Position(b2, new Coordinate(1, 1));
		board[2][1] = new Position(c2, new Coordinate(2, 1));
		board[3][1] = new Position(d2, new Coordinate(3, 1));		
		board[4][1] = new Position(e2, new Coordinate(4, 1));
		board[5][1] = new Position(f2, new Coordinate(5, 1));		
		board[6][1] = new Position(g2, new Coordinate(6, 1));
		board[7][1] = new Position(h2, new Coordinate(7, 1));
		//3rd row
		board[0][2] = new Position(null, new Coordinate(0, 2));
		board[1][2] = new Position(null, new Coordinate(1, 2));
		board[2][2] = new Position(null, new Coordinate(2, 2));
		board[3][2] = new Position(null, new Coordinate(3, 2));		
		board[4][2] = new Position(null, new Coordinate(4, 2));
		board[5][2] = new Position(null, new Coordinate(5, 2));		
		board[6][2] = new Position(null, new Coordinate(6, 2));
		board[7][2] = new Position(null, new Coordinate(7, 2));
		//4th row
		board[0][3] = new Position(null, new Coordinate(0, 3));
		board[1][3] = new Position(null, new Coordinate(1, 3));
		board[2][3] = new Position(null, new Coordinate(2, 3));
		board[3][3] = new Position(null, new Coordinate(3, 3));		
		board[4][3] = new Position(null, new Coordinate(4, 3));
		board[5][3] = new Position(null, new Coordinate(5, 3));		
		board[6][3] = new Position(null, new Coordinate(6, 3));
		board[7][3] = new Position(null, new Coordinate(7, 3));
		//5th row
		board[0][4] = new Position(null, new Coordinate(0, 4));
		board[1][4] = new Position(null, new Coordinate(1, 4));
		board[2][4] = new Position(null, new Coordinate(2, 4));
		board[3][4] = new Position(null, new Coordinate(3, 4));		
		board[4][4] = new Position(null, new Coordinate(4, 4));
		board[5][4] = new Position(null, new Coordinate(5, 4));		
		board[6][4] = new Position(null, new Coordinate(6, 4));
		board[7][4] = new Position(null, new Coordinate(7, 4));
		//6th row5
		board[0][5] = new Position(null, new Coordinate(0, 6));
		board[1][5] = new Position(null, new Coordinate(1, 5));
		board[2][5] = new Position(null, new Coordinate(2, 5));
		board[3][5] = new Position(null, new Coordinate(3, 5));		
		board[4][5] = new Position(null, new Coordinate(4, 5));
		board[5][5] = new Position(null, new Coordinate(5, 5));		
		board[6][5] = new Position(null, new Coordinate(6, 5));
		board[7][5] = new Position(null, new Coordinate(7, 5));
		//7th ro5
		board[0][6] = new Position(a7, new Coordinate(0, 6));
		board[1][6] = new Position(b7, new Coordinate(1, 6));
		board[2][6] = new Position(c7, new Coordinate(2, 6));
		board[3][6] = new Position(d7, new Coordinate(3, 6));		
		board[4][6] = new Position(e7, new Coordinate(4, 6));
		board[5][6] = new Position(f7, new Coordinate(5, 6));		
		board[6][6] = new Position(g7, new Coordinate(6, 6));
		board[7][6] = new Position(h7, new Coordinate(7, 6));
		//8th row
		board[0][7] = new Position(a8, new Coordinate(0, 7));
		board[1][7] = new Position(b8, new Coordinate(1, 7));
		board[2][7] = new Position(c8, new Coordinate(2, 7));
		board[3][7] = new Position(d8, new Coordinate(3, 7));		
		board[4][7] = new Position(e8, new Coordinate(4, 7));
		board[5][7] = new Position(f8, new Coordinate(5, 7));		
		board[6][7] = new Position(g8, new Coordinate(6, 7));
		board[7][7] = new Position(h8, new Coordinate(7, 7));
	}
}
