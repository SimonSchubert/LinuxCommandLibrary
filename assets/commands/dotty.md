# TAGLINE

removed interactive DOT graph viewer and editor

# TLDR

**dotty has been removed from Graphviz.** Use a maintained viewer instead.

View a graph interactively with **xdot**

```xdot [graph.dot]```

Render to **SVG** and open it in a browser

```dot -Tsvg [graph.dot] -o [graph.svg]```

Edit graphs visually with **Gephi**, **yEd**, or a live-preview editor

```dot -Tx11 [graph.dot]```

# SYNOPSIS

**dotty** [**-V**] [**-f**] [**-lm** _mode_] [_files_...]

# PARAMETERS

_FILES_
> DOT files to open.

**-V**
> Print the version and exit.

**-f**
> Load and reformat the graph even if it already has layout coordinates.

**-lm** _MODE_
> Set the layout mode: **sync** or **async**.

# DESCRIPTION

**dotty** was an interactive graph viewer and editor for the DOT language, shipped with Graphviz. Unlike **dot**, which renders a static image, dotty opened a window in which a graph could be panned, zoomed, edited, and re-laid-out, with nodes and edges added or deleted by mouse.

It was written not in C but in **lefty**, a small programmable graphics language that also came with Graphviz. lefty handled the window and the interaction, and shelled out to `dot` or `neato` for layout. That design made dotty highly scriptable, since its entire behaviour was source code you could edit, but it also tied it to a language nobody else used.

**This command no longer exists.** lefty, and with it dotty and lneato, were disabled in the build system in **September 2021**, dropped from the packages published on graphviz.org in **January 2022**, and finally deleted from the repository. Current Graphviz releases do not contain any of them. The code remains in the project's git history for anyone who needs to build an old version.

# CAVEATS

If a distribution still ships **dotty**, it is packaging an old Graphviz release. The command requires X11, cannot be built against current Graphviz sources, and receives no fixes.

For interactive viewing, **xdot** is the usual replacement: it is actively maintained, reads the same DOT files, and offers pan, zoom, and click-to-navigate. For editing graphs by hand, general graph editors such as yEd or Gephi are far more capable than dotty ever was, and for a quick look, rendering to SVG with `dot -Tsvg` and opening the result in a browser costs nothing.

# HISTORY

dotty came out of the original Graphviz work at **AT&T Bell Labs** and later AT&T Labs Research, in the early **1990s**, when an interactive X11 viewer was the only convenient way to explore a large graph. It was written by Eleftherios Koutsofios on top of his **lefty** language.

Its removal was unusually cautious even by Graphviz standards. The maintainers suspected lefty had been unused for years but, given how widely Graphviz is deployed, staged the removal across several years so that anyone still depending on it would have time to object. Almost nobody did.

# INSTALL

```apt: sudo apt install graphviz```

```dnf: sudo dnf install graphviz```

```pacman: sudo pacman -S graphviz```

```zypper: sudo zypper install graphviz```

```brew: brew install graphviz```

```nix: nix profile install nixpkgs#graphviz```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dot](/man/dot)(1), [xdot](/man/xdot)(1), [neato](/man/neato)(1), [graphviz](/man/graphviz)(7)

# RESOURCES

```[Source code](https://gitlab.com/graphviz/graphviz)```

```[Homepage](https://graphviz.org)```

```[Documentation](https://graphviz.org/docs/cli/dotty/)```

<!-- verified: 2026-07-14 -->

