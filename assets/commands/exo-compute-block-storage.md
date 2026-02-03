# TLDR

**List block storage volumes**

```exo compute block-storage list```

**Create a volume**

```exo compute block-storage create [name] --size [100] --zone [ch-gva-2]```

**Show volume details**

```exo compute block-storage show [name]```

**Attach volume to instance**

```exo compute block-storage attach [volume] [instance]```

**Detach volume**

```exo compute block-storage detach [volume]```

**Delete a volume**

```exo compute block-storage delete [name]```

# SYNOPSIS

**exo** **compute** **block-storage** _command_ [_options_]

# SUBCOMMANDS

**list**
> List block storage volumes.

**create**
> Create a volume.

**show**
> Show volume details.

**attach**
> Attach to instance.

**detach**
> Detach from instance.

**resize**
> Resize volume.

**delete**
> Delete volume.

# DESCRIPTION

**exo compute block-storage** manages Exoscale block storage volumes. Volumes provide persistent storage that can be attached to compute instances.

# SEE ALSO

[exo-compute-instance](/man/exo-compute-instance)(1), [exo](/man/exo)(1)

