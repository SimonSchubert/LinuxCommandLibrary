# TAGLINE

List directory contents in long format

# TLDR

**List directory contents in long format**

```vdir```

**Include hidden files**

```vdir -a```

**Human readable sizes**

```vdir -h```

**Sort by modification time, newest first**

```vdir -t```

**Reverse the sort order**

```vdir -r```

# SYNOPSIS

**vdir** [_-a_] [_-h_] [_-t_] [_options_] [_files_]

# PARAMETERS

**-a**
> Include hidden.

**-h**
> Human readable.

**-t**
> Sort by time.

**-r**
> Reverse order.

**-S**
> Sort by size.

# DESCRIPTION

**vdir** lists directory contents in long format by default, equivalent to running **ls -l**. It displays file permissions, owner, group, size, modification time, and name for each entry.

The command is part of GNU coreutils and accepts the same options as **ls**. It exists as a convenience for users who prefer verbose directory listings without having to specify the **-l** flag.

# CAVEATS

Equivalent to ls -l. GNU specific. Use ls for portability.

# HISTORY

**vdir** is part of **GNU coreutils**, equivalent to ls with long listing format by default.

# INSTALL

```apt: sudo apt install coreutils```

```dnf: sudo dnf install coreutils```

```pacman: sudo pacman -S coreutils```

```apk: sudo apk add coreutils```

```zypper: sudo zypper install coreutils```

```brew: brew install coreutils```

```nix: nix profile install nixpkgs#coreutils```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ls](/man/ls)(1), [dir](/man/dir)(1), [exa](/man/exa)(1)
