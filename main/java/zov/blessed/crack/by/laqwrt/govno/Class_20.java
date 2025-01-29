package zov.blessed.crack.by.laqwrt.govno;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

final class Class_20 {
   static final String field_7 = "ConstantValue";
   static final String field_8 = "Code";
   static final String field_9 = "StackMapTable";
   static final String field_10 = "Exceptions";
   static final String field_11 = "InnerClasses";
   static final String field_12 = "EnclosingMethod";
   static final String field_13 = "Synthetic";
   static final String field_14 = "Signature";
   static final String field_15 = "SourceFile";
   static final String field_16 = "SourceDebugExtension";
   static final String field_17 = "LineNumberTable";
   static final String field_18 = "LocalVariableTable";
   static final String field_19 = "LocalVariableTypeTable";
   static final String field_20 = "Deprecated";
   static final String field_21 = "RuntimeVisibleAnnotations";
   static final String field_22 = "RuntimeInvisibleAnnotations";
   static final String field_23 = "RuntimeVisibleParameterAnnotations";
   static final String field_24 = "RuntimeInvisibleParameterAnnotations";
   static final String field_25 = "RuntimeVisibleTypeAnnotations";
   static final String field_26 = "RuntimeInvisibleTypeAnnotations";
   static final String field_27 = "AnnotationDefault";
   static final String field_28 = "BootstrapMethods";
   static final String field_29 = "MethodParameters";
   static final String field_30 = "Module";
   static final String field_31 = "ModulePackages";
   static final String field_32 = "ModuleMainClass";
   static final String field_33 = "NestHost";
   static final String field_34 = "NestMembers";
   static final String field_35 = "PermittedSubclasses";
   static final String field_36 = "Record";
   static final int field_37 = 262144;
   static final int field_38 = 256;
   static final int field_39 = 19;
   static final int field_40 = 20;
   static final int field_41 = 26;
   static final int field_42 = 27;
   static final int field_43 = 28;
   static final int field_44 = 29;
   static final int field_45 = 30;
   static final int field_46 = 31;
   static final int field_47 = 32;
   static final int field_48 = 33;
   static final int field_49 = 34;
   static final int field_50 = 35;
   static final int field_51 = 36;
   static final int field_52 = 37;
   static final int field_53 = 38;
   static final int field_54 = 39;
   static final int field_55 = 40;
   static final int field_56 = 41;
   static final int field_57 = 42;
   static final int field_58 = 43;
   static final int field_59 = 44;
   static final int field_60 = 45;
   static final int field_61 = 59;
   static final int field_62 = 60;
   static final int field_63 = 61;
   static final int field_64 = 62;
   static final int field_65 = 63;
   static final int field_66 = 64;
   static final int field_67 = 65;
   static final int field_68 = 66;
   static final int field_69 = 67;
   static final int field_70 = 68;
   static final int field_71 = 69;
   static final int field_72 = 70;
   static final int field_73 = 71;
   static final int field_74 = 72;
   static final int field_75 = 73;
   static final int field_76 = 74;
   static final int field_77 = 75;
   static final int field_78 = 76;
   static final int field_79 = 77;
   static final int field_80 = 78;
   static final int field_81 = 196;
   static final int field_82 = 200;
   static final int field_83 = 201;
   static final int field_84 = 33;
   static final int field_85 = 49;
   static final int field_86 = 20;
   static final int field_87 = 202;
   static final int field_88 = 203;
   static final int field_89 = 204;
   static final int field_90 = 205;
   static final int field_91 = 206;
   static final int field_92 = 207;
   static final int field_93 = 208;
   static final int field_94 = 209;
   static final int field_95 = 210;
   static final int field_96 = 211;
   static final int field_97 = 212;
   static final int field_98 = 213;
   static final int field_99 = 214;
   static final int field_100 = 215;
   static final int field_101 = 216;
   static final int field_102 = 217;
   static final int field_103 = 218;
   static final int field_104 = 219;
   static final int field_105 = 220;

   private Class_20() {
   }

   static void method_17(Object var0) {
      Class var1 = var0.getClass();
      String var2 = var1.getName().replace('.', '/');
      if (!method_18(var2)) {
         method_19(var1.getClassLoader().getResourceAsStream(var2 + ".class"));
      }

   }

   static boolean method_18(String var0) {
      if (!var0.startsWith("org/objectweb/asm/")) {
         return false;
      } else {
         String var1 = "(Annotation|Class|Field|Method|Module|RecordComponent|Signature)";
         return var0.contains("Test$") || Pattern.matches("org/objectweb/asm/util/Trace" + var1 + "Visitor(\\$.*)?", var0) || Pattern.matches("org/objectweb/asm/util/Check" + var1 + "Adapter(\\$.*)?", var0);
      }
   }

   static void method_19(InputStream var0) {
      if (var0 == null) {
         throw new IllegalStateException("Bytecode not available, can't check class version");
      } else {
         int var1;
         try {
            DataInputStream var2 = new DataInputStream(var0);

            try {
               var2.readInt();
               var1 = var2.readUnsignedShort();
            } catch (Throwable var6) {
               try {
                  var2.close();
               } catch (Throwable var5) {
                  var6.addSuppressed(var5);
               }

               throw var6;
            }

            var2.close();
         } catch (IOException var7) {
            throw new IllegalStateException("I/O error, can't check class version", var7);
         }

         if (var1 != 65535) {
            throw new IllegalStateException("ASM9_EXPERIMENTAL can only be used by classes compiled with --enable-preview");
         }
      }
   }
}
