package zov.blessed.crack.by.laqwrt;

import main.Main;
import zov.blessed.crack.by.laqwrt.govno.Class_160;
import zov.blessed.crack.by.laqwrt.govno.Class_81;
import zov.blessed.crack.by.laqwrt.govno.Class_260;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

public class Class_174 {
    private static final Map<Class<?>, byte[]> field_930 = new ConcurrentHashMap();
    private static final Map<Class<?>, Class_23> field_931 = new ConcurrentHashMap();
    private static final String[] field_932 = new String[200];

    public static byte[] method_719(Class<?> var0) {
        byte[] var1 = Main.gcb(var0);
        if (!field_930.containsKey(var0)) {
            field_930.put(var0, var1);
        }

        return var1;
    }

    public static void method_720(Class<?> var0, Class_23 var1) {
        Class_160 var2 = new Class_160(2);
        var1.method_21(var2);
        method_721(var0, var2.method_583());
    }

    public static void method_721(Class<?> var0, byte[] var1) {
        Main.rc(var0, var1);
    }

    public static void method_722() {
        ArrayList<CompletableFuture> var0 = new ArrayList<>();

        for (Entry<Class<?>, byte[]> var3 : field_930.entrySet()) {
            CompletableFuture<Void> var5 = CompletableFuture.runAsync(() -> {
                Class_212.method_916(() -> {
                    Main.rc(var3.getKey(), var3.getValue());
                });
            });
            var0.add(var5);
        }

        var0.forEach(Class_174::accept);
        field_930.clear();
        field_931.clear();
    }

    public static Class_23 method_723(Class<?> var0) {
        return (Class_23) field_931.computeIfAbsent(var0, (var1) -> {
            Class_23 var2 = new Class_23();
            byte[] var3 = (byte[]) field_930.putIfAbsent(var0, method_719(var0));
            Class_81 var4 = new Class_81(var3);
            var4.method_248(var2, 8);
            return var2;
        });
    }

    public static Class_211 method_724(Class_23 var0, Method var1) {
        String var2 = Class_260.method_1211(var1);
        Class_211 var3 = (Class_211) Class_140.method_453(var0.field_129, (var2x) -> {
            return var2x.field_1084.equals(var1.getName()) && var2x.field_1085.equals(var2);
        });
        return var3;
    }

    public static String method_725(int var0) {
        return var0 >= 0 && var0 <= 199 ? field_932[var0] : "";
    }

