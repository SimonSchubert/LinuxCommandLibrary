# TAGLINE

disables PHP extensions on Debian-based systems by removing the symbolic link

# TLDR

**Disable** extension for all PHP versions and SAPIs

```sudo phpdismod [extension]```

Disable extension for **specific version** and SAPI

```sudo phpdismod -v [8.3] -s [cli] [extension]```

Disable **several extensions** at once

```sudo phpdismod [extension1] [extension2]```

# SYNOPSIS

**phpdismod** [**-v** _version_] [**-s** _sapi_] [**-q**] _module_ [_module_ ...]

# PARAMETERS

**-v** _version_
> PHP version (e.g., 8.2, 8.3). Use ALL for all versions. Can be repeated.

**-s** _sapi_
> SAPI type (cli, fpm, apache2, cgi). Use ALL for all SAPIs. Can be repeated.

**-q**
> Suppress output messages.

_module_
> One or more extension names to disable.

# DESCRIPTION

**phpdismod** disables PHP extensions on Debian-based systems by removing the symbolic link from the conf.d directory. Without version or SAPI specified, it disables the extension for all installed PHP versions and all SAPIs.

The command works by manipulating symlinks in /etc/php/VERSION/SAPI/conf.d/ that point to module configuration files in /etc/php/VERSION/mods-available/. **phpdismod** and **phpenmod** are the same script, selected by the name it is invoked under.

# CAVEATS

Debian/Ubuntu specific tool. Requires root privileges. Changes take effect after restarting PHP-FPM or Apache. Some extensions have dependencies that may cause issues when disabled.

# HISTORY

**phpdismod** is part of the **php-common** package, built from the **php-defaults** source maintained by the Debian PHP team. It provides a standardized way to manage PHP extensions, similar to how a2enmod/a2dismod manage Apache modules.

# SEE ALSO

[phpenmod](/man/phpenmod)(8), [phpquery](/man/phpquery)(8), [php](/man/php)(1), [a2dismod](/man/a2dismod)(8)

# RESOURCES

```[Source code](https://salsa.debian.org/php-team/php-defaults)```

<!-- verified: 2026-11-09 -->
