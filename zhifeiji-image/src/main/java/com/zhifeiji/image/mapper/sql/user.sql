CREATE TABLE `user`
(
    `id`          bigint NOT NULL AUTO_INCREMENT COMMENT '用户ID',
    `name`        varchar(20)  DEFAULT NULL COMMENT '姓名',
    `nickname`    varchar(20)  DEFAULT NULL COMMENT '昵称',
    `age`         int          DEFAULT NULL COMMENT '年龄',
    `phone`       varchar(20)  DEFAULT NULL COMMENT '手机号',
    `sex`         tinyint      DEFAULT NULL COMMENT '性别 0:女 1:男',
    `id_number`   varchar(18)  DEFAULT NULL COMMENT '身份证号',
    `avatar`      varchar(100) DEFAULT NULL COMMENT '头像URL',
    `status`      int          DEFAULT NULL COMMENT '状态 0:禁用 1:正常',
    `create_time` int          DEFAULT NULL COMMENT '创建时间(时间戳)',
    `modify_time` int          DEFAULT NULL COMMENT '修改时间(时间戳)',
    PRIMARY KEY (`id`),
    KEY `idx_phone` (`phone`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT ='用户表';


INSERT INTO `user` (`name`,
                    `nickname`,
                    `age`,
                    `phone`,
                    `sex`,
                    `id_number`,
                    `avatar`,
                    `status`,
                    `create_time`,
                    `modify_time`)
VALUES ('郑海清',
        '夺命喵九',
        25,
        '17396176837',
        1,
        '42282320000327255X',
        'http://example.com/avatar/zhangsan.jpg',
        1,
        UNIX_TIMESTAMP(),
        UNIX_TIMESTAMP());