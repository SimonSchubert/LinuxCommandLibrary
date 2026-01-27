# TLDR

**List available GPUs**

```switcherooctl list```

**Launch application on discrete GPU**

```switcherooctl launch [application]```

**Launch on specific GPU** by number

```switcherooctl -g [1] launch [application]```

**Check service status**

```systemctl status switcheroo-control.service```

**Enable the service**

```sudo systemctl enable --now switcheroo-control.service```

# SYNOPSIS

**switcherooctl** [_options_] [_command_]

# PARAMETERS

**-g**, **--gpu** _index_
> GPU index to use for launch command.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Display version information.

# COMMANDS

**list**
> List known GPUs with their indices and capabilities.

**launch** _command_
> Launch application on discrete GPU (or specified GPU with -g).

# DESCRIPTION

**switcherooctl** is the command-line interface for switcheroo-control, a daemon that manages hybrid graphics on Linux laptops with multiple GPUs. It provides a simple way to list available graphics adapters and launch applications on a specific GPU.

On hybrid graphics systems with both integrated (power-efficient) and discrete (high-performance) GPUs, applications default to the integrated GPU. Using switcherooctl, you can run specific applications on the discrete GPU for better graphics performance.

The underlying daemon interfaces with the kernel's vga_switcheroo subsystem and provides a D-Bus API that desktop environments like GNOME and KDE use for GUI-based GPU selection.

Setting the environment variable DRI_PRIME=1 achieves a similar effect for individual applications.

# CAVEATS

Requires switcheroo-control.service to be running. Only works on systems with hybrid graphics (typically laptops with Intel/AMD integrated and Nvidia/AMD discrete GPUs). Detection may incorrectly identify GPUs in some configurations. Does not provide mux switching (for systems with hardware mux).

# HISTORY

**switcheroo-control** was developed for the GNOME desktop to provide a user-friendly interface for hybrid graphics management on Linux. It abstracts the kernel's vga_switcheroo mechanism, allowing desktop environments to offer "Launch using Discrete Graphics" options in application menus.

# SEE ALSO

[prime-run](/man/prime-run)(1), [nvidia-settings](/man/nvidia-settings)(1), [glxinfo](/man/glxinfo)(1)
