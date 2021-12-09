public class ShadesOfGrey {
    static String[] shadesOfGrey(int num) {
        // returns n shades of grey in an array
        num=Math.max(0,Math.min(254,num));
        String[] r= new String[num];
        for(int i=1;i<=num;i++){
            r[i-1]=String.format("#%02x%02x%02x",i,i,i);
        }
        return r;
    }
}