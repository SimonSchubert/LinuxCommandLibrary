# TAGLINE

Rich git commit graph in your terminal

# TLDR

**Display the commit graph for the current repository**

```serie```

**Limit display to a number of commits**

```serie -n [100]```

**Use topological commit ordering**

```serie -o topo```

**Use angular edge style with double-width cells**

```serie -s angular --graph-width double```

# SYNOPSIS

**serie** [_options_]

# PARAMETERS

**-n**, **--max-count** _NUMBER_
> Maximum number of commits to render.

**-p**, **--protocol** _TYPE_
> Image protocol: auto, iterm, or kitty. Default: auto.

**-o**, **--order** _TYPE_
> Commit ordering: chrono or topo. Default: chrono.

**-g**, **--graph-width** _TYPE_
> Cell width: auto, double, or single.

**-s**, **--graph-style** _TYPE_
> Edge style: rounded or angular.

# DESCRIPTION

**serie** renders rich git commit graphs directly in the terminal using image display protocols (iTerm2 or Kitty). It provides a visual alternative to **git log --graph --all** with customizable graph styles, commit ordering, and interactive browsing.

# CAVEATS

Requires iTerm2 or Kitty terminal emulator with image protocol support. Does not support Sixel graphics or terminal multiplexers (tmux, screen, Zellij).

# HISTORY

**serie** was created by **Kyosuke Fujimoto** (lusingander) and is written in **Rust**.

# SEE ALSO

[tig](/man/tig)(1), [lazygit](/man/lazygit)(1), [gitui](/man/gitui)(1)
