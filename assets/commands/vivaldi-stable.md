# TAGLINE

Customizable Chromium-based web browser (stable channel)

# TLDR

**Open** Vivaldi

```vivaldi-stable```

**Open a specific URL**

```vivaldi-stable [https://example.com]```

**Open with a specific profile**

```vivaldi-stable --profile-directory=[test]```

**Open URL in a new tab**

```vivaldi-stable --new-tab [https://example.com]```

**Start in incognito (private) mode**

```vivaldi-stable --incognito```

**Disable GPU** (useful for troubleshooting)

```vivaldi-stable --disable-gpu```

# SYNOPSIS

**vivaldi-stable** [_options_] [_URL_]

# DESCRIPTION

**vivaldi-stable** is the Linux package name for the stable release of the Vivaldi browser. Vivaldi is a highly customizable web browser built on Chromium that focuses on power users, offering features such as tab stacking, tiling, built-in email, notes, and extensive theming.

Since Vivaldi is Chromium-based, it accepts most Chromium command-line switches. User-specific flags can also be placed in `~/.config/vivaldi-stable.conf` for persistent application.

# CAVEATS

Not fully open source: the UI layer is proprietary while the Chromium base is open source. Some Chromium features may behave differently due to Vivaldi modifications.

# SEE ALSO

[chromium](/man/chromium)(1), [google-chrome](/man/google-chrome)(1), [firefox](/man/firefox)(1), [brave](/man/brave)(1)
