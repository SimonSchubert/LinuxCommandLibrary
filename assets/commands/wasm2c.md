# TAGLINE

Convert WebAssembly to portable C code

# TLDR

**Convert to C**

```wasm2c [input.wasm] -o [output.c]```

**Generate header**

```wasm2c [input.wasm] -o [output.c] --header=[output.h]```

**Module name**

```wasm2c [input.wasm] -o [output.c] --module-name=[mymod]```

# SYNOPSIS

**wasm2c** [_-o output_] [_--header file_] [_options_] _input_

# PARAMETERS

**-o** _FILE_
> Output C file.

**--header** _FILE_
> Generate header.

**--module-name** _NAME_
> C module name.

**--help**
> Show help.

# DESCRIPTION

**wasm2c** is a tool from the WABT (WebAssembly Binary Toolkit) that translates WebAssembly binary modules into portable C source code. The generated C code can be compiled with any standard C compiler, enabling WebAssembly modules to run natively without a WebAssembly runtime.

The tool produces both a C source file containing the translated module logic and an optional header file with function declarations and type definitions. A custom module name can be specified to control the naming of generated symbols, which is useful when linking multiple translated modules together.

This approach is useful for embedding WebAssembly functionality in C/C++ projects, running WebAssembly on platforms without a runtime, or analyzing module behavior through the generated source code.

# CAVEATS

Generated code large. Slow compilation. Part of WABT.

# HISTORY

**wasm2c** is part of **WABT** (WebAssembly Binary Toolkit), converting WebAssembly to portable C code.

# SEE ALSO

[wasm2wat](/man/wasm2wat)(1), [wat2wasm](/man/wat2wasm)(1), [wasmtime](/man/wasmtime)(1)
