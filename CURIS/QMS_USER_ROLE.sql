--------------------------------------------------------
--  File created - Monday-May-28-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table QMS_USER_ROLE
--------------------------------------------------------

  CREATE TABLE "ADMIN"."QMS_USER_ROLE" 
   (	"QMS_USER_ROLE_ID" VARCHAR2(100 BYTE), 
	"QMS_USER_ROLE_NAME" VARCHAR2(100 BYTE), 
	"QMS_USER_ROLE_DESCRIPTION" VARCHAR2(1000 BYTE), 
	"REC_UPDATE_DATE" TIMESTAMP (6), 
	"CURRENT_FLAG" VARCHAR2(1 BYTE), 
	"MODIFIED_BY" VARCHAR2(100 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into ADMIN.QMS_USER_ROLE
SET DEFINE OFF;
Insert into ADMIN.QMS_USER_ROLE (QMS_USER_ROLE_ID,QMS_USER_ROLE_NAME,QMS_USER_ROLE_DESCRIPTION,REC_UPDATE_DATE,CURRENT_FLAG,MODIFIED_BY) values ('1','Measure_developer','Measure developer',to_timestamp('01-AUG-17 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'Y','raghu');
Insert into ADMIN.QMS_USER_ROLE (QMS_USER_ROLE_ID,QMS_USER_ROLE_NAME,QMS_USER_ROLE_DESCRIPTION,REC_UPDATE_DATE,CURRENT_FLAG,MODIFIED_BY) values ('2','Measure_Reviewer','Measure Reviewer',to_timestamp('01-AUG-17 12.00.00.000000000 AM','DD-MON-RR HH.MI.SSXFF AM'),'Y','raghu');
--------------------------------------------------------
--  DDL for Index SYS_C0011490
--------------------------------------------------------

  CREATE UNIQUE INDEX "ADMIN"."SYS_C0011490" ON "ADMIN"."QMS_USER_ROLE" ("QMS_USER_ROLE_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table QMS_USER_ROLE
--------------------------------------------------------

  ALTER TABLE "ADMIN"."QMS_USER_ROLE" MODIFY ("QMS_USER_ROLE_ID" NOT NULL ENABLE);
 
  ALTER TABLE "ADMIN"."QMS_USER_ROLE" MODIFY ("QMS_USER_ROLE_NAME" NOT NULL ENABLE);
 
  ALTER TABLE "ADMIN"."QMS_USER_ROLE" MODIFY ("REC_UPDATE_DATE" NOT NULL ENABLE);
 
  ALTER TABLE "ADMIN"."QMS_USER_ROLE" MODIFY ("CURRENT_FLAG" NOT NULL ENABLE);
 
  ALTER TABLE "ADMIN"."QMS_USER_ROLE" MODIFY ("MODIFIED_BY" NOT NULL ENABLE);
 
  ALTER TABLE "ADMIN"."QMS_USER_ROLE" ADD PRIMARY KEY ("QMS_USER_ROLE_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
