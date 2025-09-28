package artie.common.web.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExerciseLombokTest {

    @Test
    void lombok_generates_boolean_and_int_accessors() {
        Exercise e = new Exercise();
        e.setLevel(3);
        e.setEvaluation(true); // for boolean field named "isEvaluation", Lombok generates setEvaluation(boolean)

        assertEquals(3, e.getLevel());
        assertTrue(e.isEvaluation());
    }
}

