# TAGLINE

GNOME document viewer for PDF and PostScript

# TLDR

Open a document

```evince [path/to/file.pdf]```

Open **several documents** at once

```evince [path/to/file1.pdf] [path/to/file2.pdf]```

Jump straight to a page by its **position in the file**

```evince --page-index [5] [path/to/file.pdf]```

Jump to a page by its **printed label**, which may not be a plain number

```evince --page-label [iv] [path/to/file.pdf]```

Open with a **search already running**

```evince --find "[keyword]" [path/to/file.pdf]```

Start **full screen**

```evince --fullscreen [path/to/file.pdf]```

Start in **presentation mode**

```evince --presentation [path/to/slides.pdf]```

Open in **preview mode**, which shows a print toolbar

```evince --preview [path/to/file.pdf]```

Jump to a **named destination** inside the document

```evince --named-dest [chapter1] [path/to/file.pdf]```

# SYNOPSIS

**evince** [_options_] [_files_]

# PARAMETERS

**-f, --fullscreen**
> Open in fullscreen mode

**-s, --presentation**
> Open in presentation mode

**-i, --page-index** _page_
> Open at specific page

**-l, --page-label** _label_
> Open at page with label

**-w, --preview**
> Run in preview mode

# DESCRIPTION

**evince** is the GNOME document viewer supporting PDF, PostScript, DjVu, TIFF, and other formats. It provides annotation support, form filling, and presentation mode.

Integrates with GNOME desktop services for printing and file management.

# CAVEATS

GNOME desktop application. Some features require poppler library. Large documents may consume significant memory.

# INSTALL

```apt: sudo apt install evince```

```dnf: sudo dnf install evince```

```pacman: sudo pacman -S evince```

```apk: sudo apk add evince```

```zypper: sudo zypper install evince```

```brew: brew install evince```

```nix: nix profile install nixpkgs#evince```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[okular](/man/okular)(1), [zathura](/man/zathura)(1), [xdg-open](/man/xdg-open)(1)

# RESOURCES

```[Source code](https://gitlab.gnome.org/GNOME/evince)```

```[Homepage](https://apps.gnome.org/Evince/)```

<!-- verified: 2026-07-15 -->
