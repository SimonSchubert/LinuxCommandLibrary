# TAGLINE

Set terminal attributes such as colors, cursor, and screen blanking

# TLDR

**Clear** the screen and home the cursor

```setterm --clear```

Turn the **cursor** on or off

```setterm --cursor [off]```

Set the **text color**

```setterm --foreground=[red]```

Set the **background color**

```setterm --background=[black]```

Turn **bold** text on or off

```setterm --bold [on]```

Set the **screen blanking** timeout in minutes (`0` disables it)

```setterm --blank=[10]```

**Reset** the terminal toward its power-on state

```setterm --reset```

**Dump** the current virtual console to a file

```setterm --dump --file [screen.dump]```

# SYNOPSIS

**setterm** [_options_]

# PARAMETERS

Boolean options take **on** or **off**; the default is **on**. Write optional arguments as **--option=argument**.

**--foreground** _8-color_|**default**
> Set the foreground text color. An 8-color is **black**, **red**, **green**, **yellow**, **blue**, **magenta**, **cyan**, or **white**.

**--background** _8-color_|**default**
> Set the background text color.

**--ulcolor** _16-color_
> Color for underlined characters. A 16-color is an 8-color, **grey**, or **bright** followed by an 8-color (except black). Virtual consoles only.

**--hbcolor** _16-color_
> Color for half-bright characters.

**--bold on**|**off**
> Extra-bright (bold) mode. Except on a virtual console, **--bold off** turns off bold, half-brightness, blink, and reverse together.

**--half-bright on**|**off**
> Dim (half-brightness) mode. Except on a virtual console, **off** also turns off bold, blink, and reverse.

**--blink on**|**off**
> Blink mode. Except on a virtual console, **off** also turns off bold, half-brightness, and reverse.

**--underline on**|**off**
> Underline mode.

**--reverse on**|**off**
> Reverse-video mode. Except on a virtual console, **off** also turns off bold, half-brightness, and blink.

**--inversescreen on**|**off**
> Swap foreground and background colors for the whole screen.

**--cursor on**|**off**
> Show or hide the terminal cursor.

**--clear**[=**all**|**rest**]
> With no argument or **all**, clear the whole screen and home the cursor (like **clear**(1)). With **rest**, clear from the cursor to the end of the screen.

**--reset**
> Write the terminal reset string, which typically restores power-on state.

**--initialize**
> Write the terminal initialization string (rendering options and related attributes back to defaults).

**--default**
> Set rendering options to the default values.

**--store**
> Store the current foreground and background as the reset-to-default colors. Virtual consoles only.

**--blank**[=_0-60_|**force**|**poke**]
> Blank after this many minutes of inactivity. With no argument, print which VT is blanked (0 means unblanked). **force** keeps the screen blank even if a key is pressed. **poke** unblanks. Virtual consoles only.

**--powersave** _mode_
> VESA powersave: **vsync**|**on**, **hsync**, **powerdown**, or **off**.

**--powerdown**[=_0-60_]
> VESA powerdown interval in minutes. No argument defaults to 0 (disabled).

**--bfreq**[=_number_]
> Bell frequency in Hertz. No argument defaults to 0. Virtual consoles only.

**--blength**[=_0-2000_]
> Bell duration in milliseconds. No argument defaults to 0. Virtual consoles only.

**--dump**[=_console_number_]
> Snapshot that virtual console into the file given by **--file** (default **screen.dump**). No argument dumps the current console. Overrides **--append**.

**--append** _console_number_
> Like **--dump**, but appends. Only works when no **--dump** is given.

**--file** _filename_
> Snapshot path for **--dump** / **--append**. Default is **screen.dump** in the current directory.

**--msg on**|**off**
> Allow kernel printk messages on the console. Virtual consoles only.

**--msglevel** _0-8_
> Console log level for kernel messages. 0 is like **--msg on**; 8 prints all kernel messages. Virtual consoles only.

**--linewrap on**|**off**
> Continue on a new line when the current line is full.

**--repeat on**|**off**
> Keyboard repeat. Virtual consoles only.

**--appcursorkeys on**|**off**
> Cursor Key Application Mode. Virtual consoles only.

**--tabs**[=_tab1 tab2_...]
> Set tab stops at those columns (1–160). With no arguments, print the current tab stops.

**--clrtabs**[=_tab1 tab2_...]
> Clear those tab stops. With no arguments, clear all. Virtual consoles only.

**--regtabs**[=_1-160_]
> Clear all tabs, then set a regular stop every N columns (default 8). Virtual consoles only.

**--resize**
> Reassess maximum row and column and reset the terminal size. Useful when the kernel driver and the real geometry have drifted, especially on serial consoles.

**--term** _terminal_name_
> Override the **TERM** environment variable.

**--help**
> Print help and exit.

**--version**
> Print version and exit.

# DESCRIPTION

**setterm** writes a character string to standard output that invokes the requested terminal capabilities. Where possible it consults **terminfo**(5) for the string to send. Options marked as virtual-console-only have no terminfo equivalent; for those, if the terminal type is **con** or **linux**, setterm emits the sequence used on the PC Minix virtual console. Capabilities the terminal does not implement are ignored.

Color options can be set independently, at least on virtual consoles, but combining modes (for example **--underline** with **--half-bright**) is hardware-dependent.

Since util-linux 2.25, long options accept two hyphens (**--help**) as well as the older single-hyphen form (**-help**). Scripts that must run on older util-linux should keep the single hyphen.

# CAVEATS

Redirect both stdin and stdout to the same device when piping: some options operate on stdin, so redirecting only stdout can apply the change to the wrong terminal. Many options work only on Linux virtual consoles. On other terminals, **--bold off**, **--blink off**, **--half-bright off**, and **--reverse off** each clear bold, half-brightness, blink, and reverse together.

# HISTORY

**setterm** is part of the **util-linux** package. It grew as a Linux console helper that maps named attributes onto terminfo strings, with extra sequences for the kernel’s virtual consoles.

# INSTALL

```apt: sudo apt install util-linux```

```dnf: sudo dnf install util-linux```

```pacman: sudo pacman -S util-linux```

```apk: sudo apk add util-linux-misc```

```zypper: sudo zypper install util-linux```

```brew: brew install util-linux```

```nix: nix profile install nixpkgs#util-linux```

<!-- packages: 2026-10-18 -->

# SEE ALSO

[tput](/man/tput)(1), [stty](/man/stty)(1), [clear](/man/clear)(1), [reset](/man/reset)(1), [tty](/man/tty)(1)

# RESOURCES

```[Source code](https://github.com/util-linux/util-linux)```

```[Documentation](https://man7.org/linux/man-pages/man1/setterm.1.html)```

<!-- verified: 2026-10-18 -->
