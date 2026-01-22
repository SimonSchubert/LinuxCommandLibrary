# TLDR

Turn up the **master volume** by 10%

```amixer -D pulse sset Master 10%+```

Turn down the **master volume** by 10%

```amixer -D pulse sset Master 10%-```

**Mute** the master channel

```amixer -D pulse sset Master mute```

**Unmute** the master channel

```amixer -D pulse sset Master unmute```

List all **simple mixer controls**

```amixer scontrols```

# SYNOPSIS

**amixer** [_-option_] [_cmd_]

# DESCRIPTION

**amixer** allows command-line control of the mixer for the ALSA soundcard driver and supports multiple soundcards. Running it without arguments displays current mixer settings for the default soundcard.

# PARAMETERS

**-c card**
> Select card number (format: hw:N)

**-D device**
> Select device name (default: 'default')

**-s, --stdin**
> Read and execute commands from stdin sequentially

**-q**
> Quiet mode; suppress output

**-R**
> Raw value for percentage evaluation (default)

**-M**
> Mapped volume for percentage evaluation

# COMMANDS

**scontrols**
> List all simple mixer controls

**scontents**
> List simple mixer controls with their contents

**set/sset NAME PARAMETER**
> Configure mixer control contents (supports percentage, dB values, mute/unmute/toggle)

**get/sget NAME**
> Display simple mixer control contents

**controls**
> List all card controls

**contents**
> List card controls with their contents

**info**
> Show mixer device information

# CAVEATS

Mixer control names vary between sound cards. Use **scontrols** to list available controls for your card.

# HISTORY

Part of **ALSA** (Advanced Linux Sound Architecture) utilities package.

# SEE ALSO

[alsamixer](/man/alsamixer)(1), [aplay](/man/aplay)(1), [arecord](/man/arecord)(1)
