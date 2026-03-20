# TAGLINE

Prettier and powerful ls for the pros

# TLDR

**List the current directory**

```pls```

**List with detailed metadata**

```pls -d```

**List specific files or directories**

```pls [path/to/directory] [path/to/file]```

# SYNOPSIS

**pls** [_options_] [_paths_...]

# PARAMETERS

**-d**, **--det** _COLS_
> Display detailed file metadata. Columns can be freely ordered based on specification.

# DESCRIPTION

**pls** is a prettier and more powerful replacement for **ls** designed for human consumption rather than scripting. The "p" in pls stands for pretty, powerful, performant, practical, petite, pliable, and personable. It features Nerd Font icons, rich formatting, flexible column ordering, and a configurable display. Files and directories can be passed as positional arguments.

# CAVEATS

Requires a Nerd Font for icon rendering. Not intended for scripting — use **ls** for machine-readable output.

# HISTORY

**pls** is maintained by the **pls-rs** organization and is written in **Rust**.

# SEE ALSO

[ls](/man/ls)(1), [eza](/man/eza)(1), [lsd](/man/lsd)(1), [lla](/man/lla)(1)
