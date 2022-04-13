public class vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double A, M;
		double theta;
		char[] operators = new char[3];
		Vector[] vectors = new Vector[3];
		User user = new User();
		for (int i = 0; i < 3; i++) {
			M = (user.inputDouble("Enter magnitude V" + (i + 1) + ": "));
			A = (user.inputDouble("Enter angle V" + (i + 1) + ": "));
			operators[i] = user.inputChar("Enter sign for V" + (i + 1) + ": ", "+-");
			vectors[i] = new Vector("V" + (i + 1), M, A);
		}

		double sumVx = Vector.vrx(vectors, operators);
		double sumVy = Vector.vry(vectors, operators);
		System.out.print("VR =");
		for (int i = 0; i < 3; i++) {
			String string = i == 0 && operators[i] == '+' ? (" V" + (i + 1)) : (" " + operators[i] + " V" + (i + 1));
			System.out.print(string);
		}
		System.out.println();
		System.out.println("________________________________________________________");
		System.out.println("|Vectors|\tVRx\t\t|\tVRy\t\t|");
		System.out.println("|_______|_______________________|_______________________|");

		for (Vector v : vectors) {
			System.out.println(v);
			System.out.println("|_______|_______________________|_______________________|");
		}
		sumVx = Math.round(sumVx * 10000.0) / 10000.0;
		sumVy = Math.round(sumVy * 10000.0) / 10000.0;
		System.out.println("|VR\t|\t" + sumVx + "\t\t|\t" + sumVy);
		System.out.println("|_______|_______________________|_______________________|");
		double vr= Math.round(Math.sqrt(Math.pow(sumVx, 2) + Math.pow(sumVy, 2)) * 100.0) / 100.0;
		System.out.println("VR = " + vr);
		double thetaRef = Math.round(Math.toDegrees(Math.atan(Math.abs(sumVy / sumVx))) * 10.0) / 10.0;
		System.out.println("Theta Ref = " + thetaRef+ "°");
		

		if (sumVx < 0 && sumVy < 0) {
			theta = thetaRef + 180;
		} else if (sumVx > 0 && sumVy > 0) {
			theta = thetaRef;
		} else if (sumVx > 0 && sumVy < 0) {
			theta = 360 - thetaRef;
		} else {
			theta = 180 - thetaRef;
		}
		System.out.println("Theta  = " + theta+ "°");
		System.out.println("VR  = " + Math.round(vr* 10.0) / 10.0 + " @ " + Math.round(theta) + "°");

	}

}
