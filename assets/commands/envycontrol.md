# TAGLINE

GPU switching utility for Nvidia Optimus laptops

# TLDR

**Switch** between GPU modes

```sudo envycontrol [-s|--switch] [nvidia|integrated|hybrid]```

Specify **display manager** manually

```envycontrol --dm [gdm|gdm3|sddm|lightdm]```

**Check** current GPU mode

```sudo envycontrol [-q|--query]```

**Reset** settings

```sudo envycontrol --reset```

Display **help**

```envycontrol [-h|--help]```

Display **version**

```envycontrol [-v|--version]```

# SYNOPSIS

**envycontrol** [_options_]

# DESCRIPTION

**envycontrol** is a GPU switching utility specifically designed for Nvidia Optimus laptops running Linux. It provides a streamlined interface for switching between integrated Intel/AMD graphics, hybrid mode (both GPUs active), and dedicated Nvidia GPU mode without requiring manual configuration file editing.

The tool simplifies power management and performance tuning on dual-GPU systems by handling the complex configuration changes needed for GPU mode switching, including display manager setup and driver configuration. Changes require a system reboot to take effect as the underlying graphics stack must be reinitialized.

# PARAMETERS

**-s, --switch** _mode_
> Switch to nvidia, integrated, or hybrid

**--dm** _manager_
> Specify display manager

**-q, --query**
> Show current GPU mode

**--reset**
> Reset to default settings

**-h, --help**
> Display help message

**-v, --version**
> Display version

# CAVEATS

Requires Nvidia Optimus laptop. Changes require reboot to take effect. Display manager must be correctly specified. May conflict with other GPU switching solutions.

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1), [prime-select](/man/prime-select)(1)
