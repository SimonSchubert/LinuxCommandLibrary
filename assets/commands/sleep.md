# TLDR

Delay in **seconds**

```sleep [seconds]```

Delay in **minutes** (other units: d=day, h=hour, s=second)

```sleep [minutes]m```

Delay for **1 day 3 hours**

```sleep 1d 3h```

Execute a command after **20 minutes** delay

```sleep 20m && [command]```

Delay **forever**

```sleep infinity```

Display **help**

```sleep --help```

# SYNOPSIS

**sleep** _NUMBER_[_SUFFIX_]...

**sleep** _OPTION_

# PARAMETERS

**NUMBER**
> Amount of time to sleep

**s**
> Seconds (default if no suffix)

**m**
> Minutes

**h**
> Hours

**d**
> Days

**infinity** / **inf**
> Sleep forever (until interrupted)

**--help**
> Display help and exit

**--version**
> Output version information and exit

# DESCRIPTION

**sleep** pauses execution for a specified amount of time. It accepts floating-point numbers and multiple time arguments which are summed together. The command is commonly used in shell scripts to add delays between operations or to wait for external processes.

GNU sleep supports time suffixes (s, m, h, d) and the special value infinity for indefinite pausing. Multiple arguments are added together, allowing expressions like **sleep 1h 30m** for 90 minutes.

# CAVEATS

Time precision depends on system capabilities; very small fractions may not be honored exactly. The infinity option keeps the process running until killed, consuming minimal resources. Not all implementations support suffixes or multiple arguments (POSIX only requires seconds).

# HISTORY

Sleep has been part of Unix since **Version 4 Unix (1973)**. The original implementation only accepted integer seconds. GNU coreutils extended it with floating-point support, time suffixes, and multiple arguments. The infinity feature was added to simplify scripts that need indefinite waits.

# SEE ALSO

[wait](/man/wait)(1), [timeout](/man/timeout)(1), [watch](/man/watch)(1)
