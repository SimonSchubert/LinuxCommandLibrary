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

**Remove cluster settings** from persisted state (wildcards allowed)

```elasticsearch-node remove-settings [xpack.monitoring.*]```

**Remove incompatible index settings** that prevent the cluster from forming

```elasticsearch-node remove-index-settings [index.my_plugin.foo]```

# SYNOPSIS

**elasticsearch-node** **repurpose**|**unsafe-bootstrap**|**detach-cluster**|**override-version** [**-E** _setting=value_] [**-h**] [**-s**|**-v**]

**elasticsearch-node** **remove-settings**|**remove-index-settings**|**remove-customs** _pattern_... [_options_]

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

**remove-index-settings** _patterns_
> Remove index settings matching the supplied patterns from the on-disk cluster state, e.g. settings of an uninstalled plugin.

**unsafe-bootstrap**
> Bootstrap a new single-node cluster from this node's on-disk data when the original cluster cannot be recovered. Can cause data loss.

# PARAMETERS

**-E** _setting=value_
> Override an Elasticsearch configuration setting for the tool invocation.

**-h**, **--help**
> Show help.

**-s**, **--silent**
> Show minimal output (mutually exclusive with **--verbose**).

**-v**, **--verbose**
> Show verbose output.

# DESCRIPTION

**elasticsearch-node** is shipped in the **bin/** directory of every Elasticsearch installation. It operates directly on the on-disk data of a **stopped** node to repair situations that cannot be fixed through the REST API: repurposing a node after a role change, recovering from the permanent loss of a majority of master-eligible nodes, moving a node to a new cluster, or removing settings and metadata that block startup. Each mode prints a warning describing the consequences and asks for confirmation before changing anything.

# CAVEATS

These commands can cause data loss and divergence between nodes. Run only on a stopped node, on every affected node, and only after consulting the official Elasticsearch documentation for the specific recovery scenario. Always back up the data directory first.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-keystore](/man/elasticsearch-keystore)(1)

# RESOURCES

```[Source code](https://github.com/elastic/elasticsearch)```

```[Documentation](https://www.elastic.co/docs/reference/elasticsearch/command-line-tools/node-tool)```

<!-- verified: 2026-11-23 -->
