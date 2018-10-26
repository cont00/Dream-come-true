import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Ex03 extends JFrame implements MouseListener{
	
	private XY[] xy_arr = new XY[100];
	int arr_cnt = 0;
	
	Ex03(){
		addMouseListener(this);
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("e.getX()"+e.getX());
		System.out.println("e.getY()"+e.getY());
		System.out.println("Clicked");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Entered");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Exited");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Pressed");
		xy_arr[arr_cnt] = new XY();
if(xy_arr[arr_cnt].getBeforeX() == 0 && xy_arr[arr_cnt].getBeforeY() == 0){
	xy_arr[arr_cnt].setBeforeX(e.getX());
	xy_arr[arr_cnt].setBeforeY(e.getY());
}else{
	xy_arr[arr_cnt].setAfterX(e.getX());
	xy_arr[arr_cnt].setAfterY(e.getY());
	arr_cnt++;
	repaint();
}
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Released");
	}
	@Override
	public void paint(Graphics g){
		super.paint(g);
		System.out.println("불러지나");
		g.drawLine(beforeX, beforeY, afterX, afterY);
	}
}