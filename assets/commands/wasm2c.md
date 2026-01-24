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

**wasm2c** converts WASM to C. It transpiles modules.

Portable C output. Compile anywhere.

No WASM runtime needed. Native execution.

Header generation. API definitions.

Part of WABT. WebAssembly tools.

# CAVEATS

Generated code large. Slow compilation. Part of WABT.

# HISTORY

**wasm2c** is part of **WABT** (WebAssembly Binary Toolkit), converting WebAssembly to portable C code.

# SEE ALSO

[wasm2wat](/man/wasm2wat)(1), [wat2wasm](/man/wat2wasm)(1), [wasmtime](/man/wasmtime)(1)
