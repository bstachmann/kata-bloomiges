package de.bst.kata.bloom;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

public class SerializationUtils {

	public static byte[] serialize(Object index) {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream os = new ObjectOutputStream(baos);
			os.writeObject(index);
			os.close();
			return baos.toByteArray();
		} catch (Exception e) {
			throw new RuntimeException("Couldn't serialize " + index, e);
		}
	}

	public static int nrOfBytesSerializing(Object filter) {
		return serialize(filter).length;
	}

}
