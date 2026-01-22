# TLDR

**Compile to executable**

```nim c [program.nim]```

**Compile and run**

```nim c -r [program.nim]```

**Release build**

```nim c -d:release [program.nim]```

**Compile to C**

```nim c --compileOnly [program.nim]```

**Compile to JavaScript**

```nim js [program.nim]```

**Check syntax**

```nim check [program.nim]```

**Show documentation**

```nim doc [program.nim]```

# SYNOPSIS

**nim** [_command_] [_options_] _file_

# PARAMETERS

_COMMAND_
> Compilation command.

**c**
> Compile to C.

**js**
> Compile to JavaScript.

**-r**
> Run after compilation.

**-d:release**
> Release mode.

**check**
> Check without compiling.

**doc**
> Generate documentation.

**--help**
> Display help information.

# DESCRIPTION

**nim** is the Nim programming language compiler. It compiles to C, JavaScript, and other backends.

The tool produces efficient executables. Features Python-like syntax with static typing.

nim compiles Nim programs.

# CAVEATS

Requires C compiler for native builds. Garbage collected by default. Growing ecosystem.

# HISTORY

Nim was created by **Andreas Rumpf** starting in 2005, originally named Nimrod.

# SEE ALSO

[nimble](/man/nimble)(1), [gcc](/man/gcc)(1), [python](/man/python)(1)

