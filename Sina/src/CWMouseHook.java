//package rob;

import java.awt.Desktop;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Date;

import javax.imageio.ImageIO;

//import com.ocr.Test;

public class CWMouseHook {
	public static void main(String[] args) throws Exception {
		Robot r = new Robot();
		for (int ii = 0; ii <200; ii++) {
			URL u1 = new URL(
					"http://weibo.com/2760968687/myfollow?t=1&page=2");
			openWebpage(u1.toURI());
           for(int jj=0;jj<1;jj++){
			Thread.sleep(5000);
			r.mouseMove(600, 350);
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(1000);
			r.mouseMove(840, 350);
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(1000);
			r.mouseMove(1100, 350);
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(2000);
			r.mouseMove(600, 570);
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(1000);
			r.mouseMove(840, 570);
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(1000);
			r.mouseMove(1100, 570);
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(2000);
			r.mouseMove(600, 700);
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(1000);
			r.mouseMove(840, 700);
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(1000);
			r.mouseMove(1100, 700);
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			
			
			//以上是选择sina 关注人员的
			Thread.sleep(1000);
			r.mouseMove(770, 270);
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(2000);
			//取消关注 
	
			r.mouseMove(735, 450);
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			//确定
			Thread.sleep(2000);
             }   
			Runtime.getRuntime().exec(
			            "taskkill /F /FI \"IMAGENAME eq chrome.exe*\"");
	         Thread.sleep(2000);
		}
			/*for (int jj = 0; jj <200; jj++) {
				URL u2 = new URL(
						"http://weibo.com/2760968687/myfollow?rightmod=1&wvr=5");

				
				openWebpage(u2.toURI());
				
				Thread.sleep(5000);
				r.mouseMove(300, 600);
				r.mousePress(InputEvent.BUTTON1_MASK);
				r.mouseRelease(InputEvent.BUTTON1_MASK);
				Thread.sleep(5000);
				Runtime.getRuntime().exec(
						"taskkill /F /FI \"IMAGENAME eq SogouExplorer.exe*\"");*/
				
			/*BufferedImage i = r.createScreenCapture(new Rectangle(104, 89, 75,25));
			ImageIO.write(i, "jpg", new File("D:\\bea\\" + "CreateImg"+ ".jpg"));
			r.mouseMove(160, 82);
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			
			//串赋值，接口
		/*	String str = "";
			Test test = new Test();
			str = test.printOCR();
			//去除换行符号
			String update_str = Test.replaceBlank(str);
			r.keyPress(KeyEvent.VK_CAPS_LOCK);
			for (int k = 0; k < update_str.length(); k++) {
				char ch = update_str.charAt(k);
				switch(ch){
					case 'A': r.keyPress(KeyEvent.VK_A); break;
					case 'B': r.keyPress(KeyEvent.VK_B); break;
					case 'C': r.keyPress(KeyEvent.VK_C); break;
					case 'D': r.keyPress(KeyEvent.VK_D); break;
					case 'E': r.keyPress(KeyEvent.VK_E); break;
					case 'F': r.keyPress(KeyEvent.VK_F); break;
					case 'G': r.keyPress(KeyEvent.VK_G); break;
					case 'H': r.keyPress(KeyEvent.VK_H); break;
					case 'I': r.keyPress(KeyEvent.VK_I); break;
					case 'J': r.keyPress(KeyEvent.VK_J); break;
					case 'K': r.keyPress(KeyEvent.VK_K); break;
					case 'L': r.keyPress(KeyEvent.VK_L); break;
					case 'M': r.keyPress(KeyEvent.VK_M); break;
					case 'N': r.keyPress(KeyEvent.VK_N); break;
					case 'O': r.keyPress(KeyEvent.VK_O); break;
					case 'P': r.keyPress(KeyEvent.VK_P); break;
					case 'Q': r.keyPress(KeyEvent.VK_Q); break;
					case 'R': r.keyPress(KeyEvent.VK_R); break;
					case 'S': r.keyPress(KeyEvent.VK_S); break;
					case 'T': r.keyPress(KeyEvent.VK_T); break;
					case 'U': r.keyPress(KeyEvent.VK_U); break;
					case 'V': r.keyPress(KeyEvent.VK_V); break;
					case 'W': r.keyPress(KeyEvent.VK_W); break;
					case 'X': r.keyPress(KeyEvent.VK_X); break;
					case 'Y': r.keyPress(KeyEvent.VK_Y); break;
					case 'Z': r.keyPress(KeyEvent.VK_Z); break;
					default : r.keyPress(KeyEvent.VK_X);
				}
			}
*/
		
			//}
		}
		

	

	public static void openWebpage(URI uri) {
		Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop()
				: null;
		if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
			try {
				desktop.browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void openWebpage(URL url) {
		try {
			openWebpage(url.toURI());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

}
