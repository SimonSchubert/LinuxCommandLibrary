# TAGLINE

Interactive URL selector from text files

# TLDR

**Extract URLs from a file** and display interactive menu

```urlview [path/to/file]```

**Extract URLs from multiple files**

```urlview [file1] [file2] [file3]```

**Extract URLs from stdin** (e.g., piped from mutt)

```cat [path/to/email.txt] | urlview```

**Read from stdin** explicitly using dash

```command | urlview -```

**Jump to a specific line number** in the URL list

```urlview -[5] [path/to/file]```

# SYNOPSIS

**urlview** _filename_ [_filename_...]

# PARAMETERS

_filename_
> One or more text files to scan for URLs. If no files specified, reads from stdin. Use `-` to explicitly read from stdin.

**-**_number_
> Jump to the specified line number in the URL list.

# DESCRIPTION

**urlview** is a screen-oriented utility that extracts URLs from text files and displays an interactive menu for launching them in a browser. It scans input using a regular expression to identify URLs and presents a navigable list.

The tool is commonly used with terminal email clients like **mutt**, allowing users to quickly access links embedded in messages. When a URL is selected from the menu, urlview launches the configured browser or URL handler.

Configuration is read from ~/.urlview or /etc/urlview/system.urlview. The configuration file supports the following directives: REGEXP (custom URL matching pattern), COMMAND (URL launch command with %s placeholder), WRAP (yes/no for long URL wrapping), QUITONLAUNCH (exit after launching a URL).

The default handler is url_handler.sh, but the BROWSER environment variable can override this with a browser command or colon-delimited list of browsers to try.

# CAVEATS

The default URL regular expression may not match all valid URL formats. Complex URLs with special characters may require configuration adjustments. urlview works best with plain text; for emails with MIME encoding, consider **urlscan** which handles quoted-printable and base64 encodings.

# HISTORY

**urlview** was originally written by **Michael Elkins**, the creator of the mutt email client, in the late **1990s**. It was designed to complement mutt by providing easy URL handling in a terminal environment. The tool has been maintained by various contributors and remains a standard utility for terminal-based email workflows.

# SEE ALSO

[urlscan](/man/urlscan)(1), [mutt](/man/mutt)(1), [lynx](/man/lynx)(1), [xdg-open](/man/xdg-open)(1)
