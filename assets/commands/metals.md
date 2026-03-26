# TAGLINE

Scala language server with rich IDE features

# TLDR

**Install Metals using Coursier**

```cs bootstrap org.scalameta:metals_2.13:[version] -o metals -f```

**Start Metals as an MCP server for a workspace**

```metals-mcp --workspace [/path/to/project]```

**Start Metals MCP server on a specific port**

```metals-mcp --workspace [/path/to/project] --port [8080]```

**Generate editor config for a specific client**

```metals-mcp --workspace [/path/to/project] --client [vscode]```

# SYNOPSIS

**metals** [_options_]

**metals-mcp** **--workspace** _path_ [_options_]

# PARAMETERS

**--workspace** _path_
> Path to the Scala project (required for MCP server).

**--port** _number_
> HTTP port to listen on. Auto-assigned by default.

**--transport** _type_
> Transport type: http (default) or stdio.

**--client** _name_
> Client to generate config for (e.g., vscode, cursor).

**-v**, **--version**
> Print version information.

**-h**, **--help**
> Print usage message.

# DESCRIPTION

**Metals** is a Scala language server implementing the Language Server Protocol (LSP). It provides IDE features like code completion, navigation, refactoring, and error checking for Scala projects.

Metals works with various editors including VS Code, Vim/Neovim, Emacs, and Sublime Text.

# SUPPORTED BUILD TOOLS

```
- sbt
- Mill
- Gradle
- Maven
- Bloop
```

# FEATURES

```
- Code completion
- Go to definition
- Find references
- Rename refactoring
- Code actions
- Diagnostics
```

# CAVEATS

Requires JDK 11+. Initial indexing takes time. Build tool must be supported. Performance depends on project size.

# HISTORY

Metals was created by **Ólafur Páll Geirsson** at the **Scala Center** in **2018** as the official Scala language server.

# SEE ALSO

[scala](/man/scala)(1), [sbt](/man/sbt)(1), [javac](/man/javac)(1)
