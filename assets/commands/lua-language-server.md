# TAGLINE

Language Server Protocol implementation for Lua

# TLDR

**Start the language server** on stdin and stdout (what editors launch)

```lua-language-server```

**Diagnose** a workspace and print the report

```lua-language-server --check=[path/to/project]```

Diagnose and keep only **errors**

```lua-language-server --check=[path/to/project] --checklevel=Error```

Write the diagnosis as **JSON**

```lua-language-server --check=[path/to/project] --check_format=json```

**Generate documentation** for a workspace

```lua-language-server --doc=[path/to/project] --doc_out_path=[path/to/docs]```

Print the **version** and exit

```lua-language-server --version```

# SYNOPSIS

**lua-language-server** [_options_]

# PARAMETERS

**--check** _path_

> Run a diagnosis of that workspace and write the results to the log directory. The default minimum level is **Warning**.

**--checklevel** _Error_|_Warning_|_Information_|_Hint_

> With **--check**, drop diagnostics below this level. Priority from highest to lowest is Error, Warning, Information, Hint. Default **Warning**.

**--check_format** _pretty_|_json_

> How **--check** reports results. **pretty** prints a readable report on stdout. **json** writes a JSON file. Default **pretty**.

**--check_out_path** _path_

> File that receives the JSON diagnosis. Used when **--check_format** is **json**. If omitted, the server writes **check.json** under the log directory.

**--doc** _path_

> Generate documentation from that workspace.

**--doc_out_path** _path_

> Directory for files produced by **--doc**. If omitted, documentation is written in the current directory.

**--doc_update** _path_

> Update documentation files that already exist at this path.

**--logpath** _path_

> Directory for log files. Default **./log**.

**--loglevel** _error_|_warn_|_info_|_debug_|_trace_

> Minimum level written to the log. **trace** is the most verbose.

**--metapath** _path_

> Where generated standard-library definition files are written. Default **./meta**.

**--locale** _name_

> Interface language. Default **en-us**. Other names are the directories under the server's **locale** folder, for example **zh-cn**.

**--configpath** _path_

> Configuration file to load, relative to the workspace or absolute. When this is set, configuration coming from the editor is not loaded.

**--socket** _port_

> Speak LSP over this TCP port instead of stdin and stdout.

**--develop**

> Development mode. Plugins may write into the log directory.

**--version**

> Print the version and exit.

**--help**

> Print the built-in option list and exit.

# DESCRIPTION

**lua-language-server** is the Lua Language Server from the LuaLS project. Editors that speak the Language Server Protocol start it and use it for diagnostics, completion, hover, navigation, and formatting of Lua. With no mode flag it serves JSON-RPC on stdin and stdout. **--socket** serves the same protocol on a TCP port instead.

**--check** is the batch mode: it loads a workspace, runs the same diagnosis the editor would show, and prints or writes the result. **--doc** exports documentation from annotations in that workspace. **--version** and **--help** exit without starting the server.

The process is normally installed as the **lua-language-server** executable (a small launcher plus the Lua scripts and a bundled Lua runtime). The option parser accepts a bare flag or **--name=value**.

# CONFIGURATION

Editor clients send settings over LSP. On the command line, **--configpath** points at one configuration file and disables settings that would have come from the editor. **--locale** selects the language of server messages. **--logpath** and **--loglevel** control the log written at startup; the default log file is **service.log** inside the log directory. **--metapath** is where the server writes the standard-library definition files it generates.

# CAVEATS

**--check** needs a real workspace path. A diagnosis of a huge tree can take a long time and writes under **--logpath**.

**--check_format=json** is for tools. Human-readable output is the **pretty** format.

The server is a language tool, not a Lua interpreter. Running scripts is still **lua** or **luajit**.

**--help** lists **--force-accept-workspace**. The argument parser takes only letters, digits, and underscores as the option name, so that hyphenated word is not read as one option. Pass options as **--name** or **--name=value**.

# INSTALL

```pacman: sudo pacman -S lua-language-server```

```apk: sudo apk add lua-language-server```

```zypper: sudo zypper install lua-language-server```

```brew: brew install lua-language-server```

```nix: nix profile install nixpkgs#lua-language-server```

<!-- packages: 2026-11-22 -->

# SEE ALSO

[lua](/man/lua)(1), [luac](/man/luac)(1), [luajit](/man/luajit)(1), [gopls](/man/gopls)(1), [pyright](/man/pyright)(1), [clangd](/man/clangd)(1)

# RESOURCES

```[Source code](https://github.com/LuaLS/lua-language-server)```

```[Homepage](https://luals.github.io/)```

```[Documentation](https://luals.github.io/wiki/usage/)```

<!-- verified: 2026-11-22 -->
