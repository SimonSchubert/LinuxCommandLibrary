# TLDR

Set **default** boot target

```systemctl set-default [target.target]```

Boot to **GUI** mode

```systemctl set-default graphical.target```

Boot to **CLI** mode

```systemctl set-default multi-user.target```

# SYNOPSIS

**systemctl set-default** _TARGET_

# DESCRIPTION

**systemctl set-default** sets the default target that the system boots into by creating a symlink at `/etc/systemd/system/default.target` pointing to the specified target.

Common targets include `graphical.target` (GUI environment with display manager) and `multi-user.target` (text-mode multi-user with networking).

# COMMON TARGETS

**graphical.target** - Full graphical user interface

**multi-user.target** - Text-mode multi-user

**rescue.target** - Single-user rescue shell

**emergency.target** - Minimal emergency shell

# CAVEATS

Requires root privileges. Takes effect on next boot. Does not affect the currently running system. Use `systemctl isolate` to switch targets immediately.

# HISTORY

The **set-default** subcommand replaces traditional runlevel configuration, providing a simple way to control what target (runlevel equivalent) the system boots into.

# SEE ALSO

[systemctl-get-default](/man/systemctl-get-default)(1), [systemctl-isolate](/man/systemctl-isolate)(1), [systemctl](/man/systemctl)(1)
