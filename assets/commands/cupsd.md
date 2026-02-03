# TLDR

**Start CUPS daemon**

```cupsd```

**Start in foreground**

```cupsd -f```

**Test configuration**

```cupsd -t```

**Use alternate config file**

```cupsd -c [/path/to/cupsd.conf]```

# SYNOPSIS

**cupsd** [_options_]

# PARAMETERS

**-f**
> Run in foreground.

**-F**
> Run in foreground with no forking.

**-c** _config_
> Use alternate configuration file.

**-t**
> Test configuration and exit.

**-h**
> Show help.

# DESCRIPTION

**cupsd** is the scheduler daemon for CUPS (Common Unix Printing System). It manages print queues, processes print requests, and handles printer communication.

Typically started automatically by systemd or init scripts.

# CAVEATS

Normally managed by the system service manager. Direct invocation is usually only needed for debugging.

# SEE ALSO

[cupsctl](/man/cupsctl)(1), [lp](/man/lp)(1), [lpstat](/man/lpstat)(1)
