# TAGLINE

Resume frozen unit processes

# TLDR

**Thaw** (resume) a unit

```systemctl thaw [unit]```

Thaw **multiple** units

```systemctl thaw [unit1 unit2 ...]```

Thaw units matching a **pattern**

```systemctl thaw '[pattern]'```

# SYNOPSIS

**systemctl thaw** _PATTERN_...

# DESCRIPTION

**systemctl thaw** resumes one or more units that were previously frozen with `systemctl freeze`. Frozen units have all their processes suspended using the cgroup freezer. A frozen unit is also thawed automatically just before a job runs against it, such as a stop.

Thawing allows the unit's processes to continue execution from where they were paused.

# CAVEATS

Only affects units that were frozen. Thawing a non-frozen unit has no effect. Requires the unified cgroup hierarchy (cgroup v2).

# HISTORY

The **thaw** subcommand complements the freeze functionality, enabling controlled process suspension and resumption for debugging or resource management. It has been available since systemd 246.

# SEE ALSO

[systemctl-freeze](/man/systemctl-freeze)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
