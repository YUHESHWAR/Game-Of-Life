package application;

import javax.swing.SwingUtilities;

import gui.MainFrame;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SwingUtilities.invokeLater(new Runnable() {
//
//			@Override
//			public void run() {
//				new MainFrame();				
//			}
//			
//		});
		SwingUtilities.invokeLater(()->new MainFrame());
	}

}
