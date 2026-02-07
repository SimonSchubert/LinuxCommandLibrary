# TAGLINE

manage PostgreSQL connection pools

# TLDR

**List connection pools**

```doctl databases pool list [cluster_id]```

**Create a connection pool**

```doctl databases pool create [cluster_id] [pool_name] --db [database] --user [user] --size [10]```

**Get pool info**

```doctl databases pool get [cluster_id] [pool_name]```

**Delete a pool**

```doctl databases pool delete [cluster_id] [pool_name]```

# SYNOPSIS

**doctl** **databases** **pool** _command_ [_options_]

# SUBCOMMANDS

**list**
> List connection pools.

**create**
> Create a connection pool.

**get**
> Get pool details.

**delete**
> Delete a connection pool.

# PARAMETERS

**--db** _string_
> Database name.

**--user** _string_
> Username.

**--size** _int_
> Pool size (number of connections).

**--mode** _string_
> Pool mode (transaction, session, statement).

# DESCRIPTION

**doctl databases pool** manages connection pools for PostgreSQL managed databases on DigitalOcean. Connection pools provide connection multiplexing, significantly improving performance for applications with many concurrent clients.

Pools act as intermediaries between applications and the database, maintaining a set number of reusable database connections. This reduces overhead from repeatedly opening and closing connections. Pool modes determine connection behavior: transaction mode (fastest for stateless queries), session mode (preserves server-side session state), and statement mode (most compatible but least efficient).

Proper pool configuration balances performance with resource usage, especially important for applications with high connection counts or intermittent traffic patterns.

# SEE ALSO

[doctl-databases](/man/doctl-databases)(1), [doctl-databases-user](/man/doctl-databases-user)(1)
