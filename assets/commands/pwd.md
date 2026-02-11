# TAGLINE

Display current working directory path

# TLDR

**Print working directory**

```pwd```

**Print physical path (no symlinks)**

```pwd -P```

**Print logical path (with symlinks)**

```pwd -L```

# SYNOPSIS

**pwd** [_options_]

# PARAMETERS

**-L**
> Logical path (follow symlinks).

**-P**
> Physical path (resolve symlinks).

# DESCRIPTION

**pwd** prints the absolute path of the current working directory. It is one of the most basic shell commands, used to confirm your location in the filesystem when navigating between directories.

The **-P** flag resolves symbolic links to display the physical path, while **-L** (the default in most shells) preserves symbolic link components in the path. Both a shell built-in version and a standalone binary from GNU coreutils exist; the built-in is used by default in interactive shells.

# CAVEATS

Shell built-in and external command. Behavior may differ.

# HISTORY

pwd is a **classic Unix** command for directory display.

# SEE ALSO

[cd](/man/cd)(1), [dirs](/man/dirs)(1), [basename](/man/basename)(1)

