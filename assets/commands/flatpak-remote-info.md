# TAGLINE

query information about remote Flatpak packages

# TLDR

Show **information** about a flatpak in a remote

```flatpak remote-info [remote_name] [com.example.app]```

Show a **log of previous versions** in a remote

```flatpak remote-info --log [remote_name] [com.example.app]```

Show information about a **specific commit**

```flatpak remote-info --commit [COMMIT_HASH] [remote_name] [com.example.app]```

Show only the **commit ID** (machine-readable)

```flatpak remote-info --show-commit [remote_name] [com.example.app]```

Show information for a specific **architecture**

```flatpak remote-info --arch [x86_64] [remote_name] [com.example.app]```

# SYNOPSIS

**flatpak remote-info** [_options_] _remote_ _ref_

# PARAMETERS

**--user**
> Use per-user configuration

**--system**
> Use default system-wide configuration

**--installation** _name_
> Use specified system-wide installation

**--cached**
> Use locally cached data when available

**--runtime**
> Assume ref is a runtime

**--app**
> Assume ref is an application

**--arch** _arch_
> Target specific architecture

**--commit** _commit_
> Show information for a specific commit

**--log**
> Display version history

**-r, --show-ref**
> Display the matched ref (machine-readable)

**-c, --show-commit**
> Display the commit ID (machine-readable)

**-p, --show-parent**
> Display the parent commit

**-m, --show-metadata**
> Display the metadata

**-v, --verbose**
> Output debug information

# DESCRIPTION

**Flatpak remote-info** displays details about an application or runtime available in a remote repository. It shows information such as the application ID, architecture, branch, commit hash, download size, installed size, and runtime dependencies.

By default, output is in human-readable format. Using **--show-*** options switches to machine-readable output suitable for scripting.

The **--log** option is useful for viewing available versions and finding specific commits for downgrade operations or version pinning.

# CAVEATS

Requires network access to query remote repositories unless **--cached** is specified. The cached option only works if the repository metadata has been previously fetched. Some information may not be available for all remotes or refs.

# HISTORY

Part of the **Flatpak** project developed by Alexander Larsson at Red Hat. Flatpak evolved from the xdg-app project around **2015** and has become a leading universal package format for Linux desktop applications.

# SEE ALSO

[flatpak](/man/flatpak)(1), [flatpak-info](/man/flatpak-info)(1), [flatpak-remote-ls](/man/flatpak-remote-ls)(1), [flatpak-update](/man/flatpak-update)(1)
