/*
 * Copyright (c) 2017. 简书首页：http://www.jianshu.com/u/092df3f77bca 山东三米科技有限公司(于起宇) All rights reserved.
 */

package com.yuqiyu.chapter37.utils;

import org.springframework.util.StringUtils;
import sun.misc.BASE64Decoder;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * @author 
 * 3DES加解密工具
 */
public class DES3Util {
	
	public static final String DESKEY = "DE76E3EC39801CEEE0440025";

	
	private DES3Util() {
		
	}
	
	
	public synchronized static String encrypt(String content) {
		
		try {
			return encrypt(content, DESKEY, "UTF-8");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;
	}
	
	
	public static String toDES(String json) {

		return encrypt("comSMAPPcom" + "|" + json + "|" + System.currentTimeMillis());
	}
	
	/**
	 * @param content 	加密内容
	 * @param desKey  	3DES KEY
	 * @param charset  	字符集
	 * @return
	 * @throws Exception
	 */
	public static String encrypt(String content, String desKey, String charset)throws Exception {
		try {
			if(StringUtils.isEmpty(desKey) || desKey.length() != 24) {
				throw new Exception("3des key's length must be 24");
			}
			if(StringUtils.isEmpty(content)) {
				return "";
			}
			SecretKeySpec key = new SecretKeySpec(desKey.getBytes(charset), "DESede");
			Cipher cipher = Cipher.getInstance("DESede");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte [] encryptBytes = cipher.doFinal(content.getBytes(charset));
			return BASE64Encoder.encode(encryptBytes);
		} catch (Exception e) {
			throw e;
		} 
	}
	
	/**
	 * @param content		解密内容
	 * @param desKey		3des key
	 * @param charset		字符集
	 * @return
	 * @throws Exception
	 */
	public static String decrypt(String content, String desKey, String charset)throws Exception {
		try {

			if(StringUtils.isEmpty(desKey) || desKey.length() != 24) {
				throw new Exception("3des key's length must be 24");
			}
			if(StringUtils.isEmpty(content)) {
				
				return "";
			}
			
			byte [] decryptBytes = null;
			decryptBytes = new BASE64Decoder().decodeBuffer(content);
			//System.out.println("decryptBytes:"+decryptBytes);
			SecretKeySpec key = new SecretKeySpec(desKey.getBytes(charset), "DESede");
			Cipher cipher = Cipher.getInstance("DESede");
			cipher.init(Cipher.DECRYPT_MODE, key);
			return new String(cipher.doFinal(decryptBytes), charset);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static String decryt(String content)
	{
		try
		{
			return decrypt(content,DESKEY,"UTF-8");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	

	/**
	 * SHA1 加密
	 * @param decript
	 * @return
	 */
	public static String SHA1(String decript) {
		try {
			MessageDigest digest = MessageDigest
					.getInstance("SHA-1");
			digest.update(decript.getBytes());
			byte messageDigest[] = digest.digest();
			// Create Hex String
			StringBuffer hexString = new StringBuffer();
			// 字节数组转换为 十六进制 数
			for (int i = 0; i < messageDigest.length; i++) {
				String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
				if (shaHex.length() < 2) {
					hexString.append(0);
				}
				hexString.append(shaHex);
			}
			return hexString.toString();

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}
}
