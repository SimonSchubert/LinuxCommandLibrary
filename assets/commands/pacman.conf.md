# TAGLINE

configuration file for pacman, the Arch Linux package manager

# TLDR

**Enable multilib repository**

```[multilib]\nInclude = /etc/pacman.d/mirrorlist```

**Set parallel downloads**

```ParallelDownloads = 5```

**Enable color output**

```Color```

**Hold back** a package from upgrades

```IgnorePkg = [package]```

**Add custom repository**

```[custom]\nServer = https://example.com/$repo/$arch```

# SYNOPSIS

**/etc/pacman.conf**

# PARAMETERS

**[options]**
> General options section.

**RootDir**, **DBPath**, **CacheDir**, **HookDir**, **GPGDir**, **LogFile**
> Paths used by pacman. Defaults include **/var/lib/pacman/** (DBPath), **/var/cache/pacman/pkg/** (CacheDir) and **/var/log/pacman.log** (LogFile).

**HoldPkg**
> Packages that trigger a confirmation prompt before removal.

**IgnorePkg**, **IgnoreGroup**
> Packages or groups to skip during upgrades.

**NoUpgrade**, **NoExtract**
> Files that are never overwritten during upgrades, or never extracted at all.

**Architecture**
> Allowed architectures, or **auto**. If unset, no architecture checks are performed.

**CleanMethod**
> What **pacman -Sc** removes: **KeepInstalled** (default) and/or **KeepCurrent**.

**Color**
> Enable color output when writing to a terminal.

**ParallelDownloads**
> Number of concurrent download streams. If unset, downloads are sequential.

**CheckSpace**
> Check for sufficient disk space before installing.

**VerbosePkgLists**
> Show package names, versions and sizes in tables before transactions.

**DownloadUser**
> Run downloads as this user. If unset, downloads run as the user running pacman.

**DisableSandbox**
> Disable the download sandbox on Linux.

**SigLevel**
> Package and database signature level. Defaults to **Required TrustedOnly**.

**LocalFileSigLevel**, **RemoteFileSigLevel**
> Signature levels for packages installed with -U from local files and from URLs. Both inherit SigLevel.

**[repository]**
> Repository definition.

**Include**
> Include another file, typically a mirror list.

**Server**
> Direct server URL.

**CacheServer**
> Server tried first and treated as a cache, so failures do not count against it.

**Usage**
> Limit what a repository is used for: **Sync**, **Search**, **Install**, **Upgrade** or **All** (default).

# DESCRIPTION

**pacman.conf** is the configuration file for pacman, the Arch Linux package manager. It defines repositories, signature checking, and various options.

The file uses INI-style sections with [options] for general settings and [reponame] for repositories.

# EXAMPLE CONFIG

```ini
[options]
HoldPkg = pacman glibc
Architecture = auto
Color
CheckSpace
ParallelDownloads = 5
SigLevel = Required DatabaseOptional

[core]
Include = /etc/pacman.d/mirrorlist

[extra]
Include = /etc/pacman.d/mirrorlist

[multilib]
Include = /etc/pacman.d/mirrorlist
```

# CAVEATS

Repository order matters: when several repositories provide a package, the first one listed wins. After adding or changing a repository, refresh and upgrade with **pacman -Syu**. Back up the file before editing.

# SEE ALSO

[pacman](/man/pacman)(8), [makepkg](/man/makepkg)(8), [libalpm](/man/libalpm)(3), [pacman-key](/man/pacman-key)(8)

# RESOURCES

```[Source code](https://gitlab.archlinux.org/pacman/pacman)```

```[Homepage](https://archlinux.org/pacman/)```

```[Documentation](https://man.archlinux.org/man/pacman.conf.5)```

<!-- verified: 2026-11-08 -->
