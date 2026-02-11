# TAGLINE

JavaScript toolchain version manager

# TLDR

**Install Node version**

```volta install node@[18]```

**Install specific version**

```volta install node@[18.17.0]```

**Install npm version**

```volta install npm@[9]```

**Install yarn**

```volta install yarn```

**Pin Node version for project**

```volta pin node@[18]```

**List installed tools**

```volta list```

**Show current versions**

```volta which node```

**Fetch without installing**

```volta fetch node@[20]```

# SYNOPSIS

**volta** [_install_] [_pin_] [_list_] [_fetch_] [_options_] [_tool_[@_version_]]

# PARAMETERS

**install** _TOOL_
> Install tool.

**pin** _TOOL_
> Pin tool version for project.

**uninstall** _TOOL_
> Remove tool.

**list** [_all_]
> List installed tools.

**fetch** _TOOL_
> Download without installing.

**run** _TOOL_
> Run tool.

**which** _TOOL_
> Show tool path.

**setup**
> Configure shell.

**--quiet**
> Suppress output.

**--verbose**
> Verbose output.

**--version**
> Show version.

# DESCRIPTION

**volta** manages JavaScript tool versions. It handles Node.js, npm, and Yarn with fast, reliable switching.

Pin configuration stores versions in package.json. When entering a project directory, Volta automatically uses pinned versions.

Installation is fast. Volta downloads pre-built binaries and caches them. Switching versions is instant.

The shim system intercepts node, npm, and npx commands. It routes to the correct version based on project configuration.

Global packages work correctly across Node versions. Volta manages them separately from Node installations.

Zero configuration is needed after setup. Version switching happens transparently based on project requirements.

# CAVEATS

Requires shell setup. Limited to Node.js ecosystem. Some edge cases with global packages. Newer than nvm/fnm.

# HISTORY

**Volta** was created by **LinkedIn** around **2019**. Written in Rust, it emphasizes speed and reliability for managing JavaScript toolchains.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [nvm](/man/nvm)(1), [fnm](/man/fnm)(1)
