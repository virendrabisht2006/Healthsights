--------------------------------------------------------
--  File created - Monday-May-28-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table QMS_DIM_STATUS
--------------------------------------------------------

  CREATE TABLE "ADMIN"."QMS_DIM_STATUS" 
   (	"STATUS_DIM_ID" VARCHAR2(100 BYTE), 
	"STATUS_DESCRIPTION" VARCHAR2(1000 BYTE), 
	"REC_CREATE_DATE" TIMESTAMP (6), 
	"REC_UPDATE_DATE" TIMESTAMP (6), 
	"ACTIVE_FLAG" VARCHAR2(1 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into ADMIN.QMS_DIM_STATUS
SET DEFINE OFF;
Insert into ADMIN.QMS_DIM_STATUS (STATUS_DIM_ID,STATUS_DESCRIPTION,REC_CREATE_DATE,REC_UPDATE_DATE,ACTIVE_FLAG) values ('1','New',to_timestamp('01-AUG-17 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),to_timestamp('01-AUG-17 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'Y');
Insert into ADMIN.QMS_DIM_STATUS (STATUS_DIM_ID,STATUS_DESCRIPTION,REC_CREATE_DATE,REC_UPDATE_DATE,ACTIVE_FLAG) values ('2','In-Progress',to_timestamp('01-AUG-17 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),to_timestamp('01-AUG-17 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'Y');
Insert into ADMIN.QMS_DIM_STATUS (STATUS_DIM_ID,STATUS_DESCRIPTION,REC_CREATE_DATE,REC_UPDATE_DATE,ACTIVE_FLAG) values ('3','Review',to_timestamp('01-AUG-17 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),to_timestamp('01-AUG-17 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'Y');
Insert into ADMIN.QMS_DIM_STATUS (STATUS_DIM_ID,STATUS_DESCRIPTION,REC_CREATE_DATE,REC_UPDATE_DATE,ACTIVE_FLAG) values ('4','Re-work',to_timestamp('01-AUG-17 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),to_timestamp('01-AUG-17 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'Y');
Insert into ADMIN.QMS_DIM_STATUS (STATUS_DIM_ID,STATUS_DESCRIPTION,REC_CREATE_DATE,REC_UPDATE_DATE,ACTIVE_FLAG) values ('5','Approved',to_timestamp('01-AUG-17 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),to_timestamp('01-AUG-17 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'Y');
Insert into ADMIN.QMS_DIM_STATUS (STATUS_DIM_ID,STATUS_DESCRIPTION,REC_CREATE_DATE,REC_UPDATE_DATE,ACTIVE_FLAG) values ('6','Completed',to_timestamp('01-AUG-17 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),to_timestamp('01-AUG-17 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'Y');
--------------------------------------------------------
--  Constraints for Table QMS_DIM_STATUS
--------------------------------------------------------

  ALTER TABLE "ADMIN"."QMS_DIM_STATUS" MODIFY ("STATUS_DIM_ID" NOT NULL ENABLE);
