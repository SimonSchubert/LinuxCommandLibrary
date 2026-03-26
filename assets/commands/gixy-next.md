# TAGLINE

Maintained fork of gixy for nginx security analysis

# TLDR

**Analyze nginx config**

```gixy-next [/etc/nginx/nginx.conf]```

**Run only specific checks**

```gixy-next --tests [ssrf,host_spoofing] [config.conf]```

**Skip specific checks**

```gixy-next --skips [http_splitting] [config.conf]```

**Output as JSON**

```gixy-next -f json [config.conf]```

**Show only medium severity and above**

```gixy-next -ll [config.conf]```

# SYNOPSIS

**gixy-next** [_options_] _config_

# PARAMETERS

_CONFIG_
> Nginx configuration file.

**--tests** _RULES_
> Only run specific checks (comma-separated).

**--skips** _RULES_
> Skip specific checks (comma-separated).

**-f**, **--format** _FORMAT_
> Output format (text, json).

**-l**
> Filter by severity level. Use -l for LOW+, -ll for MEDIUM+, -lll for HIGH only.

**--help**
> Display help information.

# DESCRIPTION

**gixy-next** is a maintained fork of gixy for nginx security analysis. It continues development of the original tool with updates, bug fixes, and support for newer nginx features.

The tool analyzes nginx configurations for security issues, detecting misconfigurations that could lead to vulnerabilities such as SSRF and host spoofing.

# CAVEATS

Fork of original gixy with additional checks and performance features. Defaults to analyzing /etc/nginx/nginx.conf if no path given. Can also read config from stdin.

# HISTORY

gixy-next continues development of **gixy** after the original project became less actively maintained.

# SEE ALSO

[gixy](/man/gixy)(1), [nginx](/man/nginx)(1)
