package PointLine;

import java.util.Scanner;

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String display() {
		return "(" + x + ", " + y + ")";
	}
}

class Line {

	private Point p1;
	private Point p2;

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public void display() {
		System.out.println(
				"A line from points (" + p1.getX() + "," + p1.getY() + ") to (" + p2.getX() + "," + p2.getY() + ")");
	}
}

public class TestLine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Point 1 X:");
		int x = scan.nextInt();
		System.out.print("Point 1 Y:");
		int y = scan.nextInt();
		Point p1 = new Point(x, y);

		System.out.print("Point 1 X:");
		x = scan.nextInt();
		System.out.print("Point 1 Y:");
		y = scan.nextInt();
		Point p2 = new Point(x, y);

		Line l1 = new Line(p1, p2);
		l1.display();
	}
}