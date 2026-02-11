# TAGLINE

Modify unit properties at runtime

# TLDR

**Set** unit property

```systemctl set-property [unit] [property]=[value]```

Set **multiple** properties

```systemctl set-property [unit] [prop1=val1 prop2=val2 ...]```

Set for **runtime** only

```systemctl set-property [unit] [property]=[value] --runtime```

**Reset** to default

```systemctl set-property [unit] [property]=```

# SYNOPSIS

**systemctl set-property** _UNIT_ _PROPERTY=VALUE_...

# PARAMETERS

**--runtime**
> Make changes temporary (cleared on reboot)

# DESCRIPTION

**systemctl set-property** modifies unit properties at runtime. By default, changes are persistent and stored in drop-in files under `/etc/systemd/system/<unit>.d/`.

Common properties include CPUQuota, MemoryMax, IOWeight, and other resource control settings.

# COMMON PROPERTIES

**CPUQuota=** - CPU time limit (e.g., 50%)

**MemoryMax=** - Memory limit

**IOWeight=** - I/O priority

**TasksMax=** - Maximum tasks

# CAVEATS

Some properties cannot be changed at runtime. Persistent changes are stored as drop-in files. Use `systemctl revert` to remove custom properties.

# HISTORY

The **set-property** subcommand enables runtime resource control adjustments, supporting dynamic system tuning without service restarts.

# SEE ALSO

[systemctl-show](/man/systemctl-show)(1), [systemctl-revert](/man/systemctl-revert)(1), [systemd.resource-control](/man/systemd.resource-control)(5)
