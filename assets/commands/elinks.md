# TLDR

**Open a URL** in the text browser

```elinks [https://example.com]```

**Open in a new window** instead of tab

```elinks -new-window [https://example.com]```

**Dump page content** to stdout (non-interactive)

```elinks -dump [https://example.com]```

**Dump with numbered links**

```elinks -dump -dump-width [80] [https://example.com]```

**Open from a bookmarks file**

```elinks [path/to/bookmarks.html]```

**Start with a specific configuration**

```elinks -config-dir [/path/to/config]```

**Render HTML from stdin**

```echo "[<h1>Hello</h1>]" | elinks -dump```

**Open without loading config**

```elinks -no-home [https://example.com]```

# SYNOPSIS

**elinks** [_-dump_] [_-source_] [_-no-home_] [_-config-dir path_] [_url_]

# PARAMETERS

**-dump**
> Render page to stdout and exit (non-interactive).

**-dump-width** _n_
> Width for dumped output (default: 80).

**-source**
> Print page source instead of rendering.

**-no-home**
> Don't use or create a home directory for config.

**-config-dir** _path_
> Use alternate configuration directory.

**-anonymous**
> Restrict to safe operations (for public terminals).

**-new-window**
> Open URL in new window instead of tab.

**-remote** _command_
> Send command to running ELinks instance.

**-version**
> Print version information.

**-help**
> Display help.

# DESCRIPTION

**ELinks** is a feature-rich text-mode web browser for terminals. It renders HTML pages with support for tables, frames, colors, and forms, providing a usable web experience without a graphical interface.

The browser supports tabbed browsing, bookmarks, history, cookies, HTTP authentication, and downloads. Navigation uses keyboard shortcuts: **g** for go to URL, **d** to download, **Tab** to move between links, **Enter** to follow links, and **q** to quit.

ELinks can execute JavaScript (when compiled with SpiderMonkey support), handle CSS styling to some extent, and render complex layouts better than simpler browsers like Lynx. Forms, including multi-select and file uploads, work properly.

The **-dump** mode is particularly useful for scripts, converting web pages to plain text. Combined with shell pipes, it enables command-line web scraping. The output respects terminal width and formats tables as text.

Configuration is stored in **~/.elinks/** including options, bookmarks, cookies, and history. The setup manager (press **o** in the browser) provides an interactive interface for customization.

# CAVEATS

JavaScript support is limited compared to modern browsers. Some CSS-heavy sites may not render well. HTTPS requires proper SSL library support. Memory usage can be high with many tabs. Flash and other plugins are not supported.

# HISTORY

**ELinks** is a fork of **Links** browser that began in **2001**, adding features like tabs, mouse support, and improved rendering. The name stands for "Extended Links." While active development has slowed, it remains popular for server administration and terminal-centric workflows.

# SEE ALSO

[lynx](/man/lynx)(1), [w3m](/man/w3m)(1), [links](/man/links)(1), [curl](/man/curl)(1), [wget](/man/wget)(1)
