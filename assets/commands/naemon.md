# TLDR

**Start Naemon**

```sudo naemon /etc/naemon/naemon.cfg```

**Verify configuration**

```naemon -v /etc/naemon/naemon.cfg```

**Start as daemon**

```sudo systemctl start naemon```

**Check status**

```sudo systemctl status naemon```

# SYNOPSIS

**naemon** [_options_] _config-file_

# PARAMETERS

**-v**
> Verify configuration.

**-d**
> Run as daemon.

**-s**
> Show scheduling info.

**-p** _file_
> PID file location.

**--help**
> Show help.

# DESCRIPTION

**Naemon** is a network monitoring application that monitors hosts and services and alerts when problems occur. It's a fork of Nagios focused on performance and modern features.

Naemon uses plugins for checks and provides a web interface through Thruk.

# CONFIGURATION

```
/etc/naemon/
├── naemon.cfg       # Main config
├── conf.d/          # Object definitions
└── resource.cfg     # Macros
```

# COMPONENTS

```
naemon        - Core daemon
naemonstats   - Statistics
livestatus    - Status API
thruk         - Web interface
```

# CAVEATS

Compatible with Nagios plugins and configs. Requires plugin setup. Web interface separate package.

# HISTORY

Naemon was forked from Nagios Core in **2013** by op5 and Consol to create a faster, more community-driven monitoring solution.

# SEE ALSO

[nagios](/man/nagios)(8), [icinga2](/man/icinga2)(8), [thruk](/man/thruk)(1), [check_mk](/man/check_mk)(1)
