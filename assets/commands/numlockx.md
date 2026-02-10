# TAGLINE

controls the Num Lock key state in X11 sessions

# TLDR

Show the current **number lock status**

```numlockx status```

Turn the number lock **on**

```numlockx on```

Turn the number lock **off**

```numlockx off```

**Toggle** the current state

```numlockx toggle```

# SYNOPSIS

**numlockx** [_on_|_off_|_toggle_|_status_]

# PARAMETERS

**on**
> Turn Num Lock on

**off**
> Turn Num Lock off

**toggle**
> Toggle current Num Lock state

**status**
> Display current Num Lock state

# DESCRIPTION

**numlockx** controls the Num Lock key state in X11 sessions. It's commonly used in login scripts or desktop startup files to ensure Num Lock is in the desired state when a session begins.

The command directly manipulates the keyboard LED and state through X11, making it useful for systems where the BIOS Num Lock setting doesn't persist or for users who prefer a specific Num Lock state at login.

Without arguments, numlockx turns Num Lock on (equivalent to **numlockx on**).

# CAVEATS

Only works in X11 sessions; does not work in Wayland or virtual consoles. The state may be reset by some desktop environments during login. For console Num Lock control, use **setleds** instead.

# SEE ALSO

[setleds](/man/setleds)(1), [xset](/man/xset)(1), [xdotool](/man/xdotool)(1)
