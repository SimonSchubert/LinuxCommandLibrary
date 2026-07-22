# TAGLINE

creates directories on MS-DOS filesystems

# TLDR

**Create directory on MS-DOS**

```mmd [a:dirname]```

**Create multiple directories**

```mmd [a:dir1] [a:dir2]```

**Create nested path**

```mmd [a:path/to/dir]```

**Verbose output**

```mmd -v [a:dirname]```

# SYNOPSIS

**mmd** [_options_] _directories_

# PARAMETERS

_DIRECTORIES_
> Directories to create on MS-DOS disk.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**mmd** creates directories on MS-DOS filesystems. It's part of mtools.

The tool creates directories on FAT filesystems without mounting.

# CAVEATS

Part of mtools. FAT filesystem only. Like mkdir for DOS.

# HISTORY

mmd is part of **mtools**, providing mkdir functionality for MS-DOS filesystems on Unix.

# INSTALL

```apt: sudo apt install mtools```

```dnf: sudo dnf install mtools```

```pacman: sudo pacman -S mtools```

```apk: sudo apk add mtools```

```zypper: sudo zypper install mtools```

```brew: brew install mtools```

```nix: nix profile install nixpkgs#mtools```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[mcopy](/man/mcopy)(1), [mdel](/man/mdel)(1)

