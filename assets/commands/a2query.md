# TAGLINE

Query Apache2 configuration state

# TLDR

List enabled Apache **modules**

```sudo a2query -m```

Check if a **specific module** is enabled

```sudo a2query -m [module_name]```

List enabled **virtual hosts**

```sudo a2query -s```

Display the currently enabled **Multi Processing Module**

```sudo a2query -M```

Display **Apache version**

```sudo a2query -v```

List enabled **configuration files**

```sudo a2query -c```

# SYNOPSIS

**a2query** [_-m_ [_MODULE_]] [_-s_ [_SITE_]] [_-c_ [_CONF_]] [_-a_] [_-v_] [_-M_] [_-d_] [_-h_]

# DESCRIPTION

**a2query** is a Debian-specific utility designed to retrieve configuration values from a locally installed Apache2 web server. It provides a robust interface primarily intended for use in maintainer scripts but also useful for system administrators.

Arguments for **-c**, **-m**, and **-s** options are compared flexibly, ignoring leading **mod_** prefixes and **.conf** or **.load** suffixes.

# PARAMETERS

**-m [MODULE]**
> Check whether a module is enabled; returns all enabled modules if no argument provided

**-s [SITE]**
> Check whether a site is enabled; returns all enabled sites if no argument provided

**-c [CONF]**
> Check if a configuration is enabled; returns all enabled configs if no argument provided

**-M**
> Returns the current Apache2 MPM (Multi Processing Module)

**-v**
> Returns the installed Apache2 version

**-a**
> Displays the Apache2 Module Magic Version (API version) number

**-q**
> Suppresses output; useful when only return codes matter

**-h**
> Shows usage help and exits

# CAVEATS

This utility is **Debian-specific** and not available on other Linux distributions. Exit code **32** indicates the requested module, site, or configuration was not found.

# HISTORY

Created as part of the Apache2 package for **Debian GNU/Linux**. Written by Arno Toell.

# SEE ALSO

[a2enmod](/man/a2enmod)(8), [a2dismod](/man/a2dismod)(8), [a2enconf](/man/a2enconf)(8), [a2disconf](/man/a2disconf)(8), [a2ensite](/man/a2ensite)(8), [a2dissite](/man/a2dissite)(8), [apache2ctl](/man/apache2ctl)(8)
