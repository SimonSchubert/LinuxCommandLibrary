# TAGLINE

disables PHP extensions on Debian-based systems by removing the symbolic link

# TLDR

**Disable** extension for all PHP versions and SAPIs

```sudo phpdismod [extension]```

Disable extension for **specific version** and SAPI

```sudo phpdismod -v [7.4] -s [cli] [extension]```

# SYNOPSIS

**phpdismod** [**-v** _version_] [**-s** _sapi_] _module_

# PARAMETERS

**-v _version_**
> PHP version (e.g., 7.4, 8.0, 8.1)

**-s _sapi_**
> SAPI type (cli, fpm, apache2, cgi)

**module**
> Extension name to disable

# DESCRIPTION

**phpdismod** disables PHP extensions on Debian-based systems by removing the symbolic link from the conf.d directory. Without version or SAPI specified, it disables the extension for all installed PHP versions and all SAPIs.

The command works by manipulating symlinks in /etc/php/VERSION/SAPI/conf.d/ that point to module configuration files in mods-available.

# CAVEATS

Debian/Ubuntu specific tool. Requires root privileges. Changes take effect after restarting PHP-FPM or Apache. Some extensions have dependencies that may cause issues when disabled.

# HISTORY

**phpdismod** is part of the **php-defaults** package maintained by the Debian PHP team. It provides a standardized way to manage PHP extensions, similar to how a2enmod/a2dismod manage Apache modules.

# SEE ALSO

[phpenmod](/man/phpenmod)(8), [phpquery](/man/phpquery)(8), [php](/man/php)(1)
