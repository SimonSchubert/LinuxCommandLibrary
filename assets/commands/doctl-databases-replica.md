# TAGLINE

manage database read replicas

# TLDR

**List replicas**

```doctl databases replica list [cluster_id]```

**Create a read replica** in another region

```doctl databases replica create [cluster_id] [replica_name] --region [fra1] --size [db-s-1vcpu-1gb]```

**Get replica info**

```doctl databases replica get [cluster_id] [replica_name]```

**Retrieve connection details** for a replica

```doctl databases replica connection [cluster_id] [replica_name]```

**Delete a replica**

```doctl databases replica delete [cluster_id] [replica_name]```

**Promote a replica** to a standalone primary cluster

```doctl databases replica promote [cluster_id] [replica_name]```

# SYNOPSIS

**doctl** **databases** **replica** _command_ _database-cluster-id_ [_replica-name_] [_flags_]

# SUBCOMMANDS

**list** _cluster-id_
> Retrieve the list of read-only replicas for a cluster.

**create** _cluster-id_ _name_
> Create a read-only replica. Accepts **--region**, **--size**, and **--private-network-uuid**.

**get** _cluster-id_ _name_
> Retrieve information about a read-only replica.

**delete** _cluster-id_ _name_
> Delete a read-only replica. **-f**, **--force** skips the confirmation prompt.

**connection** _cluster-id_ _name_
> Retrieve the connection string, host, port, user, and password for a replica.

**promote** _cluster-id_ _name_
> Promote a read-only replica to become an independent primary cluster.

# OPTIONS

**--region** _SLUG_
> Region to place the replica in, e.g. `nyc1` or `fra1`. Defaults to the primary's region.

**--size** _SLUG_
> Machine size for the replica, e.g. `db-s-1vcpu-1gb`.

**--private-network-uuid** _UUID_
> VPC to attach the replica to.

**-o**, **--output** _FORMAT_
> Output format: `text` (default) or `json`.

**--format** _FIELDS_
> Comma-separated list of columns to display.

# DESCRIPTION

**doctl databases replica** manages read replicas for DigitalOcean managed database clusters. Read replicas are read-only copies of a primary database that provide horizontal scaling for read-heavy workloads and geographic distribution of data.

Replicas asynchronously replicate data from the primary cluster, allowing applications to distribute read queries across multiple database instances. This reduces load on the primary and improves query performance. Replicas can be placed in different regions for lower latency to geographically distributed users.

In disaster recovery scenarios, replicas can be promoted to standalone clusters, creating an independent database cluster from the replica. This provides failover capabilities and data migration options.

# CAVEATS

Replication is asynchronous, so a replica can lag behind the primary and serve slightly stale rows. **promote** is irreversible: the replica becomes an independent cluster, stops following the primary, and is billed as a full cluster from then on. Read replicas are not offered for every engine or plan (they are unavailable on the smallest shared-CPU tiers and on some engines), and each replica is billed at the price of its own size.

# INSTALL

```dnf: sudo dnf install doctl```

```pacman: sudo pacman -S doctl```

```apk: sudo apk add doctl```

```brew: brew install doctl```

```nix: nix profile install nixpkgs#doctl```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[doctl](/man/doctl)(1), [doctl-databases](/man/doctl-databases)(1), [doctl-databases-user](/man/doctl-databases-user)(1)

# RESOURCES

```[Source code](https://github.com/digitalocean/doctl)```

```[Documentation](https://docs.digitalocean.com/reference/doctl/reference/databases/replica/)```

<!-- verified: 2026-07-14 -->

