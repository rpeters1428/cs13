public class Russle implements Dog {

	private String name;
	private int age;
	private String color;
	private boolean isDirty;

	public Russle(String n, int a, String c, boolean s) {
		name = n;
		age = a;
		color = c;
		isDirty = false;
	}

	public String eat() {
		return "Yum Yum Yum!";
	}

	public String bark() {
		return "Bark Bark Bark!";
	}

	public int birthday() {
		age++;
		return age;
	}

	public void clean() {
		isDirty = true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Russle [name=" + name + ", age=" + age + ", color=" + color
				+ ", isDirty=" + isDirty + "]";
	}

}
