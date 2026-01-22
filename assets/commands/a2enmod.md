# TLDR

**Enable** a module

```sudo a2enmod [module]```

Don't show **informative messages**

```sudo a2enmod -q [module]```

# SYNOPSIS

**a2enmod** [_-q_|_--quiet_] [_-m_|_--maintmode_] [_module_]

# DESCRIPTION

**a2enmod** is a Debian-specific utility that enables Apache2 modules by creating symbolic links in **/etc/apache2/mods-enabled** pointing to module files in **/etc/apache2/mods-available**. The tool handles both **.load** and associated **.conf** files for each module.

The tool works alongside **a2dismod**, which disables modules. After enabling a module, Apache must be restarted or reloaded for changes to take effect.

# PARAMETERS

**-q, --quiet**
> Don't show informative messages

**-m, --maintmode**
> Enables maintainer mode; the program invocation is effectuated automatically by a maintainer script

# CAVEATS

This utility is **Debian-specific** and not available on other Linux distributions. Enabling a module may require enabling its dependencies first. Module changes require an Apache restart or reload to take effect.

# HISTORY

Created as part of the Apache2 package for **Debian GNU/Linux**. The manual page was authored by Daniel Stone and dates to **October 2006**.

# SEE ALSO

[a2dismod](/man/a2dismod)(8), [a2enconf](/man/a2enconf)(8), [a2disconf](/man/a2disconf)(8), [a2ensite](/man/a2ensite)(8), [a2dissite](/man/a2dissite)(8), [apache2ctl](/man/apache2ctl)(8)
