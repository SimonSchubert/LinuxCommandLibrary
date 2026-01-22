# TLDR

**Open Firefox**

```firefox```

**Open specific URL**

```firefox [https://example.com]```

**New window**

```firefox --new-window [url]```

**Private browsing**

```firefox --private-window```

**Use specific profile**

```firefox -P [profilename]```

# SYNOPSIS

**firefox** [_options_] [_urls_...]

# PARAMETERS

_URLS_
> URLs to open.

**--new-window** _URL_
> Open URL in new window.

**--new-tab** _URL_
> Open URL in new tab.

**--private-window**
> Start private browsing.

**-P** _PROFILE_
> Use named profile.

**--ProfileManager**
> Open profile manager.

**--safe-mode**
> Start with extensions disabled.

**--headless**
> Run without GUI.

**--screenshot** _FILE_
> Capture page to file.

**--help**
> Display help information.

# DESCRIPTION

**firefox** is Mozilla's open source web browser. The command-line interface launches the browser with various options for windows, profiles, and automated tasks.

The browser supports multiple profiles for separating work and personal browsing. Headless mode enables automated screenshots and testing without a visible window.

Firefox provides extensive privacy features and extension support through its add-ons ecosystem.

# CAVEATS

Profile options require no running instance. Headless mode has limited functionality. Some options vary by platform.

# HISTORY

Firefox emerged from the **Mozilla** project in 2002 as Phoenix, renamed Firefox in 2004. It became a major browser challenging Internet Explorer's dominance, pioneering features like tabbed browsing and extensions.

# SEE ALSO

[chromium](/man/chromium)(1), [google-chrome](/man/google-chrome)(1)
