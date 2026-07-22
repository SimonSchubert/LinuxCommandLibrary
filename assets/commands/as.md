# TAGLINE

Translate assembly language source into object files.

# TLDR

**Assemble** a file, writing output to a.out

```as [path/to/file.s]```

Assemble to a **specific output file**

```as [path/to/file.s] -o [path/to/output.o]```

Generate output **faster** by skipping whitespace preprocessing

```as -f [path/to/file.s]```

Add a directory to the **include search path**

```as -I [path/to/directory] [path/to/file.s]```

# SYNOPSIS

**as** [_options_] _file_...

# DESCRIPTION

**as** is the GNU assembler, part of the GNU Binutils collection. It translates assembly language source files into object files that can be linked with **ld** to create executables.

While primarily intended to assemble output from compilers like **gcc**, it can also be used directly for low-level programming. The assembler supports multiple target architectures and output formats.

# PARAMETERS

**-o** _file_
> Write the output object file to _file_ instead of a.out

**-f**
> Fast mode: skip whitespace and comment preprocessing (use only with trusted compiler output)

**-I** _directory_
> Add _directory_ to the search path for **.include** directives

**-g**
> Generate debugging information

**--32** / **--64**
> Generate 32-bit or 64-bit code (x86)

**-W**, **--no-warn**
> Suppress warning messages.

**--warn**
> Do not suppress warnings (default).

**--fatal-warnings**
> Treat warnings as errors.

**-a**[_letters_]
> Turn on listings; suboptions include _h_ (high-level), _l_ (assembly), _s_ (symbols), _n_ (omit forms processing).

**--statistics**
> Print processing statistics (max-space, total-time).

**-march=**_CPU_
> Assemble for a specific CPU architecture.

# CAVEATS

Assembly syntax varies between architectures. GNU as uses AT&T syntax by default on x86, which differs from Intel syntax. Use **.intel_syntax noprefix** directive for Intel syntax. The **-f** flag should only be used with compiler-generated output, since it skips whitespace and comment preprocessing that hand-written sources may rely on.

# HISTORY

The GNU assembler was developed as part of the GNU project starting in the 1980s. It became part of GNU Binutils and supports virtually all architectures that GCC targets.

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

[gcc](/man/gcc)(1), [ld](/man/ld)(1), [objdump](/man/objdump)(1), [readelf](/man/readelf)(1)
