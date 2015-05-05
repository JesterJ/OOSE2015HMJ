

public class tiles {
	boolean [][] type1 = new boolean[][] {
		{
			false,	false,	false,	false,
			true,	true,	true,	true,
			false,	false,	false,	false,
			false,	false,	false,	false,
		},
		{
			false,	false,	true,	false,
			false,	false,	true,	false,
			false,	false,	true,	false,
			false,	false,	true,	false,
		},
		{
			false,	false,	false,	false,
			false,	false,	false,	false,
			true,	true,	true,	true,
			false,	false,	false,	false,
		},
		{
			false,	true,	false,	false,
			false,	true,	false,	false,
			false,	true,	false,	false,
			false,	true,	false,	false,
		}
	};
		
	private int dimension;
	private int rows;
	private int cols;
	private boolean[][] type;
	private int spawnCol;
	private int spawnRow;
	private tiles curTile;
	
	tiles Type1 = TileType(4, 4, 1, type1);
	
private tiles TileType(int dimension, int cols, int rows, boolean[][] type) {
	this.dimension = dimension;
	this.type = type;
	this.cols = cols;
	this.rows = rows;
	
	this.spawnCol = 5 - (dimension >> 1);	
	//this.spawnRow = getTopInset	(0);
	return curTile;
}
}