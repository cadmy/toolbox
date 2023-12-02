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
