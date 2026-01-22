# TLDR

**Open** a URL in the default application

```handlr open https://example.com```

Open a **PDF** in the default PDF viewer

```handlr open [path/to/file.pdf]```

**Set** imv as the default application for PNG files

```handlr set .png imv.desktop```

Set MPV as the default for all **audio files**

```handlr set 'audio/*' mpv.desktop```

**List** all default apps

```handlr list```

**Get** the default application for PNG files

```handlr get .png```

# SYNOPSIS

**handlr** _command_ [_arguments_]

# PARAMETERS

**open** _PATH|URL_
> Open file or URL with default application

**set** _MIME|EXT_ _HANDLER_
> Set default application for MIME type or extension

**get** _MIME|EXT_
> Get default application for MIME type or extension

**list**
> List all configured default applications

**unset** _MIME|EXT_
> Remove default application setting

**add** _MIME|EXT_ _HANDLER_
> Add handler to list without setting as default

# DESCRIPTION

**handlr** is a modern alternative to xdg-utils for managing default applications on Linux. It handles file and URL associations through MIME types and file extensions.

The tool modifies ~/.config/mimeapps.list (and optionally the deprecated ~/.local/share/applications/mimeapps.list) to set default applications. It supports both specific file extensions (.pdf, .png) and MIME type patterns (audio/*, video/*).

handlr aims to be simpler and more predictable than xdg-open and xdg-mime, with better terminal integration and clear output.

# CAVEATS

Requires .desktop files to be properly installed in standard locations. May not be recognized by all desktop environments. Some applications may have their own file association mechanisms that override system defaults.

# HISTORY

handlr was created as a Rust-based alternative to the xdg-utils suite, focusing on simplicity and reliability. It addresses common frustrations with xdg-open's unpredictable behavior and complex fallback mechanisms.

# SEE ALSO

[xdg-open](/man/xdg-open)(1), [xdg-mime](/man/xdg-mime)(1), [mimeopen](/man/mimeopen)(1)
