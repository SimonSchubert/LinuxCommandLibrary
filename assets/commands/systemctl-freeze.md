# TAGLINE

Freeze unit processes via cgroup

# TLDR

**Freeze** a unit

```systemctl freeze unit_name```

Freeze **multiple** units

```systemctl freeze unit1 unit2```

Freeze units matching a **pattern**

```systemctl freeze 'app-*.service'```

Freeze a **user** unit

```systemctl --user freeze unit_name```

**Resume** a frozen unit

```systemctl thaw unit_name```

# SYNOPSIS

**systemctl freeze** _PATTERN_...

# DESCRIPTION

**systemctl freeze** freezes one or more units using the cgroup freezer. Frozen units have all their processes suspended and cannot be scheduled until thawed. This is useful for temporarily pausing services without stopping them.

# PARAMETERS

**PATTERN**
> One or more unit names or patterns to freeze

# CAVEATS

Frozen units remain in memory but cannot execute. Use "systemctl thaw" to resume frozen units. A unit is automatically thawed just before a job is executed against it, for example before it is stopped. Only service, scope, and slice unit types support freezing. Requires cgroup v2 (unified hierarchy) support in the kernel.

# HISTORY

**systemctl freeze** was added in **systemd 246** as part of cgroup-based process freezing for service management.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-thaw](/man/systemctl-thaw)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
