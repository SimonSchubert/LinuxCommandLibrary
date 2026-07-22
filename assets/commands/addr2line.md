# TAGLINE

Translate addresses to source file locations

# TLDR

Display the **filename and line number** from an instruction address

```addr2line -e [path/to/executable] [address]```

Display the **function name**, filename, and line number

```addr2line -e [path/to/executable] -f [address]```

**Demangle** the function name for C++ code

```addr2line -e [path/to/executable] -f -C [address]```

**Pretty-print** with inlined frames

```addr2line -e [path/to/executable] -f -C -i -p [address]```

**Read addresses from stdin** (e.g., from a stack trace)

```cat [addresses.txt] | addr2line -e [path/to/executable] -f -C```

# SYNOPSIS

**addr2line** [_-e executable_] [_-f_] [_-C_] [_-s_] [_-i_] [_address_...]

# DESCRIPTION

**addr2line** translates addresses into file names and line numbers. Given an address in an executable or relocatable object, it uses the debugging information to figure out which file name and line number are associated with it.

This is particularly useful for interpreting crash dumps and debugging information from stack traces.

# PARAMETERS

**-e, --exe executable**
> Specify the executable to examine

**-f, --functions**
> Display function names as well as file and line number information

**-C, --demangle**
> Decode (demangle) low-level symbol names into user-level names (useful for C++)

**-s, --basenames**
> Display only the base of each file name rather than the full path

**-i, --inlines**
> If the address belongs to an inlined function, also print the caller information

**-p, --pretty-print**
> Print output in a human-readable format

**-a, --addresses**
> Display the address before the function name, file, and line

**-j, --section** _NAME_
> Treat input addresses as offsets within the named section.

**--target** _BFDNAME_
> Specify the binary format of the object file (auto-detected by default).

**-r, --no-recurse-limit**
> Disable the demangler's recursion limit.

# CAVEATS

Requires the executable to be compiled with debugging information (e.g., **-g** flag for gcc). Stripped executables will not provide useful output.

# HISTORY

Part of **GNU Binutils**, a collection of binary tools for working with object files and executables.

# INSTALL

```apt: sudo apt install binutils```

```dnf: sudo dnf install binutils```

```pacman: sudo pacman -S binutils```

```apk: sudo apk add binutils```

```zypper: sudo zypper install binutils```

```brew: brew install binutils```

```nix: nix profile install nixpkgs#binutils```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[objdump](/man/objdump)(1), [nm](/man/nm)(1), [readelf](/man/readelf)(1)
