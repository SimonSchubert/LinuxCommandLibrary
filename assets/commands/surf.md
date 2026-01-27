# TLDR

**Open a URL**

```surf [https://example.com]```

**Open in a new window with tabbed**

```surf.sh [https://example.com]```

**Open with specific window geometry**

```surf -g [800x600] [https://example.com]```

**Open in fullscreen mode**

```surf -F [https://example.com]```

**Disable JavaScript**

```surf -s [https://example.com]```

**Disable images**

```surf -i [https://example.com]```

# SYNOPSIS

**surf** [_options_] [_URI_]

# PARAMETERS

**-b**
> Disable scrollbars.

**-c** _file_
> Specify cookie file.

**-d**
> Disable disk cache.

**-e** _winid_
> Embed into window with given ID.

**-f**
> Start in windowed mode (not fullscreen).

**-F**
> Start in fullscreen mode.

**-g** _geometry_
> Set window geometry (WIDTHxHEIGHT).

**-i**
> Disable images.

**-I**
> Enable images (default).

**-k**
> Disable cookies.

**-K**
> Enable cookies (default).

**-m**
> Disable applying styles from the specified file.

**-M**
> Enable applying styles from the specified file.

**-n**
> Disable the Web Inspector (Developer Tools).

**-N**
> Enable the Web Inspector (Developer Tools).

**-p**
> Disable plugins.

**-P**
> Enable plugins (default).

**-r** _file_
> Specify script file.

**-s**
> Disable JavaScript.

**-S**
> Enable JavaScript (default).

**-t** _file_
> Specify style file.

**-v**
> Display version information.

**-x**
> Print X window ID to stdout.

# DESCRIPTION

**surf** is a minimalist web browser from the suckless project. It is based on WebKit/GTK+ and follows the suckless philosophy of simplicity, clarity, and frugality.

The browser has no graphical user interface elements such as toolbars or URL bars. Navigation is performed entirely through keyboard shortcuts and external tools like **dmenu**. Use Ctrl+g to enter a new URL, Ctrl+y to copy the current URL, and Ctrl+p to navigate to a URL from the clipboard.

Configuration is done by editing the config.h source file and recompiling, following the suckless approach. For tabbed browsing, use the companion **tabbed** utility with the included surf.sh script.

The source code is intentionally kept under 2000 lines for readability and auditability.

# CAVEATS

Requires GTK+ and WebKit libraries. No built-in tab support; use tabbed for tabs. Configuration requires editing source code and recompiling. Install dmenu for URL bar functionality. Limited features compared to mainstream browsers.

# HISTORY

**surf** was created as part of the suckless project, which produces software that emphasizes minimalism and clarity. It embodies the Unix philosophy of doing one thing well: displaying web pages. The browser provides a lightweight alternative for users who prefer keyboard-driven interfaces and minimal resource usage.

# SEE ALSO

[tabbed](/man/tabbed)(1), [dmenu](/man/dmenu)(1), [firefox](/man/firefox)(1), [chromium](/man/chromium)(1)
