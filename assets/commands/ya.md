# TLDR

**Install a plugin** or theme package

```ya pack -a [owner/repo]```

**Update all installed packages**

```ya pack -u```

**Delete a package**

```ya pack -d [owner/repo]```

**List installed packages**

```ya pack -l```

**Publish a message** to yazi

```ya pub [receiver] [args]```

**Emit a command** to yazi

```ya emit [command] [args]```

**Show version**

```ya --version```

# SYNOPSIS

**ya** _subcommand_ [_options_] [_arguments_]

# SUBCOMMANDS

**pack**
> Package manager for plugins and themes

**pub**
> Publish a message to a yazi instance

**emit**
> Emit a command to a yazi instance

# PACK OPTIONS

**-a**, **--add** _package_
> Install a package (owner/repo format)

**-u**, **--upgrade**
> Update all installed packages

**-d**, **--delete** _package_
> Remove an installed package

**-l**, **--list**
> List installed packages

**-i**, **--install**
> Install packages from package.toml

# DESCRIPTION

**ya** (yazi-cli) is the command-line companion tool for **Yazi**, a fast terminal file manager written in Rust. It provides package management for plugins and themes, and enables communication with running Yazi instances.

The package manager downloads plugins and themes from GitHub repositories. Packages are specified in **owner/repo** format (e.g., **yazi-rs/plugins**). Installed packages are listed in **~/.config/yazi/package.toml**.

The **pub** and **emit** commands allow external scripts to interact with a running Yazi instance, enabling automation and integration with other tools. These verify that the receiver exists and has the necessary capabilities.

ya is installed alongside the main **yazi** file manager binary.

# CAVEATS

ya requires an active internet connection for package operations. Some packages may require specific Yazi versions. The tool is in beta alongside Yazi and may have breaking changes between versions.

# HISTORY

**ya** (yazi-cli) was developed as part of the **Yazi** project by **sxyazi**. Yazi was first released around **2023** as a modern, async terminal file manager written in Rust. The CLI tool was added to provide package management and inter-process communication capabilities for the file manager ecosystem.

# SEE ALSO

[yazi](/man/yazi)(1), [ranger](/man/ranger)(1), [lf](/man/lf)(1), [nnn](/man/nnn)(1)
