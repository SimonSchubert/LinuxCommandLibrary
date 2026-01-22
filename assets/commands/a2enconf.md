# TLDR

**Enable** a configuration file

```sudo a2enconf [configuration_file]```

Don't show **informative messages**

```sudo a2enconf -q [configuration_file]```

# SYNOPSIS

**a2enconf** [_-q_|_--quiet_] [_-m_|_--maintmode_] [_configuration_]

# DESCRIPTION

**a2enconf** is a Debian-specific utility that enables Apache2 configuration files by creating symbolic links in **/etc/apache2/conf-enabled** pointing to files in **/etc/apache2/conf-available**.

The tool works alongside **a2disconf**, which disables configurations. After enabling a configuration, Apache must be restarted or reloaded for changes to take effect.

# PARAMETERS

**-q, --quiet**
> Don't show informative messages

**-m, --maintmode**
> Enables maintainer mode; the program invocation is effectuated automatically by a maintainer script

# CAVEATS

This utility is **Debian-specific** and not available on other Linux distributions. Configuration changes require an Apache restart or reload to take effect.

# HISTORY

Created as part of the Apache2 package for **Debian GNU/Linux**. The manual page was authored by Arno Toell and dates to **February 2012**.

# SEE ALSO

[a2disconf](/man/a2disconf)(8), [a2enmod](/man/a2enmod)(8), [a2dismod](/man/a2dismod)(8), [a2ensite](/man/a2ensite)(8), [a2dissite](/man/a2dissite)(8), [apache2ctl](/man/apache2ctl)(8)
