package zov.blessed.crack.by.laqwrt;

public class Class_151 {
   public static String field_759 = "#version 120\r\n\r\nuniform vec2 location, rectSize;\r\nuniform vec4 color, outlineColor;\r\nuniform float radius, outlineThickness;\r\n\r\nfloat roundedSDF(vec2 centerPos, vec2 size, float radius) {\r\n    return length(max(abs(centerPos) - size + radius, 0.0)) - radius;\r\n}\r\n\r\nvoid main() {\r\n    float distance = roundedSDF(gl_FragCoord.xy - location - (rectSize * .5), (rectSize * .5) + (outlineThickness *.5) - 1.0, radius);\r\n\r\n    float blendAmount = smoothstep(0., 2., abs(distance) - (outlineThickness * .5));\r\n\r\n    vec4 insideColor = (distance < 0.) ? color : vec4(outlineColor.rgb,  0.0);\r\n    gl_FragColor = mix(outlineColor, insideColor, blendAmount);\r\n\r\n}";
}
