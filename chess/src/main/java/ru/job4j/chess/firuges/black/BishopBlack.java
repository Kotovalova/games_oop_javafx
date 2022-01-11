package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not move by diagonal from %s to %s", position, dest)
            );
        }
        int x = this.position.getX();
        int y = this.position.getY();
        int size = dest.getX() - x;
        Cell[] steps = new Cell[size];
        int deltaX;
        int deltaY;
        if (dest.getX() > x) {
            deltaX = 1;
        } else {
            deltaX = -1;
        }
        if (dest.getY() > y) {
            deltaY = 1;
        } else {
            deltaY = -1;
        }
        for (int index = 0; index < size; index++) {
            x = x + deltaX;
            y = y + deltaY;
            steps[index] = Cell.findBy(x, y);
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return true;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
