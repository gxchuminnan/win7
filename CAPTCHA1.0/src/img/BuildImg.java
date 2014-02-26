package img;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

public class BuildImg {
	Random random = new Random();
	private final  static String character = 
			"0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String checkCode = "";//生成图片后的正确字符
	private String captcha = "";
	
	public String getCheckCode() {
		return checkCode;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	/*设置图片*/
	private int width = 75;
	private int height = 25;
	private int imageType = BufferedImage.TYPE_INT_RGB;

	//画随机线
	public void drawRondamLine(Graphics graph){
		for(int i=0; i<2; i++){
			graph.setColor(Color.RED);
			int x1 = random.nextInt(width);
			int y1 = random.nextInt(height);
			int x2 = random.nextInt(width);
			int y2 = random.nextInt(height);
			graph.drawLine(x1, y1, x2, y2);
		}
	}
	
	public ByteArrayInputStream createImage(){
		BuildImg bi = new BuildImg();
		BufferedImage image = new BufferedImage(this.width, this.height, this.imageType);
		Graphics g = image.getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, this.width, this.height);
		g.setFont(new Font("Times New Roman", Font.BOLD, 20));
		//g.setColor(Color.RED);
		drawRondamLine(g);
		g.setColor(Color.RED);
		//生成4个随机字符
		
		
		for(int i=0; i<4; i++){
			int n = random.nextInt(36);
			char c = character.charAt(n);
			captcha += c;
			/*添加旋转效果*/
//			AffineTransform trans = new AffineTransform();
//			trans.rotate(20, 5);
//			g2d.setTransform(trans);
		}		
		checkCode = captcha;
		System.out.println("验证码： " + captcha);
		
		g.drawString(captcha, 15, 20);//写字符到图像
	    ByteArrayInputStream inputStream = null;
	    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		try{
			ImageOutputStream imgOutput = ImageIO.createImageOutputStream(outputStream);
			ImageIO.write(image, "jpg", new File("image/createImg.jpg"));
			imgOutput.close();
			inputStream = new ByteArrayInputStream(outputStream.toByteArray());
			outputStream.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return inputStream;
	}

//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		
//		BuildImg bi = new BuildImg();
//		System.out.println("run!");
//		bi.createImage();
//	}

}
