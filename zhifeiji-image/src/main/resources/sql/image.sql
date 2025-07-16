create database zhifeiji_image;

use zhifeiji_image;

drop table `image`;

CREATE TABLE `image`
(
    `id`             BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `name`           VARCHAR(255) DEFAULT NULL COMMENT '图片名称',
    `part_id`        VARCHAR(100) DEFAULT NULL COMMENT '分区ID',
    `cos_key`        VARCHAR(255) DEFAULT NULL COMMENT '图片cos',
    `user_nick_name` VARCHAR(100) DEFAULT NULL COMMENT '用户昵称',
    `url`            VARCHAR(500) DEFAULT NULL COMMENT '图片URL地址',
    `longitude`      VARCHAR(50)  DEFAULT NULL COMMENT '经度',
    `latitude`       VARCHAR(50)  DEFAULT NULL COMMENT '纬度',
    `address`        VARCHAR(255) DEFAULT NULL COMMENT '地址',
    `status`         INT          DEFAULT NULL COMMENT '状态 0:禁用 1:正常',
    `create_time`    DATETIME     DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`    DATETIME     DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `deleted`        TINYINT(1) DEFAULT 0 COMMENT '逻辑删除 0-未删 1-已删',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='图片表';

select * from image;


