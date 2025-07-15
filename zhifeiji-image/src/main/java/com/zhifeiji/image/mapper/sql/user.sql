use zhifeiji_image;

drop table `user`;

CREATE TABLE `user`
(
    `id`          bigint NOT NULL AUTO_INCREMENT COMMENT '用户ID',
    `name`        varchar(20)  DEFAULT NULL COMMENT '姓名',
    `nickname`    varchar(20)  DEFAULT NULL COMMENT '昵称',
    `age`         int          DEFAULT NULL COMMENT '年龄',
    `phone`       varchar(20)  DEFAULT NULL COMMENT '手机号',
    `sex`         tinyint      DEFAULT NULL COMMENT '性别 0:女 1:男',
    `id_number`   varchar(18)  DEFAULT NULL COMMENT '身份证号',
    `avatar`      varchar(100) DEFAULT NULL COMMENT '头像',
    `status`      int          DEFAULT NULL COMMENT '状态 0:禁用 1:正常',
    `create_time`    DATETIME     DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`    DATETIME     DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `deleted`     TINYINT(1)   DEFAULT 0 COMMENT '逻辑删除 0-未删 1-已删',
    PRIMARY KEY (`id`),
    KEY `idx_phone` (`phone`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1944387486074376195
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='用户表';

select * from user;


