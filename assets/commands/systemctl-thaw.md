# TAGLINE

Resume frozen unit processes

# TLDR

**Thaw** (resume) a unit

```systemctl thaw [unit]```

Thaw **multiple** units

```systemctl thaw [unit1 unit2 ...]```

Thaw **all** frozen units

```systemctl thaw '*'```

# SYNOPSIS

**systemctl thaw** _PATTERN_...

# DESCRIPTION

**systemctl thaw** resumes one or more units that were previously frozen with `systemctl freeze`. Frozen units have all their processes suspended via the kernel freezer cgroup controller.

Thawing allows the unit's processes to continue execution from where they were paused.

# CAVEATS

Only affects units that were frozen. Thawing a non-frozen unit has no effect. Requires the cgroup freezer controller to be available.

# HISTORY

The **thaw** subcommand complements the freeze functionality, enabling controlled process suspension and resumption for debugging or resource management.

# SEE ALSO

[systemctl-freeze](/man/systemctl-freeze)(1), [systemctl](/man/systemctl)(1)
