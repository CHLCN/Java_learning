package location;

public class Location {
	public int row;
	public int column;
	public double maxValue;
	
	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	public static Location locateLargest(double[][] a) {
		double max = 0;
		int r = 0;
		int c = 0;
		for ( int i = 0; i < a.length; i++){
			for ( int j = 1; j < a[i].length; j++) {
				if(a[i][j] > max){
					max = a[i][j];
					r = i;
					c = j;
				}
			}
		}
		return new Location(r,c,max);
	}

}
