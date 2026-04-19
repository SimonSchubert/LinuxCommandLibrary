# TAGLINE

programming language compiler

# TLDR

**Compile to executable**

```nim c [program.nim]```

**Compile and run**

```nim c -r [program.nim]```

**Release build**

```nim c -d:release [program.nim]```

**Generate C source without linking**

```nim c --compileOnly [program.nim]```

**Compile to JavaScript**

```nim js [program.nim]```

**Compile to C++**

```nim cpp [program.nim]```

**Check syntax and semantics**

```nim check [program.nim]```

**Generate HTML documentation**

```nim doc [program.nim]```

# SYNOPSIS

**nim** [_command_] [_options_] _file_

# PARAMETERS

_COMMAND_
> Compilation command.

**c** / **compile**
> Compile to C (default backend).

**cpp**
> Compile to C++.

**js**
> Compile to JavaScript.

**objc**
> Compile to Objective-C.

**check**
> Validate syntax and semantics without code generation.

**doc**
> Generate HTML documentation from source.

**-r**, **--run**
> Run the program after compilation.

**-c**, **--compileOnly**
> Generate code without linking.

**-d:release**
> Enable release optimizations.

**-d:danger**
> Disable all runtime checks for maximum speed.

**-o:**_FILE_
> Set the output filename.

**--opt:**_speed|size|none_
> Optimization target.

**--mm:**_arc|orc|refc_
> Select memory management strategy.

**--threads:on**
> Enable multithreading support.

**-f**, **--forceBuild**
> Force full rebuild of all modules.

**--help**
> Display help information.

# DESCRIPTION

**nim** is the Nim programming language compiler. It compiles to C, JavaScript, and other backends.

The tool produces efficient executables. Features Python-like syntax with static typing.

# CAVEATS

Requires C compiler for native builds. Garbage collected by default. Growing ecosystem.

# HISTORY

Nim was created by **Andreas Rumpf** starting in 2005, originally named Nimrod.

# SEE ALSO

[nimble](/man/nimble)(1), [gcc](/man/gcc)(1), [python](/man/python)(1)

