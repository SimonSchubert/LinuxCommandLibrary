# TAGLINE

static analyzer and linter for Lua

# TLDR

**Check Lua file**

```luacheck [file.lua]```

**Check directory recursively**

```luacheck [directory]```

**Check with specific standard**

```luacheck --std [lua53] [file.lua]```

**Ignore specific warnings**

```luacheck --ignore [211] [file.lua]```

**Output in different format**

```luacheck --formatter [TAP] [file.lua]```

**Check from stdin**

```cat [file.lua] | luacheck -```

# SYNOPSIS

**luacheck** [_options_] _files_...

# PARAMETERS

**--std** _std_
> Lua version standard.

**--ignore** _codes_
> Ignore warning codes.

**--only** _codes_
> Show only specific codes.

**--globals** _names_
> Allowed globals.

**--formatter** _fmt_
> Output format (TAP, JUnit, plain).

**--codes**
> Show warning codes.

**-q**, **--quiet**
> Less verbose output.

**--config** _file_
> Config file path.

# DESCRIPTION

**luacheck** is a static analyzer and linter for Lua. It detects various issues including undefined globals, unused variables, unreachable code, and stylistic problems.

luacheck supports multiple Lua versions and can be configured per-project.

# CONFIGURATION

```lua
-- .luacheckrc
std = "lua53"
globals = {"myGlobal"}
ignore = {"212"}  -- unused argument
```

# CAVEATS

Static analysis only; won't catch runtime errors. May have false positives with dynamic code. Different standards for different Lua versions.

# HISTORY

luacheck was created by **Peter Melnichenko** as a comprehensive Lua static analysis tool, filling the gap of linting tools for Lua.

# SEE ALSO

[lua](/man/lua)(1), [luac](/man/luac)(1), [selene](/man/selene)(1)
