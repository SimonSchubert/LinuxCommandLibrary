# TAGLINE

Display animated GIFs as colorful terminal art

# TLDR

**Play** a GIF in the terminal

```gif-for-cli [file.gif]```

**Play** from a URL (if supported)

```gif-for-cli "[https://example.com/a.gif]"```

# SYNOPSIS

**gif-for-cli** [*options*] *gif*

# DESCRIPTION

**gif-for-cli** (Google) renders GIF animations using ANSI/Unicode block characters so short clips can play inside a terminal. Useful for demos and easter eggs. Requires a color-capable terminal; **ffmpeg** is used in the processing pipeline.

# PARAMETERS

*gif*

> Path or source for the animation.

Display size and color mode flags depend on version—**gif-for-cli --help**.

# CAVEATS

Performance depends on terminal emulator and GIF resolution. Not suitable for accessibility-critical output. Package install methods vary (pip/source).

# SEE ALSO

[timg](/man/timg)(1), [chafa](/man/chafa)(1), [viu](/man/viu)(1)

# RESOURCES

```[Source code](https://github.com/google/gif-for-cli)```

<!-- verified: 2026-07-19 -->
