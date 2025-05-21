
public class Minge {
	private int x;
	private int y;

	public Minge(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int pozX() {
		return x;
	}

	public int pozY() {
		return y;
	}

	public void suteaza() throws Gol, Out, Corner {
		CoordinateGenerator generator = new CoordinateGenerator();
		x = generator.generateX();
		y = generator.generateY();
		if (y == 0 || y == 50) {
			throw new Out("Out!");
		}

		if (x == 0 || x == 100) {
			if (y >= 20 && y <= 30) {
				throw new Gol("Gol!");
			} else if ((y > 0 && y < 20) || (y > 30 && y < 50)) {
				throw new Corner("Corner!");
			}
		}
	}

}
