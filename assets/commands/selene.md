# TLDR

**Lint Lua files** in the current directory

```selene .```

**Lint specific files**

```selene [path/to/file1.lua] [path/to/file2.lua]```

**Lint with a custom configuration file**

```selene --config [path/to/selene.toml] [path/to/files]```

**Lint and suppress summary** information

```selene --no-summary [path/to/files]```

**Lint with quiet output** showing only essential information

```selene --quiet [path/to/files]```

**Lint with JSON output** for tooling integration

```selene --display-style json [path/to/files]```

**Validate configuration file** for errors

```selene validate-config```

# SYNOPSIS

**selene** [_flags_] [_options_] _files_...

**selene** _subcommand_

# PARAMETERS

**--allow-warnings**
> Exit successfully when only warnings (no errors) occur.

**--color** _color_
> Control color output. Possible values: **Always**, **Auto**, **Never**. Default: **Auto**.

**--config** _config_
> Path to a TOML configuration file. Default: **selene.toml** in current directory.

**--display-style** _style_
> Set the output display format. Possible values: **Json**, **Json2**, **Rich**, **Quiet**.

**--num-threads** _n_
> Number of threads to use. Defaults to the number of logical CPU cores.

**--pattern** _pattern_
> A glob pattern to match files to check. Can be specified multiple times.

**--no-exclude**
> Do not respect exclude patterns from configuration.

**-n**, **--no-summary**
> Suppress the summary information at the end of linting.

**-q**, **--quiet**
> Display only essential information. Equivalent to **--display-style=quiet**.

**-h**, **--help**
> Print help information.

**-V**, **--version**
> Print version information.

# SUBCOMMANDS

**validate-config**
> Report any errors in the selene configuration file.

**capabilities**
> Print the capabilities of the current selene build.

**generate-roblox-std**
> Generate a Roblox standard library definition.

**update-roblox-std**
> Update the Roblox standard library definition.

**upgrade-std**
> Upgrade standard library format to the latest version.

**help**
> Print help for selene or a specific subcommand.

# DESCRIPTION

**selene** is a fast, modern Lua linter written in Rust. It analyzes Lua code to detect bugs, style issues, and potential problems before runtime. The tool supports standard Lua as well as Luau (Roblox's Lua dialect) through configurable standard libraries.

Configuration is done via a **selene.toml** file where you can enable or disable specific lints, set their severity levels, and configure standard library definitions. The linter integrates well with editors and CI/CD pipelines through its JSON output modes.

selene is particularly popular in the Roblox development community but works for any Lua project. It can be extended with custom lint rules and standard library definitions.

# CAVEATS

selene requires a **selene.toml** configuration file for customization. Without one, it uses default settings which may not match your Lua variant or coding standards. For Luau/Roblox projects, you need to generate or configure the appropriate standard library definitions.

# HISTORY

**selene** was created by Kampfkarren (Lucas) and first released as an open-source project on GitHub. It was written in Rust for performance and safety, gaining popularity particularly within the Roblox development community where fast, reliable Lua linting is essential. The project continues active development with regular releases adding support for new Luau features and additional lint rules.

# SEE ALSO

[luacheck](/man/luacheck)(1), [stylua](/man/stylua)(1), [lua](/man/lua)(1)
