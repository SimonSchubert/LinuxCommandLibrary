# TLDR

**Launch Dillo** browser

```dillo```

**Open a URL**

```dillo [https://example.com]```

**Open local HTML** file

```dillo [file.html]```

**Open in fullscreen** mode

```dillo -f [url]```

**Use specific geometry**

```dillo -g [800x600] [url]```

# SYNOPSIS

**dillo** [_options_] [_URL_|_file_]

# PARAMETERS

_URL_
> Web address to open.

_FILE_
> Local HTML file to open.

**-f**, **--fullscreen**
> Start in fullscreen mode.

**-g** _WxH_
> Window geometry (width x height).

**-v**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**Dillo** is a fast, small, and resource-efficient web browser written in C using the FLTK toolkit. It prioritizes speed and privacy over feature completeness, making it suitable for older hardware or minimalist setups.

The browser supports HTML 4.01 and CSS 2.1 with limitations, focusing on core browsing functionality. It doesn't include JavaScript support, which improves performance and reduces security surface but limits compatibility with modern websites.

Dillo features tabbed browsing, bookmarks, and form handling. Its minimal resource usage makes it valuable for embedded systems, older computers, or users who prefer lightweight applications.

# CAVEATS

No JavaScript support limits modern website compatibility. CSS support is incomplete. No plugin system. HTTPS support may require additional libraries. Limited media playback capabilities.

# HISTORY

Dillo was started by **Jorge Arellano Cid** in **1999**. Development focused on creating a minimalist browser that could run on low-resource systems. After periods of dormancy, the project continues with community maintenance.

# SEE ALSO

[firefox](/man/firefox)(1), [links](/man/links)(1), [lynx](/man/lynx)(1), [surf](/man/surf)(1)
