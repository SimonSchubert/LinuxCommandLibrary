# TLDR

**Start PolicyKit daemon**

```polkitd```

**Run with debug output**

```polkitd --debug```

**Specify config directory**

```polkitd --config-dir=[/etc/polkit-1]```

# SYNOPSIS

**polkitd** [_options_]

# PARAMETERS

**--debug**
> Enable debug output.

**--config-dir** _DIR_
> Configuration directory.

**--no-debug**
> Disable debug output.

# DESCRIPTION

**polkitd** is the PolicyKit daemon. Handles authorization requests.

The tool processes policy rules. Manages privilege elevation.

polkitd handles auth requests.

# CAVEATS

Usually started by systemd. System service.

# HISTORY

polkitd is the daemon component of **PolicyKit** authorization framework.

# SEE ALSO

[polkit](/man/polkit)(8), [pkexec](/man/pkexec)(1), [systemd](/man/systemd)(1)

