# TLDR

List available **PHP versions**

```sudo phpquery -V```

List available **SAPIs** for a version

```sudo phpquery -v [7.4] -S```

List **enabled extensions** for version and SAPI

```sudo phpquery -v [7.4] -s [cli] -M```

**Check** if extension is enabled

```sudo phpquery -v [7.4] -s [apache2] -m [json]```

# SYNOPSIS

**phpquery** [**-v** _version_] [**-s** _sapi_] [**-V**|**-S**|**-M**|**-m** _module_]

# PARAMETERS

**-v _version_**
> PHP version to query

**-s _sapi_**
> SAPI to query

**-V**
> List available PHP versions

**-S**
> List available SAPIs

**-M**
> List enabled modules

**-m _module_**
> Check if specific module is enabled

**-q**
> Quiet mode, exit status only

# DESCRIPTION

**phpquery** queries PHP configuration on Debian-based systems. It reports installed PHP versions, available SAPIs (Server API), and enabled extensions. This is useful for scripts and automation that need to detect PHP configuration.

The tool reads configuration from /etc/php/ directory structure and reports the state of symbolic links that control module activation.

# CAVEATS

Debian/Ubuntu specific tool. May require root for some queries. Only reports extensions managed through phpenmod/phpdismod system.

# HISTORY

**phpquery** is part of the **php-defaults** package maintained by the Debian PHP team. It complements phpenmod and phpdismod by providing query capabilities for PHP configuration management.

# SEE ALSO

[phpenmod](/man/phpenmod)(8), [phpdismod](/man/phpdismod)(8), [php](/man/php)(1)
