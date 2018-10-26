public class XY {
	private int beforeX = 0;
	private int beforeY = 0;
	
	private int afterX = 0;
	private int afterY = 0;

	@Override
	public String toString() {
		return "XY [beforeX=" + beforeX + ", beforeY=" + beforeY + ", afterX=" + afterX + ", afterY=" + afterY + "]";
	}
	// alt shift s r
	public int getBeforeX() {
		return beforeX;
	}
	public void setBeforeX(int beforeX) {
		this.beforeX = beforeX;
	}
	public int getBeforeY() {
		return beforeY;
	}
	public void setBeforeY(int beforeY) {
		this.beforeY = beforeY;
	}
	public int getAfterX() {
		return afterX;
	}
	public void setAfterX(int afterX) {
		this.afterX = afterX;
	}
	public int getAfterY() {
		return afterY;
	}
	public void setAfterY(int afterY) {
		this.afterY = afterY;
	}
	
}