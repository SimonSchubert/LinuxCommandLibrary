# TAGLINE

PolicyKit authorization daemon

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

**polkitd** is the PolicyKit authorization daemon that processes authorization requests from applications. It evaluates policy rules defined in JavaScript or .pkla files to determine whether a user or process is authorized to perform a specific action.

The daemon is typically started automatically by D-Bus or systemd when an authorization check is needed. The **--debug** flag enables verbose logging for troubleshooting policy issues.

# CAVEATS

Usually started by systemd. System service.

# HISTORY

polkitd is the daemon component of **PolicyKit** authorization framework.

# SEE ALSO

[polkit](/man/polkit)(8), [pkexec](/man/pkexec)(1), [systemd](/man/systemd)(1)

