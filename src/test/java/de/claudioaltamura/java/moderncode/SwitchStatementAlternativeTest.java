package de.claudioaltamura.java.moderncode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchStatementAlternativeTest {

    private final SwitchStatementAlternative switchStatementAlternative = new SwitchStatementAlternative();

    @Test
    void getCaffeine() {
        assertThat(switchStatementAlternative.getCaffeine("Coffee")).isEqualTo("95 mg");
    }

    @Test
    void getCaffeineObjectLiteralStyle() {
        assertThat(switchStatementAlternative.getCaffeineObjectLiteralStyle("Coffee")).isEqualTo("95 mg");
    }

}