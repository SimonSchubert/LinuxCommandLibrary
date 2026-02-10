# TAGLINE

JavaScript tooling for WebAssembly Components

# TLDR

**Transpile WASM component**

```jco transpile [component.wasm] -o [output/]```

**Create component from module**

```jco componentize [module.wasm] -o [component.wasm]```

**Inspect component**

```jco print [component.wasm]```

**Run component**

```jco run [component.wasm]```

**Generate types**

```jco types [component.wasm] -o [types/]```

# SYNOPSIS

**jco** _command_ [_options_] _file_

# PARAMETERS

**transpile** _FILE_
> Convert to JavaScript.

**componentize** _FILE_
> Create component from core module.

**print** _FILE_
> Print component info.

**run** _FILE_
> Execute component.

**types** _FILE_
> Generate TypeScript types.

**-o** _DIR_
> Output directory.

**--help**
> Display help information.

# DESCRIPTION

**jco** is JavaScript tooling for WebAssembly Components. It transpiles WASM components to JavaScript for browser/Node.js use.

The tool works with the component model standard. It generates JavaScript bindings and TypeScript definitions.

# CAVEATS

Experimental WASM standard. Bytecode Alliance project. Node.js tool.

# HISTORY

jco was created by the **Bytecode Alliance** as JavaScript tooling for the WebAssembly Component Model standard.

# SEE ALSO

[wasm-tools](/man/wasm-tools)(1), [wasmtime](/man/wasmtime)(1), [wasm-bindgen](/man/wasm-bindgen)(1)
