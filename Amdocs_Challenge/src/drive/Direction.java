package drive;

public enum Direction
{
	NORTH (0),
	WEST (1),
	SOUTH (2),
	EAST (3);	
	
    private int dirIndex;

    Direction(int dirIndex) {
        this.dirIndex = dirIndex;
    }

    public int DirIndex() {
        return dirIndex;
    }
};
