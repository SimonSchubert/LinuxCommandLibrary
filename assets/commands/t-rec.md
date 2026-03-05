# TAGLINE

Blazingly fast terminal recorder generating animated GIFs

# TLDR

**Record the current terminal session**

```t-rec```

**Generate both GIF and MP4 output**

```t-rec --video```

**Record with drop shadow using a specific shell**

```t-rec -d shadow /bin/sh```

# SYNOPSIS

**t-rec** [_options_] [_shell_]

# PARAMETERS

**--video**
> Generate both GIF and MP4 output.

**-d** _DECOR_
> Apply decorative effect (e.g., shadow).

# DESCRIPTION

**t-rec** captures terminal sessions and converts them into animated GIF images or MP4 videos. It features intelligent idle frame detection for optimized file sizes, configurable framerate, optional decorative effects like drop shadows, and can record any window. Runs entirely offline on macOS, Linux, and NetBSD.

# HISTORY

**t-rec** was created by **Sven Assmann** (sassman) and is written in **Rust**.

# SEE ALSO

[asciinema](/man/asciinema)(1), [vhs](/man/vhs)(1), [terminalizer](/man/terminalizer)(1)
