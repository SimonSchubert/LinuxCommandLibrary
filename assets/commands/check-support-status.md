# TAGLINE

Identify installed packages with limited security support

# TLDR

Display packages with **limited or ended support**

```check-support-status```

Show only packages whose support **has ended**

```check-support-status --type ended```

Show packages with **limited** security support

```check-support-status --type limited```

Skip printing a **headline**

```check-support-status --no-heading```

**Exclude specific packages** from alerts

```check-support-status --except [package1,package2]```

# SYNOPSIS

**check-support-status** [_options_]

# DESCRIPTION

**check-support-status** identifies installed Debian packages for which security support has been limited or prematurely ended. This helps users understand which packages may not receive security updates. It is part of the **debian-security-support** package.

The tool reports packages that have reached end-of-life earlier than the distribution's support period, or have limited security support due to various reasons.

# PARAMETERS

**--type** _type_
> Filter by support status type: **ended** (support has ended), **limited** (support is limited), or **earlyend** (support ends earlier than the distribution's).

**--no-heading**
> Skip printing the headline.

**--except** _PACKAGES_
> Do not alert for the given comma-separated binary packages.

**--list** _FILE_
> Use the given file as the database of packages and their support status.

**--status-db** _FILE_
> Use the given file to record alerts so each affected package is reported only once.

**--version**, **-V**
> Show the version number and exit.

# CAVEATS

Specific to Debian-based distributions. Package support status depends on Debian's security team decisions and may change. By default, evaluates status based on the Debian version where it runs; this can be overridden with the **DEBIAN_VERSION** environment variable.

# SEE ALSO

[apt](/man/apt)(8), [apt-cache](/man/apt-cache)(8), [debsecan](/man/debsecan)(1)
