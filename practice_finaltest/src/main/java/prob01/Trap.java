package prob01;

import java.util.Objects;

public class Trap {

	private int left;
	private int right;

	public Trap(int left, int right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int hashCode() {
		return Objects.hash(left * right);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trap other = (Trap) obj;
		return left * right == other.left * other.right;
	}
}
