# TLDR

**Lock** display

```xtrlock```

Lock with **blank** screen

```xtrlock -b```

Lock and **fork** to background

```xtrlock -f```

# SYNOPSIS

**xtrlock** [_OPTIONS_]

# PARAMETERS

**-b**
> Blank the screen in addition to locking

**-f**
> Fork to background and return immediately

# DESCRIPTION

**xtrlock** locks the X display until the user supplies their password. While locked, the cursor changes to a padlock icon and keyboard input is captured for authentication.

The lock is transparent, showing the desktop but preventing interaction.

# CAVEATS

X11 only. Does not blank screen by default. Requires proper PAM configuration for authentication.

# SEE ALSO

[xlock](/man/xlock)(1), [i3lock](/man/i3lock)(1), [vlock](/man/vlock)(1)
