# TAGLINE

A command-line based markdown presentation tool

# TLDR

**Present a markdown file as slides**

```mdp [presentation.md]```

**Read presentation from stdin**

```cat [presentation.md] | mdp```

**Present with color fading disabled**

```mdp -f [presentation.md]```

**Present with inverted colors**

```mdp -i [presentation.md]```

**Present with character entity expansion enabled**

```mdp -e [presentation.md]```

**Present with transparency disabled**

```mdp -t [presentation.md]```

# SYNOPSIS

**mdp** [_options_] [_FILE_]

# PARAMETERS

_FILE_
> Markdown presentation file. If no file is specified or if the file name is -, reads from standard input.

**-e**, **--expand**
> Enable character entity expansion (e.g. '&gt;' becomes '>').

**-f**, **--nofade**
> Disable color fading in 256 color mode.

**-i**, **--invert**
> Swap black and white colors.

**-t**, **--notrans**
> Disable transparency in transparent terminal.

**-d**, **--debug**
> Enable debug messages on stderr. Add multiple times to increase debug level.

**-h**, **--help**
> Display usage message and exit.

**-v**, **--version**
> Display version and license information.

# DESCRIPTION

**mdp** is a command-line based markdown presentation tool. It renders presentations in the terminal using standard markdown syntax.

Horizontal rules are used as slide separators. Headers prefixed with **@** are displayed as title and author in the top and bottom bars. Supported formatting includes headlines, code blocks, block quotes, unordered lists, bold text, underlined text, and inline code.

Navigation uses arrow keys, h/j/k/l, Space, Enter, Page Up/Down. Press **g** or **Home** to go to the first slide, **G** or **End** for the last. Number keys **1-9** jump to a specific slide. Press **r** to reload and **q** to quit.

# CAVEATS

Terminal-based only. Limited formatting compared to graphical presentation tools. UTF-8 support varies by terminal.

# HISTORY

mdp was created by **Michael Göhler** as a terminal-based presentation tool using markdown for slide content.

# SEE ALSO

[presenterm](/man/presenterm)(1), [slides](/man/slides)(1)

