# TAGLINE

manages GPU switching on laptops with Nvidia Optimus technology

# TLDR

**Switch** to a GPU mode (logs out the session)

```optimus-manager --switch [integrated|nvidia|hybrid]```

**Switch without** the logout confirmation prompt

```optimus-manager --switch [nvidia] --no-confirm```

**Show** the current status

```optimus-manager --status```

**Print** the current GPU mode

```optimus-manager --print-mode```

**Print** the mode for the next login

```optimus-manager --print-next-mode```

**Clean up** leftover auto-generated configuration

```sudo optimus-manager --cleanup```

# SYNOPSIS

**optimus-manager** [_options_]

# PARAMETERS

**--switch** _MODE_
> Set the GPU mode for future logins: integrated, nvidia or hybrid. Logs out the current session.

**--no-confirm**, **--now**
> Skip the confirmation before logging out.

**--status**
> Print the current status.

**--print-mode**, **--current-mode**
> Print the current GPU mode.

**--print-next-mode**, **--next-mode**
> Print the GPU mode used on the next login.

**--print-startup**, **--startup-mode**
> Print the GPU mode used at boot.

**--temp-config** _PATH_
> Use a temporary configuration file for the next boot only.

**--unset-temp-config**
> Revert **--temp-config**.

**--cleanup**
> Remove auto-generated configuration files left over by the daemon.

**-v**, **--version**
> Print the version.

# DESCRIPTION

**optimus-manager** manages GPU switching on laptops with Nvidia Optimus technology (integrated Intel or AMD GPU plus a discrete Nvidia GPU). A daemon, **optimus-manager.service**, applies the selected mode by writing Xorg configuration and loading or unloading kernel modules before the display manager starts X.

Available modes are:
- **integrated**: only the integrated GPU; the Nvidia GPU can be powered off (best battery life)
- **nvidia**: the Nvidia GPU renders everything (best performance)
- **hybrid**: the integrated GPU renders, Nvidia is used on demand via PRIME render offload (**prime-run**)

# CONFIGURATION

**/etc/optimus-manager/optimus-manager.conf**
> Main configuration (startup mode, power switching method, per-mode options). Defaults are documented in **/usr/share/optimus-manager.conf**.

# CAVEATS

Only works with Xorg sessions; Wayland is not supported. Requires a supported display manager (SDDM, LightDM, or GDM with a patched gdm-prime package) and the **optimus-manager** service to be enabled. Switching logs out the session, closing all open applications. Do not combine it with other switching tools such as **envycontrol** or Bumblebee.

# HISTORY

Developed by **Askannz** starting in 2018, primarily for Arch Linux and distributed through the AUR. The integrated mode was called **intel** in older versions.

# INSTALL

```aur: yay -S optimus-manager-git```

<!-- packages: 2026-11-07 -->

# SEE ALSO

[prime-run](/man/prime-run)(1), [envycontrol](/man/envycontrol)(1), [nvidia-smi](/man/nvidia-smi)(1), [nvidia-settings](/man/nvidia-settings)(1)

# RESOURCES

```[Source code](https://github.com/Askannz/optimus-manager)```

```[Documentation](https://github.com/Askannz/optimus-manager/wiki)```

<!-- verified: 2026-11-07 -->
