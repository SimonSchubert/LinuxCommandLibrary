# TLDR

**Freeze** a unit

```systemctl freeze unit_name```

Freeze **multiple** units

```systemctl freeze unit1 unit2```

Freeze **all** running units

```systemctl freeze '*'```

# SYNOPSIS

**systemctl freeze** _PATTERN_...

# DESCRIPTION

**systemctl freeze** freezes one or more units using the cgroup freezer. Frozen units have all their processes suspended and cannot be scheduled until thawed. This is useful for temporarily pausing services without stopping them.

# PARAMETERS

**PATTERN**
> One or more unit names or patterns to freeze

# CAVEATS

Frozen units remain in memory but cannot execute. Use "systemctl thaw" to resume frozen units. Not all units support freezing. This requires cgroup v2 freezer support in the kernel.

# HISTORY

**systemctl freeze** is part of **systemd**, providing cgroup-based process freezing for service management.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-thaw](/man/systemctl-thaw)(1)
