# TAGLINE

lightweight package manager for embedded Linux systems

# TLDR

**Update package list**

```ipkg update```

**Install package**

```ipkg install [package]```

**Remove package**

```ipkg remove [package]```

**List installed packages**

```ipkg list_installed```

**Search packages**

```ipkg list | grep [pattern]```

**Upgrade all packages**

```ipkg upgrade```

# SYNOPSIS

**ipkg** _command_ [_options_] [_package_...]

# PARAMETERS

**update**
> Update package list.

**install** _package_
> Install package.

**remove** _package_
> Remove package.

**upgrade**
> Upgrade all packages.

**list**
> List available packages.

**list_installed**
> List installed packages.

**info** _package_
> Show package information.

**status** _package_
> Show package status.

**download** _package_
> Download without installing.

# DESCRIPTION

**ipkg** (Itsy Package Management System) is a lightweight package manager for embedded Linux systems. It was designed for devices with limited storage and memory, using a format similar to Debian's dpkg.

ipkg was commonly used on OpenWrt, NSLU2, and other embedded devices before being succeeded by opkg.

# CAVEATS

Deprecated in favor of opkg. Limited to embedded systems. Package availability depends on feed configuration. No dependency resolution in some versions.

# HISTORY

ipkg was developed for the NSLU2 Linux community and used by OpenWrt before version 8.09. It was succeeded by **opkg**, which is a fork with improved features and active maintenance.

# SEE ALSO

[opkg](/man/opkg)(1), [apt](/man/apt)(8), [dpkg](/man/dpkg)(1)
