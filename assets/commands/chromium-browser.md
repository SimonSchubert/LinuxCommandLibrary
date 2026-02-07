# TAGLINE

Open-source web browser with extensive command-line controls

# TLDR

**Open URL**

```chromium-browser [https://example.com]```

**Open in incognito mode**

```chromium-browser --incognito```

**Open with remote debugging**

```chromium-browser --remote-debugging-port=[9222]```

**Disable GPU acceleration**

```chromium-browser --disable-gpu```

**Start headless**

```chromium-browser --headless --screenshot [https://example.com]```

**Use specific profile**

```chromium-browser --user-data-dir=[/path/to/profile]```

# SYNOPSIS

**chromium-browser** [_options_] [_URL_...]

# DESCRIPTION

**chromium-browser** is the open-source web browser project that forms the foundation of Google Chrome, Microsoft Edge, and many other browsers. It provides a full-featured browsing experience with support for modern web standards, extensions, and developer tools.

The browser supports an extensive set of command-line switches for customization, debugging, and automation. Headless mode enables server-side rendering, automated testing, and screenshot/PDF generation without a graphical display. Remote debugging via DevTools Protocol allows external tools to inspect and control browser sessions.

Chromium can be configured to use specific user profiles, proxy servers, and experimental features. It is commonly used in CI/CD pipelines, web scraping, and automated testing environments alongside tools like Puppeteer and Playwright.

# PARAMETERS

**--incognito**
> Start in incognito mode

**--headless**
> Run without UI

**--disable-gpu**
> Disable GPU hardware acceleration

**--remote-debugging-port** _port_
> Enable remote debugging

**--user-data-dir** _dir_
> Custom profile directory

**--no-sandbox**
> Disable sandbox (for containers)

**--disable-extensions**
> Disable extensions

**--start-maximized**
> Start maximized

**--kiosk**
> Start in kiosk mode

**--proxy-server** _server_
> Use proxy server

**--enable-features** _features_
> Enable experimental features

**--disable-features** _features_
> Disable features

**--screenshot** _file_
> Take screenshot (headless)

**--print-to-pdf** _file_
> Print page to PDF (headless)

# HEADLESS USAGE

```
chromium-browser --headless --print-to-pdf=page.pdf https://example.com
```

# CONFIGURATION

**~/.config/chromium/**
> User profile directory containing preferences, bookmarks, history, and extensions.

**~/.config/chromium/Default/Preferences**
> JSON file with per-profile browser settings.

# CAVEATS

Command-line switches may change between versions. Check about:version for active switches. Use chrome://flags for experimental features.

# SEE ALSO

[google-chrome](/man/google-chrome)(1), [firefox](/man/firefox)(1)
