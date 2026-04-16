# TAGLINE

Haskell type-safe web framework CLI

# TLDR

**Create project**

```yesod init```

**Run development server**

```yesod devel```

**Add handler**

```yesod add-handler [HandlerName]```

**Generate Keter bundle**

```yesod keter```

# SYNOPSIS

**yesod** _command_ [_options_]

# PARAMETERS

**init**
> Scaffold a new Yesod project interactively.

**devel**
> Run the development server with automatic recompilation on file changes.

**add-handler**
> Generate a new route handler with boilerplate code.

**keter**
> Build a Keter deployment bundle (.keter archive).

**test**
> Run the project's test suite.

**version**
> Display yesod-bin version information.

**-v, --verbose**
> Enable verbose output.

**--help**
> Show usage information.

# DESCRIPTION

**yesod** is the command-line tool for the Yesod web framework, which builds type-safe web applications in Haskell. It provides project scaffolding, development server management, and deployment bundling.

The **init** command creates a new project with a complete directory structure, configuration, and dependencies. The **devel** subcommand starts a development server that watches for file changes and recompiles automatically, providing live reload during development.

Route handlers can be added with **add-handler**, which generates boilerplate code following Yesod conventions. The **keter** command packages the application into a deployment bundle for the Keter web application deployment system.

# CAVEATS

Haskell knowledge required. Stack/Cabal needed. Learning curve.

# HISTORY

**Yesod** was created by **Michael Snoyman** as a type-safe Haskell web framework.

# SEE ALSO

[stack](/man/stack)(1), [cabal](/man/cabal)(1), [ghc](/man/ghc)(1)
