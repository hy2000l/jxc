package com.jxc.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class SysTools {
	public static String bulidBillNo(String prefix){
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		String no=prefix+df.format(new Date());
		return no;
	}
	public static void main(String[] args) {
		System.out.println(SysTools.bulidBillNo("cmp"));
	}
}
