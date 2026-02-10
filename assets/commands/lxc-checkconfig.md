# TAGLINE

checks whether the current kernel has the required features enabled for LXC

# TLDR

Check **current kernel** support

```lxc-checkconfig```

Check **specific kernel** config

```CONFIG=/path/to/config lxc-checkconfig```

# SYNOPSIS

**lxc-checkconfig**

# DESCRIPTION

**lxc-checkconfig** checks whether the current kernel has the required features enabled for LXC container support. It examines namespaces, cgroups, and other kernel capabilities.

# CHECKS PERFORMED

**Namespaces**: User, PID, UTS, IPC, Network
**Cgroups**: v1/v2, controllers
**Misc**: Seccomp, checkpoint/restore

# CAVEATS

Set CONFIG environment variable to check a different kernel configuration file. Helps diagnose why containers might not work on a system.

# SEE ALSO

[lxc-create](/man/lxc-create)(1), [lxc-start](/man/lxc-start)(1)
