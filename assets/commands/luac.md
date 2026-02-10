# TAGLINE

compiles Lua source code into bytecode

# TLDR

**Compile Lua script to bytecode**

```luac -o [output.luac] [script.lua]```

**Compile multiple scripts**

```luac -o [combined.luac] [script1.lua] [script2.lua]```

**Parse and syntax check only**

```luac -p [script.lua]```

**List compiled bytecode**

```luac -l [script.lua]```

**List with full debug info**

```luac -l -l [script.lua]```

**Strip debug info from output**

```luac -s -o [stripped.luac] [script.lua]```

**Show version**

```luac -v```

# SYNOPSIS

**luac** [_-o output_] [_-l_] [_-p_] [_-s_] [_files_]

# PARAMETERS

**-o** _FILE_
> Output compiled bytecode to file.

**-l**
> List bytecode (use twice for more detail).

**-p**
> Parse only, don't generate output.

**-s**
> Strip debug information.

**-v**
> Print version.

**--**
> Stop handling options.

# DESCRIPTION

**luac** compiles Lua source code into bytecode. The compiled output loads faster and can be distributed without source code.

Syntax checking with -p validates scripts without creating output. This is useful in build processes and CI pipelines to catch errors early.

The listing option (-l) shows the bytecode instructions, helping understand Lua's virtual machine and debug compilation issues. Double -l adds local variable and upvalue information.

Stripping debug info (-s) reduces file size but removes line numbers and local variable names, making debugging harder. Use for production deployment where size matters.

Multiple input files combine into a single output chunk. When executed, each file's code runs in order.

Bytecode format is version-specific and not portable between different Lua versions. Lua 5.1, 5.2, 5.3, and 5.4 have incompatible bytecode formats.

# CAVEATS

Bytecode not portable between Lua versions. Stripping debug info prevents meaningful stack traces. Endianness and integer size may affect portability. LuaJIT uses different bytecode format.

# HISTORY

**luac** has been part of **Lua** since early versions, developed at **PUC-Rio** (Pontifical Catholic University of Rio de Janeiro) in Brazil. Lua was created by **Roberto Ierusalimschy**, **Waldemar Celes**, and **Luiz Henrique de Figueiredo** starting in **1993**. The compiler remains the standard tool for pre-compiling Lua code.

# SEE ALSO

[lua](/man/lua)(1), [luajit](/man/luajit)(1), [luarocks](/man/luarocks)(1)
