# TAGLINE

Display files with pride flag colors

# TLDR

Print file in **pride colors**

```pridecat file.txt```

Print in **trans** pride colors

```pridecat --trans file.txt```

Print in **bisexual** pride colors

```pridecat --bi file.txt```

Print in **lesbian** pride colors

```pridecat --lesbian file.txt```

Apply colors to **background**

```pridecat -b file.txt```

Pipe command output through **pridecat**

```ls | pridecat --rainbow```

# SYNOPSIS

**pridecat** [_options_] [_file_]

# DESCRIPTION

**pridecat** is a colorful alternative to cat that displays file contents with pride flag colors. It supports various pride flags and can colorize both foreground text and backgrounds.

# PARAMETERS

**--rainbow**
> Use rainbow pride flag colors (default)

**--trans, --transgender**
> Use transgender pride flag colors

**--bi, --bisexual**
> Use bisexual pride flag colors

**--lesbian**
> Use lesbian pride flag colors

**--gay**
> Use gay pride flag colors

**--pan, --pansexual**
> Use pansexual pride flag colors

**--nb, --nonbinary**
> Use non-binary pride flag colors

**--ace, --asexual**
> Use asexual pride flag colors

**-b, --background**
> Apply colors to background instead of text

**-f, --force**
> Force color output even when not a terminal

**-h, --help**
> Display help information

# CAVEATS

Colors are applied as ANSI escape sequences. Output may not display correctly in terminals without color support. Multiple flag options can be combined to alternate between flags.

# HISTORY

**pridecat** was created as a fun, colorful alternative to cat, allowing users to display file contents decorated with pride flag colors.

# SEE ALSO

[cat](/man/cat)(1), [lolcat](/man/lolcat)(1)
