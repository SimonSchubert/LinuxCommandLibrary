# TAGLINE

Terminal-based presentations using Pandoc Markdown

# TLDR

**Present a Markdown file**

```patat [presentation.md]```

**Present with auto-reload on file changes**

```patat --watch [presentation.md]```

**Dump all slides to stdout**

```patat --dump [presentation.md]```

# SYNOPSIS

**patat** [_options_] _file_

# PARAMETERS

**-w**, **--watch**
> Monitor the presentation file for changes and reload automatically.

**-f**, **--force**
> Run even if the terminal claims insufficient ANSI support.

**-d**, **--dump**
> Output all slides to stdout for debugging.

**--version**
> Display version information.

# DESCRIPTION

**patat** (Presentations Atop The ANSI Terminal) is a feature-rich, terminal-based presentation tool built on Pandoc. It supports images, evaluating code snippets, syntax highlighting, speaker notes, theming, and progressive slide reveals. Slides are separated by Markdown headers, and configuration can be embedded in the YAML front matter.

# CAVEATS

Requires Pandoc-flavored Markdown. Some features like image display depend on terminal capabilities.

# HISTORY

**patat** was created by **Jasper Van der Jeugt** (jaspervdj) and is written in **Haskell**.

# SEE ALSO

[slides](/man/slides)(1), [presenterm](/man/presenterm)(1), [mdp](/man/mdp)(1)
