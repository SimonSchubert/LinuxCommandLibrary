# TAGLINE

manage individual databases within a cluster

# TLDR

**List databases in cluster**

```doctl databases db list [cluster_id]```

**Create a database**

```doctl databases db create [cluster_id] [db_name]```

**Delete a database**

```doctl databases db delete [cluster_id] [db_name]```

**Get database details**

```doctl databases db get [cluster_id] [db_name]```

# SYNOPSIS

**doctl** **databases** **db** _command_ [_options_]

# SUBCOMMANDS

**list**
> List databases in a cluster.

**create**
> Create a database.

**delete**
> Delete a database.

**get**
> Get database info.

# DESCRIPTION

**doctl databases db** manages individual databases within a DigitalOcean managed database cluster.

Within a single database cluster, you can create multiple isolated databases. This allows hosting separate applications or environments (development, staging, production) on the same cluster infrastructure. Each database can have its own set of users and permissions while sharing the cluster's compute and storage resources.

The command handles database creation, listing, and deletion within the cluster. This is distinct from managing the cluster itself, which is handled by the parent doctl databases command.

# SEE ALSO

[doctl-databases](/man/doctl-databases)(1), [doctl-databases-user](/man/doctl-databases-user)(1)

