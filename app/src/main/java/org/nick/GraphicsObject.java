package org.nick;

import org.joml.Matrix4f;

class GraphicsObject {

	private Matrix4f localPosition;
	private Mesh mesh;
	private Material mat;

	public GraphicsObject(Mesh mesh, Material mat) {
		this.localPosition = new Matrix4f();
		this.mesh = mesh;
		this.mat = mat;
	}

	@Override public String toString() {
		return "{ mesh: " + mesh + ", mat: " + mat + " }";
	}
}