# TAGLINE

Show unit dependency tree

# TLDR

Show **default.target** dependencies

```systemctl list-dependencies```

Show dependencies for **specific unit**

```systemctl list-dependencies [unit]```

Show **all** dependency types

```systemctl list-dependencies [unit] -a```

Filter by **unit type**

```systemctl list-dependencies [unit] -t [service|socket|target|mount]```

Show **reverse** dependencies

```systemctl list-dependencies [unit] --reverse```

Output without **headers**

```systemctl list-dependencies [unit] --no-legend```

# SYNOPSIS

**systemctl list-dependencies** [_OPTIONS_] [_UNIT_...]

# PARAMETERS

**-a, --all**
> Include all dependency types (not just Requires and Wants)

**-t, --type=** _TYPE_
> Filter by unit type

**--reverse**
> Show units that depend on this unit instead

**--no-legend**
> Suppress header and footer (for scripts)

**--no-pager**
> Disable pager

# DESCRIPTION

**systemctl list-dependencies** displays a unit's dependency tree in a hierarchical format. By default, it shows Requires and Wants dependencies. With `--all`, it includes all dependency types (After, Before, Conflicts, etc.).

The `--reverse` option inverts the view, showing which units depend on the specified unit rather than what it depends on.

# CAVEATS

The tree can be very large for targets like default.target. Active units are marked differently from inactive ones. The output represents configuration, not runtime state.

# HISTORY

The **list-dependencies** subcommand helps understand the complex dependency relationships in systemd, essential for debugging boot issues and understanding service ordering.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-list-units](/man/systemctl-list-units)(1), [systemd.unit](/man/systemd.unit)(5)
