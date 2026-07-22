# TAGLINE

manage DigitalOcean managed database clusters

# TLDR

**List database clusters**

```doctl databases list```

**Create a database cluster**

```doctl databases create [name] --engine [pg] --region [nyc1] --size [db-s-1vcpu-1gb]```

**Get cluster info**

```doctl databases get [cluster_id]```

**Delete a cluster**

```doctl databases delete [cluster_id]```

**Get connection details**

```doctl databases connection [cluster_id]```

**Resize cluster** (size and node count)

```doctl databases resize [cluster_id] --size [db-s-2vcpu-4gb] --num-nodes [2]```

**Download the CA certificate** needed for TLS connections

```doctl databases get-ca [cluster_id]```

# SYNOPSIS

**doctl** **databases** _command_ [_arguments_] [_flags_]

# SUBCOMMANDS

**list**
> List your database clusters.

**create** _name_
> Create a cluster. Requires **--engine** (`pg`, `mysql`, `redis`, `valkey`, `mongodb`, `kafka`, `opensearch`), and accepts **--region**, **--size**, **--num-nodes**, **--version**, and **--private-network-uuid**.

**get** _id_
> Get details for a database cluster.

**delete** _id_
> Delete a cluster. **-f**, **--force** skips the confirmation prompt.

**connection** _id_
> Retrieve connection details (URI, host, port, user, password).

**get-ca** _id_
> Print the CA certificate used to verify TLS connections to the cluster.

**resize** _id_
> Resize a cluster with **--size** and **--num-nodes**.

**migrate** _id_
> Migrate a cluster to a new region.

**fork** _name_
> Create a new cluster by forking an existing one, optionally at a point in time.

**backups** _id_
> List the cluster's backups.

**events** _id_
> List cluster events.

**options**
> Show the engines, versions, regions, and sizes available.

**configuration**
> View or update engine-level cluster configuration.

**maintenance-window**
> Schedule the automatic maintenance window.

**storage-autoscale**
> Manage automatic storage scaling for the cluster.

**sql-mode**
> Get or set the SQL modes of a MySQL cluster.

**db**
> Manage the individual databases inside a cluster.

**user**
> Manage database users.

**pool**
> Manage connection pools (PostgreSQL).

**replica**
> Manage read-only replicas.

**firewalls**
> Manage which resources may connect to the cluster.

**indexes**
> Manage indexes on OpenSearch clusters.

**topics**
> Manage topics on Kafka clusters.

# DESCRIPTION

**doctl databases** manages DigitalOcean Managed Databases: PostgreSQL, MySQL, Valkey (formerly Redis), MongoDB, Kafka, and OpenSearch clusters.

The command provides full lifecycle management for clusters, from creation and configuration through resizing, migration, and deletion. Managed databases handle backups, minor-version updates, failover, and standby nodes for you; the CLI exposes the same operations available in the control panel, which makes them scriptable and usable from CI.

Additional subcommands manage the databases inside a cluster, users, connection pools, read replicas, firewall rules, and the maintenance window. Connection strings, credentials, and the CA certificate can all be retrieved for application integration.

Cluster IDs are UUIDs, but most subcommands also accept the cluster name. Add **-o json** to any command for machine-readable output.

# CAVEATS

**delete** destroys the cluster and all of its backups; there is no undo. Managed clusters accept TLS connections only, so clients usually need the certificate from **get-ca**. Resizing is one-way for storage (disks can grow but not shrink) and briefly interrupts connections while nodes are replaced. Not every subcommand applies to every engine: **pool** is PostgreSQL-only, **sql-mode** is MySQL-only, **topics** is Kafka-only, and **indexes** is OpenSearch-only.

# INSTALL

```dnf: sudo dnf install doctl```

```pacman: sudo pacman -S doctl```

```apk: sudo apk add doctl```

```brew: brew install doctl```

```nix: nix profile install nixpkgs#doctl```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[doctl](/man/doctl)(1), [doctl-databases-user](/man/doctl-databases-user)(1), [doctl-databases-replica](/man/doctl-databases-replica)(1), [psql](/man/psql)(1), [mysql](/man/mysql)(1)

# RESOURCES

```[Source code](https://github.com/digitalocean/doctl)```

```[Documentation](https://docs.digitalocean.com/reference/doctl/reference/databases/)```

<!-- verified: 2026-07-14 -->

