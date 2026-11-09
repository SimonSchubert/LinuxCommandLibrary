# TAGLINE

Exoscale persistent block storage volume management

# TLDR

**List block storage volumes in a zone**

```exo compute block-storage list --zone [ch-gva-2]```

**Create a volume** of a given size in GiB

```exo compute block-storage create [name] --size [100] --zone [ch-gva-2]```

**Create a volume from a snapshot**

```exo compute block-storage create [name] --snapshot [snapshot] --zone [ch-gva-2]```

**Show volume details**

```exo compute block-storage show [name] --zone [ch-gva-2]```

**Attach volume to instance**

```exo compute block-storage attach [volume] [instance] --zone [ch-gva-2]```

**Detach volume**

```exo compute block-storage detach [volume] --zone [ch-gva-2]```

**Resize a volume**

```exo compute block-storage update [name] --size [200] --zone [ch-gva-2]```

**Create a snapshot**

```exo compute block-storage snapshot create [volume] --name [snapshot] --zone [ch-gva-2]```

**Delete a volume** without confirmation

```exo compute block-storage delete [name] --force --zone [ch-gva-2]```

# SYNOPSIS

**exo** **compute** **block-storage** _command_ [_options_]

# SUBCOMMANDS

**list**
> List block storage volumes.

**create** _NAME_
> Create a volume.

**show** _NAME|ID_
> Show volume details.

**attach** _VOLUME_ _INSTANCE_
> Attach a volume to an instance.

**detach** _VOLUME_
> Detach a volume from its instance.

**update** _NAME|ID_
> Update volume properties (**--rename**, **--size**, **--label**).

**snapshot**
> Manage volume snapshots (create, list, show, delete, update).

**delete** _NAME|ID_
> Delete a volume.

# PARAMETERS

**-z**, **--zone** _ZONE_
> Zone of the volume. For **list**, filters results to that zone.

**--size** _GiB_
> Volume size in GiB (default for create: 10).

**--label** _KEY=VALUE_
> Volume labels. With **update**, pass **=** to clear the labels.

**--snapshot** _NAME|ID_
> With **create**: create the volume from a snapshot.

**--rename** _NAME_
> With **update**: rename the volume.

**-f**, **--force**
> With **delete** and **detach**: do not prompt for confirmation.

# DESCRIPTION

**exo compute block-storage** manages Exoscale block storage volumes. Volumes provide persistent storage that can be attached to compute instances.

Block storage volumes survive instance termination and can be moved between instances. They are ideal for databases, application data, and any workload requiring persistent storage separate from the instance lifecycle.

Volumes can be resized via the **update** subcommand and support snapshots for backup and cloning.

# SEE ALSO

[exo-compute-instance](/man/exo-compute-instance)(1), [exo](/man/exo)(1)

# RESOURCES

```[Source code](https://github.com/exoscale/cli)```

```[Documentation](https://community.exoscale.com/product/storage/block-storage/)```

<!-- verified: 2026-11-09 -->
