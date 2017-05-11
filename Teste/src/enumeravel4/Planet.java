package enumeravel4;

public enum Planet {

	TERRA(300,55f + 250f), VENUS(855,88f + 250f), MARTE(555,55f + 400f);

	private float radius;
	private float gravity;

	public float getRadius() {
		return radius;
	}

	public float getGravity() {
		return gravity;
	}

	private Planet(float radius, float gravity) {
		this.radius = radius;
		this.gravity = gravity;
	}

}
