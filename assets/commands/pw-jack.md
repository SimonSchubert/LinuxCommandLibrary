# TLDR

Run a command with its arguments using **PipeWire**

```pw-jack command arg1 arg2```

Run a command in **verbose** mode

```pw-jack -v command```

Connect to a specific **remote** PipeWire instance

```pw-jack -r remote_instance command```

Display **help**

```pw-jack -h```

# SYNOPSIS

**pw-jack** [_options_] _command_ [_arguments_...]

# PARAMETERS

**-v**
> Enable verbose mode

**-r** _name_
> Connect to specific remote PipeWire instance

**-h**
> Display help message

# DESCRIPTION

**pw-jack** runs JACK applications using PipeWire as the audio backend. It provides a compatibility layer that allows JACK-based audio applications to work seamlessly with PipeWire.

The wrapper intercepts JACK library calls and redirects them through PipeWire's JACK compatibility implementation.

# CAVEATS

Some advanced JACK features may behave differently under PipeWire. Applications that depend on specific JACK server behavior may require adjustment.

# HISTORY

Part of **PipeWire**, the modern multimedia framework for Linux. Enables JACK application compatibility without requiring a separate JACK server.

# SEE ALSO

[pipewire](/man/pipewire)(1), [jackd](/man/jackd)(1), [pw-cli](/man/pw-cli)(1)
