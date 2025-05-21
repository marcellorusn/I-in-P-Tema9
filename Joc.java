public class Joc {
	private String echipa1;
	private String echipa2;
	private int goluriEchipa1;
	private int goluriEchipa2;
	private int outuri;
	private int cornere;

	public Joc(String echipa1, String echipa2) {
		this.echipa1 = echipa1;
		this.echipa2 = echipa2;
		goluriEchipa1 = 0;
		goluriEchipa2 = 0;
		outuri = 0;
		cornere = 0;
	}

	public void simuleaza() {

		Minge minge = new Minge(50, 25);

		for (int i = 1; i <= 1000; i++) {
			try {
				System.out.println(echipa1 + " - " + echipa2 + " : Mingea se afla la coordonatele (" + minge.pozX()
						+ ", " + minge.pozY() + ")");
				minge.suteaza();
			} catch (Gol e) {
				System.out.println("GOL marcat de echipa care a sutat!");

				if (minge.pozX() == 0) {
					goluriEchipa2++;
				} else {
					goluriEchipa1++;
				}

				minge = new Minge(50, 25);
			} catch (Out e) {
				System.out.println("Out !");
				outuri++;

				minge = new Minge(minge.pozX(), minge.pozY());
			} catch (Corner e) {
				System.out.println("Corner !");
				cornere++;

				int doiX= minge.pozX();
				int doiY = minge.pozY();
				minge = new Minge(doiX, doiY);
			}
		}
	}

	@Override
	public String toString() {
		return "Meci: " + echipa1 + " contra " + echipa2 + "\n" + "Scor: " + goluriEchipa1 + " - " + goluriEchipa2 + "\n"
				+ "Out-uri: " + outuri + "\n" + "Cornere: " + cornere;
	}
}