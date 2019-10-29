package regularPolygon;

public class TestRegularPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon regpolygon1 = new RegularPolygon();
		RegularPolygon regpolygon2 = new RegularPolygon(6,4);
		RegularPolygon regpolygon3 = new RegularPolygon(10,4,5.6,7.8);
		System.out.println("The perimeter of the regularpolygon ("+regpolygon1.getX()+","+regpolygon1.getY()+") is " + regpolygon1.getPerimeter()+"; Area: " + regpolygon1.getArea());
		System.out.println("The perimeter of the regularpolygon ("+regpolygon2.getX()+","+regpolygon2.getY()+") is " + regpolygon2.getPerimeter()+"; Area: " + regpolygon2.getArea());
		System.out.println("The perimeter of the regularpolygon ("+regpolygon3.getX()+","+regpolygon3.getY()+") is " + regpolygon3.getPerimeter()+"; Area: " + regpolygon3.getArea());
	}

}
