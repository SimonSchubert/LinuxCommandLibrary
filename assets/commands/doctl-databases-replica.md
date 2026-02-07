# TAGLINE

manage database read replicas

# TLDR

**List replicas**

```doctl databases replica list [cluster_id]```

**Create a read replica**

```doctl databases replica create [cluster_id] [replica_name]```

**Get replica info**

```doctl databases replica get [cluster_id] [replica_name]```

**Delete a replica**

```doctl databases replica delete [cluster_id] [replica_name]```

**Promote replica to primary**

```doctl databases replica promote [cluster_id] [replica_name]```

# SYNOPSIS

**doctl** **databases** **replica** _command_ [_options_]

# SUBCOMMANDS

**list**
> List read replicas.

**create**
> Create a read replica.

**get**
> Get replica details.

**delete**
> Delete a replica.

**connection**
> Get connection details.

**promote**
> Promote to standalone cluster.

# DESCRIPTION

**doctl databases replica** manages read replicas for DigitalOcean managed database clusters. Read replicas are read-only copies of a primary database that provide horizontal scaling for read-heavy workloads and geographic distribution of data.

Replicas asynchronously replicate data from the primary cluster, allowing applications to distribute read queries across multiple database instances. This reduces load on the primary and improves query performance. Replicas can be placed in different regions for lower latency to geographically distributed users.

In disaster recovery scenarios, replicas can be promoted to standalone clusters, creating an independent database cluster from the replica. This provides failover capabilities and data migration options.

# SEE ALSO

[doctl-databases](/man/doctl-databases)(1)
