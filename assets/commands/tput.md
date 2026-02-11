# TAGLINE

Query and set terminal capabilities

# TLDR

**Set bold text**

```tput bold```

**Set foreground color** (0-7: black, red, green, yellow, blue, magenta, cyan, white)

```tput setaf [2]```

**Set background color**

```tput setab [4]```

**Reset all attributes** to default

```tput sgr0```

**Clear the screen**

```tput clear```

**Get terminal width** in columns

```tput cols```

**Get terminal height** in lines

```tput lines```

**Move cursor** to row and column

```tput cup [5] [10]```

# SYNOPSIS

**tput** [**-T** _type_] _capname_ [_parameters_...]

# PARAMETERS

**-T** _type_
> Specify terminal type; defaults to $TERM environment variable

**-S**
> Read capabilities from stdin, allowing multiple operations

**-V**
> Print ncurses version and exit

# COMMON CAPABILITIES

**bold**
> Enable bold mode

**dim**
> Enable half-bright/dim mode

**smul** / **rmul**
> Start/end underline mode

**rev**
> Enable reverse video mode

**blink**
> Enable blinking text

**smso** / **rmso**
> Start/end standout mode

**sgr0**
> Reset all attributes to default

**setaf** _n_
> Set foreground color (0-7 or 0-255)

**setab** _n_
> Set background color

**clear**
> Clear screen and move cursor home

**cup** _row_ _col_
> Move cursor to position

**cols**
> Print number of columns

**lines**
> Print number of lines

**sc** / **rc**
> Save/restore cursor position

**civis** / **cnorm**
> Hide/show cursor

# DESCRIPTION

**tput** queries the terminfo database to output terminal-dependent capabilities. It provides a portable way to control terminal features like colors, cursor positioning, and text attributes without hardcoding escape sequences.

The command uses the **$TERM** environment variable to determine the terminal type and looks up the appropriate escape sequences. This makes scripts portable across different terminal emulators.

Color numbers 0-7 represent basic colors: black (0), red (1), green (2), yellow (3), blue (4), magenta (5), cyan (6), white (7). Extended color terminals support 256 colors (0-255).

Common usage in scripts combines capabilities: **$(tput bold)$(tput setaf 1)Error$(tput sgr0)** prints "Error" in bold red, then resets.

# CAVEATS

Capabilities vary by terminal type; not all terminals support all features. Always reset attributes with **sgr0** after use to avoid affecting subsequent output. The **-T** option should match the actual terminal for correct behavior.

# HISTORY

**tput** was introduced in **System V Unix** in the early 1980s as part of the terminfo system, which replaced the older termcap. The ncurses implementation provides the tput command on most Linux systems today. It was designed to abstract terminal-specific escape codes behind a consistent interface.

# SEE ALSO

[terminfo](/man/terminfo)(5), [infocmp](/man/infocmp)(1), [tic](/man/tic)(1), [clear](/man/clear)(1), [reset](/man/reset)(1)
