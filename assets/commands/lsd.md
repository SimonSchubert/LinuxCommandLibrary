# TAGLINE

modern ls replacement

# TLDR

**List files**

```lsd```

**List with details**

```lsd -l```

**List all including hidden**

```lsd -la```

**List as tree**

```lsd --tree```

**List with icons only**

```lsd --icon always```

**Sort by time**

```lsd -lt```

**Recursive listing**

```lsd -R```

# SYNOPSIS

**lsd** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files or directories to list.

**-l**
> Long listing format.

**-a**
> Include hidden files.

**--tree**
> Show as tree.

**--icon** _WHEN_
> Show icons (always, auto, never).

**-t**
> Sort by time.

**-R**
> Recursive listing.

**--help**
> Display help information.

# DESCRIPTION

**lsd** is a modern ls replacement. It adds colors, icons, and a tree view to directory listings.

The tool is written in Rust. It's compatible with ls while adding visual enhancements.

# CAVEATS

Requires Nerd Font for icons. Rust-based tool. Terminal must support colors.

# HISTORY

lsd (LSDeluxe) was created as a modern, colorful **Rust-based** replacement for the traditional ls command.

# SEE ALSO

[ls](/man/ls)(1), [exa](/man/exa)(1), [tree](/man/tree)(1), [eza](/man/eza)(1)

