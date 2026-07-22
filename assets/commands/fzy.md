# TAGLINE

Simple, fast fuzzy text selector for the terminal

# TLDR

**Fuzzy-pick a line** from stdin

```[command] | fzy```

**Pick a file** to edit

```find . -type f | fzy | xargs -r $EDITOR```

**Limit number of visible matches**

```[command] | fzy -l [20]```

**Show help**

```fzy --help```

# SYNOPSIS

**fzy** [**-l** *lines*] [**-p** *prompt*] [**-q** *query*] [**-e** *query*] [**-t**] [**-s**] [**-0**] [**-j** *workers*]

# DESCRIPTION

**fzy** is a minimal fuzzy finder: it reads newline-separated candidates from stdin, interactively filters them as you type, and prints the selected line to stdout. It emphasizes ranking quality and speed with a small codebase, making it a lightweight alternative to heavier selectors.

# PARAMETERS

**-l**, **--lines** *n*

> Maximum number of matches shown (default often 10).

**-p**, **--prompt** *text*

> Input prompt string.

**-q**, **--query** *text*

> Initial query.

**-e**, **--show-matches** *query*

> Non-interactive: print sorted matches for *query* and exit.

**-t**, **--tty-only**

> Only use /dev/tty (behavior depends on version).

**-0**, **--read-null**

> Read NUL-separated input.

**-j** *workers*

> Parallel scoring workers.

# CAVEATS

Needs a TTY for interactive mode. Ranking differs from **fzf**; scripts may need adjustment when switching tools.

# INSTALL

```apt: sudo apt install fzy```

```pacman: sudo pacman -S fzy```

```apk: sudo apk add fzy```

```zypper: sudo zypper install fzy```

```brew: brew install fzy```

```nix: nix profile install nixpkgs#fzy```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[fzf](/man/fzf)(1), [pick](/man/pick)(1), [sk](/man/sk)(1)

# RESOURCES

```[Source code](https://github.com/jhawthorn/fzy)```

<!-- verified: 2026-07-19 -->
