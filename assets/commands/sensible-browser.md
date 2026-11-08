# TAGLINE

Open user's preferred web browser

# TLDR

Open a **new window** of the default browser

```sensible-browser```

Open a **URL** in the default browser

```sensible-browser https://example.com```

# SYNOPSIS

**sensible-browser** [_URL_]

# DESCRIPTION

**sensible-browser** opens the user's preferred web browser. It checks environment variables and system defaults to determine which browser to launch.

It tries the **BROWSER** environment variable first. With a graphical display (**DISPLAY** set) it then tries gnome-www-browser (under GNOME), x-www-browser, and www-browser in a terminal; without a display it tries www-browser.

# CAVEATS

Behavior depends on environment configuration. May not work in non-graphical environments without proper setup.

# HISTORY

Part of **sensible-utils** package, providing Debian policy-compliant default application launchers.

# SEE ALSO

[sensible-editor](/man/sensible-editor)(1), [xdg-open](/man/xdg-open)(1), [update-alternatives](/man/update-alternatives)(8)

# RESOURCES

```[Source code](https://salsa.debian.org/debian/sensible-utils)```

<!-- verified: 2026-11-08 -->
