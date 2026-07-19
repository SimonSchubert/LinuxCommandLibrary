# TAGLINE

Record terminal sessions as SVG animations

# TLDR

**Start recording** (exit shell or Ctrl-D to stop)

```termtosvg```

**Record to a specific file**

```termtosvg [out.svg]```

**Still frames** instead of animation

```termtosvg --still-frames [outdir]```

**Render an asciicast**

```termtosvg render [recording.cast]```

# SYNOPSIS

**termtosvg** [*output*] [*options*]
**termtosvg** **render** *castfile* [*options*]

# DESCRIPTION

**termtosvg** is a Unix terminal recorder written in Python that renders command-line sessions as standalone SVG animations (or still frames). Recordings are lightweight and embeddable on project pages. Custom colour themes and UI chrome are available via SVG templates. It can also render **asciinema** asciicast files.

Install with **pip3 install termtosvg** (Python >= 3.5) or from distro packages. Invoke as **termtosvg** or **python3 -m termtosvg**.

**Maintenance status:** as of June 2020 the upstream repository is read-only and unmaintained. Prefer **asciinema** plus other renderers for new projects if you need active support.

# PARAMETERS

*output*

> Output SVG path for a live recording (optional; default under a temp/generated name depending on version).

**--still-frames** [*dir*]

> Export still frames instead of (or in addition to) animation, when supported.

**render** *file.cast*

> Render an existing asciicast.

Template and geometry flags vary by version; see **termtosvg --help** and the templates man page in the repo.

# CAVEATS

Unmaintained since 2020. Unix-like systems only (Linux, macOS, BSD). SVG playback depends on the viewer; very long sessions produce large files. For actively maintained terminal recording, consider **asciinema**.

# SEE ALSO

[asciinema](/man/asciinema)(1), [script](/man/script)(1), [ttyrec](/man/ttyrec)(1), [vhs](/man/vhs)(1)

# RESOURCES

```[Source code](https://github.com/nbedos/termtosvg)```

```[Homepage](https://nbedos.github.io/termtosvg/)```

<!-- verified: 2026-07-19 -->
