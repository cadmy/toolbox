# Demo project to play with JPA, Spring Data, Hibernate

We have a box with tools and materials. Tool has child entities screwdriver and wrench.

**@Transactional**
* isolation
* propagation

**N+1 problem**

**Inheritance strategies**

To launch project, create toolbox database and pass connection string, db user and db password as environment variables.

`POSTGRES_URL=jdbc:postgresql://localhost:5432/toolbox;`

`POSTGRES_PASSWORD=pass;`

`POSTGRES_USERNAME=postgres;`

## N+1 problem

* No @Query

`select b1_0.id,b1_0.name,b1_0.place from box b1_0 where b1_0.id=?`

`select t1_0.box_id,t1_0.id,case when t1_1.id is not null then 1 when t1_2.id is not null then 2 when t1_0.id is not null then 0 end,t1_0.height,t1_0.length,t1_0.quantity,t1_0.weight,t1_0.width,t1_1.type,t1_2.size from tool t1_0 left join screwdriver t1_1 on t1_0.id=t1_1.id left join wrench t1_2 on t1_0.id=t1_2.id where t1_0.box_id=?`

`select f1_0.box_id,f1_0.id,f1_0.country,f1_0.name from food f1_0 where f1_0.box_id=?`

* With @Query

`select b1_0.id,f1_0.box_id,f1_0.id,f1_0.country,f1_0.name,b1_0.name,b1_0.place,t1_0.box_id,t1_0.id,case when t1_1.id is not null then 1 when t1_2.id is not null then 2 when t1_0.id is not null then 0 end,t1_0.height,t1_0.length,t1_0.quantity,t1_0.weight,t1_0.width,t1_1.type,t1_2.size from box b1_0 left join (tool t1_0 left join screwdriver t1_1 on t1_0.id=t1_1.id left join wrench t1_2 on t1_0.id=t1_2.id) on b1_0.id=t1_0.box_id left join food f1_0 on b1_0.id=f1_0.box_id where b1_0.id=?`

