package by.bnty.fitr.poit.matsak.javalabs.lab3.model;

public class DataTypeTester {
    public static void testByte() {
        byte a = 5, b = 2, c;
        System.out.println("\n***** Arithmetical Operators *****");
        c = (byte)(a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        c = (byte)(a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        c = (byte)(a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        c = (byte)(a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        c = (byte)(a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
        a = 5;
        c = (byte)(-a);
        System.out.printf("-%d = %d\n", a, c);
        c = (byte)(+a);
        System.out.printf("+%d = %d\n", a, c);
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        c = (byte)(a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (byte)(a | b);
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (byte)(a ^ b); // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (byte)(~a);
        System.out.printf("~%d = %d\n", a, c);
        c = (byte)(a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);
        c = (byte)(a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        a = -5;
        c = (byte)(a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        a = 5;
        c = (byte)(a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        a = -5;
        c = (byte)(a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        int i = 9;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (byte)i;
        System.out.printf("byte = int: c = (byte)%d --> c = %d\n", i, c);
        c = (byte)sh;
        System.out.printf("byte = short: c = (byte)%d --> c = %d\n", sh, c);
        c = (byte)ch;
        System.out.printf("byte = char: c = (byte)'%c' --> c = %d\n", ch, c);
        c = (byte) l;
        System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);
        c = (byte) f;
        System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);
        System.out.printf("byte = boolean: c = (byte)%b --> Compile Error\n",
                bool);
    }

    public static void testShort() {
        short a = 5, b = 2, c;
        System.out.println("\n***** Arithmetical Operators *****");
        c = (short)(a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        c = (short)(a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        c = (short)(a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        c = (short)(a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        c = (short)(a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
        a = 5;
        c = (short)(-a);
        System.out.printf("-%d = %d\n", a, c);
        c = (short)(+a);
        System.out.printf("+%d = %d\n", a, c);
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        c = (short)(a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        c = (short)(a | b);
        System.out.printf("%d | %d = %d\n", a, b, c);

        c = (short)(a ^ b);
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        c = (short)(~a);
        System.out.printf("~%d = %d\n", a, c);
        c = (short)(a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);
        c = (short)(a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        a = -5;
        c = (short)(a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        a = 5;
        c = (short)(a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        a = -5;
        c = (short)(a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        int i=9;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);
        c = (short)i;
        System.out.printf("short = int: c = (short)%d --> c = %d\n", i, c);
        c = (short)ch;
        System.out.printf("short = char: c = (short)'%c' --> c = %d\n", ch, c);
        c = (short) l;
        System.out.printf("short = long: c = (short)%d --> c = %d\n", l, c);
        c = (short) f;
        System.out.printf("short = float: c = (short)%f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("short = double: c = (short)%f --> c = %d\n", d, c);
        System.out.printf("short = boolean: c = (short)%b --> Compile Error\n",
                bool);
    }

    public static void testChar() {
        char a = 'g', b = 'a', c;
        System.out.println("\n***** Arithmetical Operators *****");
        System.out.println("a+b= "+(char)(a+b));
        System.out.println("a-b= "+(char)(a-b));
        System.out.println("a*b= "+(char)(a*b));
        System.out.println("a/b= "+(char)(a/b));
        System.out.println("a%b= "+(char)(a%b));
        System.out.println("-a = "+(char)(-a));
        System.out.println("+a= "+(char)(+a));
        System.out.println("++a = "+(++a));
        System.out.println("a++ = "+(a++));
        System.out.println("--a = "+(--a));
        System.out.println("a-- = "+(a--));
        System.out.println("\n***** Bitwise Operators *****");
        System.out.println("a&b= "+(char)(a & b));
        System.out.println("a|b= "+(char)(a | b));
        System.out.println("a^b= "+(char)(a ^ b));
        System.out.println("~a= "+(char)(~a));
        System.out.println("a<<1= "+(char)(a <<1));

        System.out.println("a>>1= "+(char)(a >>1));
        System.out.println("a>>>1= "+(char)(a >>> 1));
        System.out.println("\n***** Assignment Operators *****");
        c = (char)7;
        System.out.println("a += b:"+(a += b));
        System.out.println("a -= b:"+(a -= b));
        System.out.println("a *= b:"+(a *= b));
        System.out.println("a /= b:"+(a /= b));
        System.out.println("a %= b:"+(a %= b));
        System.out.println("a |= b:"+(a |= b));
        System.out.println("a &= b:"+(a &= b));
        System.out.println("a ^= b:"+(a ^= b));
        System.out.println("a >>= 1:"+(a >>= 1));
        System.out.println("a <<= 1:"+(a <<= 1));
        System.out.println("a >>>= 1:"+(a >>>= 1));
        System.out.println("\n***** Relational Operators *****");
        System.out.println("a>b: "+(a > b));
        System.out.println("a>=b: "+(a >= b));
        System.out.println("a<b: "+(a < b));
        System.out.println("a<=b: "+(a <= b));
        System.out.println("a==b: "+(a == b));
        System.out.println("a!=b: "+(a != b));
        System.out.println("\n***** Logical Operations *****");
        System.out.println("(a > b) && (a > 0): "+ ((a > b) && (a > 0)));
        System.out.println("(a > b) & (a > 0): "+ ((a > b) & (a > 0)));
        System.out.println("(a >= b) || (b != 0): "+ ((a >= b) || (b != 0)));
        System.out.println("(a >= b) | (b != 0): "+ ((a >= b) | (b != 0)));
        System.out.println("(a >= b) ^ (b != 0): "+ ((a >= b) ^ (b != 0)));
        System.out.println("!(a >= b): "+ (!(a >= b)));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.println("(a > b ? a : b): "+(a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        int i=9;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        System.out.println("c = (char)byte: "+(c = (char)bt));
        System.out.println("c = (char)short: "+(c = (char)sh));
        System.out.println("c = (char)int: "+(c = (char)i));
        System.out.println("c = (char)long: "+(c = (char)l));
        System.out.println("c = (char)float: "+(c = (char) f));
        System.out.println("c = (char)double: "+(c = (char) d));
        System.out.println("char = boolean: c = (char)"+bool+" --> Compile Error");

    }

    public static void testInt() {
        int a = 5, b = 2, c;
        System.out.println("\n***** Arithmetical Operators *****");
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        a = 5;
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = a | b;
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = a ^ b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = -5;
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = 5;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = -5;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                bool);
    }

    public static void testLong(){
        long a = 5, b = 2, c;
        System.out.println("\n***** Arithmetical Operators *****");
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        a = 5;
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));
        c = a | b;
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));
        c = a ^ b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        a = -5;
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        a = 5;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        a = -5;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        int i = 9;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
        c = i;
        System.out.printf("long = int: c = %d --> c = %d\n", i, c);
        c = (long)f;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
        c = (long) d;
        System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
        System.out.printf("long = boolean: c = (long)%b --> Compile Error\n",
                bool);
    }

    public static void testFloat(){
        float a = 5.5f, b = 2.2f, c;
        System.out.println("\n***** Arithmetical Operators *****");
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);
        a = 5.5f;
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        a = 5.5f;
        System.out.printf("++%f = %f\n", a, ++a);
        a = 5.5f;
        System.out.printf("%f++ = %f\n", a, a++);
        a = 5.5f;
        System.out.printf("--%f = %f\n", a, --a);
        a = 5.5f;
        System.out.printf("%f-- = %f\n", a, a--);
        System.out.println("\n***** Assignment Operators *****");
        c = 7.7f;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        System.out.printf("%f != %f --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b,
                (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        int i = 9;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("float = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);
        c =  l;
        System.out.printf("float = long: c = %d --> c = %f\n", l, c);
        c = i;
        System.out.printf("float = int: c = %f --> c = %f\n", f, c);
        c = (float) d;
        System.out.printf("float = double: c = (float)%f --> c = %f\n", d, c);
        System.out.printf("int = boolean: c = (float)%b --> Compile Error\n",
                bool);
    }

    public static void testDouble(){
        double a = 5.5, b = 2.2, c;
        System.out.println("\n***** Arithmetical Operators *****");
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);
        a = 5;
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        a = 5;
        System.out.printf("++%f = %f\n", a, ++a);
        a = 5;
        System.out.printf("%f++ = %f\n", a, a++);
        a = 5;
        System.out.printf("--%f = %f\n", a, --a);
        a = 5;
        System.out.printf("%f-- = %f\n", a, a--);
        System.out.println("\n***** Assignment Operators *****");
        c = 7.7;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
        System.out.println("\n***** Relational Operators *****");
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        System.out.printf("%f != %f --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b,
                (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        int i = 9;
        boolean bool = true;
        c = bt;
        System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("double = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c);
        c = l;
        System.out.printf("double = long: c = %d --> c = %f\n", l, c);
        c = f;
        System.out.printf("double = float: c = %f --> c = %f\n", f, c);
        c = i;
        System.out.printf("double = int: c = %d --> c = %f\n", i, c);
        System.out.printf("double = boolean: c = (double)%b --> Compile Error\n",
                bool);
    }

    public static void testBoolean(){
        boolean a = true, b = false, c;
        System.out.println("\n***** Arithmetical Operators *****");

        System.out.println("\n***** Bitwise Operators *****");
        c = a & b; // bitwise AND
        System.out.printf("%b & %b = %b\n", a, b, c);
        c = a | b; // bitwise OR
        System.out.printf("%b | %b = %b\n", a, b, c);
        c = a ^ b; // bitwise XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);

        System.out.println("\n***** Assignment Operators *****");
        System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
                System.out.println("\n***** Relational Operators *****");
        System.out.printf("%b == %b --> %b\n", a, b, a == b);

        System.out.printf("%b != %b --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        c = a && b; // logical AND
        System.out.printf("%b && %b = %b\n", a, b, c);
        c = a || b; // logical OR
        System.out.printf("%b || %b = %b\n", a, b, c);
        c = a ^ b; // logical XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        System.out.printf("!%b --> %b\n", a, !a);
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
        System.out.println("\nType Cast Operator:");

        boolean bool = true;
                c = bool;
    }
}
