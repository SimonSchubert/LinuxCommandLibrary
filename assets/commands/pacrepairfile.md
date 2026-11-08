# TAGLINE

resets properties on files managed by alpm

# TLDR

Reset the **permissions** of a file

```sudo pacrepairfile --mode [path/to/file]```

Reset **all properties** of a file

```sudo pacrepairfile --mode --uid --gid --mtime [path/to/file]```

Look up properties in a **specific package** only

```sudo pacrepairfile --package=[package] --mode [path/to/file]```

Reset a file **quietly**

```sudo pacrepairfile --quiet --mode [path/to/file]```

Display **help**

```pacrepairfile --help```

# SYNOPSIS

**pacrepairfile** [_options_] (**--gid**|**--mode**|**--mtime**|**--uid**)... _file_...

# PARAMETERS

**--mode**
> Reset file permissions mode

**--uid**
> Reset file owner UID

**--gid**
> Reset file group GID

**--mtime**
> Reset file modification time

**--package=**_pkgname_
> Search pkgname for file properties. May be repeated. Without it, all installed packages are searched.

**--quiet**
> Do not display progress information

**--config=**_path_
> Set an alternate configuration file path.

**--dbpath=**_path_
> Set an alternate database path.

**--root=**_path_
> Set an alternate installation root.

**--sysroot=**_path_
> Set an alternate system root.

**--help**
> Display help message

**--version**
> Display version information

# DESCRIPTION

**pacrepairfile** resets properties on files managed by alpm (Arch Linux Package Manager). It restores file permissions, ownership, and modification times to the values recorded in the package's MTREE data. At least one of **--gid**, **--mode**, **--mtime** or **--uid** selects what to reset.

This is useful when file properties have been accidentally changed or corrupted. If stdin is not connected to a terminal, file names are read from stdin.

# CAVEATS

Only works on files tracked by installed packages, and the owning package must have MTREE data. When called from a script or function where stdin is not a terminal but holds no file names, close stdin with **<&-**.

# HISTORY

Part of **pacutils**, a collection of utilities for Arch Linux package management built on libalpm.

# INSTALL

```pacman: sudo pacman -S pacutils```

<!-- packages: 2026-11-08 -->

# SEE ALSO

[pacman](/man/pacman)(8), [pacrepairdb](/man/pacrepairdb)(1), [paccheck](/man/paccheck)(1)

# RESOURCES

```[Source code](https://github.com/andrewgregory/pacutils)```

```[Documentation](https://man.archlinux.org/man/pacrepairfile.1)```

<!-- verified: 2026-11-08 -->
