# TAGLINE

Go compiler for microcontrollers, WebAssembly, and small binaries

# TLDR

**Flash** a blink example to an Arduino Uno

```tinygo flash -target [arduino-uno] examples/blinky1```

**Build** a WASI WebAssembly module

```tinygo build -o [out.wasm] -target=wasip1 [program.go]```

**Build** for a specific board target

```tinygo build -o [firmware.elf] -target [board] [main.go]```

**List** information about the compiler

```tinygo version```

**Run** tests for the current package (host or target)

```tinygo test```

# SYNOPSIS

**tinygo** *command* [*options*] [*packages*]

# DESCRIPTION

**tinygo** is a Go compiler based on LLVM aimed at small places: microcontrollers, WebAssembly (WASM/WASI), and compact command-line programs. It supports a large subset of Go with a focus on small binary size and good CGo interoperability, rather than matching the full performance profile of the standard **gc** toolchain for highly concurrent server workloads.

Common workflows use **tinygo flash** to compile and write firmware to a board, **tinygo build** to produce binaries or **.wasm** modules, and board-specific **-target** values (150+ boards). Programs can also be built for Linux, macOS, and Windows with TinyGo's OS targets.

# PARAMETERS

**flash**

> Compile and flash a program to a connected microcontroller.

**build**

> Compile a package to a binary, library, or WebAssembly module.

**run**

> Compile and run on the host or target as supported.

**test**

> Run package tests.

**version**

> Print TinyGo and LLVM version information.

**targets**

> List or inspect available targets (see upstream docs for full list).

**-target** *name*

> Compilation target (board name, **wasip1**, **wasm**, OS targets, etc.).

**-o** *file*

> Output path.

**-buildmode** *mode*

> Build mode (e.g. **c-shared** for WASM libraries).

**-size** *level*

> Size reporting / optimization related options (see **tinygo help**).

**-opt** *level*

> Optimization level.

# CAVEATS

Not every Go program or standard-library package is supported; see TinyGo language support docs. Toolchain setup (compiler, libraries, board toolchains) varies by platform—follow https://tinygo.org/getting-started/. Binary size and performance trade-offs differ from the standard Go compiler.

# INSTALL

```dnf: sudo dnf install tinygo```

```pacman: sudo pacman -S tinygo```

```zypper: sudo zypper install tinygo```

```nix: nix profile install nixpkgs#tinygo```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[go](/man/go)(1), [wasm-ld](/man/wasm-ld)(1)

# RESOURCES

```[Source code](https://github.com/tinygo-org/tinygo)```

```[Homepage](https://tinygo.org)```

```[Documentation](https://tinygo.org/docs/)```

<!-- verified: 2026-07-19 -->
