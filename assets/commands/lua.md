# TAGLINE

programming language interpreter

# TLDR

**Start interactive interpreter**

```lua```

**Run script**

```lua [script.lua]```

**Execute code**

```lua -e "[print('Hello')]"```

**Run with arguments**

```lua [script.lua] [arg1] [arg2]```

**Check syntax only**

```lua -p [script.lua]```

**Interactive after script**

```lua -i [script.lua]```

# SYNOPSIS

**lua** [_options_] [_script_] [_args_]

# PARAMETERS

_SCRIPT_
> Lua script file.

_ARGS_
> Script arguments.

**-e** _CODE_
> Execute string.

**-i**
> Interactive mode after script.

**-l** _MODULE_
> Require module.

**-p**
> Parse only (syntax check).

**--help**
> Display help information.

# DESCRIPTION

**lua** is the Lua programming language interpreter. Lua is lightweight and embeddable.

The tool runs Lua scripts and provides an interactive REPL. Commonly used for game scripting and configuration.

# CAVEATS

Multiple versions exist (5.1-5.4). Some incompatibilities between versions. Embedding varies.

# HISTORY

Lua was created in 1993 at **PUC-Rio** in Brazil, designed as a lightweight embeddable scripting language.

# SEE ALSO

[luajit](/man/luajit)(1), [luac](/man/luac)(1)

