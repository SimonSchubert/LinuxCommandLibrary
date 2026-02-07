# TAGLINE

compile C/C++ to WebAssembly or JavaScript

# TLDR

**Compile C to WebAssembly**

```emcc [input.c] -o [output.wasm]```

**Compile to JavaScript**

```emcc [input.c] -o [output.js]```

**Compile with HTML harness**

```emcc [input.c] -o [output.html]```

**Compile C++**

```em++ [input.cpp] -o [output.js]```

**Optimize for size**

```emcc -Os [input.c] -o [output.wasm]```

**Optimize for speed**

```emcc -O3 [input.c] -o [output.wasm]```

**Export specific functions**

```emcc -sEXPORTED_FUNCTIONS=['_main','_myFunc'] [input.c] -o [output.js]```

# SYNOPSIS

**emcc** [_options_] _files_

# PARAMETERS

**-o** _file_
> Output file (.js, .wasm, .html).

**-O0** to **-O3**, **-Os**, **-Oz**
> Optimization levels.

**-s** _SETTING=VALUE_
> Emscripten-specific settings.

**-I** _dir_
> Include directory.

**-L** _dir_
> Library directory.

**-l** _lib_
> Link library.

**-g**
> Generate debug information.

**--preload-file** _path_
> Preload file into virtual filesystem.

**--embed-file** _path_
> Embed file in output.

**-sMODULARIZE**
> Output as ES6 module.

# CONFIGURATION

**.emscripten**
> Emscripten configuration file containing SDK paths and compiler settings.

# DESCRIPTION

**emcc** (Emscripten Compiler Frontend) compiles C and C++ code to WebAssembly (Wasm) or JavaScript using LLVM and Emscripten. It enables running native code in web browsers and other Wasm runtimes.

Emscripten provides a compatibility layer for POSIX APIs, OpenGL (via WebGL), and SDL. It can compile entire codebases including games and applications to run in browsers.

# CAVEATS

Not all C/C++ features work identically. File system access requires virtual filesystem. Threading needs SharedArrayBuffer. Performance differs from native. Large applications may have long compile times. Browser security restrictions apply.

# HISTORY

Emscripten was created by **Alon Zakai** at Mozilla in **2011**, initially targeting asm.js before WebAssembly existed. When WebAssembly launched in **2017**, Emscripten became the primary compiler toolchain for bringing C/C++ to the web.

# SEE ALSO

[clang](/man/clang)(1), [wasm-ld](/man/wasm-ld)(1), [wasm2wat](/man/wasm2wat)(1)
