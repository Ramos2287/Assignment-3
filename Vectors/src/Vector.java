
public class Vector {

	String name;

	double M;
	double A;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getM() {
		return M;
	}

	public void setM(double m) {
		M = m;
	}

	public double getA() {
		return A;
	}

	public void setA(double a) {
		A = a;
	}

	/**
	 * @param name
	 * @param m
	 * @param a
	 */
	public Vector(String name, double m, double a) {
		super();
		this.name = name;
		M = m;
		A = a;
	}

	@Override
	public String toString() {
		return "|" + name + "\t|\t" + vx() + "\t\t" + vy() + "\t\t";
	}

	public double vx() {
		double X1;
		double Angle1 = Math.toRadians(A);
		X1 = M * Math.cos(Angle1);
		double roundOff = Math.round(X1 * 10000.0) / 10000.0;
		return roundOff;
	}

	public double vy() {
		double Y1;
		double Angle1 = Math.toRadians(A);
		Y1 = M * Math.sin(Angle1);
		double roundOff = Math.round(Y1 * 10000.0) / 10000.0;
		return roundOff;
	}

	public static double vrx(Vector[] VectorTab, char[] operators) {
		double vrx = 0.0;
		for (int i = 0; i < VectorTab.length; i++)
			switch (operators[i]) {
			case '+':
				vrx += VectorTab[i].vx();
				break;
			case '-':
				vrx -= VectorTab[i].vx();
				break;
			}
		return vrx;
	}
	public static double vry(Vector[] VectorTab, char[] operators) {
		double vry = 0.0;
		for (int i = 0; i < VectorTab.length; i++)
			switch (operators[i]) {
			case '+':
				vry += VectorTab[i].vy();
				break;
			case '-':
				vry -= VectorTab[i].vy();
				break;
			}
		return vry;
	}
	

}
