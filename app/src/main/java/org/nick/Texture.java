package org.nick;

class Texture {

	private String imagePath;

	Texture(String imagePath) {
		this.imagePath = imagePath;
	}

	public void LoadFromFile() {
		//TODO: use openGL bindings to actually do it
	}

	@Override public String toString() {
		return "{ imagePath: " + imagePath + " }";
	}
}