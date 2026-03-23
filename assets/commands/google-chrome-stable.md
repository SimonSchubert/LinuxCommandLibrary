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

**Open in kiosk mode** (fullscreen, no UI chrome)

```google-chrome-stable --kiosk [https://example.com]```

**Use a custom user data directory**

```google-chrome-stable --user-data-dir=[/path/to/profile]```

# SYNOPSIS

**google-chrome-stable** [_options_] [_URL_...]

# PARAMETERS

**--incognito**
> Open in private browsing mode.

**--headless**
> Run without a visible UI (for automation and testing).

**--print-to-pdf=**_file_
> Print page to PDF (use with --headless).

**--remote-debugging-port=**_port_
> Enable remote debugging on the specified port.

**--disable-extensions**
> Disable all browser extensions.

**--no-sandbox**
> Disable the sandbox (for testing environments).

**--disable-gpu**
> Disable GPU hardware acceleration.

**--user-data-dir=**_dir_
> Use a custom user data directory for the profile.

**--proxy-server=**_proxy_
> Route traffic through a specified proxy server.

**--window-size=**_W,H_
> Set initial window dimensions (e.g., 1024,768).

**--app=**_URL_
> Launch URL in application mode (minimal UI).

**--kiosk**
> Launch in kiosk mode (fullscreen, restricted UI).

**--new-window**
> Open URL in a new window instead of a new tab.

# DESCRIPTION

**google-chrome-stable** is the command-line launcher for the stable release of Google Chrome. It shares most functionality with the open-source Chromium browser but includes Google-specific features like automatic updates, proprietary codecs, and integration with Google services.

Common command-line options are identical to Chromium, including headless mode, remote debugging, user profile management, and various flags for development and testing. The command name varies by system: **google-chrome**, **google-chrome-stable**, or simply **chrome** may be available.

# SEE ALSO

[chromium](/man/chromium)(1), [firefox](/man/firefox)(1)
