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

**Resize cluster**

```doctl databases resize [cluster_id] --size [db-s-2vcpu-4gb]```

# SYNOPSIS

**doctl** **databases** _command_ [_options_]

# SUBCOMMANDS

**list**
> List database clusters.

**create**
> Create a cluster.

**get**
> Get cluster details.

**delete**
> Delete a cluster.

**connection**
> Get connection info.

**resize**
> Resize a cluster.

**migrate**
> Migrate to new region.

**db**
> Manage databases.

**user**
> Manage users.

**pool**
> Manage connection pools.

**replica**
> Manage read replicas.

**firewalls**
> Manage firewall rules.

# DESCRIPTION

**doctl databases** manages DigitalOcean Managed Databases including PostgreSQL, MySQL, Redis, MongoDB, and Kafka clusters.

The command provides full lifecycle management for database clusters, from creation and configuration to monitoring and deletion. Managed databases handle automated backups, updates, high availability, and scaling. The tool supports various database engines optimized for different use cases, from relational databases to caching and streaming platforms.

Additional subcommands manage database users, connection pools, read replicas, firewall rules, and maintenance windows. Connection strings and credentials can be retrieved for application integration.

# SEE ALSO

[doctl](/man/doctl)(1), [doctl-databases-user](/man/doctl-databases-user)(1)

