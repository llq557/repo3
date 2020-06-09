package edu.wlxy.ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WG extends JFrame {
	WG() {
		Mypanel p = new Mypanel();
		p.setBackground(Color.LIGHT_GRAY);
		this.setSize(800, 600);
		Container cn = this.getContentPane();
		cn.add(p);
		this.addMouseListener(p);
		this.setDefaultCloseOperation(3);
		this.addMouseMotionListener(p);
		this.addKeyListener(p);
	}

	public static void main(String ages[]) {
		WG w = new WG();
		w.setVisible(true);
	}
}

class Mypanel extends JPanel implements MouseListener, MouseMotionListener,
		KeyListener {
	int x = 30;
	int y = 30;
	int b = 1;
	int op = 1;

	public void paint(Graphics g) {
		super.paint(g);
		if (b == 1) {
			// 榫熷熬宸�
			g.setColor(new Color(85, 140, 95));
			g.fillOval(160 + x, 195 + y, 150, 150);
			g.setColor(Color.LIGHT_GRAY);
			g.fillOval(180 + x, 190 + y, 140, 160);
			// 榫熷ご
			g.setColor(new Color(85, 140, 95));
			g.fillOval(145 + x, 50 + y, 55, 75);
			// 鍓嶈吙
			g.fillOval(75 + x, 110 + y, 50, 60);
			g.fillOval(223 + x, 110 + y, 50, 60);
			// 鍚庤吙
			g.fillOval(75 + x, 220 + y, 50, 60);
			g.fillOval(223 + x, 220 + y, 50, 60);
			// 榫熺溂
			g.setColor(Color.WHITE);
			g.fillOval(153 + x, 55 + y, 13, 13);
			g.fillOval(178 + x, 55 + y, 13, 13);
			g.setColor(Color.BLACK);
			g.fillOval(153 + x, 55 + y, 10, 10);
			g.fillOval(178 + x, 55 + y, 10, 10);
			// 榫熻韩
			g.setColor(new Color(80, 110, 80));
			g.fillOval(100 + x, 100 + y, 150, 190);
			g.setColor(new Color(120, 180, 135));
			g.fillOval(107 + x, 107 + y, 135, 175);
			g.setColor(Color.BLACK);
			// 榫熺汗
			g.setColor(Color.BLACK);
			g.drawLine(148 + x, 160 + y, 201 + x, 160 + y);
			g.drawLine(148 + x, 225 + y, 201 + x, 225 + y);
			g.drawLine(133 + x, 193 + y, 148 + x, 160 + y);
			g.drawLine(200 + x, 160 + y, 216 + x, 193 + y);
			g.drawLine(133 + x, 193 + y, 148 + x, 225 + y);
			g.drawLine(201 + x, 225 + y, 216 + x, 193 + y);
			g.drawLine(124 + x, 253 + y, 148 + x, 225 + y);
			g.drawLine(222 + x, 255 + y, 201 + x, 225 + y);
			g.drawLine(133 + x, 193 + y, 108 + x, 209 + y);
			g.drawLine(240 + x, 209 + y, 216 + x, 193 + y);
			g.drawLine(126 + x, 135 + y, 148 + x, 160 + y);
			g.drawLine(201 + x, 160 + y, 224 + x, 135 + y);
		}
		if (b == 2) {
			// 榫熷熬宸�
			g.setColor(new Color(85, 140, 95));
			g.fillOval(37 + x, 195 + y, 150, 150);
			g.setColor(Color.LIGHT_GRAY);
			g.fillOval(27 + x, 190 + y, 140, 160);
			// 榫熷ご
			g.setColor(new Color(85, 140, 95));
			g.fillOval(145 + x, 50 + y, 55, 75);
			// 榫熺溂
			g.setColor(Color.BLACK);
			g.drawLine(164 + x, 52 + y, 160 + x, 65 + y);
			g.drawLine(181 + x, 52 + y, 185 + x, 65 + y);
			// 榫熻韩
			g.setColor(new Color(85, 140, 95));
			g.fillOval(100 + x, 100 + y, 150, 190);
			g.setColor(Color.LIGHT_GRAY);
			g.fillOval(107 + x, 107 + y, 135, 175);
			// 榫熺汗
			g.setColor(Color.BLACK);
			g.drawLine(148 + x, 160 + y, 201 + x, 160 + y);
			g.drawLine(148 + x, 225 + y, 201 + x, 225 + y);
			g.drawLine(133 + x, 193 + y, 216 + x, 193 + y);
			g.drawLine(148 + x, 160 + y, 100 + x, 120 + y);
			g.drawLine(240 + x, 120 + y, 201 + x, 160 + y);
			g.drawLine(148 + x, 225 + y, 118 + x, 255 + y);
			g.drawLine(241 + x, 270 + y, 201 + x, 225 + y);
			g.drawLine(133 + x, 193 + y, 100 + x, 160 + y);
			g.drawLine(216 + x, 193 + y, 270 + x, 135 + y);
			g.drawLine(173 + x, 110 + y, 173 + x, 280 + y);
			// 鍓嶈吙
			g.setColor(new Color(85, 140, 95));
			g.fillOval(75 + x, 110 + y, 50, 60);
			g.fillOval(223 + x, 110 + y, 50, 60);
			// 鍚庤吙
			g.fillOval(75 + x, 220 + y, 50, 60);
			g.fillOval(223 + x, 220 + y, 50, 60);
			// 鍢村拰鐖瓙
			g.setColor(new Color(178, 44, 85));
			g.fillOval(160 + x, 80 + y, 25, 15);
			g.fillOval(86 + x, 135 + y, 22, 22);
			g.fillOval(240 + x, 135 + y, 22, 22);
			g.fillOval(86 + x, 245 + y, 22, 22);
			g.fillOval(240 + x, 245 + y, 22, 22);
			// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
			g.fillOval(106 + x, 122 + y, 10, 10);
			g.fillOval(98 + x, 118 + y, 8, 8);
			g.fillOval(89 + x, 119 + y, 6, 6);
			g.fillOval(82 + x, 124 + y, 4, 4);
			// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
			g.fillOval(231 + x, 122 + y, 10, 10);
			g.fillOval(242 + x, 118 + y, 8, 8);
			g.fillOval(253 + x, 119 + y, 6, 6);
			g.fillOval(261 + x, 124 + y, 4, 4);
			// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
			g.fillOval(106 + x, 231 + y, 10, 10);
			g.fillOval(98 + x, 228 + y, 8, 8);
			g.fillOval(89 + x, 229 + y, 6, 6);
			g.fillOval(82 + x, 234 + y, 4, 4);
			// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
			g.fillOval(231 + x, 231 + y, 10, 10);
			g.fillOval(242 + x, 228 + y, 8, 8);
			g.fillOval(253 + x, 229 + y, 6, 6);
			g.fillOval(261 + x, 234 + y, 4, 4);
		}
		if (b == 3) {
			// 榫熷熬宸�
			g.setColor(new Color(85, 140, 95));
			g.fillOval(160 + x, 195 + y, 150, 150);
			g.setColor(Color.LIGHT_GRAY);
			g.fillOval(180 + x, 190 + y, 140, 160);
			// 榫熷ご
			g.setColor(new Color(85, 140, 95));
			g.fillOval(145 + x, 50 + y, 55, 75);
			// 鍓嶈吙
			g.fillOval(75 + x, 100 + y, 50, 60);
			g.fillOval(223 + x, 120 + y, 50, 60);
			// 鍚庤吙
			g.fillOval(75 + x, 230 + y, 50, 60);
			g.fillOval(223 + x, 210 + y, 50, 60);
			// 榫熺溂
			g.setColor(Color.WHITE);
			g.fillOval(153 + x, 55 + y, 13, 13);
			g.fillOval(178 + x, 55 + y, 13, 13);
			g.setColor(Color.BLACK);
			g.fillOval(153 + x, 55 + y, 10, 10);
			g.fillOval(178 + x, 55 + y, 10, 10);
			// 榫熻韩
			g.setColor(new Color(80, 110, 80));
			g.fillOval(100 + x, 100 + y, 150, 190);
			g.setColor(new Color(120, 180, 135));
			g.fillOval(107 + x, 107 + y, 135, 175);
			g.setColor(Color.BLACK);
			// 榫熺汗
			g.setColor(Color.BLACK);
			g.drawLine(148 + x, 160 + y, 201 + x, 160 + y);
			g.drawLine(148 + x, 225 + y, 201 + x, 225 + y);
			g.drawLine(133 + x, 193 + y, 148 + x, 160 + y);
			g.drawLine(200 + x, 160 + y, 216 + x, 193 + y);
			g.drawLine(133 + x, 193 + y, 148 + x, 225 + y);
			g.drawLine(201 + x, 225 + y, 216 + x, 193 + y);
			g.drawLine(124 + x, 253 + y, 148 + x, 225 + y);
			g.drawLine(222 + x, 255 + y, 201 + x, 225 + y);
			g.drawLine(133 + x, 193 + y, 108 + x, 209 + y);
			g.drawLine(240 + x, 209 + y, 216 + x, 193 + y);
			g.drawLine(126 + x, 135 + y, 148 + x, 160 + y);
			g.drawLine(201 + x, 160 + y, 224 + x, 135 + y);
		}
		if (b == 5) {
			// 榫熷熬宸�
			g.setColor(new Color(85, 140, 95));
			g.fillOval(160 + x, 195 + y, 150, 150);
			g.setColor(Color.LIGHT_GRAY);
			g.fillOval(180 + x, 190 + y, 140, 160);
			// 榫熷ご
			g.setColor(new Color(85, 140, 95));
			g.fillOval(145 + x, 50 + y, 55, 75);
			// 鍓嶈吙
			g.fillOval(75 + x, 120 + y, 50, 60);
			g.fillOval(223 + x, 100 + y, 50, 60);
			// 鍚庤吙
			g.fillOval(75 + x, 210 + y, 50, 60);
			g.fillOval(223 + x, 230 + y, 50, 60);
			// 榫熺溂
			g.setColor(Color.WHITE);
			g.fillOval(153 + x, 55 + y, 13, 13);
			g.fillOval(178 + x, 55 + y, 13, 13);
			g.setColor(Color.BLACK);
			g.fillOval(153 + x, 55 + y, 10, 10);
			g.fillOval(178 + x, 55 + y, 10, 10);
			// 榫熻韩
			g.setColor(new Color(80, 110, 80));
			g.fillOval(100 + x, 100 + y, 150, 190);
			g.setColor(new Color(120, 180, 135));
			g.fillOval(107 + x, 107 + y, 135, 175);
			g.setColor(Color.BLACK);
			// 榫熺汗
			g.setColor(Color.BLACK);
			g.drawLine(148 + x, 160 + y, 201 + x, 160 + y);
			g.drawLine(148 + x, 225 + y, 201 + x, 225 + y);
			g.drawLine(133 + x, 193 + y, 148 + x, 160 + y);
			g.drawLine(200 + x, 160 + y, 216 + x, 193 + y);
			g.drawLine(133 + x, 193 + y, 148 + x, 225 + y);
			g.drawLine(201 + x, 225 + y, 216 + x, 193 + y);
			g.drawLine(124 + x, 253 + y, 148 + x, 225 + y);
			g.drawLine(222 + x, 255 + y, 201 + x, 225 + y);
			g.drawLine(133 + x, 193 + y, 108 + x, 209 + y);
			g.drawLine(240 + x, 209 + y, 216 + x, 193 + y);
			g.drawLine(126 + x, 135 + y, 148 + x, 160 + y);
			g.drawLine(201 + x, 160 + y, 224 + x, 135 + y);
		}
		if (b == 6) {
			// 榫熷熬宸�
			g.setColor(new Color(85, 140, 95));
			g.fillOval(160 + x, 195 + y, 150, 150);
			g.setColor(Color.LIGHT_GRAY);
			g.fillOval(180 + x, 190 + y, 140, 160);
			// 榫熷ご
			g.setColor(new Color(85, 140, 95));
			g.fillOval(145 + x, 50 + y, 55, 75);
			// 鍓嶈吙
			g.fillOval(65 + x, 110 + y, 50, 60);
			g.fillOval(233 + x, 110 + y, 50, 60);
			// 鍚庤吙
			g.fillOval(65 + x, 220 + y, 50, 60);
			g.fillOval(233 + x, 220 + y, 50, 60);
			// 榫熺溂
			g.setColor(Color.WHITE);
			g.fillOval(153 + x, 55 + y, 13, 13);
			g.fillOval(178 + x, 55 + y, 13, 13);
			g.setColor(Color.BLACK);
			g.fillOval(153 + x, 55 + y, 10, 10);
			g.fillOval(178 + x, 55 + y, 10, 10);
			// 榫熻韩
			g.setColor(new Color(80, 110, 80));
			g.fillOval(100 + x, 100 + y, 150, 190);
			g.setColor(new Color(120, 180, 135));
			g.fillOval(107 + x, 107 + y, 135, 175);
			g.setColor(Color.BLACK);
			// 榫熺汗
			g.setColor(Color.BLACK);
			g.drawLine(148 + x, 160 + y, 201 + x, 160 + y);
			g.drawLine(148 + x, 225 + y, 201 + x, 225 + y);
			g.drawLine(133 + x, 193 + y, 148 + x, 160 + y);
			g.drawLine(200 + x, 160 + y, 216 + x, 193 + y);
			g.drawLine(133 + x, 193 + y, 148 + x, 225 + y);
			g.drawLine(201 + x, 225 + y, 216 + x, 193 + y);
			g.drawLine(124 + x, 253 + y, 148 + x, 225 + y);
			g.drawLine(222 + x, 255 + y, 201 + x, 225 + y);
			g.drawLine(133 + x, 193 + y, 108 + x, 209 + y);
			g.drawLine(240 + x, 209 + y, 216 + x, 193 + y);
			g.drawLine(126 + x, 135 + y, 148 + x, 160 + y);
			g.drawLine(201 + x, 160 + y, 224 + x, 135 + y);
		}
		if (b == 8) {
			// 榫熷熬宸�
			g.setColor(new Color(85, 140, 95));
			g.fillOval(37 + x, 195 + y, 150, 150);
			g.setColor(Color.LIGHT_GRAY);
			g.fillOval(27 + x, 190 + y, 140, 160);
			// 榫熷ご
			g.setColor(new Color(85, 140, 95));
			g.fillOval(145 + x, 50 + y, 55, 75);
			// 鍓嶈吙
			g.fillOval(85 + x, 110 + y, 50, 60);
			g.fillOval(213 + x, 110 + y, 50, 60);
			// 鍚庤吙
			g.fillOval(85 + x, 220 + y, 50, 60);
			g.fillOval(213 + x, 220 + y, 50, 60);
			// 榫熺溂
			g.setColor(Color.WHITE);
			g.fillOval(153 + x, 55 + y, 13, 13);
			g.fillOval(178 + x, 55 + y, 13, 13);
			g.setColor(Color.BLACK);
			g.fillOval(153 + x, 55 + y, 10, 10);
			g.fillOval(178 + x, 55 + y, 10, 10);
			// 榫熻韩
			g.setColor(new Color(80, 110, 80));
			g.fillOval(100 + x, 100 + y, 150, 190);
			g.setColor(new Color(120, 180, 135));
			g.fillOval(107 + x, 107 + y, 135, 175);
			g.setColor(Color.BLACK);
			// 榫熺汗
			g.setColor(Color.BLACK);
			g.drawLine(148 + x, 160 + y, 201 + x, 160 + y);
			g.drawLine(148 + x, 225 + y, 201 + x, 225 + y);
			g.drawLine(133 + x, 193 + y, 148 + x, 160 + y);
			g.drawLine(200 + x, 160 + y, 216 + x, 193 + y);
			g.drawLine(133 + x, 193 + y, 148 + x, 225 + y);
			g.drawLine(201 + x, 225 + y, 216 + x, 193 + y);
			g.drawLine(124 + x, 253 + y, 148 + x, 225 + y);
			g.drawLine(222 + x, 255 + y, 201 + x, 225 + y);
			g.drawLine(133 + x, 193 + y, 108 + x, 209 + y);
			g.drawLine(240 + x, 209 + y, 216 + x, 193 + y);
			g.drawLine(126 + x, 135 + y, 148 + x, 160 + y);
			g.drawLine(201 + x, 160 + y, 224 + x, 135 + y);
		}
	}

	public void mouseClicked(MouseEvent e) {
		// int mousex=(int)e.getPoint().getX();
		// int mousey=(int)e.getPoint().getY();
	}

	public void mousePressed(MouseEvent e) {
		if (e.getX() > x + 54 && e.getX() < x + 328 && e.getY() > y + 99
				&& e.getY() < y + 399) {
			b = 2;
			this.repaint();
		}
	}

	public void mouseReleased(MouseEvent e) {
		b = 1;
		this.repaint();
	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

	public void mouseDragged(MouseEvent e) {
		x = e.getX() - 176;
		y = e.getY() - 220;
		this.repaint();
	}

	public void mouseMoved(MouseEvent e) {

	}

	/**
	 * Method keyTyped
	 *
	 *
	 * @param e
	 *
	 */
	public void keyTyped(KeyEvent e) {
	}

	/**
	 * Method keyPressed
	 *
	 *
	 * @param e
	 *
	 */
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			b = 4;
			b = b + op * 1;
			op = -op;
			y -= 20;
			this.repaint();
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			b = 4;
			b = b + op * 1;
			op = -op;
			y += 20;
			this.repaint();
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			b = 7;
			b = b + op * 1;
			op = -op;
			x -= 20;
			this.repaint();
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			b = 7;
			b = b + op * 1;
			op = -op;
			x += 20;
			this.repaint();
		}
	}

	/**
	 * Method keyReleased
	 *
	 *
	 * @param e
	 *
	 */
	public void keyReleased(KeyEvent e) {

	}
}