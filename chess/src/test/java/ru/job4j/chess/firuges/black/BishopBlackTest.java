package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.position().toString(), is("C8"));
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        bishopBlack = (BishopBlack) bishopBlack.copy(Cell.F8);
        assertThat(bishopBlack.position().toString(), is("F8"));
    }
}