# TAGLINE

run Racket Slideshow presentations from the command line

# TLDR

Open the **tutorial** / file picker (no arguments)

```slideshow```

Present a **.rkt** slide program

```slideshow [path/to/talk.rkt]```

Keep the window **title bar** (windowed, resizable)

```slideshow --keep-titlebar [path/to/talk.rkt]```

Set window **width and height** in pixels

```slideshow -s [1024] [768] [path/to/talk.rkt]```

Export a **PDF**

```slideshow -D -o [talk.pdf] [path/to/talk.rkt]```

# SYNOPSIS

**slideshow** [_options_] [_file.rkt_]

# PARAMETERS

**-s**, **--size** _width_ _height_
> Presentation window size in pixels.

**--keep-titlebar**
> Show a title bar and resize border instead of a borderless/fullscreen-style window.

**-D**, **--pdf**
> Render slides to PDF (use with **-o**).

**-o** _file_
> Output path for PDF export.

# DESCRIPTION

**slideshow** is the command-line runner for Racket's Slideshow library: presentations written as programs (`#lang slideshow`) rather than a WYSIWYG deck. Slides are picts assembled in Racket; running the file opens a viewer. With no file, Slideshow offers the built-in tutorial and a way to load a `.rkt` talk.

Typical workflow: write slides in a `.rkt` file, preview with **slideshow talk.rkt**, export with **--pdf** when you need a handout. Fullscreen vs widescreen aspect is configured in the Slideshow language, not only on the CLI.

# CAVEATS

Requires a Racket install with the **slideshow** package (`slideshow-lib`). This is not a generic image slideshow (that is often **feh**, **mpv**, or a desktop app). PDF export needs a writable **-o** path.

# HISTORY

Slideshow was created by Matthew Flatt and Robert Bruce Findler as a functional alternative to PowerPoint/Beamer. Distributed with Racket.

# INSTALL

```apt: sudo apt install racket```

```dnf: sudo dnf install racket```

```pacman: sudo pacman -S racket```

```zypper: sudo zypper install racket```

```brew: brew install racket```

```nix: nix profile install nixpkgs#racket```

<!-- packages: 2026-08-26 -->

# SEE ALSO

[racket](/man/racket)(1), [raco](/man/raco)(1)

# RESOURCES

```[Documentation](https://docs.racket-lang.org/slideshow/)```

<!-- verified: 2026-08-26 -->
