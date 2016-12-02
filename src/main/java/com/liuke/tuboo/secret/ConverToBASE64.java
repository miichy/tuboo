package com.liuke.tuboo.secret;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class ConverToBASE64 {

	public static void main(String[] args) {
		try {
			encrypt();
			System.out.println(decryptBase64());
			System.out.println(Base64.getDecoder().decode("mobird".getBytes(StandardCharsets.UTF_8)));
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static byte[] encrypt() throws Exception{
		
		Encoder d = Base64.getEncoder();
		byte[] as = "mobird".getBytes(StandardCharsets.UTF_8);
		System.out.println(as.length);
		byte[] bs = d.encode("mobird".getBytes(StandardCharsets.UTF_8));
		System.out.println(bs.length);
		for(int i = 0;i < bs.length;i++){		
			System.out.println(bs[i]);
		}
		return bs;
	}
	
	public static String decryptBase64() throws Exception{
		Encoder b = Base64.getEncoder();
		String str = b.encodeToString("mobird".getBytes(StandardCharsets.UTF_8));
		return str;
	}

}
