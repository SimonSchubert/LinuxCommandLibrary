# TAGLINE

Linux shell with Lua scripting and structured pipelines

# TLDR

**Start an interactive wisp session**

```wisp```

**Run a shell command string and exit**

```wisp -c "[ls | wc -l]"```

**Run a Lua expression and exit**

```wisp -e "[for i=1,5 do print(i) end]"```

**Run a Lua script file**

```wisp -f [script.lua]```

**Evaluate Lua at the prompt** (leading colon)

```:print(42 * 10)```

**Background a job and list jobs** (inside wisp)

```sleep 30 &```

```jobs```

# SYNOPSIS

**wisp** [_-c command_] [_-e lua_] [_-f file_]

# PARAMETERS

**-c** _command_
> Execute a shell-syntax command line and exit. A leading **:** switches the string to Lua.

**-e** _lua_
> Execute a Lua expression or chunk and exit.

**-f** _file_
> Run a Lua script file (also usable via shebang `#!/usr/bin/env wisp`).

# CONFIGURATION

**~/.config/wisp/init.lua**
> User config loaded at startup. Any global Lua function defined here is callable by name as a shell command. Define **prompt()** for the interactive prompt. Copy **example-init.lua** from the repository as a starting point.

# DESCRIPTION

**wisp** is a Linux shell that uses **Lua** (not a custom DSL) for configuration and scripting, and can pass structured data (Lua tables) between consecutive pipeline stages instead of only text.

Bare prompt lines use ordinary shell syntax: external commands, pipes, redirects (`<` `>` `>>` `2>` `2>&1` `&>`), background jobs (`&`), environment assignments, quoting, brace expansion, and globbing. Job control is supported (`Ctrl-Z`, `fg`, `bg`, `jobs`, `kill %N`, `disown`, `wait`). Tab completion covers builtins, Lua functions, `$PATH` executables, and filenames; **Ctrl-R** is reverse history search.

A line starting with **:** is evaluated as Lua. User-defined Lua functions and builtins that form a "native run" stay in-process and chain Lua values (for example lists of tables) without forking. When a pipeline stage is a real external binary, wisp forks and converts between structured values and bytes at that boundary.

Builtins include **cd**, **pwd**, **echo**, **export**, **command**, **type**, **source**, **jobs**, **fg**, **bg**, **kill**, **disown**, **wait**, **exit**, and **pkg** (a thin front end to LuaRocks, requiring **luarocks** on `$PATH`).

Requires **Lua 5.4** development headers to build (`liblua5.4-dev` on Debian/Ubuntu, `lua5.4` on Arch). Install with `make && sudo make install` (default `/usr/local/bin/wisp`), or `lua bootstrap.lua build`.

# CAVEATS

Linux-focused; not a full POSIX shell. No shell-grammar `if`/`while`/`for`, heredocs, or `$1`..`$9` positional parameters — control flow belongs in Lua. Word splitting on expansion results is not POSIX-style (unquoted `$VAR` with spaces stays one argument). No sandboxing of `init.lua` (same trust model as `.bashrc`). Backgrounding an all-native pipeline is a no-op. Optional **pkg** needs LuaRocks installed separately.

# HISTORY

**wisp** is a Lua-native Linux shell emphasizing structured pipelines and real job control. Upstream is maintained at **github.com/Hinikaa/wisp** under the MIT license (vendored **linenoise** is BSD-2-Clause).

# SEE ALSO

[bash](/man/bash)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1), [nushell](/man/nushell)(1), [lua](/man/lua)(1)

# RESOURCES

```[Source code](https://github.com/Hinikaa/wisp)```

<!-- verified: 2026-08-01 -->
