package de.bst.kata.bloom;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

@SuppressWarnings("serial")
public class Filter implements Serializable {

	private Collection<String> userIds = new HashSet<>();

	public void add(String id) {
		userIds.add(id);
	}

	public boolean contains(String id) {
		return userIds.contains(id);
	}
}
