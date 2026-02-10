# TAGLINE

scala language server implementing the Language Server Protocol

# TLDR

**Start Metals server (VSCode)**

```metals-vscode```

**Import build**

```metals import-build```

**Generate Bloop config**

```metals generate-bloop```

**Connect to running server**

```metals connect-to-server```

# SYNOPSIS

**metals** [_options_]

# PARAMETERS

**-Dmetals.client** _client_
> LSP client type.

**-Dmetals.server.port** _port_
> Server port.

**-Dmetals.verbose**
> Verbose logging.

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

Requires JDK 8+. Initial indexing takes time. Build tool must be supported. Performance depends on project size.

# HISTORY

Metals was created by **Ólafur Páll Geirsson** at the **Scala Center** in **2018** as the official Scala language server.

# SEE ALSO

[scala](/man/scala)(1), [sbt](/man/sbt)(1), [bloop](/man/bloop)(1), [coursier](/man/coursier)(1)
