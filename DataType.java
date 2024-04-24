package c.datatype;

public class DataType {

    public static void main(String[] args) {

//  Integer Family
//  Byte range is -128 to 127
        byte a=10;
        byte b=-45;
        System.out.println(a);
        System.out.println(b);

//  Short range is -32768 to 32767
        short c=32665;
        short d=-25437;
        System.out.println(c);
        System.out.println(d);

//  Int range is -2,147,483,648 to 2,147,483,647
        int e=-214748648;
        System.out.println(e);

//  Long range is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        Long f=9223372036844775807L;
        System.out.println(f);

//  Float Family
//  Float range is 3.4E-38 to 3.4E+38
        float g=56565437854811114545123545365656.1111111111111111111111111111111111111f;
        System.out.println(g);

//  Double rang is approximately 1.8*10(308)
        double h= -121212212312121311.11111111111111111111111111111111111111;
        System.out.println(h);

//  Character Family
//  Character rang is unicode value (Single rang value)
        char i= 'v';
        System.out.println(i);

//  Boolean Family
//  Boolean don't have any range. It's fix value as True or False.
        boolean j=true;
        System.out.println("j="+j);

//  String Family
//  String range is 0 to 2,147,483,647.
        String k = "I am a Manual Tester";
        System.out.println(k);

//  Software Tester
        String l="Software ";
        String m ="Tester";
        System.out.println(l+m);

    }

}
