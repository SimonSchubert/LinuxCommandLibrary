# TAGLINE

manages GPU switching on laptops with Nvidia Optimus technology

# TLDR

**Switch** between different GPU modes

```optimus-manager --switch [nvidia|integrated|hybrid]```

**Clean up** configuration and state

```optimus-manager --cleanup```

# SYNOPSIS

**optimus-manager** [_options_]

# PARAMETERS

**--switch _mode_**
> Switch to specified GPU mode: nvidia, integrated, or hybrid

**--cleanup**
> Clean up leftover configuration from previous sessions

**--status**
> Display current GPU mode and configuration

**--print-mode**
> Print only the current mode name

**--print-startup**
> Print the startup mode from configuration

**--no-confirm**
> Don't ask for confirmation before switching

# DESCRIPTION

**optimus-manager** manages GPU switching on laptops with Nvidia Optimus technology (dual Intel/Nvidia graphics). It handles the complex task of switching between the integrated Intel GPU, discrete Nvidia GPU, or hybrid mode.

Available modes are:
- **integrated**: Use only the Intel GPU (best battery life)
- **nvidia**: Use only the Nvidia GPU (best performance)
- **hybrid**: Both GPUs active, Nvidia for specific applications (via PRIME)

Switching modes typically requires logging out or rebooting. The tool manages Xorg configuration, kernel module loading, and display manager integration.

# CAVEATS

Switching GPUs requires logging out of the desktop session. Hybrid mode requires proper PRIME render offload configuration. Works with various display managers but may need configuration. Specific to Linux laptops with Nvidia Optimus hardware.

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1), [prime-run](/man/prime-run)(1), [envycontrol](/man/envycontrol)(1)
