# TLDR

**Install** a package

```opkg install [package]```

**Remove** a package

```opkg remove [package]```

**Update** the list of available packages

```opkg update```

**Upgrade** one or more specific packages

```opkg upgrade [package(s)]```

Display **information** for a specific package

```opkg info [package]```

**List** all available packages

```opkg list```

Find out **which package owns** a file

```opkg search [/path/to/file]```

List all **files belonging** to a package

```opkg files [package]```

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

# SEE ALSO

[apt](/man/apt)(8), [ipkg](/man/ipkg)(8)
