CREATE TABLE
  public.box (
    id uuid NOT NULL,
    name character varying(255) NULL,
    place character varying(255) NULL
  );

ALTER TABLE
  public.box
ADD
  CONSTRAINT box_pkey PRIMARY KEY (id);

CREATE TABLE
  public.tool (
    height integer NULL,
    length integer NULL,
    quantity integer NULL,
    weight integer NULL,
    width integer NULL,
    box_id uuid NULL,
    id uuid NOT NULL
  );

ALTER TABLE
  public.tool
ADD
  CONSTRAINT tool_pkey PRIMARY KEY (id);

CREATE TABLE
  public.screwdriver (
    type
      smallint NULL,
      id uuid NOT NULL
  );

ALTER TABLE
  public.screwdriver
ADD
  CONSTRAINT screwdriver_pkey PRIMARY KEY (id);

CREATE TABLE
  public.wrench (size integer NULL, id uuid NOT NULL);

ALTER TABLE
  public.wrench
ADD
  CONSTRAINT wrench_pkey PRIMARY KEY (id);

CREATE TABLE
  public.material (
    unit smallint NULL,
    quantity bigint NULL,
    box_id uuid NULL,
    id uuid NOT NULL,
    name character varying(255) NULL
  );

ALTER TABLE
  public.material
ADD
  CONSTRAINT material_pkey PRIMARY KEY (id);

insert into "box" ("id", "name", "place") values ('8685efd7-8027-4d68-8f16-6d1bdb4440ba', 'CarTools', 'Garage');
insert into "box" ("id", "name", "place") values ('69d12ff7-95ad-4c00-acf1-6539ca684187', 'ArtTools', 'Living room');
insert into "tool" ("box_id", "height", "id", "length", "quantity", "weight", "width") values ('8685efd7-8027-4d68-8f16-6d1bdb4440ba', 15, 'df0576f6-3cca-44ae-943f-2ac220910b55', 1, 4, 100, 5);
insert into "screwdriver" ("id", "type") values ('df0576f6-3cca-44ae-943f-2ac220910b55', 1);
insert into "material" ("id", "name", "unit", "quantity", "box_id") values ('b336fc5f-802e-4aec-bb9b-101403572bd7', 'nail', '0', 100, '8685efd7-8027-4d68-8f16-6d1bdb4440ba');