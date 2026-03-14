# TAGLINE

build system for monorepos

# TLDR

**Run a target for a project**

```nx run [project]:[target]```

**Build a project**

```nx build [project]```

**Test a project**

```nx test [project]```

**Run targets for affected projects**

```nx affected -t [build]```

**Run targets across multiple projects**

```nx run-many -t [build] -p [project1] [project2]```

**Generate code using a plugin generator**

```nx generate @nx/react:component [name]```

**Visualize project dependency graph**

```nx graph```

**Update Nx and migrate workspace**

```nx migrate latest```

# SYNOPSIS

**nx** [_command_] [_options_]

# PARAMETERS

**run** _PROJECT:TARGET_
> Execute a specific target on a project.

**build** _PROJECT_
> Build a project.

**test** _PROJECT_
> Run tests for a project.

**serve** _PROJECT_
> Serve a project locally.

**lint** _PROJECT_
> Run linter on a project.

**affected** **-t** _TARGET_
> Run targets for projects affected by recent changes.

**run-many** **-t** _TARGET_
> Execute targets across multiple projects.

**generate** _GENERATOR_
> Run a code generator from a plugin.

**graph**
> Visualize workspace project dependencies.

**migrate** _PACKAGE@VERSION_
> Update packages and run automated migrations.

**list**
> List installed plugins and available capabilities.

**show**
> Display workspace information (projects, targets).

**reset**
> Clear cached artifacts and metadata, shut down the daemon.

**format:check**
> Check for unformatted files.

**format:write**
> Overwrite unformatted files.

**release**
> Orchestrate versioning and publishing.

**daemon**
> Manage the Nx background daemon process.

**repair**
> Fix unsupported workspace configurations.

**report**
> Print version information for debugging.

**--help**
> Display help information.

# DESCRIPTION

**nx** is a build system with first-class monorepo support and powerful integrations. It optimizes build and test workflows through intelligent caching, task distribution, and affected analysis.

Nx supports multiple frameworks and languages. It uses a daemon process for fast project graph computation, and provides both local and remote caching for build artifacts.

# CAVEATS

Requires an nx.json configuration file. The `@nrwl/*` plugin scope was renamed to `@nx/*` starting with Nx 16. Node.js is required.

# HISTORY

Nx was created by **Nrwl** (now Nx) to provide smart, extensible build tooling for monorepos. Originally focused on Angular, it expanded to support React, Node, and other frameworks, and later became a general-purpose build system.

# SEE ALSO

[npm](/man/npm)(1), [lerna](/man/lerna)(1), [turbo](/man/turbo)(1)
