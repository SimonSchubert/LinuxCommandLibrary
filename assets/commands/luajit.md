# TAGLINE

just-In-Time compiler for Lua

# TLDR

**Start interactive interpreter**

```luajit```

**Run script**

```luajit [script.lua]```

**Execute code**

```luajit -e "[print('Hello')]"```

**Run with arguments**

```luajit [script.lua] [arg1] [arg2]```

**Compile to bytecode**

```luajit -b [script.lua] [script.out]```

**Interactive after script**

```luajit -i [script.lua]```

# SYNOPSIS

**luajit** [_options_] [_script_] [_args_]

# PARAMETERS

_SCRIPT_
> Lua script file.

_ARGS_
> Script arguments.

**-e** _CODE_
> Execute string.

**-b**
> Compile to bytecode.

**-i**
> Interactive mode.

**-j** _CMD_
> JIT control command.

**--help**
> Display help information.

# DESCRIPTION

**luajit** is a Just-In-Time compiler for Lua. It provides significantly faster execution than standard Lua.

The tool is Lua 5.1 compatible with extensions. Widely used for high-performance Lua applications.

# CAVEATS

Lua 5.1 compatible only. FFI requires native code knowledge. Platform-specific optimizations.

# HISTORY

LuaJIT was created by **Mike Pall** to provide a high-performance Lua implementation with JIT compilation.

# SEE ALSO

[lua](/man/lua)(1), [luac](/man/luac)(1)

