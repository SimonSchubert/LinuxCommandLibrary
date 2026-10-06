# TAGLINE

Play visual effects over text in the terminal

# TLDR

Pipe a command through the **matrix** effect

```ls -la | tte matrix```

Pick an effect **at random**

```[command] | tte -R```

Read the text from a **file**

```tte -i [path/to/file] beams```

Show the options for **one effect**

```tte decrypt -h```

Limit a random choice to **named effects**

```[command] | tte -R --include-effects decrypt beams rain```

Print a **bash** completion script

```tte --print-completion bash```

# SYNOPSIS

[_command_] | **tte** [_options_] _effect_ [_effect-options_]

**tte** **-i** _file_ [_options_] _effect_ [_effect-options_]

# PARAMETERS

_effect_

> Effect to play. **tte** _effect_ **-h** lists that effect's own options.

**-i** _file_, **--input-file** _file_

> Read the input text from _file_ instead of standard input.

**-R**, **--random-effect**

> Choose an effect at random.

**--seed** _n_

> Seed the random effect choice.

**--include-effects** _name_...

> Effects **--random-effect** is allowed to choose. Names are separated by spaces.

**--exclude-effects** _name_...

> Effects **--random-effect** must not choose.

**--frame-rate** _fps_

> Target frames per second. **0** disables the limit. The default is **60**.

**--no-color**

> Draw the effect without color.

**--xterm-colors**

> Map 24-bit hex colors to the nearest xterm 256-color index.

**--terminal-background-color** _color_

> Terminal background, as an xterm index **0**-**255** or a hex RGB value **000000**-**ffffff**. Effects use it for fades.

**--existing-color-handling** _always|dynamic|ignore_

> What to do with ANSI colors already in the input. **always** keeps them, **dynamic** lets the effect decide, and **ignore** drops them. The default is **ignore**.

**--wrap-text**

> Wrap lines that are wider than the canvas.

**--canvas-width** _n_, **--canvas-height** _n_

> Canvas size. A positive integer sets that dimension, **0** follows the terminal, and **-1** follows the input text. Both default to **-1**.

**--anchor-canvas** _sw|s|se|e|ne|n|nw|w|c_

> Where the canvas sits in the terminal. The default is **sw**.

**--anchor-text** _n|ne|e|se|s|sw|w|nw|c_

> Where the input text sits inside the canvas. The default is **sw**.

**--tab-width** _n_

> Spaces per tab. Must be greater than zero.

**--ignore-terminal-dimensions**

> Draw the full canvas even when it is larger than the terminal.

**--reuse-canvas**

> Move the cursor up over the input's rows and draw there again, instead of adding new rows.

**--no-eol**

> Do not print a newline when the effect finishes.

**--no-restore-cursor**

> Leave the cursor hidden after the effect.

**-v**, **--version**

> Print the version and exit.

**--print-completion** _bash|zsh|powershell_

> Print a completion script and exit.

# DESCRIPTION

**tte** is the terminal program installed with the **terminaltexteffects** package. It reads text from a pipe or from **--input-file** and plays one built-in effect over it: rain, decrypt, beams, matrix, burn, and others. The animation uses ANSI sequences, runs in line, and tries to leave the terminal usable when it finishes.

Each effect adds its own flags, generated from that effect's configuration. **tte decrypt -h** shows them. The same engine can be called as **python -m terminaltexteffects** when the package is imported instead of installed as an application.

# CAVEATS

The effect set and some flags on the project's development branch are ahead of the last published package. A flag documented upstream can be missing from the **tte** that a package manager installed.

**--reuse-canvas** is reliable in a script that owns the screen. An interactive prompt between runs makes the cursor movement land in the wrong place.

**--random-effect** needs a terminal that can play the animation. **--no-color** and **--xterm-colors** are the escapes for terminals that cannot show 24-bit color.

# HISTORY

**terminaltexteffects** was created by **ChrisBuilds** and is written in **Python**. The installed command name is **tte**.

# INSTALL

```nix: nix profile install nixpkgs#terminaltexteffects```

<!-- packages: 2026-10-06 -->

# SEE ALSO

[terminaltexteffects](/man/terminaltexteffects)(1), [lolcat](/man/lolcat)(1), [figlet](/man/figlet)(1), [toilet](/man/toilet)(1)

# RESOURCES

```[Documentation](https://chrisbuilds.github.io/terminaltexteffects/)```

```[Source code](https://github.com/ChrisBuilds/terminaltexteffects)```

<!-- verified: 2026-10-06 -->
