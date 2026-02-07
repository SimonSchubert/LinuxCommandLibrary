# TAGLINE

disable an Apache2 virtual host

# TLDR

**Disable** a virtual host

```sudo a2dissite [virtual_host]```

Don't show **informative messages**

```sudo a2dissite -q [virtual_host]```

Disable a virtual host and **purge** all traces from the internal state database

```sudo a2dissite -p [virtual_host]```

# SYNOPSIS

**a2dissite** [_-q_|_--quiet_] [_-m_|_--maintmode_] [_-p_|_--purge_] [_site_]

# DESCRIPTION

**a2dissite** is a Debian-specific utility that disables Apache2 virtual host configurations by removing symbolic links from **/etc/apache2/sites-enabled**. Site configuration files remain in **/etc/apache2/sites-available** and can be re-enabled later.

The tool silently succeeds if the specified site is already disabled. After disabling a site, Apache must be restarted or reloaded for changes to take effect.

# PARAMETERS

**-q, --quiet**
> Don't show informative messages

**-m, --maintmode**
> Enables maintainer mode; the program invocation is effectuated automatically by a maintainer script

**-p, --purge**
> When disabling a site, purge all traces from the internal state database

# CAVEATS

This utility is **Debian-specific** and not available on other Linux distributions. Site changes require an Apache restart or reload to take effect.

# HISTORY

Created as part of the Apache2 package for **Debian GNU/Linux**. Part of the a2ensite/a2dissite family of utilities for managing Apache virtual hosts.

# SEE ALSO

[a2ensite](/man/a2ensite)(8), [a2enmod](/man/a2enmod)(8), [a2dismod](/man/a2dismod)(8), [a2enconf](/man/a2enconf)(8), [a2disconf](/man/a2disconf)(8), [apache2ctl](/man/apache2ctl)(8)
