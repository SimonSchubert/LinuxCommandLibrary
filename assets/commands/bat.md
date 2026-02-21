# TAGLINE

Cat clone with syntax highlighting and Git integration

# TLDR

**View** file with syntax highlighting

```bat [file.js]```

**Show** line numbers

```bat -n [file.py]```

**Show** non-printable characters

```bat -A [file.txt]```

**Plain** output (no decorations)

```bat -p [file.log]```

**Multiple files**

```bat [file1.rs] [file2.rs]```

**Specific language**

```bat -l [python] [script]```

# SYNOPSIS

**bat** [_options_] [_file_...]

# DESCRIPTION

**bat** is a cat clone with syntax highlighting and Git integration. It displays file contents with automatic language detection, line numbers, and Git diff indicators in the margin.

The tool provides a more user-friendly file viewing experience for developers and system administrators.

# PARAMETERS

**-n**, **--number**
> Show line numbers

**-A**, **--show-all**
> Show non-printable characters

**-p**, **--plain**
> Plain mode (no decorations)

**-l**, **--language** _lang_
> Specify language for syntax highlighting

**-H**, **--highlight-line** _n_
> Highlight specific lines

**--paging** _when_
> When to use pager (auto, always, never)

**--style** _components_
> Configure output style

**--theme** _name_
> Color theme

**--list-languages**
> List supported languages

**--list-themes**
> List available themes

# FEATURES

- Syntax highlighting for 200+ languages
- Git integration (shows modifications)
- Line numbers
- Non-printable character display
- Automatic paging
- File concatenation
- Themes support
- Integrates with less pager

# CONFIGURATION

**~/.config/bat/config**
> Default command-line options applied automatically. One option per line (e.g. --theme, --style).

# CAVEATS

Not a drop-in cat replacement for scripts (use cat for pipelines). Slower than cat on large files. Themes require true color terminal. On Debian/Ubuntu, the binary is installed as **batcat** due to a naming conflict with another package.

# HISTORY

**bat** was created by David Peter (sharkdp) in **2018** as a modern replacement for cat with syntax highlighting and Git awareness.

# SEE ALSO

[cat](/man/cat)(1), [less](/man/less)(1), [highlight](/man/highlight)(1)
