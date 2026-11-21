# TAGLINE

Digital clock, timer, and stopwatch for the terminal

# TLDR

Show the **clock** (the default command)

```clock-rs```

**12-hour** time, without seconds

```clock-rs -t -s```

Show the time in **UTC**

```clock-rs --utc```

Start a **three-minute** timer

```clock-rs timer -M 3```

Start a **stopwatch**

```clock-rs stopwatch```

Quit when the timer **reaches zero**

```clock-rs timer -M 5 -k```

# SYNOPSIS

**clock-rs** [_options_] [**clock** | **timer** [_options_] | **stopwatch**]

# PARAMETERS

**-c**, **--color** _color_
> Clock color: a name (**black**, **red**, **green**, **yellow**, **blue**, **magenta**, **cyan**, **white**), the same name with a **bright-** prefix, or **#rrggbb**.

**-i**, **--interval** _ms_
> Redraw interval in milliseconds. Must be greater than zero. Default **200**.

**-B**, **--blink**
> Blink the colon.

**-b**, **--bold**
> Draw the clock in bold.

**-x**, **--x-pos** **start** | **center** | **end**
> Horizontal position. Default **center**.

**-y**, **--y-pos** **start** | **center** | **end**
> Vertical position. Default **center**.

**--fmt** _format_
> Date line, as a chrono strftime pattern. Default **%d-%m-%Y**.

**-t**
> 12-hour clock. This flag has no long form.

**--utc**
> Use UTC instead of local time.

**-s**, **--hide-seconds**
> Omit seconds.

**-S**, **--seconds** _n_
> Add seconds to a timer.

**-M**, **--minutes** _n_
> Add minutes to a timer.

**-H**, **--hours** _n_
> Add hours to a timer.

**-k**, **--kill**
> Exit when the timer finishes.

**-V**, **--version**
> Print the version and exit.

# DESCRIPTION

**clock-rs** draws a digital clock in the terminal. With no subcommand it runs **clock**. **timer** counts down and **stopwatch** counts up.

Timer units are converted for you: **90** minutes is 1 hour and 30 minutes. The longest timer is 99 hours, 59 minutes, and 59 seconds. A timer with no duration is 5 minutes.

A command-line flag overrides the same setting in the configuration file.

# CONFIGURATION

The file is TOML. On Linux it is **~/.config/clock-rs/conf.toml**. Another path, or **None** to ignore the file, is the environment variable in this assignment:

```
CONF_PATH=None
```

```
[general]
color = "magenta"
interval = 250
blink = true
bold = true

[position]
horizontal = "center"
vertical = "center"

[date]
fmt = "%A, %B %d, %Y"
use_12h = true
utc = true
hide_seconds = true
```

**general.color**, **general.interval**, **general.blink**, and **general.bold** match the display flags. **position.horizontal** and **position.vertical** match **--x-pos** and **--y-pos**. The four **date** keys in the example match **--fmt**, **-t**, **--utc**, and **--hide-seconds**, in that order.

# CAVEATS

**-t** is only a short flag. The matching configuration key is the 12-hour key under **date** in the example above.

# INSTALL

```brew: brew install clock-rs```

```nix: nix profile install nixpkgs#clock-rs```

<!-- packages: 2026-11-21 -->

# SEE ALSO

[tty-clock](/man/tty-clock)(1)

# RESOURCES

```[Source code](https://github.com/Oughie/clock-rs)```

<!-- verified: 2026-11-21 -->
