# TAGLINE

Maintained fork of gixy for nginx security analysis

# TLDR

**Analyze nginx config**

```gixy-next [/etc/nginx/nginx.conf]```

**Check specific rules**

```gixy-next --only [ssrf,host-spoofing] [config.conf]```

**Output JSON**

```gixy-next --format json [config.conf]```

# SYNOPSIS

**gixy-next** [_options_] _config_

# PARAMETERS

_CONFIG_
> Nginx configuration file.

**--only** _RULES_
> Only run specific rules.

**--skip** _RULES_
> Skip specific rules.

**--format** _FORMAT_
> Output format.

**--help**
> Display help information.

# DESCRIPTION

**gixy-next** is a maintained fork of gixy for nginx security analysis. It continues development of the original tool with updates, bug fixes, and support for newer nginx features.

The tool analyzes nginx configurations for security issues, detecting misconfigurations that could lead to vulnerabilities such as SSRF and host spoofing.

# CAVEATS

Fork of original gixy. May have different features. Check compatibility with your nginx version.

# HISTORY

gixy-next continues development of **gixy** after the original project became less actively maintained.

# SEE ALSO

[gixy](/man/gixy)(1), [nginx](/man/nginx)(1)
