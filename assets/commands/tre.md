# TAGLINE

Modern tree replacement with editor integration

# TLDR

**Show directory tree**

```tre```

**Show with hidden**

```tre -a```

**Limit depth**

```tre -L [2]```

**With editor integration**

```tre -e```

**Specific directory**

```tre [path/to/directory]```

**Portable paths**

```tre -p```

# SYNOPSIS

**tre** [_-a_] [_-L depth_] [_-e_] [_options_] [_path_]

# PARAMETERS

**-a**
> Include hidden.

**-L** _DEPTH_
> Maximum depth.

**-e**
> Editor integration.

**-p**
> Portable paths.

**-s**
> Simple output.

**--help**
> Show help.

# DESCRIPTION

**tre** is a modern replacement for the classic tree command, written in Rust. It displays directory structures in a tree format with additional features designed for developer workflows, including editor integration and gitignore awareness.

The editor integration mode (**-e**) numbers each file in the output and creates a shell alias that opens the corresponding file in your editor by number. Portable path mode (**-p**) outputs paths that can be directly copied and pasted into other commands.

By default, tre respects `.gitignore` rules, filtering out ignored files for a cleaner view of project structures. Hidden files are excluded unless explicitly requested with **-a**.

# CAVEATS

Different from tree. Rust implementation. Editor feature unique.

# HISTORY

**tre** was created as a modern replacement for tree with editor integration for quick file access.

# SEE ALSO

[tree](/man/tree)(1), [exa](/man/exa)(1), [fd](/man/fd)(1)
