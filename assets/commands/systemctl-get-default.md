# TLDR

Show **default target**

```systemctl get-default```

# SYNOPSIS

**systemctl get-default**

# DESCRIPTION

**systemctl get-default** displays the default target (equivalent to runlevel) that the system boots into. Common targets include `graphical.target` (GUI environment), `multi-user.target` (text-mode multi-user), and `rescue.target` (single-user recovery).

The default target is determined by the symlink at `/etc/systemd/system/default.target`.

# CAVEATS

Only shows the configured default, not the currently active target. Use `systemctl list-units --type=target` to see currently active targets.

# HISTORY

The **get-default** subcommand provides a simple way to check the system's boot target, replacing the traditional examination of `/etc/inittab` runlevel configuration.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-set-default](/man/systemctl-set-default)(1), [systemctl-default](/man/systemctl-default)(1)
