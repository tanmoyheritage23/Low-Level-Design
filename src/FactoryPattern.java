
interface shape{
	public void computeArea();
}

class Square implements shape{
	public void computeArea() {
		System.out.println("Square");
	}
}

class Circle implements shape{
	public void computeArea() {
		System.out.println("Circle");
	}
}

class Rhombus implements shape{
	public void computeArea() {
		System.out.println("Rhombus");
	}
}

class ShapeInstanceFactory {
	public shape getShapeInstance(String value) {
		if(value.equals("Circle")) {
			return new Circle();
		}else if(value.equals("Square")) {
			return new Square();
		}else if(value.equals("Rhombus")) {
			return new Rhombus();
		}else
			return null;
	}
}

public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeInstanceFactory factoryObj = new ShapeInstanceFactory();
		shape circleObj = factoryObj.getShapeInstance("Circle");
		circleObj.computeArea();
	}

}
