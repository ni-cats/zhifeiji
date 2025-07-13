package com.zhifeiji.image.controller;

import com.aliyuncs.utils.StringUtils;
import com.zhifeiji.image.common.R;
import com.zhifeiji.image.dto.req.image.UploadImageReq;
import com.zhifeiji.image.entity.Image;
import com.zhifeiji.image.service.ImageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 图片接入层
 */

@Slf4j
@RestController
@RequestMapping("/image")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @PostMapping("/upload")
    public R<Boolean> test(@RequestBody UploadImageReq req) {
        return R.success(imageService.upload(req));
    }

    @GetMapping("/delete")
    public R<Boolean> delete(@RequestParam("id") String id) {
        return R.success(imageService.removeById(id));
    }

    @GetMapping("/list")
    public R<List<Image>> list() {
        return R.success(imageService.list());
    }

    @PostMapping("/chat")
    public R<String> chat(String question) {
        if (StringUtils.isEmpty(question)) {
            return R.error("question is empty");
        }
        return R.success(imageService.chat(question));
    }
}
