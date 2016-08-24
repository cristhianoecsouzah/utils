package br.jus.trf2.chkjce;

import javax.crypto.Cipher;

class App {
  public static void main(String[] args) {
    try {
      System.out.println("Checking Java Cryptography Extension (JCE) Unlimited Strength!");
      int maxKeyLen = Cipher.getMaxAllowedKeyLength("AES");
	  System.out.println("Limited to " + maxKeyLen + " bits!");
	  if(maxKeyLen == 128){ 
		System.out.println("LIMITED key length!");
	  }else{
		System.out.println("UNLIMITED key length!");
	  }
    } catch (Exception e){
      e.printStackTrace();
    }
  }
}