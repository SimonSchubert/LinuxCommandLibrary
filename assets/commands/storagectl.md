# TAGLINE

Enumerate and mount storage volumes provided by systemd storage providers

# TLDR

**List all available storage volumes**

```storagectl volumes```

**List storage providers**

```storagectl providers```

**List volume templates**

```storagectl templates```

**List volumes matching a glob**

```storagectl volumes '*foo*'```

**Mount a directory volume** using the storage mount helper (as root)

```mount -t storage fs:myvol /mnt/myvol```

# SYNOPSIS

**storagectl** [OPTIONS...] {COMMAND} [NAME...]

# DESCRIPTION

**storagectl** is a command-line tool to inspect storage providers and the storage volumes they expose. It is part of the systemd project.

A storage provider implements the `io.systemd.StorageProvider` Varlink interface and registers an AF_UNIX socket under `/run/systemd/io.systemd.StorageProvider/` (system) or the user equivalent.

systemd ships two providers:

- `systemd-storage-block@.service` — exposes the system's block devices.
- `systemd-storage-fs@.service` — exposes regular files and directories from a backing filesystem (supports on-the-fly creation via templates).

storagectl can also act as a mount helper (`mount -t storage ...` or `mount -t storage.FSTYPE ...`) to acquire and mount volumes at arbitrary locations. The source is specified as `PROVIDER:VOLUME`.

# COMMANDS

**volumes** [_GLOB_]
> List volumes (default command). Optional glob filters volume names.

**templates** [_GLOB_]
> List supported volume templates (for providers that support dynamic creation).

**providers**
> List known storage providers and whether their sockets are reachable.

# OPTIONS

**--system**
> Operate on system providers (default).

**--user**
> Operate on per-user providers.

**--json**=_MODE_
> Output as JSON ("short", "pretty", or "off").

**--no-pager**, **--no-legend**, **--no-ask-password**
> Control output and authentication behavior.

# CAVEATS

This tool is relatively new (added in systemd 261). Storage providers are an experimental/low-level interface primarily for advanced use cases and other systemd components (e.g. machinectl).

# SEE ALSO

[systemctl](/man/systemctl)(1), [mount](/man/mount)(8), [machinectl](/man/machinectl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/storagectl.html)```

<!-- verified: 2026-07-11 -->
