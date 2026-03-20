# TAGLINE

Customizable Chromium-based web browser

# TLDR

**Start browser**

```vivaldi```

**Open URL**

```vivaldi [https://example.com]```

**New window**

```vivaldi --new-window [url]```

**Incognito mode**

```vivaldi --incognito```

**With profile**

```vivaldi --profile-directory="[Profile 1]"```

# SYNOPSIS

**vivaldi** [_--new-window_] [_--incognito_] [_options_] [_url_]

# PARAMETERS

**--new-window**
> Open a new browser window.

**--incognito**
> Open a new window in private browsing mode.

**--profile-directory** _DIR_
> Use the specified profile directory.

**--app** _URL_
> Launch URL in app mode (minimal UI, no tabs or address bar).

**--no-sandbox**
> Disable the security sandbox.

**--user-data-dir** _DIR_
> Use a custom user data directory.

**--help**
> Show help.

# DESCRIPTION

**vivaldi** is a feature-rich, Chromium-based web browser designed for power users who want extensive control over their browsing experience. It supports modern web standards through its Chromium engine while adding a highly customizable user interface on top.

The browser includes advanced tab management features such as tab stacking, tab tiling for side-by-side viewing, and a tab bar that can be placed on any edge of the window. Built-in productivity tools include a notes panel, email client, calendar, feed reader, and translation service, reducing the need for separate applications or extensions.

Nearly every aspect of the interface can be customized, from keyboard shortcuts and mouse gestures to toolbar layouts and color themes. The browser also supports command chaining, custom search engines, and a web panel sidebar for keeping frequently used sites accessible.

# CAVEATS

Contains proprietary UI components on top of open-source Chromium. Supports most Chromium command-line switches. Custom flags can be placed in `~/.config/vivaldi-stable.conf`.

# HISTORY

**Vivaldi** was created by **Jon von Tetzchner**, co-founder of Opera, for power users wanting customization.

# SEE ALSO

[vivaldi-stable](/man/vivaldi-stable)(1), [firefox](/man/firefox)(1), [chromium](/man/chromium)(1), [google-chrome](/man/google-chrome)(1)
