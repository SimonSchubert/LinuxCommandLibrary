# TLDR

**Enable** extension for all PHP versions and SAPIs

```sudo phpenmod [extension]```

Enable extension for **specific version** and SAPI

```sudo phpenmod -v [7.4] -s [cli] [extension]```

# SYNOPSIS

**phpenmod** [**-v** _version_] [**-s** _sapi_] _module_

# PARAMETERS

**-v _version_**
> PHP version (e.g., 7.4, 8.0, 8.1)

**-s _sapi_**
> SAPI type (cli, fpm, apache2, cgi)

**module**
> Extension name to enable

# DESCRIPTION

**phpenmod** enables PHP extensions on Debian-based systems by creating symbolic links in the conf.d directory pointing to module configuration files. Without version or SAPI specified, it enables the extension for all installed PHP versions and all SAPIs.

The command creates symlinks in /etc/php/VERSION/SAPI/conf.d/ that point to module configuration files in mods-available.

# CAVEATS

Debian/Ubuntu specific tool. Requires root privileges. Changes take effect after restarting PHP-FPM or Apache. Extension must be installed before it can be enabled.

# HISTORY

**phpenmod** is part of the **php-defaults** package maintained by the Debian PHP team. It provides a standardized way to manage PHP extensions, similar to how a2enmod/a2dismod manage Apache modules.

# SEE ALSO

[phpdismod](/man/phpdismod)(8), [phpquery](/man/phpquery)(8), [php](/man/php)(1)
