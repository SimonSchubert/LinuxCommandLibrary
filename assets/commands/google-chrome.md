# TAGLINE

Google Chrome web browser

# TLDR

**Start** Chrome

```google-chrome```

**Open one or more URLs**

```google-chrome [https://example.com] [https://wikipedia.org]```

**Open in incognito** mode

```google-chrome --incognito [url]```

**Take a headless screenshot** of a page

```google-chrome --headless --disable-gpu --screenshot=[out.png] --window-size=[1280,800] [url]```

**Save a page as PDF**

```google-chrome --headless --disable-gpu --print-to-pdf=[out.pdf] [url]```

**Dump the rendered DOM** to stdout

```google-chrome --headless --disable-gpu --dump-dom [url]```

**Launch for remote debugging** (DevTools Protocol)

```google-chrome --headless --disable-gpu --remote-debugging-port=[9222]```

**Use an isolated profile** directory

```google-chrome --user-data-dir=[/tmp/chrome-profile]```

# SYNOPSIS

**google-chrome** [_options_] [_urls_...]

# PARAMETERS

_urls_
> One or more URLs or local file paths to open.

**--incognito**
> Start a new incognito (private) window.

**--new-window**
> Open the URL in a new window instead of a new tab.

**--headless**
> Run without a visible UI. Modern builds default to the "new" headless mode; pass `--headless=old` for the legacy implementation.

**--disable-gpu**
> Disable GPU hardware acceleration. Traditionally required together with `--headless` on Linux/Windows.

**--screenshot**[=_file_]
> In headless mode, save a PNG screenshot (default `screenshot.png`).

**--print-to-pdf**[=_file_]
> In headless mode, save the rendered page as PDF (default `output.pdf`).

**--dump-dom**
> Print the serialized DOM of the target page to stdout.

**--window-size** _W,H_
> Set the initial window size (useful for consistent screenshots).

**--remote-debugging-port** _port_
> Enable the DevTools Protocol on the given TCP port for automation tools like Puppeteer or ChromeDriver.

**--no-sandbox**
> Disable the sandbox. Sometimes required inside Docker containers; never use for untrusted content.

**--disable-dev-shm-usage**
> Avoid using `/dev/shm`, which is often too small in containers and CI.

**--disable-extensions**
> Start with all extensions disabled.

**--no-first-run**
> Skip the first-run experience and welcome prompts (useful in CI).

**--proxy-server** _url_
> Route traffic through the specified HTTP/SOCKS proxy.

**--user-data-dir** _dir_
> Use a custom profile directory (enables fully isolated sessions).

**--app** _url_
> Open the URL as a chromeless standalone app window.

# DESCRIPTION

**google-chrome** is Google's proprietary build of the open-source Chromium browser. It ships the Blink rendering engine and the V8 JavaScript engine together with a multi-process, sandboxed architecture, synchronization with a Google account, and the Chrome Web Store extension ecosystem.

The command-line interface accepts hundreds of switches and is widely used for automation, testing, and scraping. Headless mode, combined with `--screenshot`, `--print-to-pdf`, `--dump-dom`, or `--remote-debugging-port`, makes Chrome a popular backend for tools like Puppeteer, Playwright, and ChromeDriver.

# CONFIGURATION

**~/.config/google-chrome/**
> Default user profile directory containing bookmarks, history, extensions, preferences, and cached data.

**chrome://flags**
> In-browser page listing experimental features that can be toggled independently of command-line switches.

# CAVEATS

Chrome is resource-intensive; a typical session uses multiple processes and significant RAM. Many command-line switches are undocumented, version-specific, and may be removed without notice; the canonical reference is [peter.sh/experiments/chromium-command-line-switches](https://peter.sh/experiments/chromium-command-line-switches/). **--no-sandbox** weakens Chrome's security model and should only be used for trusted content. In containers/CI, pair `--headless` with `--disable-gpu`, `--disable-dev-shm-usage`, and `--no-first-run` for reliability.

# HISTORY

**Google Chrome** was first released in **September 2008** on Windows and expanded to Linux and macOS in 2010. Built on the open-source Chromium project, it introduced a sandboxed, per-tab process model and the V8 JavaScript engine, and has grown into the world's most-used web browser.

# SEE ALSO

[chromium](/man/chromium)(1), [firefox](/man/firefox)(1)
