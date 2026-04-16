# TAGLINE

Change reported architecture for program execution

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
> Disable address space layout randomization (ASLR).

**-F, --fdpic-funcptrs**
> Treat user-space function pointers as pointers to function descriptors.

**-Z, --mmap-page-zero**
> Turn on MMAP_PAGE_ZERO for legacy programs.

**-L, --addr-compat-layout**
> Use legacy virtual address space layout.

**-X, --read-implies-exec**
> Turn on READ_IMPLIES_EXEC.

**-B, --32bit**
> Turn on ADDR_LIMIT_32BIT.

**-I, --short-inode**
> Turn on SHORT_INODE.

**-S, --whole-seconds**
> Turn on WHOLE_SECONDS.

**-T, --sticky-timeouts**
> Turn on STICKY_TIMEOUTS.

**-3, --3gb**
> Use a 3GB memory layout.

**--uname-2.6**
> Report a 2.6 kernel version in uname.

**--list**
> List supported architectures and exit.

**-v, --verbose**
> Be verbose.

**-h, --help**
> Display help.

# DESCRIPTION

**setarch** changes the reported architecture for a program's execution environment. It modifies what **uname -m** reports and can affect how programs behave based on architecture detection.

The command is useful for running 32-bit applications on 64-bit systems, compatibility testing, and debugging programs that behave differently based on architecture. The **linux32** and **linux64** symlinks are shortcuts for common uses.

# CAVEATS

Does not enable actual architecture emulation; the underlying CPU must support the requested mode. Disabling ASLR (**-R**) reduces security and should only be used for debugging. Part of the util-linux package.

# SEE ALSO

[linux32](/man/linux32)(8), [linux64](/man/linux64)(8), [uname](/man/uname)(1), [personality](/man/personality)(2)
