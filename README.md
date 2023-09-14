# CS.12.01-Tutorial.1.2.13

A crossword puzzle grid is a two-dimensional rectangular array of black and white squares. Some of the white squares are labeled with a positive number according to the crossword labeling rule. 

The crossword labeling rule identifies squares to be labeled with a positive number as follows.

A square is labeled with a positive number if and only if
The square is white and
The square does not have a white square immediately above it, or it does not have a white square immediately to its left, or both. 

The squares identified by these criteria are labeled with consecutive numbers in row-major order, starting at 1.

The following diagram shows a crossword puzzle grid and the labeling of the squares according to the crossword labeling rule. 

![image](https://github.com/techarenz/CS.12.01-Tutorial.1.2.13/assets/57818506/37ef5516-9f30-44e5-85ca-01171ad75be8)

The question uses two classes, a Square class that represents an individual square in the puzzle and a Crossword class that represents a crossword puzzle grid. A partial declaration of the Square class is shown below.

public class Square
{

	public Square(boolean isBlack, int num) 
	{

		// To be implemented.
		
	}

}

A partial declaration of the Crossword class is shown below. You will implement one method and the constructor in the Crossword class. 

public class Crossword
{

	private Square[][] puzzle;

	public Crossword(boolean[][] blackSquares)
	{

		// To be implemented.

	}

	private boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
	{

		// To be implemented.

	}

}


a) Write the Crossword method toBeLabeled. The method returns true if the square indexed by row r, column c in a crossword puzzle grid should be labelled with a positive number according to the crossword labelling rule; otherwise it returns false. The parameter blackSquares indicates which squares in the crossword puzzle grid are black.

b) Write the Crossword constructor. The constructor should initialise the crossword puzzle grid to have the same dimensions as the parameter blackSquares. Each element of the puzzle grid should be initialised with a reference to a Square object with the appropriate colour and number. The number is positive if the square is labelled and 0 if the square is not labelled.
