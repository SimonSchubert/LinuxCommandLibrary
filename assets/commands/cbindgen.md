# TAGLINE

generate C/C++ headers from Rust FFI libraries

# TLDR

**Generate C header from Rust library**

```cbindgen -o [header.h]```

**Generate C++ header**

```cbindgen --lang c++ -o [header.hpp]```

**Generate C header explicitly**

```cbindgen --lang c -o [header.h]```

**Use specific config file**

```cbindgen --config [cbindgen.toml] -o [header.h]```

**Generate from specific crate**

```cbindgen --crate [crate_name] -o [header.h]```

**Show help**

```cbindgen --help```

# SYNOPSIS

**cbindgen** [_options_] [_crate_directory_]

# DESCRIPTION

**cbindgen** generates C and C++11 headers from Rust libraries that expose a public C API. It parses Rust source code and creates corresponding C declarations for FFI-exported types and functions.

Developed by Mozilla, it ensures generated headers match Rust's type layout and ABI guarantees.

# PARAMETERS

**-o**, **--output** _file_
> Output header file path

**--lang** _language_
> Output language: c or c++ (default: c++)

**--config** _file_
> Path to cbindgen.toml configuration

**--crate** _name_
> Crate name to generate bindings for

**--profile** _name_
> Cargo profile to use

**-v**, **--verbose**
> Enable verbose output

**-q**, **--quiet**
> Suppress output

**--verify**
> Verify existing header matches generated

**--help**
> Show help

# CONFIGURATION

**cbindgen.toml**
> Controls output language, header guards, include directives, formatting style, and type renaming rules.

# BUILD SCRIPT USAGE

Add to build.rs for automatic generation on build.

# CAVEATS

Only generates headers for pub extern "C" functions and #[repr(C)] types. Requires proper FFI annotations in Rust code. Configuration file customizes output format.

# INSTALL

```apt: sudo apt install cbindgen```

```dnf: sudo dnf install cbindgen```

```pacman: sudo pacman -S cbindgen```

```apk: sudo apk add cbindgen```

```brew: brew install cbindgen```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[cargo](/man/cargo)(1), [bindgen](/man/bindgen)(1), [rustc](/man/rustc)(1)

# RESOURCES

```[Source code](https://github.com/mozilla/cbindgen)```

```[Documentation](https://github.com/mozilla/cbindgen/blob/master/docs.md)```

<!-- verified: 2026-06-22 -->
