# TAGLINE

ahead-of-time Lua compiler to native executables

# TLDR

**Compile** a Lua script to a native executable

```clx [file.lua]```

Compile with **custom output** name

```clx [file.lua] --output [name]```

Optimize for **speed** or **size**

```clx [file.lua] --fast
clx [file.lua] --size```

Emit **C++ source** only (do not compile)

```clx --cpp [file.lua]```

Produce an **object file** or **static module**

```clx --object [file.lua]
clx --static [file.lua]```

**Minimal** runtime (base + package modules only)

```clx [file.lua] --minimal```

# SYNOPSIS

**clx** [_options_] _file.lua_

# DESCRIPTION

**clx** is a cross-platform ahead-of-time (AOT) Lua compiler and runtime that generates standalone native executables through a modern C++ toolchain (Clang, GCC, or MSVC). It targets Lua 5.5 compatibility and aims for fast startup, deployable binaries, and predictable performance without a bytecode interpreter.

Unknown flags are forwarded to the backend C++ compiler (for example **-O2**). Size-oriented builds can produce compact executables; **--minimal** links only base and package modules.

# PARAMETERS

**--output** _name_
> Output executable name

**--object** / **--static** / **--cpp**
> Emit object file, static library, or C++ source instead of a full executable

**--fast** / **--size** / **--debug**
> Optimize for speed, size (default orientation), or debug builds

**--minimal**
> Link only base and package modules

**--version** / **--help**
> Version or usage

# CAVEATS

Dynamic loading (**load**, **dofile**, **loadfile**, **string.dump**) and full **debug** support are limited in a pure AOT model. The traditional Lua C API is not supported; native modules use the clx C++ API. The compiler used to build clx is fixed at build time for ABI compatibility with generated code.

# SEE ALSO

[lua](/man/lua)(1), [luajit](/man/luajit)(1)

# RESOURCES

```[Source code](https://github.com/samyeyo/clx)```

```[Homepage](https://samyeyo.github.io/clx)```

```[Documentation](https://github.com/samyeyo/clx/blob/main/doc/index.md)```

<!-- verified: 2026-07-14 -->
