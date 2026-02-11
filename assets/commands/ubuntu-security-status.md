# TAGLINE

Show package security support status

# TLDR

Display **unsupported** package count

```ubuntu-security-status```

List **unavailable** packages

```ubuntu-security-status --unavailable```

List **third-party** packages

```ubuntu-security-status --thirdparty```

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

Ubuntu specific. Results depend on current Ubuntu release and support status. Third-party packages may have their own security policies.

# SEE ALSO

[apt](/man/apt)(8), [pro](/man/pro)(1)
