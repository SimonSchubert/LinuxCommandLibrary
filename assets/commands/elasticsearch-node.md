# TLDR

**Repurpose node as voting-only**

```elasticsearch-node repurpose```

**Detach node from cluster**

```elasticsearch-node detach-cluster```

**Override cluster state version**

```elasticsearch-node override-version```

**Remove custom metadata**

```elasticsearch-node remove-customs```

**Unsafe bootstrap cluster**

```elasticsearch-node unsafe-bootstrap```

# SYNOPSIS

**elasticsearch-node** _command_ [_options_]

# SUBCOMMANDS

**repurpose**
> Change node roles.

**detach-cluster**
> Detach from cluster.

**override-version**
> Override version check.

**remove-customs**
> Remove custom metadata.

**unsafe-bootstrap**
> Unsafely bootstrap cluster.

# PARAMETERS

**-E** _setting=value_
> Override configuration setting.

# DESCRIPTION

**elasticsearch-node** performs low-level operations on an Elasticsearch node. Used for recovery scenarios when the cluster is not functioning normally.

# CAVEATS

These commands can cause data loss. Only use when following official Elasticsearch documentation for specific recovery procedures.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-shard](/man/elasticsearch-shard)(1)

