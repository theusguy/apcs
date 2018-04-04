import java.awt.*;
import javax.swing.JSlider;

public class colorWheelLogic {
	public String getHex(int r, int g, int b) {
		int r1=r/16;
		int r2=r-(r1*16);
		int g1=g/16;
		int g2=g-(g1*16);
		int b1=b/16;
		int b2=b-(b1*16);
		
		String newR=convert(r1, r2);
		String newG=convert(g1, g2);
		String newB=convert(b1, b2);
		return newR + newG + newB;
	}
	
	private String convert(int c1, int c2) {
		String[] s={"a", "b", "c", "d", "e", "f"};
		String output="";
		if(c1>=10) {
			c1-=10;
			output+=s[c1];
		} else {
			output+=Integer.toString(c1);
		}
		
		if(c2>=10) {
			c2-=10;
			output+=s[c2];
		} else {
			output+=Integer.toString(c2);
		}
		
		return output;
	}
	
	public Color getColor(JSlider[] slider) {
		int r=slider[0].getValue();
		int g=slider[1].getValue();
		int b=slider[2].getValue();
		return new Color(r,g,b);
	}		
}
