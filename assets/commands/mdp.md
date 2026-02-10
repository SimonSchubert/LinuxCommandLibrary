# TAGLINE

presents markdown files as slides

# TLDR

**Present slides**

```mdp [presentation.md]```

**Start from specific slide**

```mdp -s [5] [presentation.md]```

**Disable fade**

```mdp -f [presentation.md]```

**Disable colors**

```mdp -n [presentation.md]```

**Invert colors**

```mdp -i [presentation.md]```

# SYNOPSIS

**mdp** [_options_] _file_

# PARAMETERS

_FILE_
> Markdown presentation file.

**-s** _NUM_
> Start at slide number.

**-f**
> Disable fading.

**-n**
> Disable colors.

**-i**
> Invert colors.

**--help**
> Display help information.

# DESCRIPTION

**mdp** presents markdown files as slides. It renders presentations in the terminal.

The tool uses markdown syntax for slides. Slide breaks are indicated by horizontal rules.

# CAVEATS

Terminal-based only. Limited formatting. UTF-8 support varies.

# HISTORY

mdp was created as a **terminal-based** presentation tool using markdown for slide content.

# SEE ALSO

[presenterm](/man/presenterm)(1), [slides](/man/slides)(1), [sent](/man/sent)(1)

