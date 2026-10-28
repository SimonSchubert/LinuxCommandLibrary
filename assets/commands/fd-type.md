# TAGLINE

Filter an fd search by file type

# TLDR

**Regular files** only

```fd --type file [pattern]```

The same filter in its **short form**

```fd -t f [pattern]```

**Directories**

```fd -t d [pattern]```

**Symbolic links**

```fd -t l [pattern]```

**Executable files**

```fd -t x```

**Empty files**

```fd -t e -t f```

**Empty directories**

```fd -t e -t d```

**Files and symlinks** together

```fd -t f -t l [pattern]```

**Block devices**

```fd -t b```

# SYNOPSIS

**fd** [**-t**|**--type** _filetype_]... [_options_] [_pattern_] [_path_...]

# PARAMETERS

**-t** _filetype_, **--type** _filetype_
> Keep entries of this type. Repeat the flag to include more than one type. Short forms may be joined to the letter (`-tf`, `-td`).

**f**, **file**
> Regular files

**d**, **dir**, **directory**
> Directories

**l**, **symlink**
> Symbolic links

**b**, **block-device**
> Block devices

**c**, **char-device**
> Character devices

**s**, **socket**
> Sockets

**p**, **pipe**
> Named pipes (FIFOs)

**x**, **executable**
> Executable files. Implies **file**

**e**, **empty**
> Empty files and empty directories, unless **file** or **directory** is also set

# DESCRIPTION

**fd --type** (short **-t**) restricts a search with the **fd** file finder to one or more entry types. There is no separate `fd-type` binary. On Debian and Ubuntu the same program is often installed as **fdfind**, and the flag is the same: `fdfind -t f`.

Hidden entries and gitignore patterns stay out of the results unless you pass **--hidden** or **--no-ignore**. The search pattern is still a regex matched against the file name, not a glob, unless you pass **--glob**.

Repeat the flag to combine types. `--type file --type symlink` prints regular files and symbolic links. **executable** works differently: `--type executable` implies regular files, so it does not also list directories that happen to be executable. **empty** matches empty files and empty directories until you add **file** or **directory** beside it.

# CAVEATS

Type the flag on **fd** or **fdfind**. There is no `fd-type` command. **executable** implies **file**. **empty** covers both empty files and empty directories until you narrow it. A default search still skips hidden paths and does not follow symlinked directories, so device nodes, sockets, and pipes are easy to miss under `/dev` without **--hidden** and a path.

# INSTALL

```apt: sudo apt install fd-find```

```dnf: sudo dnf install fd-find```

```pacman: sudo pacman -S fd```

```apk: sudo apk add fd```

```zypper: sudo zypper install fd```

```brew: brew install fd```

```nix: nix profile install nixpkgs#fd```

<!-- packages: 2026-10-28 -->

# SEE ALSO

[fd](/man/fd)(1), [fdfind](/man/fdfind)(1), [find](/man/find)(1)

# RESOURCES

```[Source code](https://github.com/sharkdp/fd)```

```[Documentation](https://github.com/sharkdp/fd/blob/master/doc/fd.1)```

<!-- verified: 2026-10-28 -->
