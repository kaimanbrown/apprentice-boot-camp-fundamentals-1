package cards;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnimalCardTest {
    @Test
    public void baboonSnapsBaboon() {
        assertThat(new AnimalCard(Animal.BABOON).snap(new AnimalCard(Animal.BABOON))).isTrue();
    }
}