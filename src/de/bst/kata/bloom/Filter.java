package de.bst.kata.bloom;

import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.io.Serializable;
import java.util.BitSet;
import java.util.List;

@SuppressWarnings("serial")
public class Filter implements Serializable {

	private int size = 1200000;

	private BitSet userBits = new BitSet(size);

	public void add(String id) {
		userBits.set(fingerprints(id).get(0));
	}

	public boolean contains(String id) {
		return userBits.get(fingerprints(id).get(0));
	}

	private List<Integer> fingerprints(String id) {
		return asList(fingerprint(id));
	}

	private Integer fingerprint(String id) {
		return abs(id.hashCode()) % size;
	}
}
