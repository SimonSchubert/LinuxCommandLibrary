# TAGLINE

Fullstack compiler and runtime for multi-target apps

# TLDR

**Install** the CLI (macOS/Linux)

```curl -fsSL https://get.dowe.dev/install | bash```

**Initialize** a blank project

```dowe init --template blank```

**Develop** server and web targets with watch

```dowe dev --target server --target web```

**Run** project tests

```dowe test```

**Deploy** a distribution (static, Docker, or Cloudflare)

```dowe deploy```

**Print** the installed version

```dowe version```

# SYNOPSIS

**dowe** _command_ [_options_]

# DESCRIPTION

**dowe** is the command-line interface for Dowe, a Rust compiler and runtime that builds fullstack products from a unified declarative source graph (**.dowe** files). One project model can target server (Rust), web (SSR HTML/JS/CSS), desktop windows, Android (Jetpack Compose), and iOS (SwiftUI).

Dowe Source Format is a compiler input, not a JavaScript application runtime: Node.js, **node_modules**, React, and similar stacks are not required to compile and run. The compiler validates routes, types, and platform boundaries before generating deterministic artifacts under **.dowe/**.

# COMMANDS

**init** [**--template** blank|crud] [**--i18n**]

> Scaffold a new project. **crud** adds a fullstack CRUD starter; **--i18n** includes translation catalogs.

**dev** [**--target** _name_]...

> Compile, watch, and run selected development targets. Interactive target selection if no flags are given.

**test**

> Discover and run native **.dowe** literal tests.

**deploy**

> Produce static, Docker, or Cloudflare distributions.

**icons**

> Generate versioned icon sets for web, desktop, Android, and iOS.

**agent**

> Install or update public authoring guidance for coding agents.

**codegraph**

> Inspect ownership, dependencies, modularity, and duplication.

**database** / **cache** / **vector**

> Manage Dowe Database, Cache, and Vector instances and data.

**upgrade**

> Upgrade through the official release channel.

**version**

> Print the CLI version.

# CAVEATS

Early-access toolchain; target support and APIs may change. Mobile generators produce native projects that still need platform SDKs (Android/iOS) for device builds. Do not edit **.dowe/** as source — it is generated.

# SEE ALSO

[cargo](/man/cargo)(1), [rustc](/man/rustc)(1)

# RESOURCES

```[Source code](https://github.com/usedowe/dowe-lang)```

```[Homepage](https://dowe.dev)```

```[Documentation](https://dowe.dev)```

<!-- verified: 2026-07-30 -->
