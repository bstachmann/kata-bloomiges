package de.bst.kata.bloom;

import static java.lang.Math.*;

import java.io.Serializable;
import java.util.BitSet;

@SuppressWarnings("serial")
public class Filter implements Serializable {

	private int size = 1200000;

	private BitSet userBits = new BitSet(size);

	public void add(String id) {
		userBits.set(fingerprint(id));
	}

	public boolean contains(String id) {
		return userBits.get(fingerprint(id));
	}

	private Integer fingerprint(String id) {
		return abs(id.hashCode()) % size;
	}
}
