# TAGLINE

Fuzzy interactive selector for stdin lines

# TLDR

**Pick a file** and open it

```find . -type f | pick | xargs xdg-open```

**Re-run a command** from shell history

```eval $(fc -ln 1 | pick)```

**Select one line** from a list

```printf '%s\n' [a b c] | pick```

# SYNOPSIS

**pick**

# DESCRIPTION

**pick** reads newline-separated choices from standard input, presents an interactive fuzzy filter in the terminal, and writes the selected line to standard output. It is designed for shell pipelines and subshells: feed it any list, choose an entry with the keyboard, and pipe the result into another command.

A Vim plugin (**pick.vim**) and packages for many Linux distributions and BSDs are available. Homepage: https://www.basename.se/pick/

# PARAMETERS

**pick** typically takes no arguments; configuration is via terminal interaction (typing to filter, arrow keys / completion to select, Enter to confirm). See the installed man page **pick(1)** for key bindings and compile-time options.

# CAVEATS

Requires a TTY for interactive use; pure non-interactive pipelines without a terminal will not work. Output is a single selected line (behavior if cancelled depends on version—check exit status in scripts).

# INSTALL

```apt: sudo apt install pick```

```dnf: sudo dnf install pick```

```apk: sudo apk add mmh```

```brew: brew install pick```

```nix: nix profile install nixpkgs#pick```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[fzf](/man/fzf)(1), [fzy](/man/fzy)(1), [peco](/man/peco)(1), [selecta](/man/selecta)(1)

# RESOURCES

```[Source code](https://github.com/mptre/pick)```

```[Homepage](https://www.basename.se/pick/)```

<!-- verified: 2026-07-19 -->
