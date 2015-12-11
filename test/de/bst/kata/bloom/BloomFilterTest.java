package de.bst.kata.bloom;

import static de.bst.kata.bloom.SerializationUtils.*;
import static java.lang.System.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BloomFilterTest {

	private Filter filter = new Filter();

	@Before
	public void setup() {
		// TODO hier den Filter füllen

		out.println("Filter serialized to " + nrOfBytesSerializing(filter) + " bytes.");
	}

	@Test
	public void testIndex() {
		// TODO hier Zugriffe auf den Filter testen

		fail();
	}
}
