# TAGLINE

Nginx configuration security analyzer

# TLDR

**Analyze nginx config**

```gixy [/etc/nginx/nginx.conf]```

**Check specific directive**

```gixy --only-plugins [ssrf] [config.conf]```

**Output JSON**

```gixy -f json [config.conf]```

**Skip plugins**

```gixy --skip-plugins [host_spoofing] [config.conf]```

# SYNOPSIS

**gixy** [_options_] _config_

# PARAMETERS

_CONFIG_
> Nginx configuration file.

**--only-plugins** _PLUGINS_
> Only run specific plugins.

**--skip-plugins** _PLUGINS_
> Skip specific plugins.

**-f** _FORMAT_, **--format** _FORMAT_
> Output format (text, json).

**--help**
> Display help information.

# DESCRIPTION

**gixy** analyzes nginx configuration files for security issues. It detects common misconfigurations that could lead to vulnerabilities like SSRF, host spoofing, and path traversal.

The tool includes plugins for various security checks and provides detailed explanations of issues found. It is used in security audits and CI pipelines to catch nginx misconfigurations before deployment.

# CAVEATS

Python tool. May need updates for latest nginx features. False positives possible.

# HISTORY

gixy was created by **Yandex** to automate nginx security configuration review.

# SEE ALSO

[nginx](/man/nginx)(1)
