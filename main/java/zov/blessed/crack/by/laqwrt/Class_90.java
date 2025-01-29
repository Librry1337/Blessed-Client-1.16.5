package zov.blessed.crack.by.laqwrt;

public final class Class_90 extends IndexOutOfBoundsException {
   private static final long りテノぬしちいキシムち = 6807380416709738314L;
   private final String className;
   private final String methodName;
   private final String descriptor;
   private final int codeSize;

   public Class_90(String className, String methodName, String descriptor, int codeSize) {
      super("Method too large: " + className + "." + methodName + " " + descriptor);
      this.className = className;
      this.methodName = methodName;
      this.descriptor = descriptor;
      this.codeSize = codeSize;
   }

   public String getClassName() {
      return this.className;
   }

   public String getMethodName() {
      return this.methodName;
   }

   public String getDescriptor() {
      return this.descriptor;
   }

   public int getCodeSize() {
      return this.codeSize;
   }
}
