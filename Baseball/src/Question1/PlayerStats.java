package Question1;

import java.util.Scanner;

public class PlayerStats {

	private String name;
	private int AB;
	private int H;
	private int B2;
	private int B3;
	private int HR;
	private int R;
	private int BB;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAB() {
		return AB;
	}

	public void setAB(int aB) {
		AB = aB;
	}

	public int getH() {
		return H;
	}

	public void setH(int h) {
		H = h;
	}

	public int getB2() {
		return B2;
	}

	public void setB2(int b2) {
		B2 = b2;
	}

	public int getB3() {
		return B3;
	}

	public void setB3(int b3) {
		B3 = b3;
	}

	public int getHR() {
		return HR;
	}

	public void setHR(int hR) {
		HR = hR;
	}

	public int getR() {
		return R;
	}

	public void setR(int r) {
		R = r;
	}

	public int getBB() {
		return BB;
	}

	public void setBB(int bB) {
		BB = bB;
	}

	public double BA() {

		return ((1.0*H) / AB);

	}

	public double OBP() {

		return (((1.0*H) + BB) / (AB + BB));

	}

	public double SLG() {

		return ((1.0*TB()) / AB);

	}

	public double OBS() {

		return (OBP() + SLG());

	}

	public int TB() {

		return ((HR * 4) + (B3 * 3) + (B2 * 2) + (H - B2 - B3 - HR));

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PlayerStats player = new PlayerStats();
		System.out.println("Enter name");
		player.setName(sc.nextLine());
		System.out.println("Enter At Bats");
		player.setAB(sc.nextInt());
		System.out.println("Enter Hits");
		player.setH(sc.nextInt());
		System.out.println("Enter Doubles");
		player.setB2(sc.nextInt());
		System.out.println("Enter Triples");
		player.setB3(sc.nextInt());
		System.out.println("Enter Home Runs");
		player.setHR(sc.nextInt());
		System.out.println("Enter Runs");
		player.setR(sc.nextInt());
		System.out.println("Enter Walks");
		player.setBB(sc.nextInt());
		
//		System.out.println(player.getName());
//		System.out.println(player.getAB());
//		System.out.println(player.getH());
//		System.out.println(player.getB2());
//		System.out.println(player.getB3());
//		System.out.println(player.getHR());
//		System.out.println(player.getR());
//		System.out.println(player.getBB());
		
		System.out.println("Batting Average: "+player.BA());
		System.out.println("On Base Percentage: "+player.OBP());
		System.out.println("Slugging Percentage: "+player.SLG());
		System.out.println("On Base + Slugging Percentage: "+player.OBS());
		System.out.println("Total Bases: "+player.TB());
		
		sc.close();

	}


}
