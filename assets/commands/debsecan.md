# TAGLINE

Debian security vulnerability scanner

# TLDR

List **vulnerable** installed packages

```debsecan```

List vulnerabilities for **specific suite**

```debsecan --suite [release_code_name]```

List only **fixed** vulnerabilities

```debsecan --suite [release_code_name] --only-fixed```

List fixed vulnerabilities and **mail report**

```debsecan --suite [sid] --only-fixed --format report --mailto [root] --update-history```

**Upgrade** vulnerable packages

```sudo apt upgrade $(debsecan --only-fixed --format packages)```

# SYNOPSIS

**debsecan** [_options_]

# DESCRIPTION

**debsecan** (Debian Security Analyzer) lists known vulnerabilities in installed packages. It checks against Debian's security tracker database and reports CVEs affecting the system.

Useful for security auditing and identifying packages that need updates.

# PARAMETERS

**--suite** _suite_
> Debian release (stretch, buster, bullseye, sid)

**--only-fixed**
> Only show vulnerabilities with available fixes

**--format** _format_
> Output format (summary, detail, report, packages)

**--mailto** _address_
> Email report to address

**--update-history**
> Track vulnerability history

# CAVEATS

Requires network access to fetch vulnerability data. Suite must match the installed system. Not all listed vulnerabilities may be exploitable in your specific configuration.

# SEE ALSO

[apt](/man/apt)(8), [unattended-upgrades](/man/unattended-upgrades)(8)
