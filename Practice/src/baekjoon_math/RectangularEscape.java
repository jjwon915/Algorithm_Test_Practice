package baekjoon_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RectangularEscape {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int width = Math.abs(x - w);
		int height = Math.abs(y - h);
		
		int minw = 0;
		int minh = 0;
		
		if(width >= x)
			minw = x;
		else 
			minw = width;
		
		if(height >= y)
			minh = y;
		else
			minh = height;
		
		if(minw >= minh)
			System.out.println(minh);
		else
			System.out.println(minw);

	}

}
