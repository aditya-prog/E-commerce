
package com.learn.mycart.helper;


public class Helper {
    public static String get10Words(String desc)
    {
        String[] strs = desc.split(" ");
        
        if(strs.length>12)
        {
            String res="";
            for(int i=0;i<18;i++)
            {
                res=res+strs[i]+" ";
            }
            return (res+"...");
        }else
        {
            int x=10;
            return (desc+"...");
        }
        
    }
}
