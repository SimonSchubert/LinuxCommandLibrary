# TLDR

**Disable** a module

```sudo a2dismod [module]```

Don't show **informative messages**

```sudo a2dismod -q [module]```

**Force** disable a module and cascade disable all modules that depend on it

```sudo a2dismod -f [module]```

Disable a module and **purge** all traces from the internal state database

```sudo a2dismod -p [module]```

# SYNOPSIS

**a2dismod** [_-q_|_--quiet_] [_-f_|_--force_] [_-m_|_--maintmode_] [_-p_|_--purge_] [_module_]

# DESCRIPTION

**a2dismod** is a Debian-specific utility that disables Apache2 modules by removing symbolic links from **/etc/apache2/mods-enabled**. It manages both **.load** files and associated **.conf** files for each module.

The tool works alongside **a2enmod**, which enables modules. After disabling a module, Apache must be restarted or reloaded for changes to take effect.

# PARAMETERS

**-q, --quiet**
> Don't show informative messages

**-f, --force**
> Cascade disable all modules that depend on the specified module

**-m, --maintmode**
> Enables maintainer mode; the program invocation is effectuated automatically by a maintainer script

**-p, --purge**
> When disabling a module, purge all traces from the internal state database

# CAVEATS

This utility is **Debian-specific** and not available on other Linux distributions. Using **-f** to force disable a module will also disable all dependent modules, which may break your Apache configuration.

# HISTORY

Created as part of the Apache2 package for **Debian GNU/Linux**. The manual page was authored by Daniel Stone and dates to **October 2006**.

# SEE ALSO

[a2enmod](/man/a2enmod)(8), [a2enconf](/man/a2enconf)(8), [a2disconf](/man/a2disconf)(8), [a2ensite](/man/a2ensite)(8), [a2dissite](/man/a2dissite)(8), [apache2ctl](/man/apache2ctl)(8)
