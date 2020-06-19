/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50621
 Source Host           : localhost:3306
 Source Schema         : seata_order

 Target Server Type    : MySQL
 Target Server Version : 50621
 File Encoding         : 65001

 Date: 19/06/2020 09:35:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `money` double(11, 2) NULL DEFAULT NULL COMMENT '金额',
  `num` int(9) NULL DEFAULT NULL COMMENT '购买数量',
  `order_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单名称',
  `order_no` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单号',
  `product_id` bigint(20) NULL DEFAULT NULL COMMENT '产品id',
  `status` int(2) NULL DEFAULT NULL COMMENT '订单状态(0:未付款,1:已付款,2:已发货,-1:订单取消)',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `user_id` bigint(20) NULL DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 54 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES (1, '2020-05-19 07:13:22', 2.00, 1, '奥利奥1个', '202005191513210001', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (2, '2020-05-19 07:17:36', 2.00, 1, '奥利奥1个', '202005191517360001', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (3, '2020-05-19 07:19:02', 2.00, 1, '奥利奥1个', '202005191519010001', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (4, '2020-05-19 07:20:43', 4.00, 2, '奥利奥2个', '202005191520430002', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (5, '2020-05-19 10:02:49', 4.00, 2, '奥利奥2个', '202005191802490003', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (6, '2020-05-19 10:05:56', 4.00, 2, '奥利奥2个', '202005191805550002', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (7, '2020-05-19 10:06:10', 4.00, 2, '奥利奥2个', '202005191806100003', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (8, '2020-05-19 10:10:36', 4.00, 2, '奥利奥2个', '202005191810350001', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (9, '2020-05-19 10:12:00', 4.00, 2, '奥利奥2个', '202005191812000002', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (10, '2020-05-19 10:14:36', 4.00, 2, '奥利奥2个', '202005191814350001', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (11, '2020-05-20 02:18:49', 4.00, 2, '奥利奥2个', '202005201018490002', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (13, '2020-05-21 07:18:44', 4.00, 2, '奥利奥2个', '202005211518440012', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (15, '2020-05-21 07:22:22', 4.00, 2, '奥利奥2个', '202005211522210014', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (16, '2020-05-21 07:54:02', 4.00, 2, '奥利奥2个', '202005211554010015', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (17, '2020-05-21 07:55:31', 4.00, 2, '奥利奥2个', '202005211555310017', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (18, '2020-05-21 07:55:41', 4.00, 2, '奥利奥2个', '202005211555410018', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (19, '2020-05-21 08:00:29', 4.00, 2, '奥利奥2个', '202005211600280020', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (20, '2020-05-21 08:02:01', 4.00, 2, '奥利奥2个', '202005211602010021', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (21, '2020-05-21 08:02:10', 4.00, 2, '奥利奥2个', '202005211602090022', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (23, '2020-05-22 02:33:18', 4.00, 2, '奥利奥2个', '202005221033170001', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (24, '2020-05-22 02:35:42', 4.00, 2, '奥利奥2个', '202005221035420002', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (25, '2020-05-22 02:48:00', 4.00, 2, '奥利奥2个', '202005221048000004', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (26, '2020-05-22 02:48:33', 4.00, 2, '奥利奥2个', '202005221048330005', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (28, '2020-05-28 06:57:22', 4.00, 2, '奥利奥2个', '202005281457220001', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (29, '2020-06-08 06:11:30', 2.00, 2, '奥利奥2个', '202006081411290001', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (31, '2020-06-08 06:16:29', 2.00, 2, '奥利奥2个', '202006081416280003', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (32, '2020-06-08 06:17:58', 2.00, 2, '奥利奥2个', '202006081417570004', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (33, '2020-06-08 06:19:25', 2.00, 2, '奥利奥2个', '202006081419240005', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (34, '2020-06-08 06:20:32', 2.00, 2, '奥利奥2个', '202006081420320006', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (35, '2020-06-08 06:48:11', 2.00, 2, '奥利奥2个', '202006081448100007', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (36, '2020-06-08 06:52:42', 2.00, 2, '奥利奥2个', '202006081452420011', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (37, '2020-06-08 06:53:37', 2.00, 2, '奥利奥2个', '202006081453370013', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (38, '2020-06-08 06:54:19', 2.00, 2, '奥利奥2个', '202006081454180014', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (39, '2020-06-08 06:54:40', 2.00, 2, '奥利奥2个', '202006081454400015', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (40, '2020-06-08 06:55:16', 2.00, 2, '奥利奥2个', '202006081455160016', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (41, '2020-06-08 06:56:30', 2.00, 2, '奥利奥2个', '202006081456300017', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (42, '2020-06-08 07:29:50', 2.00, 2, '奥利奥2个', '202006081529500018', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (43, '2020-06-09 01:52:14', 2.00, 2, '奥利奥2个', '202006090952140019', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (45, '2020-06-10 02:53:41', 2.00, 2, '奥利奥2个', '202006101053410021', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (47, '2020-06-10 02:56:42', 2.00, 2, '奥利奥2个', '202006101056420023', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (49, '2020-06-10 11:15:59', 1.00, 1, '奥利奥1个', '202006101915580001', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (51, '2020-06-10 11:24:13', 1.00, 1, '奥利奥1个', '202006101924130005', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (52, '2020-06-10 11:26:45', 1.00, 1, '奥利奥1个', '202006101926440006', 1, 0, NULL, 1);
INSERT INTO `t_order` VALUES (53, '2020-06-10 11:26:53', 1.00, 1, '奥利奥1个', '202006101926530007', 1, 0, NULL, 1);

-- ----------------------------
-- Table structure for undo_log
-- ----------------------------
DROP TABLE IF EXISTS `undo_log`;
CREATE TABLE `undo_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'increment id',
  `branch_id` bigint(20) NOT NULL COMMENT 'branch transaction id',
  `xid` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'global transaction id',
  `context` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'undo_log context,such as serialization',
  `rollback_info` longblob NOT NULL COMMENT 'rollback info',
  `log_status` int(11) NOT NULL COMMENT '0:normal status,1:defense status',
  `log_created` datetime(0) NOT NULL COMMENT 'create datetime',
  `log_modified` datetime(0) NOT NULL COMMENT 'modify datetime',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `ux_undo_log`(`xid`, `branch_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'AT transaction mode undo table' ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
