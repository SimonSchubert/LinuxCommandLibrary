# TAGLINE

bumblebee project's tool for running applications on NVIDIA Optimus laptops

# TLDR

**Run application with NVIDIA GPU**

```optirun [application]```

**Run with specific options**

```optirun -b [primus] [application]```

**Check GPU status**

```optirun --status```

**Run in verbose mode**

```optirun -vvv [application]```

**Force GPU power on**

```optirun --no-xorg [glxinfo]```

# SYNOPSIS

**optirun** [_options_] _command_ [_args_...]

# PARAMETERS

**-b**, **--bridge** _method_
> Rendering bridge (virtualgl, primus).

**-c** _file_
> Configuration file.

**--no-xorg**
> Don't start secondary X.

**--status**
> Check bumblebee status.

**-v**
> Verbose output.

**-q**
> Quiet mode.

# DESCRIPTION

**optirun** is the Bumblebee project's tool for running applications on NVIDIA Optimus laptops. It allows selective use of the discrete NVIDIA GPU while the integrated GPU handles the display.

Bumblebee manages GPU power to save battery when discrete GPU isn't needed.

# BRIDGES

```
virtualgl - VirtualGL bridge
primus    - Faster, lower latency
```

# CAVEATS

Requires Bumblebee daemon. Alternative: NVIDIA PRIME. May have compatibility issues. Being superseded by native PRIME.

# HISTORY

Bumblebee was created as a Linux solution for NVIDIA Optimus laptops, which lacked official Linux support when introduced in **2011**.

# SEE ALSO

[primusrun](/man/primusrun)(1), [nvidia-settings](/man/nvidia-settings)(1), [prime-select](/man/prime-select)(1)
