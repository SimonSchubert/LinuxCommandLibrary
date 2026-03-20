# TAGLINE

Nginx configuration security analyzer

# TLDR

**Analyze nginx config**

```gixy [/etc/nginx/nginx.conf]```

**Run only specific tests**

```gixy --tests [http_splitting,ssrf] [/etc/nginx/nginx.conf]```

**Output in JSON format**

```gixy -f json [/etc/nginx/nginx.conf]```

**Skip specific tests**

```gixy --skips [host_spoofing,low_keepalive_requests] [/etc/nginx/nginx.conf]```

**Report only high severity issues**

```gixy -lll [/etc/nginx/nginx.conf]```

# SYNOPSIS

**gixy** [_options_] _config_

# PARAMETERS

_CONFIG_
> Nginx configuration file.

**--tests** _TESTS_
> Comma-separated list of tests to run.

**--skips** _TESTS_
> Comma-separated list of tests to skip.

**-l, --level**
> Report issues of a given severity level or higher. Use -l for LOW, -ll for MEDIUM, -lll for HIGH.

**-f** _FORMAT_, **--format** _FORMAT_
> Output format: text, json, console.

**-o** _FILE_, **--output** _FILE_
> Write report to a file.

**-c** _FILE_, **--config** _FILE_
> Path to configuration file.

**-d, --debug**
> Enable debug mode.

**--disable-includes**
> Disable processing of include directives.

**--help**
> Display help information.

# DESCRIPTION

**gixy** analyzes nginx configuration files for security issues. It detects common misconfigurations that could lead to vulnerabilities like SSRF, host spoofing, and path traversal.

The tool includes plugins for various security checks and provides detailed explanations of issues found. It is used in security audits and CI pipelines to catch nginx misconfigurations before deployment.

# CAVEATS

Python tool. The original yandex/gixy project is unmaintained; gixy-next is a maintained fork. May need updates for latest nginx features. False positives possible. Some plugins expose additional options configurable via CLI flags or a configuration file.

# HISTORY

gixy was created by **Yandex** to automate nginx security configuration review.

# SEE ALSO

[nginx](/man/nginx)(1)
