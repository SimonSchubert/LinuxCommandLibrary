# TAGLINE

TUI for the Jujutsu version control system

# TLDR

**Launch jjui** in the current repository

```jjui```

# SYNOPSIS

**jjui** [_options_]

# DESCRIPTION

**jjui** is a terminal user interface for working with the **Jujutsu** (jj) version control system. It provides an interactive revision tree with the ability to rebase revisions, squash changes, edit descriptions, and view diffs with a preview window.

Key features include auto-complete and signature help while editing revsets, rebasing revisions or branches onto other revisions, squashing revisions with the **S** key, and a preview window (toggled with **p**) that displays jj show, jj diff, or jj op show output.

# CAVEATS

Requires **jj** version 0.36 or newer to be installed. Only works in repositories initialized with Jujutsu.

# HISTORY

**jjui** was created by **Ibrahim Dursun** (idursun) and is written in **Go**. It was designed to provide a visual, interactive interface for Jujutsu's revision-based version control model.

# SEE ALSO

[jj](/man/jj)(1), [lazyjj](/man/lazyjj)(1), [lazygit](/man/lazygit)(1)
