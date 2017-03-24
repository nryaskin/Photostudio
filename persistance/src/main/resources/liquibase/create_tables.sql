--liquibase formatted sql
--changeset codecentric-docs:release_1.create_tables.sql
 
CREATE TABLE SampleTable
(
  id uuid NOT NULL,
  someNumber INTEGER,
  CONSTRAINT sampletable_pkey PRIMARY KEY (id)
);
ALTER TABLE SampleTable
  OWNER TO sample;
 
--rollback DROP TABLE SampleTable;