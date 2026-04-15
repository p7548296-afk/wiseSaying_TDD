package com.ll.domain.WiseSaying;

import com.ll.WiseSaying;

import java.util.List;

public class WiseSayingService {
    private final WiseSayingRepository wiseSayingRepository;

    public WiseSayingService () {
        wiseSayingRepository = new WiseSayingRepository();
    }

    public WiseSaying write (String content, String author) {
        WiseSaying wiseSaying = new WiseSaying(author, content);
        wiseSayingRepository.save(wiseSaying);

        return wiseSaying;
    }

    public List<WiseSaying> findForList () {
        return wiseSayingRepository.findForList();
    }
}
