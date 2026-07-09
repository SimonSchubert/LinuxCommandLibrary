# TAGLINE

Convert ANSI escape sequences to HTML

# TLDR

**Convert colored terminal output to HTML**

```ls --color=always | aha > ls.html```

**Convert a man page** (preserving formatting) to HTML

```MAN_KEEP_FORMATTING=1 man command | ul | aha > man.html```

**Convert from a file** with black background and title

```aha -f input.txt --black --title "My Log" > output.html```

**Add custom CSS** and enable word wrap

```command | aha --css style.css --word-wrap > output.html```

**Use pink background**

```command | aha --pink > output.html```

# SYNOPSIS

**aha** [_options_] [_-f file_]

# DESCRIPTION

**aha** (Ansi HTML Adapter) reads text containing ANSI SGR escape sequences (colors, bold, underline, etc.) from a file or stdin and writes a complete, standards-compliant HTML document to stdout.

It is commonly used to publish colored terminal sessions, diffs, logs, or interactive tool output (htop, git, ls --color, etc.) on the web while preserving the original appearance.

aha supports several output customizations such as forcing a black or pink background, setting the HTML document title, injecting an external CSS stylesheet, and enabling word-wrap.

# PARAMETERS

**-f**, **--file** _file_
> Read input from _file_ instead of stdin.

**-b**, **--black**
> Use a black background in the generated HTML.

**-p**, **--pink**
> Use a pink background in the generated HTML.

**-t**, **--title** _title_
> Set the HTML `<title>`.

**-c**, **--css** _file_
> Link an external CSS stylesheet.

**-w**, **--word-wrap**
> Enable word wrapping to avoid horizontal scrollbars.

**-h**, **--help**
> Show help.

# CAVEATS

For tools that change output based on whether stdout is a tty (e.g. `ls`, `grep`), you must force color with flags such as `--color=always`.

Some programs (htop, man) emit additional control sequences; piping through `ul` or using specific flags may be required for best results.

# SEE ALSO

ansi2html, html2text

# RESOURCES

```[Source code](https://github.com/theZiz/aha)```

```[Homepage](https://theziz.github.io/aha/)```

<!-- verified: 2026-07-09 -->
