# TAGLINE

Google Chrome web browser

# TLDR

**Start Chrome**

```google-chrome```

**Open URL**

```google-chrome [https://example.com]```

**Incognito mode**

```google-chrome --incognito```

**New window**

```google-chrome --new-window [url]```

**Headless mode**

```google-chrome --headless --screenshot [url]```

# SYNOPSIS

**google-chrome** [_options_] [_urls_]

# PARAMETERS

_URLS_
> URLs to open.

**--incognito**
> Start in incognito mode.

**--new-window**
> Open in new window.

**--headless**
> Run without UI.

**--disable-gpu**
> Disable GPU acceleration.

**--screenshot**
> Take screenshot (headless).

**--user-data-dir** _DIR_
> Profile directory.

**--help**
> Display help information.

# DESCRIPTION

**google-chrome** is Google's Chrome web browser, built on the open-source Chromium project. It provides web browsing with the V8 JavaScript engine, multi-process architecture, and extensive extension support.

The command-line interface enables automation, testing, and headless operation. Headless mode is widely used for web scraping, automated testing, and screenshot generation.

# CONFIGURATION

**~/.config/google-chrome/**
> User profile directory containing bookmarks, extensions, preferences, and cached data.

# CAVEATS

Resource-intensive. Many flags available. Headless mode for automation.

# HISTORY

Google Chrome was released in **2008**, quickly becoming the dominant web browser based on the open-source Chromium project.

# SEE ALSO

[chromium](/man/chromium)(1), [firefox](/man/firefox)(1)
