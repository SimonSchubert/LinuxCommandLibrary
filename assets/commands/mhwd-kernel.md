# TAGLINE

manages Linux kernel installation and removal on Manjaro Linux

# TLDR

Show the kernels **Manjaro offers**

```mhwd-kernel --list```

Show which kernels are **already installed**

```mhwd-kernel --listinstalled```

Install another kernel **alongside** the current one

```sudo mhwd-kernel --install [linux66]```

Install one and **remove the running kernel** in the same step

```sudo mhwd-kernel --install [linux66] rmc```

Remove a kernel you **no longer boot**

```sudo mhwd-kernel --remove [linux61]```

# SYNOPSIS

**mhwd-kernel** [_options_] [_kernel_] [_rmc_]

# PARAMETERS

**-l, --list**
> List all available kernels from repositories

**-li, --listinstalled**
> List all currently installed kernels

**-i, --install _kernel_**
> Install the specified kernel

**-r, --remove _kernel_**
> Remove the specified kernel

**rmc**
> Remove the current kernel after installing the new one

# DESCRIPTION

**mhwd-kernel** manages Linux kernel installation and removal on Manjaro Linux. It simplifies the process of installing multiple kernels and switching between LTS (Long Term Support) and mainline kernel versions.

Kernel names follow the pattern **linux** followed by the version number (e.g., linux515, linux61, linux66). The tool automatically handles kernel modules and headers alongside the kernel itself.

The **rmc** (remove current) option is useful when replacing a problematic kernel: it removes the currently running kernel after successfully installing the new one and after a reboot.

# CAVEATS

Always keep at least one known-working kernel installed. Removing the only installed kernel can make the system unbootable. After installing a new kernel, reboot to activate it. Kernel updates may require rebuilding third-party modules (like NVIDIA drivers).

# SEE ALSO

[mhwd](/man/mhwd)(1), [mhwd-gpu](/man/mhwd-gpu)(1), [uname](/man/uname)(1), [dkms](/man/dkms)(8)
