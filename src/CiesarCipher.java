import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CiesarCipher {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
    	char[] ch = s.toCharArray();
    	String str = "";
    	if(k>26) {
    		k=k%26;
    	}
    	for(int i=0; i<s.length(); i++) {
    		
    		if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z') {
    			if((char)ch[i]+k>'Z' && (char)ch[i]+k<'a') {
    				str+=(char)(ch[i]+k-26);
    			}
    			else if((char)ch[i]+k>='A' && (char)ch[i]+k<'Z') {
    				System.out.println((char)(ch[i]+k-26));
    				str+=(char)(ch[i]+k-26);
    			}
    			else if((char)(ch[i]+k)>'z') {
    				str+=(char)(ch[i]+k-26);
    			}
    			else if((char)ch[i]=='z') {
    				ch[i]='a';
    				System.out.println(ch[i]);
    				str+=(char)ch[i]+k-1;
    			}
    			else if((char)ch[i]=='Z') {
    				ch[i]='A';
    				str+=(char)ch[i]+k-1;
    			}
    			else
    				str+=(char)(ch[i]+k);
    		}
    		/*else if(ch[i]=='-') {
    			str+='-';
    		}*/
    		else if(ch[i]<'A' || ch[i]>'Z' && ch[i]<'a' || ch[i]>'z' && ch[i]!='-') {
    			str+=ch[i];
    		}
    	}
    	return str;
    }


    public static void main(String[] args) throws IOException {

        int n = 11;
        String s = "W";//Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj
//!w-bL`-yX!.G`mVKmFlX/MaCyyvSS!CSwts.!g/`He`eJk1DGZBa`eBLdyu`hZD`vV-jZDm.LCBSre..-!.!dmv!-E
        int k = 62;

        String result = caesarCipher(s, k);

        System.out.println(result);
    }
}
