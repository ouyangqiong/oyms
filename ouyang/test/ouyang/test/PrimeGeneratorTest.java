package ouyang.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @ClassName PrimeGeneratorTest
 * @Description TODO(用一句话描述功能)
 * @author 欧阳琼
 * @date 2013-12-8 上午11:50:47
 */
public class PrimeGeneratorTest {

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
	 * Test method for {@link ouyang.test.PrimeGenerator#generatePrime(int)}.
	 */
	@Test
	public void testGeneratePrime() {
		int[] primes=new PrimeGenerator().generatePrime(4);
		assertEquals(primes.length,2);
	}

}
