# TAGLINE

Autoload shell functions for lazy loading

# TLDR

**Autoload a function** by name

```autoload [function_name]```

**Autoload with immediate undefined-function handling** (zsh)

```autoload -U [function_name]```

**Autoload with zsh-style function initialization** (suppresses alias expansion)

```autoload -Uz [function_name]```

**Autoload all functions** in a directory added to fpath

```autoload -Uz $fpath[1]/*(.:t)```

**Autoload the completion system**

```autoload -Uz compinit && compinit```

**Autoload the prompt system**

```autoload -Uz promptinit && promptinit```

# SYNOPSIS

**autoload** [_-UXmtz_] [_name ..._]

# PARAMETERS

**-U**
> Suppress alias expansion when the function is loaded

**-z**
> Use zsh-style function definitions (default in zsh)

**-k**
> Use ksh-style function definitions

**-X**
> Immediately load and execute the function (used inside the function itself)

**-t**
> Enable execution tracing for the autoloaded function

**-m**
> Treat arguments as patterns for matching function names

**+X**
> Force the function to be loaded immediately without executing it

# DESCRIPTION

**autoload** marks shell function names for deferred loading. Instead of reading a function definition into memory at startup, the shell records only the function name. When the function is first called, the shell searches the directories listed in **$fpath** for a file matching the function name, reads its definition, and executes it.

This mechanism significantly reduces shell startup time when many functions are available but rarely used. The function file should contain the function body directly (not wrapped in a `function name { }` block for zsh-style autoloading).

**autoload** is essential for zsh's completion system (**compinit**), prompt themes (**promptinit**), and many other standard functions distributed with zsh.

# CAVEATS

The function file must be in a directory listed in **$fpath**. The file name must exactly match the function name. Functions autoloaded with **-U** will not have aliases expanded in their definitions, which is strongly recommended to avoid unexpected behavior. Only available as a shell builtin in zsh and ksh.

# HISTORY

**autoload** originates from **ksh** (Korn Shell), designed by **David Korn** at Bell Labs in the **1980s**. Zsh adopted and extended the concept, making it central to its modular function system. The **-U** and **-z** flags are zsh-specific additions.

# SEE ALSO

[zsh](/man/zsh)(1), [source](/man/source)(1), [compinit](/man/compinit)(1)
