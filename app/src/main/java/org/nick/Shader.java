package org.nick;

class Shader {

	protected String vertexSource;
	protected String fragmentSource;

	protected long shaderProg;

	//TODO: consider making vertex and fragment shader classes here bc java is slow anyway and can handle it
	public Shader(String vertexSource, String fragmentSource) {
		this.vertexSource = vertexSource;
		this.fragmentSource = fragmentSource;
	}

	public void Link() {
		//TODO: use openGL bindings to link the shader on the GPU
	}

	@Override public String toString() {
		return "{ shaderProg: " + shaderProg + " }";
	}
}