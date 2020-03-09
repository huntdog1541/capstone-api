package com.capstone.capstoneapi.Utils;

import capstone.Capstone;

public class CapstoneUtils {

    public CapstoneUtils()
    {

    }

    public static byte[] hexString2Byte(String s) {
        // from http://stackoverflow.com/questions/140131/convert-a-string-representation-of-a-hex-dump-to-a-byte-array-using-java
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }

    public static String hex(int i)
    {
        return Integer.toString(i, 16);
    }

    public static String hex(long i)
    {
        return Long.toString(i, 16);
    }

    public static String array2hex(byte[] arr)
    {
        String ret = "";
        for(int i = 0; i<arr.length; i++)
        {
            ret += String.format("0x02x ", arr[i]);
        }
        return ret;
    }

    public static int getArchitecture(String arch)
    {
        switch (arch.toLowerCase())
        {
            case "arm":
                return Capstone.CS_ARCH_ARM;
            case "mips":
                return Capstone.CS_ARCH_MIPS;
            case "x86":
                return Capstone.CS_ARCH_X86;
            case "m680x":
                return Capstone.CS_ARCH_M680X;
            default:
                return Capstone.CS_ARCH_ALL;
        }
    }

    public static int getMode(String mode)
    {
        switch(mode.toLowerCase())
        {
            case "little":
                return Capstone.CS_MODE_LITTLE_ENDIAN;
            case "big-endian":
                return Capstone.CS_MODE_BIG_ENDIAN;
            case "Mode16":
                return Capstone.CS_MODE_16;
            case "Mode32":
                return Capstone.CS_MODE_32;
            case "Mode64":
                return Capstone.CS_MODE_64;
            default:
                return Capstone.CS_MODE_64;
        }
    }
}
