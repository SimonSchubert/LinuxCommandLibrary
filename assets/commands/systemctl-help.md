# TLDR

Show **manual** for unit

```systemctl help [unit]```

Show manuals for **multiple** units

```systemctl help [unit1 unit2 ...]```

Show manual for **user** unit

```systemctl help [unit] --user```

Show without **pager**

```systemctl help [unit] --no-pager```

Show manual by **PID**

```systemctl help [pid]```

# SYNOPSIS

**systemctl help** _PATTERN_...|_PID_...

# PARAMETERS

**--user**
> Show help for user units

**--no-pager**
> Display all output at once without paging

# DESCRIPTION

**systemctl help** displays the manual pages for one or more units. If a numeric PID is provided instead of a unit name, it shows the manual for the unit that process belongs to.

The manual page is determined by the `Documentation=` directive in the unit file.

# CAVEATS

Not all units have associated documentation. The Documentation= directive must be set in the unit file for this to work. Falls back to generic systemd documentation if no specific manual exists.

# HISTORY

The **help** subcommand provides integrated documentation access directly from the unit management interface, linking units to their relevant manual pages.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-cat](/man/systemctl-cat)(1), [man](/man/man)(1)
