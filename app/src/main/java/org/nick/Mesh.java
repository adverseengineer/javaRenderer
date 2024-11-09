package org.nick;

class Mesh {

	private String meshPath;

	public Mesh(String meshPath) {
		this.meshPath = meshPath;
	}

	@Override public String toString() {
		return "{ meshPath: " + meshPath + " }";
	}
}