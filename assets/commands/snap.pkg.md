# TAGLINE

Manage sandboxed snap packages

# TLDR

**Search** the store

```snap find [keyword]```

Show a snap's **details and available channels**

```snap info [package]```

**Install** a snap

```sudo snap install [package]```

Install from a **specific channel**

```sudo snap install [package] --channel=[latest/edge]```

Install a local snap that is **not signed by the store**

```sudo snap install --dangerous [path/to/file.snap]```

**List** the installed snaps and their revisions

```snap list```

Show **every revision** still kept on disk

```snap list --all```

**Update** everything that has a newer revision

```sudo snap refresh```

Move one snap to a **different channel**

```sudo snap refresh [package] --channel=[stable]```

**Roll back** a snap to its previous revision

```sudo snap revert [package]```

Show a snap's **background services**

```snap services [package]```

Read a service's **logs**

```snap logs [package]```

List the **interfaces** a snap is connected to

```snap connections [package]```

**Grant** a snap access to an interface it needs

```sudo snap connect [package]:[interface]```

**Uninstall** a snap, discarding its data and snapshots

```sudo snap remove --purge [package]```

Review **recent system changes** made by snapd

```snap changes```

# SYNOPSIS

**snap** _command_ [_OPTIONS_]

# PARAMETERS

**find** _query_
> Search for snaps in the store

**install** _package_
> Install a snap package

**remove** _package_
> Uninstall a snap package

**refresh** [_package_]
> Update snap(s) to latest version

**list**
> Display installed snaps

**info** _package_
> Show detailed snap information

**changes**
> List recent system changes

**revert** _package_
> Revert snap to previous version

**enable** _package_
> Enable a disabled snap

**disable** _package_
> Disable a snap

**services**
> Query service status

**start/stop/restart** _service_
> Control snap services

**connect** _plug_ _slot_
> Connect interfaces

**disconnect** _plug_ _slot_
> Disconnect interfaces

**--channel** _channel_
> Specify channel (stable, candidate, beta, edge)

**--classic**
> Allow classic confinement

**--devmode**
> Enable development mode

# DESCRIPTION

**snap** is the package manager for Snap packages, self-contained applications that work across Linux distributions. Snaps include all dependencies and run in sandboxed environments for security isolation.

The Snap store provides thousands of applications including browsers, development tools, and server software. Snaps update automatically in the background and can be rolled back to previous versions if needed.

# CAVEATS

Requires snapd daemon running. Snaps may have larger disk footprint than native packages due to bundled dependencies. Classic confinement bypasses sandbox restrictions. Some distributions have removed or disabled snap support.

# HISTORY

**Snap** was developed by **Canonical** and introduced with Ubuntu 16.04 in **2016**. It was designed to provide universal Linux packaging with automatic updates, security confinement, and cross-distribution compatibility. The technology builds on earlier work from Ubuntu Touch's click packages.

# SEE ALSO

[snapd](/man/snapd)(8), [flatpak](/man/flatpak)(1), [apt](/man/apt)(8)
