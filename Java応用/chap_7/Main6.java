package chap_7;
import java.util.zip.*;
import java.util.*;
import java.io.*;

public class Main6 {
	public static void main(String[] args) throws IOException{
		try(ZipFile file =  new ZipFile("rpg.jar")){
			for(ZipEntry e :Collections.list(file.entries())) {
				System.out.println(e.getName() + "size=" + e.getCompressedSize());
			}
		}
	}

}
