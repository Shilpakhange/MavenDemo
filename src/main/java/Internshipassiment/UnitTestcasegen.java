package Internshipassiment;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class UnitTestcasegen {

	public static void main(String[] args) {
//To generate 10 input test cases for division problem
		for (int i = 0; i < 10; i++) {

			List<Integer> pool = Arrays.asList(0, 1, 2);
			int x = getRand(pool);
			int y = getRand(pool);
			Exception exception = null;
			Double result = null;

			try {
				result = div(x, y);
			} catch (Exception e) {
				exception = e;
			}
			System.out.println("@Test public void test" + i + "(){");
			if (exception != null) {
				System.out.println("try{div(" + x + "," + y + ");fail();}catch(Exception e){}}");

			} else
				System.out.println("assertEquals(" + result + ",div(" + x + "," + y + ");}");

		}

	}

	public static int getRand(List<Integer> pool) {
		Random rand = new Random();
		if (rand.nextBoolean()) {
			return rand.nextInt();
		} else {
			return pool.get(rand.nextInt(pool.size()));
		}
	}
	
	public static double div(int x, int y) {
		return x / y;
	}

}