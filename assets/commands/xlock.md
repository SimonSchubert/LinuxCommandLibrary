# TAGLINE

Lock X display with screensaver

# TLDR

**Lock screen immediately**

```xlock```

**Lock with specific mode**

```xlock -mode [blank]```

**Lock with message**

```xlock -message "[Away from desk]"```

**Lock without password (demo mode)**

```xlock -nolock```

**Lock with specific timeout**

```xlock -timeout [30]```

**List available modes**

```xlock -help```

# SYNOPSIS

**xlock** [_options_]

# PARAMETERS

**-mode** _name_
> Display mode (blank, life, maze, etc.).

**-message** _text_
> Message to display on lock screen.

**-nolock**
> Demo mode; no password required.

**-timeout** _seconds_
> Password timeout in seconds.

**-echokeys**
> Echo characters when typing password.

**-usefirst**
> Use first character of password prompt.

**-allowaccess**
> Allow X clients while locked.

**-remote**
> Allow remote locking.

# DESCRIPTION

**xlock** locks the X display until the user enters their password. While locked, the screen displays a configurable animation or pattern, and new X server connections are refused.

Multiple display modes provide visual effects during lock. The blank mode simply blacks out the screen, while others show animations like life simulation, mazes, or geometric patterns.

The tool blanks the screen, hides the mouse cursor, and requires the user's system password to unlock. All keyboard and mouse input is captured until authentication succeeds.

# CAVEATS

X11 screen lockers have fundamental security limitations. Consider xsecurelock for higher security needs. Settings like -allowaccess reduce security. May not prevent all bypass methods on X11.

# HISTORY

**xlock** has been part of X11 utilities since the early days of the X Window System. While functional, modern alternatives like xsecurelock address various security concerns inherent to X11's architecture that traditional screen lockers cannot fully mitigate.

# SEE ALSO

[xscreensaver](/man/xscreensaver)(1), [xsecurelock](/man/xsecurelock)(1), [physlock](/man/physlock)(1), [i3lock](/man/i3lock)(1)
