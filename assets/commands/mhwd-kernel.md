# TAGLINE

manages Linux kernel installation and removal on Manjaro Linux

# TLDR

List all **available kernels**

```mhwd-kernel -l```

List all **installed kernels**

```mhwd-kernel -li```

**Install** a kernel

```sudo mhwd-kernel -i [kernel]```

**Remove** a kernel

```sudo mhwd-kernel -r [kernel]```

Install a kernel, **replacing the currently running kernel**

```sudo mhwd-kernel -i [kernel] rmc```

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

The **rmc** (remove current) option is useful when replacing a problematic kernel—it removes the currently running kernel after successfully installing the new one and after a reboot.

# CAVEATS

Always keep at least one known-working kernel installed. Removing the only installed kernel can make the system unbootable. After installing a new kernel, reboot to activate it. Kernel updates may require rebuilding third-party modules (like NVIDIA drivers).

# SEE ALSO

[mhwd](/man/mhwd)(1), [mhwd-gpu](/man/mhwd-gpu)(1), [uname](/man/uname)(1), [dkms](/man/dkms)(8)
