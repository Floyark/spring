import com.statik.StatiExtends;
import com.statik.StatiTest;

import java.lang.reflect.Field;
import java.util.ArrayList;


public class Test {




    //Inter int 对比
    @org.junit.Test
    public void testOne(){
        Integer a1=100;
        Integer a2=100;
        System.out.println("a1==a2:"+(a1==a2));

        Integer b1=200;
        Integer b2=200;
        System.out.println("b1==b2:"+(b1==b2));

        int c1=100;
        int c2=100;
        System.out.println("c1==c2:"+(c1==c2));

        int d1=200;

        System.out.println("a1==c1:"+(a1==c1));
        System.out.println("b1==d1:"+(b1==d1));
    }

    //Integer数据交换
    @org.junit.Test
    public void testTwo() throws NoSuchFieldException, IllegalAccessException {
        Integer i1=100;
        Integer i2=8;
        Field fun= Integer.class.getDeclaredField("value");
        fun.setAccessible(true);

        //交换
        Integer swap=new Integer(i1.intValue());
        fun.set(i1,i2);
        fun.set(i2,swap);


        //输出
        System.out.println("i1="+i1.intValue());
        System.out.println("i2="+i2.intValue());

    }

    //StringBuffer的capacity自动扩容
    @org.junit.Test
    public void testThree(){
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("01234567989123456");
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());
    }

    //泛型 上下界
    @org.junit.Test
    public void testFour(){
        C<? extends A> c=new C<B>(new B());
        System.out.println(c.getItem());
        C<? super A> cc=new C<D>(new D());
        cc.setItem(new A());
    }

    class D{ }
    class A extends D{ }
    class B extends A{}
    class C<T>{
        private T item;

        public C(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }
    }

    //getInteger
    @org.junit.Test
    public void testFive(){
        Integer integer = Integer.getInteger("123456",13);
        System.out.println(integer);

        int parseInt = Integer.parseInt("123456");
        System.out.println(parseInt);

        Integer string = Integer.decode("0x13");
        System.out.println(string);

        Integer int1=100;
        Integer int2=100;
        int i = int1.compareTo(int2);
    }

    //char转化为int
    @org.junit.Test
    public void testSix(){
        char c='3';
        int i=(int)c;
        System.out.println(i);
        int j=Character.digit(c,10);
        System.out.println(j);
        int z=Integer.parseInt(c+"");
        System.out.println(z);
    }

    //char 和int型比较  char向上转型为int  ASCII
    @org.junit.Test
    public void testSeven(){
        Character c=(char)128;
        Character c1='\u0080';
        System.out.println((int)c1);
        System.out.println(c==c1);

    }

    //字符比较Character.compare
    @org.junit.Test
    public void testEight(){
        Character c1=(char)97;
        Character c2=(char)103;
        System.out.println(c1+" "+c2);
        System.out.println(c1.compareTo(c2));
        Character c3='a';
        Character c4='g';
        System.out.println(c3.compareTo(c4));
    }

    //字符变字符串
    @org.junit.Test
    public void testNine(){
        String str1=Character.toString('s');
        System.out.println(str1);
    }

    //int变字符
    @org.junit.Test
    public void testTen(){
//        for(int i=0;i<3;i++)
//            System.out.println("a");
//        System.out.println("b");
//        Long a=0x80000000l;
//        String string = Long.toString(a, 10);
//        System.out.println(string);
//
//        int i=65537;
//        int q=i/100;
//        Integer max=new Integer(Integer.MAX_VALUE);
//        String string = Integer.toString(q, 2);
//        System.out.println("2147483647 最大的二进制："+Integer.toString(Integer.MAX_VALUE,2));
//        System.out.println(string);
//        System.out.println("Q: "+q);
//        System.out.println();
//        int j=(q<<6)+(q<<5)+(q<<2);
//        System.out.println("q<<6: "+(q<<6)+" 二进制："+Integer.toString((q<<6),2));
//        System.out.println("q<<5: "+(q<<5)+" 二进制："+Integer.toString((q<<5),2));
//        System.out.println("q<<2: "+(q<<2)+" 二进制："+Integer.toString((q<<2),2));
//        System.out.println("J: "+j);
        final  char [] DigitTens = {
                '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
                '1', '1', '1', '1', '1', '1', '1', '1', '1', '1',
                '2', '2', '2', '2', '2', '2', '2', '2', '2', '2',
                '3', '3', '3', '3', '3', '3', '3', '3', '3', '3',
                '4', '4', '4', '4', '4', '4', '4', '4', '4', '4',
                '5', '5', '5', '5', '5', '5', '5', '5', '5', '5',
                '6', '6', '6', '6', '6', '6', '6', '6', '6', '6',
                '7', '7', '7', '7', '7', '7', '7', '7', '7', '7',
                '8', '8', '8', '8', '8', '8', '8', '8', '8', '8',
                '9', '9', '9', '9', '9', '9', '9', '9', '9', '9',
        } ;

        final  char [] DigitOnes = {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        } ;
        final  char[] digits = {
                '0' , '1' , '2' , '3' , '4' , '5' ,
                '6' , '7' , '8' , '9' , 'a' , 'b' ,
                'c' , 'd' , 'e' , 'f' , 'g' , 'h' ,
                'i' , 'j' , 'k' , 'l' , 'm' , 'n' ,
                'o' , 'p' , 'q' , 'r' , 's' , 't' ,
                'u' , 'v' , 'w' , 'x' , 'y' , 'z'
        };
        System.out.println("Ones:"+DigitOnes[37]);
        System.out.println("Tnes:"+DigitTens[37]);
        //System.out.println("digits:"+digits[]);
        System.out.println(3434099500l>>>19);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.toString(Integer.MAX_VALUE,16));
        System.out.println(6<<3);
        System.out.println(6<<1);
        System.out.println((int) 6.5);
        int i=1;
        System.out.println(i<<=8);
    }

    // i * 0.1
    @org.junit.Test
    public void testEleven(){
        int i=10;
        int j=10;
        double c=(i*0.1);
        System.out.println(c);
        j*=0.1;
        System.out.println(j);
    }

    //String 字符串常量池
    @org.junit.Test
    public void testTwelve(){
        String a1=new String("hello");
        System.out.println(a1.hashCode());
        System.out.println(a1.length());
        char a[]={'h','e','l','l','o'};
        int aa=0+a[0];
        System.out.println("aa:"+aa);
        for(char c:a){
            System.out.println("c:"+c+" - "+(int)c);
        }
        String str1="gdejicbegh";
        String str2="hgebcijedg";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println("nihao".hashCode());
        String str=new String ("nihao");
        System.out.println(str.toString());
        int i=13;
        System.out.println(i*31);
        System.out.println((i<<5)-i);
    }

    //求100内的素数
    /*
    * 2，3，5，7，11，13，17，
    * 19，23，29，31，37，41，
    * 43，47，53，59，61，67，
    * 71，73，79，83，89，97
    * */
    @org.junit.Test
    public void testThirteen(){

        long l = System.currentTimeMillis();
        for(int i=2;i<100;i++){
            if(i%2!=0){
                if(i%3!=0)
                    if(i%5!=0)
                        if(i%7!=0)
                System.out.println(i);
            }
        }
        long l2 = System.currentTimeMillis();
        System.out.println(l);
        System.out.println(l2);
    }

    //String转为Int
    /*
    final static char[] digits = {
        '0' , '1' , '2' , '3' , '4' , '5' ,
        '6' , '7' , '8' , '9' , 'a' , 'b' ,
        'c' , 'd' , 'e' , 'f' , 'g' , 'h' ,
        'i' , 'j' , 'k' , 'l' , 'm' , 'n' ,
        'o' , 'p' , 'q' , 'r' , 's' , 't' ,
        'u' , 'v' , 'w' , 'x' , 'y' , 'z'
    };
    */
    @org.junit.Test
    public void testFourteen(){

        System.out.println((13 % 2));
    }

    //静态变量可以被继承 不能被重写
    @org.junit.Test
    public void testFifteen(){
        StatiTest statiTest=new StatiTest();
        statiTest.new B().print();
    }
}
