# TAGLINE

Preview GitHub-flavored Markdown in a browser

# TLDR

**Preview a markdown file** (opens browser with live reload)

```gh markdown-preview [README.md]```

**Preview in dark mode**

```gh markdown-preview --dark-mode [file.md]```

**Preview on a specific port**

```gh markdown-preview --port [8080] [file.md]```

**Preview without auto-opening** the browser

```gh markdown-preview --disable-auto-open [file.md]```

# SYNOPSIS

**gh markdown-preview** [_options_] [_file_]

# PARAMETERS

**--dark-mode**
> Force dark mode rendering.

**--light-mode**
> Force light mode rendering.

**-p**, **--port** _port_
> TCP port for the local server (default: 3333).

**--host** _hostname_
> Hostname to bind the server to (default: localhost).

**--disable-auto-open**
> Do not automatically open the browser.

**--disable-reload**
> Disable live reloading on file changes.

**--verbose**
> Show verbose output.

**--version**
> Show version.

# DESCRIPTION

**gh markdown-preview** is a GitHub CLI extension that starts a local web server to preview Markdown files with GitHub-accurate rendering. It uses the GitHub Markdown API and CSS extracted from the GitHub website to produce output that looks exactly as it will appear on GitHub.

The extension supports live reloading, so edits to the file are reflected in the browser automatically. If no file is specified, it detects and opens the README in the current directory.

Install with: **gh extension install yusukebe/gh-markdown-preview**.

# CAVEATS

Requires the GitHub CLI (**gh**) and an internet connection for the GitHub Markdown API. The rendered output depends on GitHub's API availability. This is a community extension, not a built-in gh command.

# SEE ALSO

[gh](/man/gh)(1), [glow](/man/glow)(1)
