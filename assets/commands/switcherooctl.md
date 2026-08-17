# TAGLINE

Launch a command on a specific GPU

# TLDR

**List** known GPUs (default when no command is given)

```switcherooctl```

**List** GPUs explicitly

```switcherooctl list```

Launch a command on the **first discrete GPU**

```switcherooctl launch [glxgears]```

Launch a command on a **specific GPU** (number from **list**)

```switcherooctl launch [-g|--gpu] [1] [firefox]```

Print the **switcheroo-control** version

```switcherooctl version```

Show **help** for a subcommand

```switcherooctl help launch```

Start the **switcheroo-control** daemon

```sudo systemctl enable --now switcheroo-control.service```

# SYNOPSIS

**switcherooctl** **help** [_COMMAND_]

**switcherooctl** **version**

**switcherooctl** **list**

**switcherooctl** **launch** [**-g**|_**--gpu=**_GPU_] _COMMAND_...

# COMMANDS

**help** [_COMMAND_]
> Print a short synopsis, or detailed help for one command.

**version**
> Print the **switcheroo-control** version this CLI belongs to.

**list**
> List known GPUs. Each entry includes a device number used with **launch --gpu**. This is the default command when none is given.

**launch** [_OPTION_] _COMMAND_...
> Run _COMMAND_ on a GPU. With no **-g**, the first discrete (non-default) GPU is used, or the default GPU if the system has no discrete GPU.

# PARAMETERS

**-g**, **--gpu=**_GPU_
> GPU to launch on (device number from **list**). Applies to **launch**.

# DESCRIPTION

**switcherooctl** is the command-line client for **switcheroo-control**, a D-Bus service that discovers GPUs on hybrid-graphics Linux systems and tells desktop environments which adapters exist. GNOME and KDE use that API for menu actions such as "Launch using Discrete Graphics".

**list** prints each adapter with a device number, whether it is the default or a discrete GPU, and the environment variables the daemon would set for that device. **launch** starts a process with those variables so the application renders on the chosen GPU (typically PRIME render offload: Mesa **DRI_PRIME** and, on NVIDIA, the vendor offload variables). It does not flip a hardware mux.

The daemon is **switcheroo-control.service**. Without it, **switcherooctl** cannot enumerate GPUs. The package name is **switcheroo-control**; the command you type is **switcherooctl**.

# CAVEATS

Requires **switcheroo-control.service** to be running and a machine with more than one GPU. This is render offload, not mux switching: the display can stay on the integrated GPU while a single app uses the discrete one. Detection can mis-label adapters on unusual hardware. Wayland plus the proprietary NVIDIA driver has historically needed extra compositor and driver support; **prime-run** or vendor tools may still be required for some titles.

# HISTORY

**switcheroo-control** was written by **Bastien Nocera** (hadess) for GNOME so desktop shells could offer discrete-GPU launch without users setting environment variables by hand. The source moved from GitHub to **gitlab.freedesktop.org**; the old GitHub mirror was archived in **June 2020**. GNOME 3.36 (2020) tightened the D-Bus API. openSUSE later recommended **switcherooctl** over **suse-prime** and Bumblebee for hybrid laptops.

# INSTALL

```apt: sudo apt install switcheroo-control```

```dnf: sudo dnf install switcheroo-control```

```pacman: sudo pacman -S switcheroo-control```

```zypper: sudo zypper install switcheroo-control```

```nix: nix profile install nixpkgs#switcheroo-control```

<!-- packages: 2026-08-17 -->

# SEE ALSO

[prime-run](/man/prime-run)(1), [optirun](/man/optirun)(1), [envycontrol](/man/envycontrol)(1), [nvidia-smi](/man/nvidia-smi)(1), [glxinfo](/man/glxinfo)(1)

# RESOURCES

```[Source code](https://gitlab.freedesktop.org/hadess/switcheroo-control)```

<!-- verified: 2026-08-17 -->
