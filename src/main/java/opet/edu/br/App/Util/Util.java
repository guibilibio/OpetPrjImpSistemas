package opet.edu.br.App.Util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Util {

	public static String md5(String senha) throws NoSuchAlgorithmException {
		
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		BigInteger bigInteger = new BigInteger(1,messageDigest.digest(senha.getBytes()));
		return bigInteger.toString(16);
	}
	
}
