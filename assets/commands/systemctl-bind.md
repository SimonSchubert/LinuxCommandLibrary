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
> Create the destination directory if it doesn't exist

# DESCRIPTION

**systemctl bind** ephemerally bind-mounts a file or directory from the host into a running unit's mount namespace. This allows injecting files into sandboxed services without modifying their unit configuration.

If only one path is specified, the mount appears at the same location inside the unit. If two paths are given, the source is mounted at the destination inside the unit.

# CAVEATS

Requires the unit to have a separate mount namespace (PrivateMounts=yes or similar). Binds are ephemeral and don't persist across unit restarts. The unit must be running.

# HISTORY

The **bind** subcommand was added to **systemctl** for runtime injection of files into isolated services. It complements systemd's sandboxing features like PrivateMounts and ProtectSystem.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemd.exec](/man/systemd.exec)(5)
