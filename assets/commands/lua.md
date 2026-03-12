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

**Show version**

```lua -v```

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

**-v**
> Show version information.

**-W**
> Turn warnings on.

**--help**
> Display help information.

# DESCRIPTION

**lua** is the interpreter for the Lua programming language. Lua is a lightweight, high-performance, embeddable scripting language designed for extending applications. It features automatic memory management, first-class functions, and a simple but powerful data structuring mechanism (tables).

The interpreter runs Lua scripts and provides an interactive REPL for testing code. Lua is widely used for game scripting (World of Warcraft, Roblox), embedded systems, configuration (Neovim, Nginx via OpenResty), and as an extension language in applications like Redis and Wireshark.

# CAVEATS

Multiple versions exist (5.1-5.4). Some incompatibilities between versions. Embedding varies.

# HISTORY

Lua was created in 1993 at **PUC-Rio** in Brazil, designed as a lightweight embeddable scripting language.

# SEE ALSO

[luajit](/man/luajit)(1), [luac](/man/luac)(1)

