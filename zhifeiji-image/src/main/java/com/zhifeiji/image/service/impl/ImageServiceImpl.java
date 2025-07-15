package com.zhifeiji.image.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifeiji.image.common.enums.Magic;
import com.zhifeiji.image.dto.req.image.UploadImageReq;
import com.zhifeiji.image.entity.Image;
import com.zhifeiji.image.mapper.ImageMapper;
import com.zhifeiji.image.service.ImageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ImageServiceImpl extends ServiceImpl<ImageMapper, Image> implements ImageService {
    private final ImageMapper imageMapper;

    @Override
    public Boolean upload(UploadImageReq req) {
        Image image = Image.builder()
                .name(req.getName())
                .partId(req.getPartId())
                .cosKey(req.getCosKey())
                .userNickName(req.getUserNickName())
                .url(req.getUrl())
                .Longitude(req.getLongitude())
                .Latitude(req.getLatitude())
                .address(req.getAddress())
                .status(req.getStatus())
                .build();
        return Magic.ONE.getCode() == imageMapper.insert(image);
    }

    @Override
    public String chat(String question) {
        return "功能开发中~";
    }
}
