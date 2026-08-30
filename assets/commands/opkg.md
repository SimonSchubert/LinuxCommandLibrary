# TAGLINE

lightweight package manager used primarily on OpenWrt and other embedded Linux

# TLDR

**Refresh** the package lists

```opkg update```

**Install** a package from the configured feeds

```opkg install [package]```

Install a **local .ipk file**

```opkg install [path/to/package.ipk]```

Install onto **another destination**, such as attached storage

```opkg install --dest [usb] [package]```

**Upgrade** named packages

```opkg upgrade [package1] [package2]```

Show which installed packages have **updates waiting**

```opkg list-upgradable```

List **everything installed**

```opkg list-installed```

**Search the catalogue** by name pattern

```opkg find [pattern]```

Find **which package provides a file**

```opkg search [/usr/bin/wget]```

List the **files a package installed**

```opkg files [package]```

Show what a package **depends on**

```opkg depends [package]```

Show **what depends on** a package

```opkg whatdepends [package]```

**Uninstall** a package

```opkg remove [package]```

Remove a package **and everything that needs it**

```opkg remove --force-removal-of-dependent-packages [package]```

List configuration files **changed since install**

```opkg list-changed-conffiles```

# SYNOPSIS

**opkg** _command_ [_options_] [_packages_]

# PARAMETERS

**install**
> Install packages

**remove**
> Remove packages

**update**
> Update package lists from repositories

**upgrade**
> Upgrade installed packages

**info**
> Display package information

**list**
> List available packages

**list-installed**
> List installed packages

**search**
> Find which package owns a file

**files**
> List files installed by a package

**--force-depends**
> Ignore dependency errors

**--force-overwrite**
> Overwrite files from other packages

# DESCRIPTION

**opkg** is a lightweight package manager used primarily on OpenWrt and other embedded Linux systems. It provides functionality similar to apt or yum but with minimal resource requirements suitable for routers and IoT devices.

The package manager handles dependencies, downloads packages from configured repositories, and manages the installation database. Configuration is stored in **/etc/opkg.conf** and repository lists in **/etc/opkg/*.conf**.

Space is often limited on embedded devices, so opkg supports installing packages to external storage and manages package state efficiently.

# CAVEATS

Package lists must be updated (**opkg update**) before installing new packages. Storage space on embedded devices is limited; check available space before installing. Some packages require rebooting the device to take effect. Dependencies may require manual resolution on resource-constrained systems.

# INSTALL

```nix: nix profile install nixpkgs#opkg```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[apt](/man/apt)(8), [ipkg](/man/ipkg)(8)
