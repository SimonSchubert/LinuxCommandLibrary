# TLDR

# TAGLINE

Lightweight Unicode terminal emulator for X11

# TLDR

Open new **window**

```urxvt```

Open in specific **directory**

```urxvt -cd [path/to/directory]```

Run **command**

```urxvt -e [command]```

Run command and **keep** open

```urxvt --hold -e [command]```

Run with **shell**

```urxvt -e sh -c [command]```

# SYNOPSIS

**urxvt** [_OPTIONS_]

# PARAMETERS

**-cd** _DIR_
> Start in specified directory

**-e** _COMMAND_
> Execute command instead of shell

**--hold**
> Keep window open after command exits

**-fn** _FONT_
> Specify font

**-fg** _COLOR_
> Foreground color

**-bg** _COLOR_
> Background color

# DESCRIPTION

**urxvt** (rxvt-unicode) is a highly customizable terminal emulator with Unicode support, transparency, and Perl extensions. It is known for being lightweight and fast while offering extensive customization through X resources.

Configuration is typically done through ~/.Xresources or command-line options.

# CAVEATS

Requires X11 display. Configuration through X resources may seem complex initially. Some features require Perl extensions to be enabled.

# SEE ALSO

[xterm](/man/xterm)(1), [st](/man/st)(1)