    static {
        field_932[0] = "NOP";
        field_932[1] = "ACONST_NULL";
        field_932[2] = "ICONST_M1";
        field_932[3] = "ICONST_0";
        field_932[4] = "ICONST_1";
        field_932[5] = "ICONST_2";
        field_932[6] = "ICONST_3";
        field_932[7] = "ICONST_4";
        field_932[8] = "ICONST_5";
        field_932[9] = "LCONST_0";
        field_932[10] = "LCONST_1";
        field_932[11] = "FCONST_0";
        field_932[12] = "FCONST_1";
        field_932[13] = "FCONST_2";
        field_932[14] = "DCONST_0";
        field_932[15] = "DCONST_1";
        field_932[16] = "BIPUSH";
        field_932[17] = "SIPUSH";
        field_932[18] = "LDC";
        field_932[21] = "ILOAD";
        field_932[22] = "LLOAD";
        field_932[23] = "FLOAD";
        field_932[24] = "DLOAD";
        field_932[25] = "ALOAD";
        field_932[46] = "IALOAD";
        field_932[47] = "LALOAD";
        field_932[48] = "FALOAD";
        field_932[49] = "DALOAD";
        field_932[50] = "AALOAD";
        field_932[51] = "BALOAD";
        field_932[52] = "CALOAD";
        field_932[53] = "SALOAD";
        field_932[54] = "ISTORE";
        field_932[55] = "LSTORE";
        field_932[56] = "FSTORE";
        field_932[57] = "DSTORE";
        field_932[58] = "ASTORE";
        field_932[79] = "IASTORE";
        field_932[80] = "LASTORE";
        field_932[81] = "FASTORE";
        field_932[82] = "DASTORE";
        field_932[83] = "AASTORE";
        field_932[84] = "BASTORE";
        field_932[85] = "CASTORE";
        field_932[86] = "SASTORE";
        field_932[87] = "POP";
        field_932[88] = "POP2";
        field_932[89] = "DUP";
        field_932[90] = "DUP_X1";
        field_932[91] = "DUP_X2";
        field_932[92] = "DUP2";
        field_932[93] = "DUP2_X1";
        field_932[94] = "DUP2_X2";
        field_932[95] = "SWAP";
        field_932[96] = "IADD";
        field_932[97] = "LADD";
        field_932[98] = "FADD";
        field_932[99] = "DADD";
        field_932[100] = "ISUB";
        field_932[101] = "LSUB";
        field_932[102] = "FSUB";
        field_932[103] = "DSUB";
        field_932[104] = "IMUL";
        field_932[105] = "LMUL";
        field_932[106] = "FMUL";
        field_932[107] = "DMUL";
        field_932[108] = "IDIV";
        field_932[109] = "LDIV";
        field_932[110] = "FDIV";
        field_932[111] = "DDIV";
        field_932[112] = "IREM";
        field_932[113] = "LREM";
        field_932[114] = "FREM";
        field_932[115] = "DREM";
        field_932[116] = "INEG";
        field_932[117] = "LNEG";
        field_932[118] = "FNEG";
        field_932[119] = "DNEG";
        field_932[120] = "ISHL";
        field_932[121] = "LSHL";
        field_932[122] = "ISHR";
        field_932[123] = "LSHR";
        field_932[124] = "IUSHR";
        field_932[125] = "LUSHR";
        field_932[126] = "IAND";
        field_932[127] = "LAND";
        field_932[128] = "IOR";
        field_932[129] = "LOR";
        field_932[130] = "IXOR";
        field_932[131] = "LXOR";
        field_932[132] = "IINC";
        field_932[133] = "I2L";
        field_932[134] = "I2F";
        field_932[135] = "I2D";
        field_932[136] = "L2I";
        field_932[137] = "L2F";
        field_932[138] = "L2D";
        field_932[139] = "F2I";
        field_932[140] = "F2L";
        field_932[141] = "F2D";
        field_932[142] = "D2I";
        field_932[143] = "D2L";
        field_932[144] = "D2F";
        field_932[145] = "I2B";
        field_932[146] = "I2C";
        field_932[147] = "I2S";
        field_932[148] = "LCMP";
        field_932[149] = "FCMPL";
        field_932[150] = "FCMPG";
        field_932[151] = "DCMPL";
        field_932[152] = "DCMPG";
        field_932[153] = "IFEQ";
        field_932[154] = "IFNE";
        field_932[155] = "IFLT";
        field_932[156] = "IFGE";
        field_932[157] = "IFGT";
        field_932[158] = "IFLE";
        field_932[159] = "IF_ICMPEQ";
        field_932[160] = "IF_ICMPNE";
        field_932[161] = "IF_ICMPLT";
        field_932[162] = "IF_ICMPGE";
        field_932[163] = "IF_ICMPGT";
        field_932[164] = "IF_ICMPLE";
        field_932[165] = "IF_ACMPEQ";
        field_932[166] = "IF_ACMPNE";
        field_932[167] = "GOTO";
        field_932[168] = "JSR";
        field_932[169] = "RET";
        field_932[170] = "TABLESWITCH";
        field_932[171] = "LOOKUPSWITCH";
        field_932[172] = "IRETURN";
        field_932[173] = "LRETURN";
        field_932[174] = "FRETURN";
        field_932[175] = "DRETURN";
        field_932[176] = "ARETURN";
        field_932[177] = "RETURN";
        field_932[178] = "GETSTATIC";
        field_932[179] = "PUTSTATIC";
        field_932[180] = "GETFIELD";
        field_932[181] = "PUTFIELD";
        field_932[182] = "INVOKEVIRTUAL";
        field_932[183] = "INVOKESPECIAL";
        field_932[184] = "INVOKESTATIC";
        field_932[185] = "INVOKEINTERFACE";
        field_932[186] = "INVOKEDYNAMIC";
        field_932[187] = "NEW";
        field_932[188] = "NEWARRAY";
        field_932[189] = "ANEWARRAY";
        field_932[190] = "ARRAYLENGTH";
        field_932[191] = "ATHROW";
        field_932[192] = "CHECKCAST";
        field_932[193] = "INSTANCEOF";
        field_932[194] = "MONITORENTER";
        field_932[195] = "MONITOREXIT";
        field_932[197] = "MULTIANEWARRAY";
        field_932[198] = "IFNULL";
        field_932[199] = "IFNONNULL";
    }

    private static void accept(Object t) {
      //  Object join = CompletableFuture.join(t);
    }
}
