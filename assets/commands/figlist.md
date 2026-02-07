# TAGLINE

figlet font listing utility

# TLDR

**List available figlet fonts**

```figlist```

# SYNOPSIS

**figlist** [_options_]

# DESCRIPTION

**figlist** enumerates all installed figlet fonts and control files by scanning the default figlet font directory, typically /usr/share/figlet. It provides a simple way to discover available font names for use with the figlet command.

The output includes both .flf font files and .flc control files, showing the complete set of available character rendering options. This is more convenient than manually browsing the font directory.

figlist is particularly useful when exploring different text banner styles or writing scripts that need to verify font availability before rendering.

# SEE ALSO

[figlet](/man/figlet)(6), [showfigfonts](/man/showfigfonts)(6)

