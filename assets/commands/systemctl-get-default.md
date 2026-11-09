# TAGLINE

Show default boot target

# TLDR

Show **default target**

```systemctl get-default```

# SYNOPSIS

**systemctl get-default**

# DESCRIPTION

**systemctl get-default** displays the default target (equivalent to runlevel) that the system boots into. Common targets include `graphical.target` (GUI environment), `multi-user.target` (text-mode multi-user), and `rescue.target` (single-user recovery).

The value is the unit that `default.target` is symlinked to, normally via `/etc/systemd/system/default.target`, falling back to the vendor one in `/usr/lib/systemd/system/`.

# CAVEATS

Only shows the configured default, not the currently active target or a one-off `systemd.unit=` override on the kernel command line. Use `systemctl list-units --type=target` to see currently active targets.

# HISTORY

The **get-default** subcommand provides a simple way to check the system's boot target, replacing the traditional examination of `/etc/inittab` runlevel configuration. It has been documented since systemd 205.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-set-default](/man/systemctl-set-default)(1), [systemctl-default](/man/systemctl-default)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
