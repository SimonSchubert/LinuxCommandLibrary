# TAGLINE

static analyzer and linter for Lua

# TLDR

**Check a Lua file**

```luacheck [file.lua]```

**Check all Lua files in a directory recursively**

```luacheck [directory]```

**Check with a specific Lua standard**

```luacheck --std [lua53] [file.lua]```

**Ignore specific warning codes**

```luacheck --ignore [211] [file.lua]```

**Check showing warning codes in output**

```luacheck --codes [file.lua]```

**Output in a specific format**

```luacheck --formatter [TAP|JUnit|plain|visual_studio] [file.lua]```

**Check multiple files in parallel**

```luacheck -j [4] [file1.lua] [file2.lua]```

**Check from stdin with a custom filename**

```cat [file.lua] | luacheck --filename [file.lua] -```

# SYNOPSIS

**luacheck** [_options_] _files_...

# PARAMETERS

**--std** _std_
> Set standard globals (lua51, lua52, lua53, lua54, luajit, ngx_lua, love, busted, min, max, none).

**-g**, **--no-global**
> Exclude warnings about global variables.

**-u**, **--no-unused**
> Exclude warnings about unused variables and values.

**-r**, **--no-redefined**
> Exclude warnings about redefined variables.

**-a**, **--no-unused-args**
> Exclude warnings about unused arguments and loop variables.

**-s**, **--no-unused-secondaries**
> Exclude warnings about unused variables set alongside used ones.

**-d**, **--allow-defined**
> Allow implicit global definitions via assignment.

**-t**, **--allow-defined-top**
> Allow implicit global definitions at top level scope only.

**-i**, **--ignore** _patt_ ...
> Filter out warnings matching patterns.

**-o**, **--only** _patt_ ...
> Show only warnings matching patterns.

**-e**, **--enable** _patt_ ...
> Re-enable warnings matching patterns.

**--globals** _names_ ...
> Add custom allowed global variables.

**--read-globals** _names_ ...
> Add read-only global variables.

**--max-line-length** _length_
> Set maximum line length (default: 120). Use **--no-max-line-length** to disable.

**--max-cyclomatic-complexity** _limit_
> Set maximum cyclomatic complexity for functions.

**--formatter** _fmt_
> Output format (default, TAP, JUnit, visual_studio, plain).

**--codes**
> Show warning codes in output.

**--ranges**
> Show column ranges for warnings.

**-q**, **--quiet**
> Suppress output for files without warnings. Use **-qq** or **-qqq** for less output.

**-j**, **--jobs** _num_
> Check files in parallel (requires LuaLanes).

**--cache** [_file_]
> Enable caching of results (default: .luacheckcache).

**--config** _file_
> Path to custom configuration file (default: .luacheckrc).

**--no-config**
> Disable configuration file loading.

**--no-color**
> Disable colorized output.

**--exclude-files** _glob_ ...
> Skip files matching these glob patterns.

**--include-files** _glob_ ...
> Only check files matching these glob patterns.

# DESCRIPTION

**luacheck** is a static analyzer and linter for Lua. It detects various issues including undefined globals, unused variables, unreachable code, and stylistic problems.

luacheck supports multiple Lua versions and can be configured per-project via a **.luacheckrc** file or inline comments.

# CONFIGURATION

```lua
-- .luacheckrc
std = "lua53"
globals = {"myGlobal"}
ignore = {"212"}  -- unused argument
max_line_length = 120
```

# CAVEATS

Static analysis only; won't catch runtime errors. May have false positives with dynamic code. Parallel checking with **-j** requires the LuaLanes library.

# HISTORY

luacheck was created by **Peter Melnichenko** as a comprehensive Lua static analysis tool, filling the gap of linting tools for Lua.

# SEE ALSO

[lua](/man/lua)(1), [luac](/man/luac)(1), [selene](/man/selene)(1), [stylua](/man/stylua)(1)
