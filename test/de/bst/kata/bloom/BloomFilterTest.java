package de.bst.kata.bloom;

import static de.bst.kata.bloom.SerializationUtils.*;
import static java.lang.System.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BloomFilterTest {

	private int nrOfUserIdsAdded = 100000;

	private Filter filter = new Filter();

	@Before
	public void setup() {
		for (int i = 0; i < nrOfUserIdsAdded; i++)
			filter.add("a-user-id-to-be-added-" + i);

		double bytesPerUserId = nrOfBytesSerializing(filter) / (double) nrOfUserIdsAdded;
		out.println("Filter serialized to " + bytesPerUserId + " bytes per user id.");
	}

	@Test
	public void testIndex() {
		for (int i = 0; i < nrOfUserIdsAdded; i++)
			assertEquals(true, filter.contains("a-user-id-to-be-added-" + i));

		assertEquals(false, filter.contains("a-user-id-NOT-added"));
	}
}
