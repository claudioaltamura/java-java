package de.claudioaltamura.java.moderncode;

import java.util.Map;

public class SwitchStatementAlternative {

    public String getCaffeine(String type) {
        return switch (type) {
            case "Coffee" -> "95 mg";
            case "Redbull" -> "147 mg";
            case "Tea" -> "11 mg";
            default -> "unknown";
        };
    }

    public String getCaffeineObjectLiteralStyle(String type) {
        var map = Map.of(
                "Coffee", "95 mg",
                "Redbull", "147 mg",
                "Tea", "11 mg"
        );
        return map.getOrDefault(type, "unknown");
    }

}
