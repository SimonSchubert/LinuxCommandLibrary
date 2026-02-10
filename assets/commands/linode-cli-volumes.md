# TAGLINE

manages Linode block storage volumes

# TLDR

**List volumes**

```linode-cli volumes list```

**Create volume**

```linode-cli volumes create --label [my-volume] --size [20] --region [us-east]```

**Attach to Linode**

```linode-cli volumes attach [volume_id] --linode_id [linode_id]```

**Detach volume**

```linode-cli volumes detach [volume_id]```

**View volume**

```linode-cli volumes view [volume_id]```

**Delete volume**

```linode-cli volumes delete [volume_id]```

# SYNOPSIS

**linode-cli volumes** _subcommand_ [_options_]

# PARAMETERS

_SUBCOMMAND_
> Volume operation.

**list**
> List all volumes.

**create**
> Create new volume.

**attach** _ID_
> Attach to Linode.

**detach** _ID_
> Detach from Linode.

**view** _ID_
> View volume details.

**delete** _ID_
> Delete volume.

**--label** _NAME_
> Volume name.

**--size** _GB_
> Size in gigabytes.

**--help**
> Display help information.

# DESCRIPTION

**linode-cli volumes** manages Linode block storage volumes. Volumes provide persistent storage for instances.

The tool creates, attaches, resizes, and manages block storage independent of Linode lifecycle.

# CAVEATS

Requires authentication. Billed by size. Same region as Linode for attach.

# HISTORY

linode-cli volumes is part of the **Linode CLI** for managing block storage volumes on Linode cloud.

# SEE ALSO

[linode-cli](/man/linode-cli)(1), [linode-cli-linodes](/man/linode-cli-linodes)(1)

