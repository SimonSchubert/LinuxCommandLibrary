# TAGLINE

Low-level node recovery and cluster operations

# TLDR

**Clean up data** after repurposing the node (removes data no longer used by its current roles)

```elasticsearch-node repurpose```

**Detach node from its cluster** so it can join another

```elasticsearch-node detach-cluster```

**Override cluster state version** to allow downgrade

```elasticsearch-node override-version```

**Remove custom metadata** from cluster state

```elasticsearch-node remove-customs [customs]```

**Unsafely bootstrap a new cluster** from this node (data loss possible)

```elasticsearch-node unsafe-bootstrap```

**Remove cluster settings** from persisted state

```elasticsearch-node remove-settings [settings]```

# SYNOPSIS

**elasticsearch-node** _command_ [_options_]

# SUBCOMMANDS

**repurpose**
> Clean up data and indices on a node whose roles have changed so that data is no longer required (e.g. switching a data node to master-only).

**detach-cluster**
> Forcibly detach the node from its current cluster, allowing it to join a new one. Used when the previous cluster is permanently lost.

**override-version**
> Override the on-disk cluster state version when starting on a newer Elasticsearch than the data was written by.

**remove-customs** _patterns_
> Remove custom metadata entries matching the supplied patterns from the on-disk cluster state.

**remove-settings** _patterns_
> Remove persistent cluster settings matching the supplied patterns.

**unsafe-bootstrap**
> Bootstrap a new single-node cluster from this node's on-disk data when the original cluster cannot be recovered. Can cause data loss.

# PARAMETERS

**-E** _setting=value_
> Override an Elasticsearch configuration setting for the tool invocation.

**-h**, **--help**
> Show help.

**-s**, **--silent**
> Show minimal output.

**-v**, **--verbose**
> Show verbose output.

# CAVEATS

These commands can cause data loss and divergence between nodes. Run only on a stopped node, on every affected node, and only after consulting the official Elasticsearch documentation for the specific recovery scenario. Always back up the data directory first.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1)

