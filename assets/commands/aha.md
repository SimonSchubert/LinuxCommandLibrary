# TAGLINE

Convert ANSI escape sequences to HTML

# TLDR

**Convert colored terminal output to HTML**

```ls --color=always | aha > ls.html```

**Convert a man page** (preserving formatting) to HTML

```MAN_KEEP_FORMATTING=1 man command | ul | aha > man.html```

**Convert from a file** with black background and title

```aha -f input.txt --black --title "My Log" > output.html```

**Handle cursor-position sequences** (e.g. htop)

```echo q | htop | aha --black --line-fix > htop.html```

**Add custom CSS** and enable word wrap

```command | aha --css style.css --word-wrap > output.html```

**Use pink background**

```command | aha --pink > output.html```

# SYNOPSIS

**aha** [_options_] [_-f file_]

# DESCRIPTION

**aha** (Ansi HTML Adapter) reads text containing ANSI SGR escape sequences (colors, bold, underline, etc.) from a file or stdin and writes a complete, standards-compliant HTML document to stdout.

It is commonly used to publish colored terminal sessions, diffs, logs, or interactive tool output (htop, git, ls --color, etc.) on the web while preserving the original appearance.

aha supports several output customizations such as forcing a black or pink background, setting the HTML document title, injecting an external CSS stylesheet, enabling word-wrap, and emitting stylesheet-based styles instead of inline styles.

# PARAMETERS

**-f**, **--file** _file_
> Read input from _file_ instead of stdin.

**-b**, **--black**
> Use a black background with white text.

**-p**, **--pink**
> Use a pink background.

**-t**, **--title** _title_
> Set the HTML `<title>` (default: stdin or the input filename).

**-c**, **--css** _file_
> Link an external CSS stylesheet (`<link rel="stylesheet" href="...">`).

**-s**, **--stylesheet**
> Use a stylesheet instead of inline styles.

**-w**, **--word-wrap**
> Enable word wrapping to avoid horizontal scrollbars.

**-l**, **--line-fix**
> Fix inputs that use control sequences to change the cursor position (needed for tools like htop). Hot fix; may not work with every program.

**-n**, **--no-header**
> Do not wrap output in `<html>`, `<head>`, and `<body>` tags.

**-r**, **--ignore-cr**
> Ignore carriage returns (`\r`), which may otherwise produce double newlines in HTML.

**-i**, **--iso** _X_
> Use ISO-8859-_X_ (1–16) instead of UTF-8 for the output.

**-y**, **--style** _STYLE_
> Append _STYLE_ to the `<body>` element style after other style parameters.

**-L**, **--lang** _LANG_
> Set the document language to ISO-639-1 code _LANG_.

**-x**, **--no-xml**
> Use HTML doctype instead of XML (may help older browsers).

**-v**, **--version**
> Print version number and exit.

**-h**, **--help**
> Show help.

# CAVEATS

For tools that change output based on whether stdout is a tty (e.g. `ls`, `grep`), you must force color with flags such as `--color=always`.

Some programs (htop, man) emit additional control sequences; piping through `ul` or using `--line-fix` may be required for best results. Blinking text needs `--stylesheet` and a custom `.blink` CSS class on modern browsers.

# INSTALL

```apt: sudo apt install aha```

```dnf: sudo dnf install aha```

```pacman: sudo pacman -S aha```

```apk: sudo apk add aha```

```zypper: sudo zypper install aha```

```brew: brew install aha```

```nix: nix profile install nixpkgs#aha```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[ul](/man/ul)(1)

# RESOURCES

```[Source code](https://github.com/theZiz/aha)```

<!-- verified: 2026-07-11 -->
