package com.phan.codechallenge.toyrobot.lib;

import com.phan.codechallenge.toyrobot.exception.InvalidPlaceException;
import lombok.Data;

@Data
class Place {

    static final int TABLE_SIZE = 5;

    /*
    unit 5 * 5, start from (0,0)
     */
    Integer x, y;

    Place(int x, int y) throws InvalidPlaceException {
        this.x = x;
        this.y = y;

        /*
        validate place to start
         */
        boolean amInsideTable = isInsideTable(x) && isInsideTable(y);
        if (!amInsideTable)
            throw new InvalidPlaceException("I'm out of Table!");
    }

    void updatePlace(int moveX, int moveY) {
        /*
        prevented move
         */
        if (isInsideTable(x + moveX))
            x = x + moveX;

        if (isInsideTable(y + moveY))
            y = y + moveY;
    }

    private boolean isInsideTable(int position) {
        return 0 <= position && position < TABLE_SIZE;
    }
}
