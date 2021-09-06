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

 Date: 06/09/2021 22:11:08
*/


-- ----------------------------
-- Table structure for PRODUCT
-- ----------------------------
DROP TABLE "SGR"."PRODUCT";
CREATE TABLE "SGR"."PRODUCT" (
  "ID" NUMBER(20,0) NOT NULL,
  "CREATE_AT" DATE,
  "CREATE_BY" VARCHAR2(20 BYTE),
  "UPDATE_AT" DATE,
  "UPDATE_BY" VARCHAR2(20 BYTE),
  "PRODUCT_CODE" VARCHAR2(20 BYTE),
  "PRODUCT_NAME" VARCHAR2(255 BYTE),
  "PRICE" NUMBER,
  "UNIT" CHAR(10 BYTE),
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
COMMENT ON COLUMN "SGR"."PRODUCT"."PRICE" IS '价格';
COMMENT ON COLUMN "SGR"."PRODUCT"."UNIT" IS '单位';
COMMENT ON COLUMN "SGR"."PRODUCT"."REMARKS" IS '备注';

-- ----------------------------
-- Primary Key structure for table PRODUCT
-- ----------------------------
ALTER TABLE "SGR"."PRODUCT" ADD CONSTRAINT "SYS_C007211" PRIMARY KEY ("ID");

-- ----------------------------
-- Checks structure for table PRODUCT
-- ----------------------------
ALTER TABLE "SGR"."PRODUCT" ADD CONSTRAINT "SYS_C007210" CHECK ("ID" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
