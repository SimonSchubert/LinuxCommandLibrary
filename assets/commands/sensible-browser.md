# TLDR

Open a **new window** of the default browser

```sensible-browser```

Open a **URL** in the default browser

```sensible-browser https://example.com```

# SYNOPSIS

**sensible-browser** [_URL_]

# DESCRIPTION

**sensible-browser** opens the user's preferred web browser. It checks environment variables and system defaults to determine which browser to launch.

The browser selection order checks BROWSER environment variable, then system alternatives.

# CAVEATS

Behavior depends on environment configuration. May not work in non-graphical environments without proper setup.

# HISTORY

Part of **sensible-utils** package, providing Debian policy-compliant default application launchers.

# SEE ALSO

[xdg-open](/man/xdg-open)(1), [update-alternatives](/man/update-alternatives)(8)
