# TLDR

**Format file**

```stylua [script.lua]```

**Format multiple files**

```stylua [file1.lua] [file2.lua]```

**Format directory**

```stylua [src/]```

**Check formatting** (don't modify)

```stylua --check [script.lua]```

**Show diff** (don't modify)

```stylua --diff [script.lua]```

**Format from stdin**

```cat [script.lua] | stylua -```

**Use specific config**

```stylua --config [stylua.toml] [script.lua]```

# SYNOPSIS

**stylua** [_--check_] [_--diff_] [_--config file_] [_options_] [_files_]

# PARAMETERS

**--check**
> Check without formatting.

**--diff**
> Show diff without formatting.

**--config** _FILE_
> Configuration file.

**--search-parent-directories**
> Search for config in parents.

**--stdin-filepath** _PATH_
> Path for stdin input.

**--column-width** _N_
> Line width.

**--indent-type** _TYPE_
> Tabs or spaces.

**--indent-width** _N_
> Indent width.

**--line-endings** _TYPE_
> Unix or windows.

**--quote-style** _STYLE_
> String quote style.

**--call-parentheses** _STYLE_
> Call parentheses style.

**-g**, **--glob** _PATTERN_
> Glob pattern.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**stylua** formats Lua code according to configurable style rules. It enforces consistent formatting automatically.

Configuration in stylua.toml or .stylua.toml sets project preferences. Options include indentation, line width, quote style, and more.

Check mode verifies formatting without changes. It returns non-zero exit code if files would be reformatted, suitable for CI.

Diff mode shows what would change. This helps review formatting before applying it.

The formatter handles various Lua versions and can be configured for game-specific variants like Roblox Luau.

Integration with editors enables format-on-save. CI integration ensures consistent style across contributions.

# CAVEATS

Some style preferences can't be configured. Complex expressions may format unexpectedly. Very long lines may not wrap perfectly.

# HISTORY

**StyLua** was created by **JohnnyMorganz** around **2020**. Written in Rust, it provides fast, opinionated Lua formatting similar to Prettier for JavaScript.

# SEE ALSO

[lua](/man/lua)(1), [luacheck](/man/luacheck)(1), [selene](/man/selene)(1)
