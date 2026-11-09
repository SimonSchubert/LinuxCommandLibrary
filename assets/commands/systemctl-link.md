# TAGLINE

Link external unit files to systemd

# TLDR

**Link** unit file

```systemctl link [/absolute/path/to/unit.service]```

Link **multiple** unit files

```systemctl link [/path/to/unit1.service /path/to/unit2.service ...]```

# SYNOPSIS

**systemctl link** _PATH_...

# DESCRIPTION

**systemctl link** creates a symbolic link in the unit file search path pointing to a unit file located elsewhere. This makes the unit available to systemd commands without copying the file.

The link is created in `/etc/systemd/system/` (or the user equivalent with `--user`). The path given must be absolute.

# CAVEATS

The linked file must remain in place; removing it breaks the link. Its file system must be accessible when systemd starts, so locations under `/home/` or `/var/` only work if they are on the root file system. Use `systemctl disable` to remove the link. The linked unit is not automatically enabled; use `systemctl enable` after linking to start at boot.

# HISTORY

The **link** subcommand allows testing or using unit files stored outside standard locations, useful during development or when unit files are managed by external configuration management systems.

# SEE ALSO

[systemctl-enable](/man/systemctl-enable)(1), [systemctl-disable](/man/systemctl-disable)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
