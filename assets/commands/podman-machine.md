# TLDR

**Initialize machine**

```podman machine init```

**Start machine**

```podman machine start```

**Stop machine**

```podman machine stop```

**List machines**

```podman machine list```

**SSH into machine**

```podman machine ssh```

**Remove machine**

```podman machine rm```

# SYNOPSIS

**podman** **machine** _command_ [_options_]

# PARAMETERS

**init**
> Initialize a new machine.

**start**
> Start machine.

**stop**
> Stop machine.

**list**
> List machines.

**ssh**
> SSH into machine.

**rm**
> Remove machine.

**--cpus** _n_
> Number of CPUs (init).

**--memory** _mb_
> Memory in MB (init).

# DESCRIPTION

**podman machine** manages virtual machines for running Podman on macOS and Windows. Creates a Linux VM to run containers. Required on non-Linux systems since containers need a Linux kernel.

# SEE ALSO

[podman](/man/podman)(1)

