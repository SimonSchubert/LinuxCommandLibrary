# TAGLINE

Opinionated Lua code formatter

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
> Glob pattern for filtering files. Use -- to separate glob patterns from file arguments.

**--verify**
> Verify output by re-parsing formatted code to ensure no syntax errors were introduced.

**--syntax** _SYNTAX_
> Lua syntax version: All (default), Lua51, Lua52, Lua53, Lua54, LuaJIT, Luau, CfxLua.

**--respect-ignores**
> Respect .styluaignore rules even for files passed directly on the command line.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**stylua** formats Lua code according to configurable style rules. It enforces consistent formatting automatically.

Configuration in stylua.toml or .stylua.toml sets project preferences. Options include indentation, line width, quote style, and more. If no config file is found, StyLua also checks for an .editorconfig file.

Check mode verifies formatting without changes. It returns non-zero exit code if files would be reformatted, suitable for CI.

Diff mode shows what would change. This helps review formatting before applying it.

The formatter handles various Lua versions and can be configured for game-specific variants like Roblox Luau via the --syntax flag or syntax option in the config file.

Integration with editors enables format-on-save. CI integration ensures consistent style across contributions. A .styluaignore file (with .gitignore-like syntax) can be used to exclude files from formatting.

# CONFIGURATION

**stylua.toml** or **.stylua.toml**
> Project configuration file specifying formatting rules such as column width, indent type, quote style, and call parentheses behavior.

**.styluaignore**
> Ignore file with .gitignore-like syntax for excluding files from formatting.

# CAVEATS

Some style preferences can't be configured. Complex expressions may format unexpectedly. Column width is a guide for line wrapping, not a hard limit.

# HISTORY

**StyLua** was created by **JohnnyMorganz** around **2020**. Written in Rust, it provides fast, opinionated Lua formatting similar to Prettier for JavaScript.

# SEE ALSO

[lua](/man/lua)(1), [luacheck](/man/luacheck)(1), [selene](/man/selene)(1)
