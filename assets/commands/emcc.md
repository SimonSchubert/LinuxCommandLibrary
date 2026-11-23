# TAGLINE

compile C/C++ to WebAssembly or JavaScript

# TLDR

**Compile C to a standalone WebAssembly module**

```emcc [input.c] -o [output.wasm]```

**Compile to a .wasm module plus JavaScript loader**

```emcc [input.c] -o [output.js]```

**Compile with HTML harness**

```emcc [input.c] -o [output.html]```

**Compile C++**

```em++ [input.cpp] -o [output.js]```

**Optimize for size**

```emcc -Os [input.c] -o [output.wasm]```

**Optimize for speed**

```emcc -O3 [input.c] -o [output.wasm]```

**Export specific functions** and runtime helpers

```emcc -sEXPORTED_FUNCTIONS=_main,_myFunc -sEXPORTED_RUNTIME_METHODS=ccall,cwrap [input.c] -o [output.js]```

**Build** an ES6 module factory with growable memory

```emcc -O2 -sMODULARIZE -sEXPORT_ES6 -sALLOW_MEMORY_GROWTH [input.c] -o [output.mjs]```

**Bundle** an asset directory into the virtual filesystem

```emcc [input.c] --preload-file [assets] -o [index.html]```

**Enable** threads (requires SharedArrayBuffer)

```emcc -pthread -sPTHREAD_POOL_SIZE=[4] [input.c] -o [output.js]```

# SYNOPSIS

**emcc** [_options_] _files_

# PARAMETERS

**-o** _file_
> Output file. **.js** emits JavaScript plus a **.wasm** file, **.html** adds an HTML shell, **.mjs** emits an ES6 module, and **.wasm** emits a standalone module.

**-O0** to **-O3**, **-Os**, **-Oz**
> Optimization levels.

**-s**_SETTING_[=_VALUE_]
> Emscripten-specific setting (e.g. **-sALLOW_MEMORY_GROWTH**, **-sEXPORTED_FUNCTIONS=_main**). A bare boolean setting means **=1**.

**-I** _dir_
> Include directory.

**-L** _dir_
> Library directory.

**-l** _lib_
> Link library.

**-g**
> Generate debug information (DWARF in the Wasm, readable JavaScript).

**-pthread**
> Enable POSIX threads support via Web Workers.

**--closure** _0|1|2_
> Run the Closure Compiler on the generated JavaScript to shrink it.

**--js-library** _file_
> Link a JavaScript library implementing imported C functions.

**--pre-js** _file_, **--post-js** _file_
> Prepend or append JavaScript code to the output.

**--shell-file** _file_
> Custom HTML template used when the output is **.html**.

**--preload-file** _path_
> Preload file into virtual filesystem.

**--embed-file** _path_
> Embed a file or directory directly into the generated code.

**-sMODULARIZE**
> Wrap the output in a factory function that returns a Promise of the module instance; combine with **-sEXPORT_ES6** to emit an ES6 module.

**-sWASM=0**
> Emit asm.js-style JavaScript instead of WebAssembly.

# CONFIGURATION

**.emscripten**
> Configuration file containing LLVM, Binaryen and Node.js paths; usually managed by **emsdk** and located via **EM_CONFIG**.

# DESCRIPTION

**emcc** (Emscripten Compiler Frontend) compiles C and C++ code to WebAssembly (Wasm) or JavaScript using LLVM and Emscripten. It works as a drop-in replacement for **gcc**/**clang**, and **em++** is the C++ variant. Build systems are wrapped with **emconfigure** and **emcmake**, and the toolchain is normally installed and activated with **emsdk**.

Emscripten provides a compatibility layer for POSIX APIs, OpenGL (via WebGL), and SDL. It can compile entire codebases including games and applications to run in browsers.

# CAVEATS

Not all C/C++ features work identically. File system access requires virtual filesystem. Threading needs SharedArrayBuffer. Performance differs from native. Large applications may have long compile times. Browser security restrictions apply.

# HISTORY

Emscripten was started by **Alon Zakai** in **2010** and developed at Mozilla, originally compiling LLVM bitcode to plain JavaScript. Its optimizable JavaScript subset was formalized as **asm.js** in **2013**, which in turn led to **WebAssembly**, shipped in all major browsers in **2017**. Emscripten now uses the upstream LLVM WebAssembly backend and is maintained largely by Google.

# SEE ALSO

[clang](/man/clang)(1), [wasm2wat](/man/wasm2wat)(1), [wasm-opt](/man/wasm-opt)(1), [node](/man/node)(1)

# RESOURCES

```[Source code](https://github.com/emscripten-core/emscripten)```

```[Homepage](https://emscripten.org)```

```[Documentation](https://emscripten.org/docs/tools_reference/emcc.html)```

<!-- verified: 2026-11-23 -->
