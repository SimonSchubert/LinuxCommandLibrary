# TAGLINE

Manage PostgreSQL connection pools on DigitalOcean

# TLDR

**List all connection pools** for a database cluster

```doctl databases pool list [cluster_id]```

**Create a connection pool**

```doctl databases pool create [cluster_id] [pool_name] --db [database] --user [user] --size [10] --mode [transaction]```

**Get details of a specific pool**

```doctl databases pool get [cluster_id] [pool_name]```

**Update a connection pool**

```doctl databases pool update [cluster_id] [pool_name] --size [20]```

**Delete a connection pool**

```doctl databases pool delete [cluster_id] [pool_name]```

# SYNOPSIS

**doctl** **databases** **pool** _command_ [_options_]

# SUBCOMMANDS

**list**
> List all connection pools for a database cluster.

**create**
> Create a connection pool (requires name, database, user, and size).

**get**
> Get details of a specific connection pool.

**update**
> Update an existing connection pool's settings.

**delete**
> Delete a connection pool.

# PARAMETERS

**--db** _string_
> Target database name for the pool.

**--user** _string_
> Database username for pool authentication.

**--size** _int_
> Pool size (number of connections to maintain).

**--mode** _string_
> Pool mode: transaction (default, fastest), session (preserves session state), or statement.

**--format** _string_
> Customize output columns.

# DESCRIPTION

**doctl databases pool** manages connection pools for PostgreSQL managed databases on DigitalOcean. Connection pools use PgBouncer to provide connection multiplexing, significantly improving performance for applications with many concurrent clients.

Pools act as intermediaries between applications and the database, maintaining a set number of reusable database connections. This reduces overhead from repeatedly opening and closing connections. Pool modes determine connection behavior: **transaction** mode releases connections after each transaction (fastest for stateless queries), **session** mode holds connections for the entire client session, and **statement** mode releases after each individual statement.

# SEE ALSO

[doctl-databases](/man/doctl-databases)(1), [doctl-databases-db](/man/doctl-databases-db)(1), [doctl-databases-user](/man/doctl-databases-user)(1)
