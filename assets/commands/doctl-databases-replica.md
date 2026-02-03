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

**doctl databases replica** manages read replicas for DigitalOcean managed database clusters. Replicas provide read scaling and can be promoted to standalone clusters.

# SEE ALSO

[doctl-databases](/man/doctl-databases)(1)

