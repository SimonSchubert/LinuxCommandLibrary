# TLDR

**Build storage pool**

```virsh pool-build [pool]```

**Build with overwrite**

```virsh pool-build [pool] --overwrite```

# SYNOPSIS

**virsh** **pool-build** _pool_ [_options_]

# PARAMETERS

**--overwrite**
> Overwrite existing data.

**--no-overwrite**
> Fail if data exists.

# DESCRIPTION

**virsh pool-build** initializes a storage pool. Creates necessary directories or formats devices depending on pool type. Required before pool-start for some pool types.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-define-as](/man/virsh-pool-define-as)(1), [virsh-pool-start](/man/virsh-pool-start)(1)

