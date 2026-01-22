# TLDR

List **installed modules**

```dkms status```

**Rebuild** modules for current kernel

```sudo dkms autoinstall```

**Install** a module version

```sudo dkms install -m module_name -v 1.2.1```

**Remove** module from all kernels

```sudo dkms remove -m module_name -v 1.2.1 --all```

**Add** module source

```sudo dkms add -m module_name -v 1.2.1```

**Build** module for current kernel

```sudo dkms build -m module_name -v 1.2.1```

# SYNOPSIS

**dkms** _action_ [_options_] [_module/module-version_]

# DESCRIPTION

**dkms** (Dynamic Kernel Module Support) is a framework that allows kernel modules to be dynamically built for each kernel version on a system. It automatically rebuilds modules when a new kernel is installed.

# ACTIONS

**add**
> Add a module source to the DKMS tree

**remove**
> Remove a module from the DKMS tree

**build**
> Build a module for a specific kernel

**install**
> Install a built module for a kernel

**uninstall**
> Uninstall a module from a kernel

**autoinstall**
> Install all modules for current kernel

**status**
> Show status of DKMS-managed modules

**mkdriverdisk**
> Create a driver disk image

**mktarball**
> Create a tarball of module source

# PARAMETERS

**-m, --module**
> Specify module name

**-v, --version**
> Specify module version

**-k, --kernelver**
> Specify kernel version

**--all**
> Apply to all kernel versions

**-c, --config**
> Specify dkms.conf location

# CAVEATS

DKMS requires kernel headers to be installed. Module sources are stored in /usr/src/. Kernel upgrades trigger automatic module rebuilds if properly configured.

# HISTORY

**dkms** was developed by Dell as a solution to maintain out-of-tree kernel modules across kernel updates without manual rebuilding.

# SEE ALSO

[modprobe](/man/modprobe)(8), [insmod](/man/insmod)(8), [make](/man/make)(1)
