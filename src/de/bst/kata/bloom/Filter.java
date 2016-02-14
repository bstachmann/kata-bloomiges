package de.bst.kata.bloom;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

@SuppressWarnings("serial")
public class Filter implements Serializable {

	private Collection<Short> userIds = new HashSet<>();

	public void add(String id) {
		userIds.add(fingerprint(id));
	}

	public boolean contains(String id) {
		return userIds.contains(fingerprint(id));
	}

	private Short fingerprint(String id) {
		return (short) id.hashCode();
	}
}
