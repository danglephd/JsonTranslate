/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.vhes.common;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 *
 * @author danglph
 */
public class CharsetDetector {
    
    public static Charset detectCharset(File f) {
 
        String[] charsets = {"UTF-8", "windows-1253", "ISO-8859-7"};
        Charset charset = null;
 
        for (String charsetName : charsets) {
            charset = detectCharset(f, Charset.forName(charsetName));
            if (charset != null) {
                break;
            }
        }
 
        return charset;
    }
 
    private static Charset detectCharset(File f, Charset charset) {
        try {
            BufferedInputStream input = new BufferedInputStream(new FileInputStream(f));
 
            CharsetDecoder decoder = charset.newDecoder();
            decoder.reset();
 
            byte[] buffer = new byte[512];
            boolean identified = false;
            while ((input.read(buffer) != -1) && (!identified)) {
                identified = identify(buffer, decoder);
            }
 
            input.close();
 
            if (identified) {
                return charset;
            } else {
                return null;
            }
 
        } catch (Exception e) {
            return null;
        }
    }
    
    private static boolean identify(byte[] bytes, CharsetDecoder decoder) {
        try {
            decoder.decode(ByteBuffer.wrap(bytes));
        } catch (CharacterCodingException e) {
            return false;
        }
        return true;
    }
    
    public static String convertToUTF8(String s) {
        String out = null;
        try {
            out = new String(s.getBytes("UTF-8"), "ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException e) {
            return null;
        }
        return out;
    }
    
    public static void main(String[] args) {
//        File f = new File(GlobalVariables.folderSrt + "\\2The.Little.Hours.2017.720p.BluRay.X264-AMIABLE.srt");
// 
////        String[] charsetsToBeTested = {"UTF-8", "windows-1253", "ISO-8859-7"};
// 
//        CharsetDetector cd = new CharsetDetector();
//        Charset charset = cd.detectCharset(f);
// 
//        if (charset != null) {
//            try {
//                InputStreamReader reader = new InputStreamReader(new FileInputStream(f), charset);
//                int c = 0;
//                while ((c = reader.read()) != -1) {
//                    System.out.print((char)c);
//                }
//                reader.close();
//            } catch (FileNotFoundException fnfe) {
//                fnfe.printStackTrace();
//            }catch(IOException ioe){
//                ioe.printStackTrace();
//            }
// 
//        }else{
//            System.out.println("Unrecognized charset.");
//        }
    }
}
