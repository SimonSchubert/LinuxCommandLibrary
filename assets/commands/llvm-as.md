# TAGLINE

assembler that reads LLVM assembly language and outputs LLVM bitcode

# TLDR

**Assemble LLVM IR to bitcode**

```llvm-as [input.ll] -o [output.bc]```

**Assemble from stdin**

```cat [input.ll] | llvm-as -o [output.bc]```

**Check syntax only**

```llvm-as -disable-output [input.ll]```

**Output to stdout**

```llvm-as [input.ll] -o -```

# SYNOPSIS

**llvm-as** [_options_] [_filename_]

# PARAMETERS

**-o** _filename_
> Output filename.

**-f**
> Enable binary on terminal.

**-disable-output**
> Don't write output (syntax check).

**-data-layout** _layout_
> Override data layout.

**--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**llvm-as** is the LLVM assembler that reads LLVM assembly language (.ll files) and outputs LLVM bitcode (.bc files). It's the inverse of llvm-dis.

The tool converts human-readable LLVM intermediate representation into the binary bitcode format used by other LLVM tools.

# EXAMPLE

```llvm
; input.ll
define i32 @main() {
  ret i32 0
}
```

```bash
llvm-as input.ll -o output.bc
```

# CAVEATS

Input must be valid LLVM IR. Bitcode format may change between LLVM versions. Use llvm-dis for reverse operation.

# HISTORY

llvm-as has been part of LLVM since the project's inception by **Chris Lattner** at the University of Illinois in **2000**.

# SEE ALSO

[llvm-dis](/man/llvm-dis)(1), [llc](/man/llc)(1), [opt](/man/opt)(1), [clang](/man/clang)(1)
