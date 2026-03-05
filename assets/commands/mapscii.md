# TAGLINE

Braille and ASCII world map renderer for the terminal

# TLDR

**Launch the interactive world map**

```mapscii```

**Connect via telnet** without installing

```telnet mapscii.me```

# SYNOPSIS

**mapscii** [_options_]

# DESCRIPTION

**mapscii** is a node.js based vector tile to Braille and ASCII renderer that brings an interactive world map to your terminal using OpenStreetMap data. You can pan with arrow keys or mouse drag, zoom with **a**/**z** keys or mouse scroll, and switch between Unicode Braille and raw ASCII rendering with **c**.

The map supports Mapbox Styles for customizing layer styling and can connect to any public or private vector tile server. It also works offline with local VectorTile/MBTiles sources.

# CAVEATS

Braille rendering requires a Unicode-capable terminal and font. Detail level depends on terminal size and zoom level.

# HISTORY

**mapscii** was created by **rastapasta** and is written in **JavaScript** (Node.js). It can be accessed remotely via `telnet mapscii.me` without installation.

# SEE ALSO

[telnet](/man/telnet)(1)
