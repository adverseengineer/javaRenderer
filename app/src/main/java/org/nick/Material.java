package org.nick;

class Material {

	Texture tex;
	Shader shader;

	//TODO: add map of shader params

	public Material(Texture tex, Shader shader) {
		this.tex = tex;
		this.shader = shader;
	}

	@Override public String toString() {
		return  "{ tex: " + tex + ", shader: " + shader + " }"; 
	}
}