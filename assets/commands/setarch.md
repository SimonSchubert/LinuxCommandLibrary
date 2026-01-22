# TLDR

**Run** a command as if the machine architecture is i686

```setarch i686 [command]```

**Run** a shell with x86_64 architecture

```setarch x86_64 [bash]```

**Disable** randomization of the virtual address space

```setarch [linux32] -R [command]```

**List** supported architectures

```setarch --list```

# SYNOPSIS

**setarch** [_arch_] [_options_] [_program_ [_arguments_]]

# PARAMETERS

**arch**
> Target architecture (i686, x86_64, linux32, linux64, etc.)

**-R, --addr-no-randomize**
> Disable address space layout randomization (ASLR)

**-S, --short-inode**
> Use legacy 32-bit inode values

**-L, --uname-2.6**
> Set uname to report 2.6 kernel

**-B, --32bit**
> Limit address space to 32 bits

**--list**
> List supported architectures

**-v, --verbose**
> Verbose output

# DESCRIPTION

**setarch** changes the reported architecture for a program's execution environment. It modifies what **uname -m** reports and can affect how programs behave based on architecture detection.

The command is useful for running 32-bit applications on 64-bit systems, compatibility testing, and debugging programs that behave differently based on architecture. The **linux32** and **linux64** symlinks are shortcuts for common uses.

# CAVEATS

Does not enable actual architecture emulation; the underlying CPU must support the requested mode. Disabling ASLR (**-R**) reduces security and should only be used for debugging. Part of the util-linux package.

# SEE ALSO

[linux32](/man/linux32)(8), [linux64](/man/linux64)(8), [uname](/man/uname)(1), [personality](/man/personality)(2)
