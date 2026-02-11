# TAGLINE

Steam locomotive animation for typo correction

# TLDR

**Display a steam locomotive** animation

```sl```

**Show a smaller locomotive**

```sl -l```

**Make the locomotive fly**

```sl -F```

**Show an accident** (people crying for help)

```sl -a```

**Display the C51 locomotive** instead of D51

```sl -c```

**Allow interruption** with Ctrl+C

```sl -e```

**Combine options** for flying little locomotive with accident

```sl -alF```

# SYNOPSIS

**sl** [**-alFce**]

# PARAMETERS

**-a**
> An accident occurs; people appear crying for help

**-l**
> Display a smaller (little) locomotive

**-F**
> The locomotive flies across the screen

**-c**
> Show C51 locomotive instead of the default D51

**-e**
> Allow interrupt with Ctrl+C; normally you must wait

# DESCRIPTION

**sl** (Steam Locomotive) displays an ASCII art animation of a steam locomotive crossing the terminal. It was created as a humorous punishment for users who accidentally type **sl** instead of **ls** (list directory contents).

When executed, a detailed ASCII train animation scrolls across the screen from right to left. By default, the program ignores Ctrl+C, forcing users to watch the entire train pass—a gentle reminder to type more carefully.

The default locomotive is the **D51** (a Japanese steam locomotive). The **-c** option shows the alternative **C51** model. Options can be combined for effects like a flying miniature locomotive with passengers in distress.

# CAVEATS

By default, Ctrl+C is ignored, and you must wait for the animation to complete. Use **-e** to allow early termination. The animation may not display correctly in terminals with very small dimensions.

# HISTORY

**sl** was created by **Toyoda Masashi** in **1993** at the University of Tokyo. It was designed as a joke program to discourage the common typo of typing sl instead of ls. The program has become a beloved piece of Unix humor and is available in most Linux distribution repositories.

# SEE ALSO

[ls](/man/ls)(1), [cowsay](/man/cowsay)(1), [fortune](/man/fortune)(6), [figlet](/man/figlet)(6)
