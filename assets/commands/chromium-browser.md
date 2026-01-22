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

**chromium-browser** is the open-source web browser that Chrome is based on. Supports extensive command-line switches for customization, debugging, and automation.

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

# CAVEATS

Command-line switches may change between versions. Check about:version for active switches. Use chrome://flags for experimental features.

# SEE ALSO

[google-chrome](/man/google-chrome)(1), [firefox](/man/firefox)(1)
