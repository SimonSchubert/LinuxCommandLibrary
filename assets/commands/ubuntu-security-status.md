# TAGLINE

Show package security support status

# TLDR

Display **unsupported** package count

```ubuntu-security-status```

List **unavailable** packages

```ubuntu-security-status --unavailable```

List **third-party** packages

```ubuntu-security-status --thirdparty```

Use the **replacement** command

```pro security-status```

# SYNOPSIS

**ubuntu-security-status** [_OPTIONS_]

# PARAMETERS

**--unavailable**
> List packages no longer available for download

**--thirdparty**
> List packages from third-party sources

# DESCRIPTION

**ubuntu-security-status** displays information about security support status for installed Ubuntu packages. It identifies packages that may no longer receive security updates.

The tool helps administrators understand their system's security posture by identifying packages outside the official support period or from unofficial sources.

# CAVEATS

Ubuntu specific. Superseded by **pro security-status**: when /usr/bin/pro is installed, this command prints a notice and runs **pro security-status** without any of the options given, so use the **pro** command directly to pass flags. Results depend on current Ubuntu release and support status. Third-party packages may have their own security policies.

# SEE ALSO

[apt](/man/apt)(8), [pro](/man/pro)(1)

# RESOURCES

```[Source code](https://git.launchpad.net/update-manager)```

<!-- verified: 2026-11-09 -->
