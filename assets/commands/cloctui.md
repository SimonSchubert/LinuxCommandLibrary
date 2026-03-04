# TAGLINE

TUI for counting lines of code with CLOC

# TLDR

**Scan** a directory for lines of code

```cloctui [path/to/directory]```

**Scan** the current directory

```cloctui .```

**Scan** in fullscreen mode

```cloctui [path/to/directory] -f```

**Try without installing** via uvx

```uvx cloctui .```

# SYNOPSIS

**cloctui** [_path_] [**-f**]

# PARAMETERS

**path**
> Directory path to analyze with CLOC. If omitted, usage instructions are displayed.

**-f**, **--fullscreen**
> Run in fullscreen mode instead of the default inline mode.

# DESCRIPTION

**cloctui** is a terminal user interface wrapper around the **cloc** (Count Lines of Code) tool. Instead of displaying raw text output, cloctui presents CLOC's analysis results in an interactive table that can be sorted and browsed, making it particularly useful for large codebases.

Features include multiple grouping modes (by programming language, by directory, or as individual files), column sorting by clicking table headers or using keyboard shortcuts, and dual display modes (inline or fullscreen).

# CAVEATS

Requires **cloc** to be separately installed on the system; cloctui is only a frontend, not a standalone code analyzer. Requires Python 3.10 or later. Many of CLOC's native options are not yet exposed through the TUI.

# HISTORY

**cloctui** was created by **Edward Jazzhands** and published in **August 2025**. Its core CLOC-wrapping functionality was adapted from Stefano Stone's **pycloc** project, with the addition of a Textual-based TUI. The project is MIT-licensed and written in Python.

# SEE ALSO

[cloc](/man/cloc)(1), [tokei](/man/tokei)(1), [scc](/man/scc)(1)
