# TLDR

Check cluster **health status**

```ceph status```

Check cluster **usage stats**

```ceph df```

Get **placement group** statistics

```ceph pg dump --format [plain]```

**Create** a storage pool

```ceph osd pool create [pool_name] [page_number]```

**Delete** a storage pool

```ceph osd pool delete [pool_name]```

**Rename** a storage pool

```ceph osd pool rename [current_name] [new_name]```

**Self-repair** pool storage

```ceph pg repair [pool_name]```

# SYNOPSIS

**ceph** [_options_] _command_

# DESCRIPTION

**ceph** is the command-line interface for managing Ceph distributed storage clusters. Ceph provides unified object, block, and file storage with high availability and no single point of failure.

The command communicates with the Ceph monitor daemons to perform cluster administration tasks.

# SUBCOMMANDS

**status**
> Show cluster health and status

**df**
> Show cluster disk usage

**osd**
> Manage Object Storage Daemons

**pg**
> Manage placement groups

**mon**
> Manage monitor daemons

**mds**
> Manage metadata servers

**auth**
> Manage authentication

# PARAMETERS

**-s, --status**
> Show cluster status

**--format** _format_
> Output format: json, plain

**-c** _file_
> Use alternate config file

# CAVEATS

Requires proper Ceph configuration and authentication. Cluster operations may take time to complete. Some commands require specific permissions.

# SEE ALSO

[cephadm](/man/cephadm)(8), [rbd](/man/rbd)(8), [rados](/man/rados)(8)
