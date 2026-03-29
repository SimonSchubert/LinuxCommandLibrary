# TAGLINE

Just-In-Time Compiler for the Lua Language

# TLDR

**Start interactive interpreter**

```luajit```

**Run a Lua script**

```luajit [script.lua]```

**Execute a string of Lua code**

```luajit -e "[print('Hello')]"```

**Run a script with arguments**

```luajit [script.lua] [arg1] [arg2]```

**Save bytecode** to a file

```luajit -b [script.lua] [script.out]```

**Load a library** before running a script

```luajit -l [library] [script.lua]```

**Enter interactive mode** after running a script

```luajit -i [script.lua]```

# SYNOPSIS

**luajit** [_options_] [_script_ [_args_]]

# PARAMETERS

**-e** _chunk_
> Run the given chunk of Lua code.

**-l** _library_
> Load the named library, equivalent to require("library").

**-b** _..._
> Save or list bytecode. Run without arguments to get help on options.

**-j** _command_
> Perform a LuaJIT control command (e.g., -jv for verbose trace info, -jdump for detailed trace dumps).

**-O**[_opt_]
> Control LuaJIT optimizations. -O0 disables all optimizations, -O (default) is equivalent to -O3.

**-i**
> Run in interactive mode after executing the script or code.

**-v**
> Show LuaJIT version.

**-E**
> Ignore environment variables.

**--**
> Stop processing options.

# DESCRIPTION

**luajit** is a Just-In-Time compiler for the Lua programming language. It provides significantly faster execution than the standard Lua interpreter through trace-based JIT compilation, an efficient interpreter, and a built-in FFI (Foreign Function Interface).

LuaJIT is fully compatible with Lua 5.1 and includes several extensions. Script arguments are passed via the global `arg` table. Interactive mode is activated automatically when no script or `-e` option is provided.

# CAVEATS

LuaJIT is compatible with Lua 5.1 only, not Lua 5.2 or later. The FFI library requires knowledge of C types and native code. JIT compilation is not available on all architectures. The `-b` bytecode format is not compatible with standard Lua bytecode.

# HISTORY

LuaJIT was created by **Mike Pall** starting in 2005. LuaJIT 2.0, featuring the current trace compiler architecture, was released in 2012.

# SEE ALSO

[lua](/man/lua)(1), [luac](/man/luac)(1)

