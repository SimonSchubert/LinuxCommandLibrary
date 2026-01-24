# TLDR

**Change service directory**

```runsvchdir [multi-user]```

**Switch to rescue mode**

```runsvchdir [single]```

**View current runlevel**

```cat /etc/runit/runsvdir/current```

# SYNOPSIS

**runsvchdir** _name_

# DESCRIPTION

**runsvchdir** switches which service directory runsvdir supervises. It changes the system's effective runlevel.

Runlevels are directories in /etc/runit/runsvdir/. Each contains symlinks to services.

The switch is graceful. Services not in the new level are stopped, new ones started.

Common levels include default, single, and multi-user. Custom levels can be created.

The current symlink tracks active level. /etc/runit/runsvdir/current points to active.

# RUNLEVELS

**default** - Normal multi-user
**single** - Single user/rescue
**multi-user** - Network services
**custom** - User-defined

# CAVEATS

Requires root. Services must exist in target level. Switch may take time for service stops.

# HISTORY

**runsvchdir** is part of **runit**, providing runlevel-like switching. It allows dynamic reconfiguration of which services are supervised.

# SEE ALSO

[runsvdir](/man/runsvdir)(8), [runit](/man/runit)(8), [sv](/man/sv)(8)
