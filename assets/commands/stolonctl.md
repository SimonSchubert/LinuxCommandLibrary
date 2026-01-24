# TLDR

**Get cluster status**

```stolonctl --cluster-name [cluster] status```

**Initialize cluster**

```stolonctl --cluster-name [cluster] init```

**Get cluster spec**

```stolonctl --cluster-name [cluster] spec```

**Update spec**

```stolonctl --cluster-name [cluster] update --patch '[{"key":"value"}]'```

**Failkeeper**

```stolonctl --cluster-name [cluster] failkeeper [keeper-id]```

# SYNOPSIS

**stolonctl** [_--cluster-name name_] _command_ [_options_]

# PARAMETERS

**--cluster-name** _NAME_
> Cluster name.

**status**
> Show status.

**init**
> Initialize cluster.

**spec**
> Show specification.

**update**
> Update configuration.

**--store-backend** _TYPE_
> Backend type.

# DESCRIPTION

**stolonctl** manages Stolon clusters. It controls PostgreSQL HA.

Cluster administration. Status and config.

Initialization support. Bootstrap clusters.

Specification management. Update settings.

Failover control. Manual failover.

# CAVEATS

Stolon deployment required. Kubernetes or etcd. PostgreSQL specific.

# HISTORY

**stolonctl** is the CLI for **Stolon**, a cloud-native PostgreSQL high-availability manager.

# SEE ALSO

[psql](/man/psql)(1), [pg_ctl](/man/pg_ctl)(1), [kubectl](/man/kubectl)(1)
