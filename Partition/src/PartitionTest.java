

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartitionTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	//@Test
	//void testCountPartitions() {
		//fail("Not yet implemented");
	//}

	@Test
	void testMain() {
		//fail("Not yet implemented");
		assertEquals(Partition.countPartitions(5, 3),25,"test0");
		assertEquals(Partition.countPartitions(5, 4),10,"test1");
		assertEquals(Partition.countPartitions(6, 3),90,"test2");
		assertEquals(Partition.countPartitions(4, 3),6,"test3");
		assertEquals(Partition.countPartitions(4, 2),7,"test4");
	}

}
