# TAGLINE

deletes files from MS-DOS filesystems

# TLDR

**Delete file from MS-DOS disk**

```mdel [a:file.txt]```

**Delete multiple files**

```mdel [a:*.bak]```

**Verbose output**

```mdel -v [a:file.txt]```

**Delete directory contents**

```mdel [a:dirname/*]```

# SYNOPSIS

**mdel** [_options_] _files_

# PARAMETERS

_FILES_
> Files to delete on MS-DOS disk.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**mdel** deletes files from MS-DOS filesystems. It's part of the mtools package.

The tool removes files from FAT filesystems without mounting. Works with floppies and USB drives.

# CAVEATS

Part of mtools. FAT filesystem only. Cannot delete directories.

# HISTORY

mdel is part of **mtools**, a collection of utilities for accessing MS-DOS disks from Unix.

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

[mcopy](/man/mcopy)(1), [mdeltree](/man/mdeltree)(1)

