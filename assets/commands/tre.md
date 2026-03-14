# TAGLINE

Modern tree replacement with editor integration

# TLDR

**Show directory tree**

```tre```

**Show with hidden**

```tre -a```

**Limit depth**

```tre -l [2]```

**With editor integration**

```tre -e```

**Specific directory**

```tre [path/to/directory]```

**Show only directories**

```tre -d```

**Output as JSON**

```tre -j```

**Exclude paths matching a regex**

```tre -E [pattern]```

**Portable paths**

```tre -p```

# SYNOPSIS

**tre** [_-a_] [_-l depth_] [_-e_] [_options_] [_path_]

# PARAMETERS

**-a, --all**
> Include hidden files.

**-d, --directories**
> Only list directories.

**-l, --limit** _DEPTH_
> Maximum depth.

**-e, --editor** [_COMMAND_]
> Editor integration (numbers files, creates aliases).

**-E, --exclude** _PATTERN_
> Exclude paths matching a regex. Repeatable.

**-j, --json**
> Output JSON instead of tree diagram.

**-p, --portable**
> Portable absolute paths in editor aliases.

**-s, --simple**
> Ignore .gitignore rules.

**-c, --color** _WHEN_
> Color output: automatic, always, never.

# DESCRIPTION

**tre** is a modern replacement for the classic tree command, written in Rust. It displays directory structures in a tree format with additional features designed for developer workflows, including editor integration and gitignore awareness.

The editor integration mode (**-e**) numbers each file in the output and creates a shell alias that opens the corresponding file in your editor by number. Portable path mode (**-p**) outputs paths that can be directly copied and pasted into other commands.

By default, tre respects `.gitignore` rules, filtering out ignored files for a cleaner view of project structures. Hidden files are excluded unless explicitly requested with **-a**.

# CAVEATS

Not a drop-in replacement for **tree** — uses different flag names (e.g. **-l** instead of **-L** for depth). Respects .gitignore by default, which can be disabled with **-s**.

# SEE ALSO

[tree](/man/tree)(1), [exa](/man/exa)(1), [fd](/man/fd)(1)
