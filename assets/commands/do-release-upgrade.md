# TAGLINE

Ubuntu release upgrader

# TLDR

Upgrade to **latest release**

```sudo do-release-upgrade```

Upgrade to **development release**

```sudo do-release-upgrade -d```

Upgrade to **proposed release**

```sudo do-release-upgrade -p```

# SYNOPSIS

**do-release-upgrade** [_options_]

# DESCRIPTION

**do-release-upgrade** upgrades Ubuntu to a new release version. It handles the complex process of updating sources, upgrading packages, and resolving conflicts.

By default, upgrades are only offered to the next LTS release (for LTS users) or the next release (for non-LTS users).

# PARAMETERS

**-d, --devel-release**
> Upgrade to development (unstable) release

**-p, --proposed**
> Upgrade to proposed release

**-c, --check-dist-upgrade-only**
> Check if upgrade is available only

**-f, --frontend** _frontend_
> Specify frontend (DistUpgradeViewGtk3, DistUpgradeViewText)

# CAVEATS

Ubuntu-specific. Backup important data before upgrading. May take significant time. Third-party repositories may cause issues. Run from a terminal or screen session to avoid disconnection issues.

# SEE ALSO

[apt](/man/apt)(8), [update-manager](/man/update-manager)(8)
