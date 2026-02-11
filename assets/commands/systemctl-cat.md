# TAGLINE

Display systemd unit file contents

# TLDR

Show **unit file** contents

```systemctl cat [unit]```

Show **multiple** unit files

```systemctl cat [unit1 unit2 ...]```

Show **template** unit file

```systemctl cat [template@]```

Show **user** unit file

```systemctl cat [unit] --user```

# SYNOPSIS

**systemctl cat** _PATTERN_...

# PARAMETERS

**--user**
> Show user unit files

**--system**
> Show system unit files (default)

# DESCRIPTION

**systemctl cat** displays the full contents of unit files as systemd sees them, including the main unit file and any drop-in override files. It shows the absolute path of each file before its contents.

This is useful for debugging unit configuration, especially when drop-in files in `.d/` directories modify the base unit.

# CAVEATS

Shows the raw file contents, not the effective configuration after parsing. Use `systemctl show` to see the actual runtime values. Template units should be specified with the trailing @ symbol.

# HISTORY

The **cat** subcommand is part of **systemctl** in the **systemd** project. It provides a convenient way to inspect unit configuration without manually locating files across multiple directories.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-edit](/man/systemctl-edit)(1), [systemctl-show](/man/systemctl-show)(1)
