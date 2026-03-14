# TAGLINE

Google Chrome stable release browser

# TLDR

**Open a URL**

```google-chrome-stable [https://example.com]```

**Open in incognito mode**

```google-chrome-stable --incognito [https://example.com]```

**Open in headless mode** and print to PDF

```google-chrome-stable --headless --print-to-pdf=[output.pdf] [https://example.com]```

**Start with remote debugging** enabled

```google-chrome-stable --remote-debugging-port=[9222]```

**Disable all extensions**

```google-chrome-stable --disable-extensions```

View `chromium` for additional options

```tldr chromium```

# SYNOPSIS

**google-chrome-stable** [_options_] [_URL_...]

# DESCRIPTION

**google-chrome-stable** is the command-line launcher for the stable release of Google Chrome. It shares most functionality with the open-source Chromium browser but includes Google-specific features like automatic updates, proprietary codecs, and integration with Google services.

Common command-line options are identical to Chromium, including headless mode, remote debugging, user profile management, and various flags for development and testing. The command name varies by system: **google-chrome**, **google-chrome-stable**, or simply **chrome** may be available.

# SEE ALSO

[chromium](/man/chromium)(1), [firefox](/man/firefox)(1)
