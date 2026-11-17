# TAGLINE

Update ELF file headers and x86 feature notes

# TLDR

Change the **machine type** of an ELF file

```elfedit --output-mach x86-64 [path/to/file]```

Change the machine type **only when it already matches**

```elfedit --input-mach i386 --output-mach iamcu [path/to/file]```

Change the **file type** to relocatable, executable, or shared object

```elfedit --output-type [rel|exec|dyn] [path/to/file]```

Change the **OS ABI**

```elfedit --output-osabi [FreeBSD] [path/to/file]```

Set the **ABI version** (0 through 255)

```elfedit --output-abiversion [0] [path/to/file]```

**Enable** an x86 feature note

```elfedit --enable-x86-feature ibt [path/to/file]```

**Disable** an x86 feature note

```elfedit --disable-x86-feature shstk [path/to/file]```

Show **help**

```elfedit -h```

# SYNOPSIS

**elfedit** [_options_] _elffile_...

# PARAMETERS

**--input-mach** _machine_
> Match only files whose ELF machine is _machine_. Without this option, every machine matches. Names are case-insensitive. Accepted names include `none`, `i386`, `iamcu`, `l1om`, `k1om`, and `x86-64`.

**--output-mach** _machine_
> Write _machine_ into the ELF header. Same names as **--input-mach**.

**--input-type** _type_
> Match only files of this ELF type. Without this option, every type matches. Names: `none`, `rel`, `exec`, `dyn`.

**--output-type** _type_
> Write _type_ into the ELF header. Same names as **--input-type**.

**--input-osabi** _osabi_
> Match only files with this OS ABI. Without this option, every OS ABI matches. Names are case-insensitive. `Linux` is an alias of `GNU`. `elfedit --help` prints the names that build accepts. The binutils manual documents `none`, `HPUX`, `NetBSD`, `GNU`, `Solaris`, `AIX`, `Irix`, `FreeBSD`, `TRU64`, `Modesto`, `OpenBSD`, `OpenVMS`, `NSK`, `AROS`, and `FenixOS`.

**--output-osabi** _osabi_
> Write _osabi_ into the ELF header. Same names as **--input-osabi**.

**--input-abiversion** _0-255_
> Match only files with this ABI version.

**--output-abiversion** _0-255_
> Write this ABI version into the ELF header.

**--enable-x86-feature** _feature_
> Turn on one x86 feature in the GNU property note. Enabling a feature clears it from the disable mask. Tokens are exact:

```ibt```

```shstk```

```lam_u48```

```lam_u57```

**--disable-x86-feature** _feature_
> Turn off one x86 feature. Same tokens as **--enable-x86-feature**. Disabling a feature clears it from the enable mask.

**-h**, **--help**
> Show help and exit.

**-v**, **--version**
> Show the version and exit.

**@**_file_
> Read more options from _file_. The file may itself contain `@file` options.

# DESCRIPTION

**elfedit** updates fields in the ELF header, and on builds that support it, x86 feature bits in the GNU property note. It is part of GNU binutils.

Pass at least one output option or one x86-feature option. Input options only narrow which files are changed. 32-bit and 64-bit ELF files are accepted, including ELF members inside archives.

The machine name `x86-64` is the form to type. The same parser also accepts the underscore spelling.

Feature options are compiled in when binutils was built with mmap support. A build without them rejects those flags.

# CAVEATS

Changing the machine, type, or OS ABI does not rewrite the rest of the file. A header that no longer matches the body will not load.

Feature names have no hyphen alias. Type them exactly, inside a context that does not treat underscores as emphasis.

# INSTALL

```apt: sudo apt install binutils```

```dnf: sudo dnf install binutils```

```pacman: sudo pacman -S binutils```

```apk: sudo apk add binutils```

```zypper: sudo zypper install binutils```

```brew: brew install binutils```

```nix: nix profile install nixpkgs#binutils```

<!-- packages: 2026-11-17 -->

# SEE ALSO

[readelf](/man/readelf)(1), [objcopy](/man/objcopy)(1), [objdump](/man/objdump)(1), [strip](/man/strip)(1)

# RESOURCES

```[Source code](https://sourceware.org/git/?p=binutils-gdb.git)```

```[Homepage](https://www.gnu.org/software/binutils/)```

```[Documentation](https://sourceware.org/binutils/docs/binutils/elfedit.html)```

<!-- verified: 2026-11-17 -->
