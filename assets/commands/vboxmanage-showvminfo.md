# TLDR

**Show VM info**

```vboxmanage showvminfo [vmname]```

**Show as machine-readable**

```vboxmanage showvminfo [vmname] --machinereadable```

**Show specific details**

```vboxmanage showvminfo [vmname] --details```

# SYNOPSIS

**vboxmanage** **showvminfo** _vmname_ [_options_]

# PARAMETERS

**--machinereadable**
> Output parseable format.

**--details**
> Show detailed info.

**--log** _n_
> Show log file n.

# DESCRIPTION

**vboxmanage showvminfo** displays detailed VM configuration. Shows hardware settings, state, snapshots, and shared folders. Use --machinereadable for scripting.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-list](/man/vboxmanage-list)(1)

