# TAGLINE

Step-through diff viewer for the terminal

# TLDR

**View a diff**

```oyo [path/to/file]```

**Use as a git difftool**

```git difftool -t oyo```

# SYNOPSIS

**oyo** [_options_] [_file_]

# DESCRIPTION

**oyo** is a step-through diff viewer that extends traditional diffs with an evolution mode. You can use it like a normal diff viewer with scrolling and hunk navigation, or step through changes one at a time watching the code evolve from old to new.

View modes include unified, split, evolution, and blame. It supports clipboard integration and can be configured as a git difftool.

# CONFIGURATION

**~/.config/oyo/config.toml**
> Configuration file for UI settings including view mode, auto-centering, line wrapping, and scrollbar display.

# CAVEATS

Best used with Git integration. Standalone diff viewing requires properly formatted diff input.

# HISTORY

**oyo** was created by **ahkohd** and is written in **Rust**.

# SEE ALSO

[diff](/man/diff)(1), [delta](/man/delta)(1), [difftastic](/man/difftastic)(1)
