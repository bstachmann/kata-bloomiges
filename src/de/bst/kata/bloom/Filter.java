package de.bst.kata.bloom;

import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.io.Serializable;
import java.util.BitSet;
import java.util.List;

@SuppressWarnings("serial")
public class Filter implements Serializable {

	private int size = 600000;

	private BitSet userBits = new BitSet(size);

	public void add(String id) {
		userBits.set(fingerprints(id).get(0));
		userBits.set(fingerprints(id).get(1));
	}

	public boolean contains(String id) {
		return userBits.get(fingerprints(id).get(0)) //
				&& userBits.get(fingerprints(id).get(1));
	}

	private List<Integer> fingerprints(String id) {
		return asList(fingerprint(id), fingerprint(id + id));
	}

	private Integer fingerprint(String id) {
		return abs(id.hashCode()) % size;
	}
}
