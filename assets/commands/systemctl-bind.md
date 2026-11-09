# TAGLINE

Bind-mount paths into unit mount namespaces at runtime

# TLDR

**Bind-mount** path into unit

```systemctl bind [unit] [/path/to/host]```

Bind to **different** location in unit

```systemctl bind [unit] [/host/path] [/unit/path]```

Bind as **read-only**

```systemctl bind [unit] [/path] --read-only```

**Create** destination before binding

```systemctl bind [unit] [/host/path] [/unit/path] --mkdir```

# SYNOPSIS

**systemctl bind** _UNIT_ _PATH_ [_PATH_]

# PARAMETERS

**--read-only**
> Mount the path as read-only inside the unit

**--mkdir**
> Create the destination before mounting. Despite the name, this also creates a file node when the source is not a directory

# DESCRIPTION

**systemctl bind** ephemerally bind-mounts a file, directory, device node, AF_UNIX socket or FIFO from the host into a running unit's mount namespace. This allows injecting files into sandboxed services without modifying their unit configuration.

If only one path is specified, the mount appears at the same location inside the unit. If two paths are given, the source is mounted at the destination inside the unit.

# CAVEATS

Only supported for units that run within a mount namespace (e.g. with RootImage= or PrivateMounts=). Binds are ephemeral and are undone as soon as the current unit process exits. The unit must be running. The mount is added to the namespace of the main service process; processes run by ExecReload=, ExecStartPre= and similar use distinct namespaces.

# HISTORY

The **bind** subcommand was added to **systemctl** in **systemd 248** for runtime injection of files into isolated services. It complements systemd's sandboxing features like PrivateMounts and ProtectSystem.

# SEE ALSO

[systemctl](/man/systemctl)(1), [mount](/man/mount)(8), [systemd-run](/man/systemd-run)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
