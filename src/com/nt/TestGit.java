package com.nt;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TestGit {

	public static void main(String[] args) throws Exception {
		System.out.println(" SAY HELLO TO GIT");
		Scanner s=null;
		String date=null;
		java.util.Date ud1=null;
		SimpleDateFormat sdf1=null;
		long ms=0;//TIME IN MILLISECONDS
		java.sql.Date sqd1=null;
		s=new Scanner(System.in);
		System.out.println("ENTER DATE VALUE");
		date=s.next();//DD-MM-YYYY
		 sdf1=new SimpleDateFormat("dd-MM-yyyy");
		 ud1=sdf1.parse(date);
		System.out.println(" DATE VALUE="+date);
		ms=ud1.getTime();
		sqd1=new java.sql.Date(ms);
		System.out.println(" SQL DATE VALUE="+sqd1);
		s.close();
			}

		}
