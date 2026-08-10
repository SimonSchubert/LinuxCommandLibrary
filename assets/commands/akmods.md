# TAGLINE

Rebuild out-of-tree kernel modules from akmod packages

# TLDR

**Check and rebuild** missing or outdated modules for the running kernel

```sudo akmods```

**Force rebuild** of all modules even if they failed or look up to date

```sudo akmods --rebuild --force```

Build and install modules only for a **specific kernel** (same format as `uname -r`)

```sudo akmods --kernels [kernel_version]```

Rebuild only one **akmod** package

```sudo akmods --akmod [akmod_name]```

Show status of the background **akmods service**

```systemctl status akmods```

# SYNOPSIS

**akmods** [_options_]

# DESCRIPTION

**akmods** checks installed **akmod** packages and rebuilds out-of-tree kernel modules when they are missing, outdated, or broken for a given kernel. It is the Fedora/RHEL-family counterpart to frameworks like DKMS: an **akmod** package ships module sources and build metadata; **akmods** compiles them on the local system (often into a matching **kmod-*** RPM) whenever a new kernel appears.

Typical use is after installing or updating drivers from RPM Fusion (for example NVIDIA via **akmod-nvidia**). A systemd unit may run **akmods** at boot so modules for the current kernel are ready before they are needed. Manual runs are common when a build failed, **kernel-devel** was missing during an earlier attempt, or you need modules for a kernel other than the one currently running.

Builds need a compiler toolchain and matching kernel headers/devel packages for each target kernel. Secure Boot setups may also need module signing keys under **/etc/pki/akmods**.

# OPTIONS

**--force**

> Try all akmods, including ones that failed on earlier runs.

**--kernels** _kernel_

> Build and install only for the given kernel version string (same format as **uname -r**).

**--rebuild**

> Rebuild all modules even when they already appear up to date.

**--akmod** _akmod_

> Build and install only the named akmod package.

**--quiet**

> Reduce output.

**--verbose**

> Increase output.

# CAVEATS

Failed builds often leave no usable **kmod** until headers, compiler tools, and enough disk space are available, then **akmods --force** or **--rebuild** is re-run. On ostree-based systems (Silverblue/Kinoite) module signing and rebuild timing can differ from classic package installs. The man page is sparse; log output under the **akmods** service and journal is usually the best diagnostic trail.

# INSTALL

```dnf: sudo dnf install akmods```

<!-- packages: 2026-08-10 -->

# SEE ALSO

[dkms](/man/dkms)(1), [modprobe](/man/modprobe)(8), [uname](/man/uname)(1)

# RESOURCES

```[Documentation](https://rpmfusion.org/Packaging/KernelModules/Akmods)```

<!-- verified: 2026-08-10 -->
