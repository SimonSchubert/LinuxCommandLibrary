# TLDR

**Display confetti** animation in the terminal

```confettysh```

**Run with custom duration** in seconds

```confettysh --duration [5]```

**Use specific colors**

```confettysh --colors "[red,green,blue,yellow]"```

**Set particle count**

```confettysh --count [100]```

**Adjust animation speed**

```confettysh --speed [2.0]```

**Run after a command completes** successfully

```[some_command] && confettysh```

# SYNOPSIS

**confettysh** [_options_]

# PARAMETERS

**--duration** _SECONDS_
> How long the animation runs (default: 3).

**--colors** _COLORS_
> Comma-separated list of colors to use.

**--count** _NUMBER_
> Number of confetti particles.

**--speed** _MULTIPLIER_
> Animation speed multiplier.

**--no-emoji**
> Use ASCII characters instead of emoji.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Display version information.

# DESCRIPTION

**confettysh** is a terminal tool that displays a colorful confetti animation. It's designed for celebrating successful command completions, build finishes, or just adding some fun to terminal workflows.

The animation uses Unicode characters or ASCII art to create falling confetti particles across the terminal window. Colors can be customized to match themes or preferences. The tool respects terminal dimensions and adapts to window size.

confettysh is often used in scripts to provide visual feedback when long-running tasks complete, such as deployment pipelines, test suites, or build processes. It adds a moment of celebration to otherwise text-heavy terminal work.

# CAVEATS

Requires a terminal with Unicode support for best results. Animation may appear differently depending on terminal emulator and font. The **--no-emoji** flag provides compatibility with terminals lacking Unicode support.

# HISTORY

confettysh emerged from the trend of adding visual flair to terminal applications. Similar to other terminal celebration tools, it was inspired by web-based confetti animations and adapted for command-line use, providing developers a way to make terminal workflows more engaging.

# SEE ALSO

[sl](/man/sl)(1), [cowsay](/man/cowsay)(1), [lolcat](/man/lolcat)(1), [figlet](/man/figlet)(1)
