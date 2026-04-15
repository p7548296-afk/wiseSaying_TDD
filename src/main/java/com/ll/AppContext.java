package com.ll;

import com.ll.domain.WiseSaying.WiseSayingController;
import com.ll.domain.WiseSaying.WiseSayingRepository;
import com.ll.domain.WiseSaying.WiseSayingService;
import com.ll.domain.system.SystemController;

import java.util.Scanner;

public class AppContext {
    public static Scanner scanner;
    public static SystemController systemController;
    public static WiseSayingController wiseSayingController;
    public static WiseSayingService wiseSayingService;
    public static WiseSayingRepository wiseSayingRepository;

    public static void renew (Scanner _scanner) {
        scanner = _scanner;
        systemController = new SystemController();
        wiseSayingRepository = new WiseSayingRepository();
        wiseSayingService = new WiseSayingService();
        wiseSayingController = new WiseSayingController();
    }

    public static void renew () {
        renew(new Scanner(System.in));
    }
}
