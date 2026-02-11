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
> Create project.

**devel**
> Development server.

**add-handler**
> Add route handler.

**keter**
> Deployment bundle.

**test**
> Run tests.

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
