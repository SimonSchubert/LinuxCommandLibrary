# TAGLINE

TUI for browsing and searching Python Enhancement Proposals

# TLDR

**Launch the PEP browser**

```peplum```

**Highlight a specific PEP** on startup

```peplum [8]```

**Sort** by creation date, newest first

```peplum --sort-by ~created```

**List available themes**

```peplum --theme "?"```

List commands whose **key bindings** can be changed

```peplum --bindings```

# SYNOPSIS

**peplum** [_options_] [_pep_]

# PARAMETERS

_pep_
> A PEP to highlight.

**-s**, **--sort-by** _ORDER_
> Sort order: number, created or title. Prefix with **~** for reverse order.

**-t**, **--theme** _THEME_
> Set the theme. Use **?** to list available themes.

**-b**, **--bindings**
> List commands that can have their bindings changed.

**--license**, **--licence**
> Show license information.

**-v**, **--version**
> Show version information.

**-h**, **--help**
> Show help.

# DESCRIPTION

**peplum** is a terminal user interface for looking up Python Enhancement Proposals (PEPs). It provides the ability to browse, filter, and search the metadata for all PEPs available via the PEP API. Features include multiple built-in themes, a command palette, and customizable keyboard bindings. Press **F1** for the help screen.

# CONFIGURATION

**~/.config/peplum/configuration.json**
> Configuration file.

**~/.local/share/peplum/**
> Locally held PEP data and cached PEP source files.

# HISTORY

**peplum** was created by **Dave Pearson** (davep) and is written in **Python**.

# SEE ALSO

[python](/man/python)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/davep/peplum)```

```[Homepage](https://peplum.davep.dev/)```

<!-- verified: 2026-11-09 -->
