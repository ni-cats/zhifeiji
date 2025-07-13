package com.zhifeiji.image.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhifeiji.image.dto.req.image.UploadImageReq;
import com.zhifeiji.image.entity.Image;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService extends IService<Image> {

    // 上传图片
    Boolean upload(UploadImageReq req);

    // AI 问答
    String chat(String question);
}
