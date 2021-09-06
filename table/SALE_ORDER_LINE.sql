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

 Date: 06/09/2021 22:11:23
*/


-- ----------------------------
-- Table structure for SALE_ORDER_LINE
-- ----------------------------
DROP TABLE "SGR"."SALE_ORDER_LINE";
CREATE TABLE "SGR"."SALE_ORDER_LINE" (
  "ID" NUMBER NOT NULL,
  "CREATE_AT" DATE,
  "CREATE_BY" VARCHAR2(255 BYTE),
  "UPDATE_AT" DATE,
  "UPDATE_BY" VARCHAR2(255 BYTE),
  "PRODUCT_ID" NUMBER(20,0),
  "QUANTITY" NUMBER(20,2),
  "PRICE" NUMBER(20,2),
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
COMMENT ON COLUMN "SGR"."SALE_ORDER_LINE"."QUANTITY" IS '数量';
COMMENT ON COLUMN "SGR"."SALE_ORDER_LINE"."PRICE" IS '单价';

-- ----------------------------
-- Primary Key structure for table SALE_ORDER_LINE
-- ----------------------------
ALTER TABLE "SGR"."SALE_ORDER_LINE" ADD CONSTRAINT "SYS_C007233" PRIMARY KEY ("ID");
