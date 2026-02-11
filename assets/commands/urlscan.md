# TAGLINE

Extract and browse URLs from text or email

# TLDR

**Extract URLs from email**

```urlscan < [email.txt]```

**Pipe content to urlscan**

```cat [file.txt] | urlscan```

**Compact list view**

```urlscan -c < [email.txt]```

**Print URLs without browser**

```urlscan -n < [email.txt]```

**Remove duplicate URLs**

```urlscan -d < [email.txt]```

**Run custom command on URL**

```urlscan --run "[wget {}]" < [email.txt]```

**Generate config file**

```urlscan --genconf```

# SYNOPSIS

**urlscan** [_options_] < _message_

# PARAMETERS

**-c**, **--compact**
> Display simple list without context.

**-d**, **--dedupe**
> Remove duplicate URLs.

**-n**, **--no-browser**
> Print URLs to stdout, no interactive mode.

**-r**, **--run** _command_
> Run command with URL as argument (use {} placeholder).

**-f**, **--run-safe** _command_
> Safely run command with URL.

**-p**, **--pipe**
> Pipe URL to command instead of argument.

**-R**, **--reverse**
> Reverse displayed order.

**-s**, **--single**
> Exit after opening one URL.

**-w**, **--width** _n_
> Set display width.

**-W**, **--whitespace-off**
> Condense display output.

**-H**, **--nohelp**
> Start with help header hidden.

**-g**, **--genconf**
> Generate default config file.

**-E**, **--regex** _pattern_
> Custom regex for URL extraction.

# KEYBOARD SHORTCUTS

**Enter**: Open URL in browser

**c**: Toggle context view

**C**: Copy URL to clipboard

**P**: Copy URL to primary selection

**R**: Reverse URL order

**q**: Quit

**F1**: Show help

# DESCRIPTION

**urlscan** extracts and displays URLs from email messages or text files in an interactive terminal interface. It is primarily designed for use with mutt and other terminal mail clients.

The tool parses input for URLs and presents them in a navigable list with surrounding context. URLs can be opened in a browser, copied to clipboard, or passed to custom commands.

Configuration is stored in ~/.config/urlscan/config.json. Custom URL patterns can be defined with --regex for specialized extraction.

# CAVEATS

Reads from stdin only. Designed primarily for email messages. Some URL patterns may not be recognized without custom regex. Browser opening uses Python webbrowser module or xdg-open.

# HISTORY

**urlscan** was created as a replacement for urlview, providing better URL extraction and a more modern interface. It integrates well with mutt and other terminal-based mail readers in the Unix tradition.

# SEE ALSO

[mutt](/man/mutt)(1), [urlview](/man/urlview)(1), [xdg-open](/man/xdg-open)(1)
