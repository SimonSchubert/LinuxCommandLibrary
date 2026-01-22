# TLDR

**Run target**

```nx run [project]:[target]```

**Build project**

```nx build [project]```

**Test project**

```nx test [project]```

**Run affected targets**

```nx affected --target=build```

**Generate component**

```nx generate @nrwl/react:component [name]```

**Show dependency graph**

```nx graph```

# SYNOPSIS

**nx** [_command_] [_options_]

# PARAMETERS

**run** _PROJECT:TARGET_
> Execute target on project.

**build** _PROJECT_
> Build project.

**test** _PROJECT_
> Run tests.

**affected**
> Run on affected projects.

**generate** _GENERATOR_
> Run code generator.

**graph**
> Visualize dependencies.

**--help**
> Display help information.

# DESCRIPTION

**nx** is a build system for monorepos. Optimizes build and test workflows.

The tool provides smart rebuilds and caching. Supports multiple frameworks.

nx manages monorepo projects.

# CAVEATS

Requires nx.json configuration. Learning curve for large projects. Node.js ecosystem.

# HISTORY

Nx was created by **Nrwl** to provide smart, extensible build tooling for monorepos.

# SEE ALSO

[npm](/man/npm)(1), [lerna](/man/lerna)(1), [turbo](/man/turbo)(1)

