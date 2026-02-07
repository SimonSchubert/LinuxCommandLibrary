# TAGLINE

disable an Apache2 configuration file

# TLDR

**Disable** a configuration file

```sudo a2disconf [configuration_file]```

Don't show **informative messages**

```sudo a2disconf -q [configuration_file]```

Disable a configuration and **purge** all traces from the internal state database

```sudo a2disconf -p [configuration_file]```

# SYNOPSIS

**a2disconf** [_-q_|_--quiet_] [_-m_|_--maintmode_] [_-p_|_--purge_] [_configuration_]

# DESCRIPTION

**a2disconf** is a Debian-specific utility that disables Apache2 configuration files by removing symbolic links from **/etc/apache2/conf-enabled**. It works alongside **a2enconf**, which enables configurations.

The tool silently succeeds if the specified configuration is already disabled, making it safe for use in scripts. After disabling a configuration, Apache must be restarted or reloaded for changes to take effect.

# PARAMETERS

**-q, --quiet**
> Don't show informative messages

**-m, --maintmode**
> Enables maintainer mode; the program invocation is effectuated automatically by a maintainer script

**-p, --purge**
> When disabling a configuration, purge all traces from the internal state database

# CAVEATS

This utility is **Debian-specific** and not available on other Linux distributions. Configuration changes require an Apache restart or reload to take effect.

# HISTORY

Created as part of the Apache2 package for **Debian GNU/Linux**. The manual page was authored by Arno Toell and dates to **February 2012**.

# SEE ALSO

[a2enconf](/man/a2enconf)(8), [a2enmod](/man/a2enmod)(8), [a2dismod](/man/a2dismod)(8), [a2ensite](/man/a2ensite)(8), [a2dissite](/man/a2dissite)(8), [apache2ctl](/man/apache2ctl)(8)
