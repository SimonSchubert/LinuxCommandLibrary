# TAGLINE

Fast modern linker, a drop-in replacement for GNU ld

# TLDR

**Link object files** into an executable

```mold -o [program] [a.o] [b.o]```

**Link a shared library**

```mold --shared -o [libfoo.so] [foo.o]```

**Link against a library** in a given directory

```mold -o [program] [file.o] -L[/path/to/lib] -l[foo]```

**Use mold from gcc or clang** (GCC 12.1 or newer, or Clang)

```gcc -fuse-ld=mold -o [program] [file.c]```

**Intercept the system linker** for a build that has no linker flag

```mold --run make -j```

**Print why** each input was pulled in

```mold --print-dependencies -o [program] [a.o] [b.o]```

**Cap worker threads**

```mold --thread-count=4 -o [program] [*.o]```

# SYNOPSIS

**mold** [_option_...] _file_...

**mold** **--run** _command_ [_arg_...]

# PARAMETERS

_FILE_...
> Object files, archives, and shared libraries to link. mold remembers archive members, so an archive earlier on the command line can still satisfy a later undefined symbol. **--start-group** and **--end-group** are accepted and ignored.

**-o** _FILE_, **--output=**_FILE_
> Write the output to _FILE_ instead of **a.out**. Long options that begin with **o** need two dashes, so **--output** must not be spelled **-output**.

**-l** _NAME_
> Search for **libNAME.so** or **libNAME.a** on the library path.

**-L** _DIR_, **--library-path=**_DIR_
> Add _DIR_ to the library search path.

**--shared**, **--Bshareable**
> Create a shared library.

**--static**
> Do not link against shared libraries.

**--pie**, **--no-pie**
> Create a position-independent executable, or do not. **--pic-executable** is a synonym for **--pie**.

**-r**, **--relocatable**
> Combine inputs into another object file that can be linked again.

**-e** _SYMBOL_, **--entry=**_SYMBOL_
> Use _SYMBOL_ as the entry point.

**--gc-sections**, **--no-gc-sections**
> Discard unreferenced sections, or keep them.

**--icf=**_MODE_
> Identical code folding. _MODE_ is **safe**, **all**, or **none**. **all** gives the smallest output and can make two different functions share one address. **safe** folds a function only when the program never takes its address.

**--as-needed**, **--no-as-needed**
> After **--as-needed**, a shared library is recorded as needed only when the output uses at least one of its symbols.

**--whole-archive**, **--no-whole-archive**
> Extract every member of the following archives, not only members that resolve an undefined symbol.

**--threads**, **--no-threads**
> Link with multiple threads. The default is one thread per core, capped at 32. **--no-threads** or **--thread-count=1** uses a single thread.

**--thread-count=**_N_
> Use _N_ worker threads.

**--run** _COMMAND_ [_ARG_...]
> Run _COMMAND_ with **LD_PRELOAD** set to mold's wrapper. The wrapper replaces **argv[0]** with mold when the program about to run is **ld**, **ld.bfd**, **ld.gold**, **ld.lld**, or **ld.mold**.

**--print-dependencies**
> For each symbol, print which input file depends on which other input file. Useful when an archive member or a shared library was kept unexpectedly.

**--separate-debug-file**[=_FILE_]
> Write DWARF to a separate debug file instead of embedding it. By default the file sits next to the output with a **.dbg** suffix, and its name is stored so gdb can find it. Creation runs in the background unless **--no-detach** is given.

**--repro**
> Save the inputs and the command line in a tar next to the output (**path/to/output.tar**) so the link can be repeated. **MOLD_REPRO** does the same thing.

**--perf**
> Print performance statistics.

**--stats**
> Print input statistics.

**--fork**, **--no-fork**
> Do the link in a child process so the time the kernel spends tearing the process down is hidden. This is the default. **--no-fork** stays in the foreground so **time**(1) can report the linker's own resource use.

**-v**, **--version**
> Print version information. **-V** also prints the target.

**--help**
> Print usage and exit.

# DESCRIPTION

**mold** is a high-speed linker for ELF user-space programs and a drop-in stand-in for the usual Unix linker. Compilers call it with **-fuse-ld=mold**. That flag works with Clang, and with GCC 12.1.0 or later. Older GCC does not accept **mold** as a **-fuse-ld** argument. Pass **-B** pointing at the directory whose **ld** is a symlink to mold: **/usr/libexec/mold** or **/usr/local/libexec/mold**, depending on the install prefix. Clang can also take **-fuse-ld=/absolute/path/to/mold**. GCC cannot.

Rui Ueyama, the original author of LLVM lld, develops mold. The released linker is written in C++20. It parallelizes symbol resolution, relocation, and copying of sections. The same inputs, the same options, and the same mold version produce a bit-identical output file. mold has no host-specific default search paths: library paths come only from the command line.

Supported targets are x86-64, i386, ARM32, ARM64, RISC-V 32/64, PowerPC 32/64, s390x, LoongArch 32/64, SPARC64, m68k, and SH-4.

A finished binary names mold in its **.comment** section. **readelf -p .comment** on the output shows whether mold produced the file.

For Rust, put clang (or a new enough gcc) in charge of linking and pass **-C link-arg=-fuse-ld=mold** through **rustflags** in **.cargo/config.toml** or **~/.cargo/config.toml**.

# CAVEATS

Linker scripts are implemented only far enough to read the usual **libc.so** script on Linux. mold does not plan to grow the rest of the GNU linker-script language.

**--icf=all** breaks the C and C++ rule that pointers to different functions compare unequal. **--shuffle-sections** randomizes section order (pass a number to fix the seed) and will move benchmark numbers around with the layout. **--reverse-sections** flips constructor order so a program that accidentally depends on link order can be tested.

**--fork** is on by default and hides the child from **time**(1). Pass **--no-fork** when those statistics matter.

Several mold processes at once multiply peak memory. **MOLD_JOBS=1** makes any new mold wait until the one already running has finished. Any other value of **MOLD_JOBS** is ignored. A non-empty **MOLD_DEBUG** embeds the mold command line in the output **.comment** section.

# HISTORY

Rui Ueyama started mold in **2020**, after running into architectural limits while optimizing LLVM lld, the linker used by Android, Chrome, and FreeBSD among others. The project has been developed in the open since then and has been in production use since **2021**. Its test suite runs for every supported architecture, and before a release the maintainers try to link Gentoo's package set with mold, using GNU ld as the control.

# INSTALL

```apt: sudo apt install mold```

```dnf: sudo dnf install mold```

```pacman: sudo pacman -S mold```

```apk: sudo apk add mold```

```zypper: sudo zypper install mold```

```brew: brew install mold```

```nix: nix profile install nixpkgs#mold```

<!-- packages: 2026-09-22 -->

# SEE ALSO

[ld](/man/ld)(1), [ld.gold](/man/ld.gold)(1), [gcc](/man/gcc)(1), [clang](/man/clang)(1), [readelf](/man/readelf)(1)

# RESOURCES

```[Source code](https://github.com/rui314/mold)```

```[Documentation](https://github.com/rui314/mold/blob/main/docs/mold.md)```

<!-- verified: 2026-09-22 -->
