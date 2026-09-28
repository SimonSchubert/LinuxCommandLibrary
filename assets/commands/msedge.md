# TAGLINE

launches Microsoft Edge browser from command line

# TLDR

**Open Microsoft Edge**

```msedge```

**Open URL**

```msedge [https://example.com]```

**Open in new window**

```msedge --new-window [https://example.com]```

**Open in InPrivate mode**

```msedge --inprivate [https://example.com]```

**Open with developer tools**

```msedge --auto-open-devtools-for-tabs [https://example.com]```

Open a site as a standalone **app window**

```msedge --app=[https://example.com]```

Use a **separate profile directory** (clean, isolated session)

```msedge --user-data-dir=[/tmp/edge-profile]```

**Print a page to PDF** headlessly

```msedge --headless --print-to-pdf=[output.pdf] [https://example.com]```

Enable **remote debugging** for automation tools

```msedge --remote-debugging-port=[9222]```

# SYNOPSIS

**msedge** [_options_] [_url_...]

# PARAMETERS

**--new-window**
> Open in new window.

**--inprivate**
> Open in InPrivate mode.

**--profile-directory**=_name_
> Use a named profile inside the user data directory (e.g. "Default", "Profile 1").

**--user-data-dir**=_path_
> Custom user data directory.

**--app**=_url_
> Open the URL in a window without browser UI.

**--auto-open-devtools-for-tabs**
> Open DevTools automatically.

**--headless**
> Run without a visible window.

**--screenshot**[=_file_]
> Headless: save a screenshot of the page.

**--print-to-pdf**[=_file_]
> Headless: save the page as PDF.

**--remote-debugging-port**=_port_
> Expose the DevTools protocol on the given port.

**--proxy-server**=_host:port_
> Route traffic through a proxy.

**--disable-gpu**
> Disable GPU hardware acceleration.

**--disable-extensions**
> Start without extensions.

# DESCRIPTION

**msedge** launches the Microsoft Edge browser from the command line. Edge is Chromium-based, so it accepts most Chromium command-line switches, and supports automation, debugging and testing scenarios.

**msedge** is the executable name on Windows and inside /opt/microsoft/msedge on Linux, where the launchers on PATH are **microsoft-edge**, **microsoft-edge-stable**, **microsoft-edge-beta** and **microsoft-edge-dev**.

# CAVEATS

Switches only apply when a new browser process starts; if Edge is already running with the same profile, the URL is handed to the existing instance and most flags are ignored. Use a separate **--user-data-dir** to force a fresh instance.

# HISTORY

Microsoft Edge was first released in **2015** with the EdgeHTML engine. It was rebuilt on **Chromium** in January 2020, and a Linux version followed in 2020 (stable in 2021).

# SEE ALSO

[microsoft-edge](/man/microsoft-edge)(1), [google-chrome](/man/google-chrome)(1), [chromium](/man/chromium)(1), [firefox](/man/firefox)(1)

# RESOURCES

```[Homepage](https://www.microsoft.com/en-us/edge)```

```[Documentation](https://learn.microsoft.com/en-us/deployedge/)```

<!-- verified: 2026-09-29 -->
