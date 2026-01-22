# TLDR

Enter **default** mode

```systemctl default```

Enter default mode **asynchronously**

```systemctl default --no-block```

# SYNOPSIS

**systemctl default** [_OPTIONS_]

# PARAMETERS

**--no-block**
> Return immediately without waiting for the operation to complete

# DESCRIPTION

**systemctl default** transitions the system to the default target, typically `graphical.target` or `multi-user.target` depending on system configuration. This is equivalent to `systemctl isolate default.target`.

This command is useful for returning a system to normal operation after being in rescue or emergency mode.

# CAVEATS

The default target is determined by the symlink at `/etc/systemd/system/default.target`. Switching targets may stop services that are not required by the new target.

# HISTORY

The **default** subcommand provides a convenient way to return to normal system operation without needing to know the specific default target name.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-rescue](/man/systemctl-rescue)(1), [systemctl-emergency](/man/systemctl-emergency)(1), [systemctl-get-default](/man/systemctl-get-default)(1)
