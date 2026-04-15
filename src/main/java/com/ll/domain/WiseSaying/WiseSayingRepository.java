package com.ll.domain.WiseSaying;

import com.ll.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingRepository {
    private final List<WiseSaying> wiseSayingList = new ArrayList<>();
    private int lastId = 0;

    public WiseSaying save (WiseSaying wiseSaying) {
        wiseSaying.setId(++lastId);
        wiseSayingList.add(wiseSaying);

        return wiseSaying;
    }

    public List<WiseSaying> findForList() {
        return wiseSayingList.reversed();
    }
}
