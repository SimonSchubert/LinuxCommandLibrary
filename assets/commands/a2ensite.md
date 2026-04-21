# TAGLINE

Enable Apache2 virtual host sites

# TLDR

**Enable** a virtual host

```sudo a2ensite [virtual_host]```

**Enable multiple** sites at once

```sudo a2ensite [site1] [site2]```

**Enable the default** site

```sudo a2ensite 000-default```

Don't show **informative messages**

```sudo a2ensite -q [virtual_host]```

**Reload** Apache after enabling to apply changes

```sudo systemctl reload apache2```

# SYNOPSIS

**a2ensite** [_-q_|_--quiet_] [_-m_|_--maintmode_] [_site_]

# DESCRIPTION

**a2ensite** is a Debian-specific utility that enables Apache2 virtual host configurations by creating symbolic links in **/etc/apache2/sites-enabled** pointing to site files in **/etc/apache2/sites-available**.

The first virtual host handles unmatched requests, so it should be named **000-default** to ensure it loads first alphabetically. The tool works alongside **a2dissite**, which disables sites.

# PARAMETERS

**-q, --quiet**
> Don't show informative messages

**-m, --maintmode**
> Enables maintainer mode; the program invocation is effectuated automatically by a maintainer script. Not intended for end users.

# EXIT STATUS

**0** - all sites processed successfully.

**1** - an error occurred.

**2** - an invalid option was used.

# FILES

**/etc/apache2/sites-available/**
> Directory containing available site configuration files.

**/etc/apache2/sites-enabled/**
> Directory of symlinks to enabled site configurations (managed by a2ensite/a2dissite).

# CAVEATS

This utility is **Debian-specific** and not available on other Linux distributions. Site changes require an Apache restart or reload to take effect. Virtual hosts are loaded alphabetically, so naming matters.

# HISTORY

Created as part of the Apache2 package for **Debian GNU/Linux**. Part of the a2ensite/a2dissite family of utilities for managing Apache virtual hosts.

# SEE ALSO

[a2dissite](/man/a2dissite)(8), [a2enmod](/man/a2enmod)(8), [a2dismod](/man/a2dismod)(8), [a2enconf](/man/a2enconf)(8), [a2disconf](/man/a2disconf)(8), [apache2ctl](/man/apache2ctl)(8)
