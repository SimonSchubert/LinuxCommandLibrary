# TLDR

Open **current directory** in file explorer

```xdg-open .```

Open a **URL** in default browser

```xdg-open https://example.com```

Open an **image** in default viewer

```xdg-open path/to/image.png```

Open a **PDF** in default viewer

```xdg-open path/to/document.pdf```

Open a **video** in default player

```xdg-open path/to/video.mp4```

# SYNOPSIS

**xdg-open** _file_|_URL_

# DESCRIPTION

**xdg-open** opens a file or URL in the user's preferred application. It is part of the xdg-utils package and works across different desktop environments by detecting which one is running and using the appropriate method.

# PARAMETERS

**--help**
> Display help message

**--version**
> Display version information

# SUPPORTED DESKTOP ENVIRONMENTS

xdg-open detects and uses the appropriate method for:
- GNOME (gio open or gnome-open)
- KDE (kde-open or kfmclient)
- Xfce (exo-open)
- MATE (mate-open)
- Enlightenment (enlightenment_open)
- Generic fallback (mimeopen)

# CAVEATS

The file or URL is opened asynchronously; xdg-open returns immediately. The application chosen depends on the desktop's MIME type associations. On systems without a desktop environment, it may fall back to text-based alternatives.

# HISTORY

**xdg-open** is part of **xdg-utils**, a set of scripts for desktop integration developed by the freedesktop.org project to provide consistent behavior across different Linux desktop environments.

# SEE ALSO

[xdg-mime](/man/xdg-mime)(1), [xdg-settings](/man/xdg-settings)(1), [gio](/man/gio)(1)
