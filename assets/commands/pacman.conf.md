# TLDR

**Enable multilib repository**

```[multilib]\nInclude = /etc/pacman.d/mirrorlist```

**Set parallel downloads**

```ParallelDownloads = 5```

**Enable color output**

```Color```

**Add custom repository**

```[custom]\nServer = https://example.com/$repo/$arch```

# SYNOPSIS

**/etc/pacman.conf**

# PARAMETERS

**[options]**
> General options section.

**Color**
> Enable color output.

**ParallelDownloads**
> Concurrent downloads.

**CheckSpace**
> Check disk space.

**SigLevel**
> Package signature level.

**[repository]**
> Repository definition.

**Include**
> Include mirror list.

**Server**
> Direct server URL.

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

Repository order matters. Changes require pacman -Sy. Backup before editing.

# SEE ALSO

[pacman](/man/pacman)(8), [makepkg](/man/makepkg)(8), [libalpm](/man/libalpm)(3)
