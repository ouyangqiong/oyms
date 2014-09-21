package ouyang.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @ClassName PrimeTest
 * @Description TODO(用一句话描述功能)
 * @author 欧阳琼
 * @date 2013-12-8 上午11:07:52
 */
public class PrimeTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Test method for {@link ouyang.test.Prime#main(java.lang.String[])}.
	 */
	//@Test
//	public void testMain() {
//		int[] primes1 =Prime.generatePrimes_v1(1);
//		assertEquals(primes1.length,0);
//		int[] primes2 =Prime.generatePrimes_v1(2);
//		assertEquals(primes2.length,1);
//		assertEquals(primes2[0],2);
//	}

	/**
	 * Test method for {@link ouyang.test.Prime#add(int, int)}.
	 */
	@Test
	public void testAdd() {
		//System.out.println(Prime.add(2,3));
		assertEquals(5,Prime.add(2,3));
	}

}
