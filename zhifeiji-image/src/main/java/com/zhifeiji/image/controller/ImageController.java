package com.zhifeiji.image.controller;

import com.zhifeiji.image.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 图片接入层
 */

@Slf4j
@RestController
@RequestMapping("/image")
public class ImageController {

    @GetMapping("/test")
    public R<String> test() {
        return R.success("zhifeiji-image test");
    }
}
