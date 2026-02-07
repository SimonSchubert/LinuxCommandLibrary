# TAGLINE

Generate Rust FFI bindings from C/C++ headers

# TLDR

**Generate Rust bindings** from a C header

```bindgen [input.h] -o [bindings.rs]```

**Generate bindings with allowlist**

```bindgen [input.h] --allowlist-function "[regex]" --allowlist-type "[regex]" -o [bindings.rs]```

**Generate bindings with blocklist**

```bindgen [input.h] --blocklist-type "[type_name]" -o [bindings.rs]```

**Add include path** for headers

```bindgen [input.h] -- -I[/path/to/includes] -o [bindings.rs]```

**Generate bindings** for a C++ header

```bindgen [input.hpp] --enable-cxx-namespaces -o [bindings.rs]```

**Use specific clang arguments**

```bindgen [input.h] -- -std=c11 -DFOO=1 -o [bindings.rs]```

**Generate with derive traits**

```bindgen [input.h] --with-derive-default --with-derive-eq -o [bindings.rs]```

# SYNOPSIS

**bindgen** [_options_] _header_ [**--**] [_clang-args_]

# DESCRIPTION

**bindgen** automatically generates Rust FFI (Foreign Function Interface) bindings to C and C++ libraries. It parses C/C++ header files using libclang and produces Rust code that allows calling native functions from Rust.

The generated bindings include function declarations, struct definitions, enums, constants, and type aliases. bindgen handles complex types like function pointers, unions, and opaque types, mapping them to appropriate Rust equivalents.

Typically used in build.rs scripts to generate bindings at compile time, ensuring bindings stay synchronized with library headers. It's a key tool in the Rust ecosystem for interfacing with existing C/C++ code.

# PARAMETERS

**-o** _file_
> Write output to file instead of stdout.

**--allowlist-function** _regex_
> Only generate bindings for matching functions.

**--allowlist-type** _regex_
> Only generate bindings for matching types.

**--blocklist-type** _regex_
> Exclude matching types from bindings.

**--blocklist-function** _regex_
> Exclude matching functions.

**--enable-cxx-namespaces**
> Enable C++ namespace support.

**--with-derive-default**
> Add Default derive to structs.

**--with-derive-eq**
> Add Eq derive to applicable types.

**--with-derive-hash**
> Add Hash derive to applicable types.

**--no-layout-tests**
> Skip generating layout tests.

**--generate** _items_
> Specify what to generate (functions, types, vars, methods).

**--opaque-type** _regex_
> Treat matching types as opaque.

**--**
> Separator for clang arguments.

# CAVEATS

Requires libclang to be installed. C++ support is more limited than C. Some C constructs like bitfields may need manual adjustment. Generated code may require the libc crate. Build-time generation requires libclang on all build machines. Complex macros are not translated.

# HISTORY

**bindgen** was originally created by **Jyun-Yan You** in **2013** and has been maintained by the Rust project community. It became an official rust-lang project and is now maintained under the **rust-lang/rust-bindgen** repository. The tool has evolved significantly to handle more complex C/C++ patterns and improve the quality of generated Rust code, becoming essential for Rust's interoperability story.

# SEE ALSO

[cargo](/man/cargo)(1), [rustc](/man/rustc)(1), [cbindgen](/man/cbindgen)(1), [clang](/man/clang)(1)
