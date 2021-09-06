/*
 Navicat Premium Data Transfer

 Source Server         : ORACLE
 Source Server Type    : Oracle
 Source Server Version : 110200
 Source Host           : localhost:1521
 Source Schema         : SGR

 Target Server Type    : Oracle
 Target Server Version : 110200
 File Encoding         : 65001

 Date: 06/09/2021 22:11:16
*/


-- ----------------------------
-- Table structure for SALE_ORDER_HEAD
-- ----------------------------
DROP TABLE "SGR"."SALE_ORDER_HEAD";
CREATE TABLE "SGR"."SALE_ORDER_HEAD" (
  "ID" NUMBER NOT NULL,
  "CREATE_AT" DATE,
  "CREATE_BY" VARCHAR2(255 BYTE),
  "UPDATE_AT" DATE,
  "UPDATE_BY" VARCHAR2(255 BYTE),
  "ORDER_NUMBER" VARCHAR2(255 BYTE),
  "LINE_ID" NUMBER(20,0),
  "TOTAL" NUMBER(20,2),
  "TOTAL_PRICE" NUMBER(20,2),
  "REMARKS" VARCHAR2(255 BYTE)
)
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;
COMMENT ON COLUMN "SGR"."SALE_ORDER_HEAD"."TOTAL" IS '总数';
COMMENT ON COLUMN "SGR"."SALE_ORDER_HEAD"."TOTAL_PRICE" IS '总价';
COMMENT ON COLUMN "SGR"."SALE_ORDER_HEAD"."REMARKS" IS '备注';

-- ----------------------------
-- Primary Key structure for table SALE_ORDER_HEAD
-- ----------------------------
ALTER TABLE "SGR"."SALE_ORDER_HEAD" ADD CONSTRAINT "SYS_C007232" PRIMARY KEY ("ID");
