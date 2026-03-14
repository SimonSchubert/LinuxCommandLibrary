# TAGLINE

Yazi file manager CLI companion

# TLDR

**Install a plugin** or flavor package

```ya pkg add [owner/repo]```

**Update all installed packages**

```ya pkg upgrade```

**Delete a package**

```ya pkg delete [owner/repo]```

**List installed packages**

```ya pkg list```

**Install packages from package.toml**

```ya pkg install```

**Publish a message** to yazi

```ya pub [receiver] [args]```

**Emit a command** to yazi

```ya emit [command] [args]```

**Show version**

```ya --version```

# SYNOPSIS

**ya** _subcommand_ [_options_] [_arguments_]

# SUBCOMMANDS

**pkg**
> Package manager for plugins and flavors.

**pub**
> Publish a message to a yazi instance.

**emit**
> Emit a command to a yazi instance.

# PKG SUBCOMMANDS

**pkg add** _package_ [_package_...]
> Install packages (owner/repo format).

**pkg upgrade**
> Update all installed packages.

**pkg delete** _package_ [_package_...]
> Remove installed packages.

**pkg list**
> List installed packages.

**pkg install**
> Install locked versions from package.toml.

# DESCRIPTION

**ya** (yazi-cli) is the command-line companion tool for **Yazi**, a fast terminal file manager written in Rust. It provides package management for plugins and themes, and enables communication with running Yazi instances.

The package manager downloads plugins and flavors from GitHub repositories. Packages are specified in **owner/repo** format (e.g., **yazi-rs/plugins**). Installed packages are tracked in **~/.config/yazi/package.toml**.

The **pub** and **emit** commands allow external scripts to interact with a running Yazi instance, enabling automation and integration with other tools. These verify that the receiver exists and has the necessary capabilities.

ya is installed alongside the main **yazi** file manager binary.

# CAVEATS

ya requires an active internet connection for package operations. The **ya** version must match the installed **yazi** version. Some packages may require specific Yazi versions.

# HISTORY

**ya** (yazi-cli) was developed as part of the **Yazi** project by **sxyazi**. Yazi was first released around **2023** as a modern, async terminal file manager written in Rust. The CLI tool was added to provide package management and inter-process communication capabilities for the file manager ecosystem.

# SEE ALSO

[yazi](/man/yazi)(1), [ranger](/man/ranger)(1), [lf](/man/lf)(1), [nnn](/man/nnn)(1)
