# TAGLINE

build and execute .NET projects

# TLDR

**Run current project**

```dotnet run```

**Run with arguments**

```dotnet run -- [arg1] [arg2]```

**Run specific project**

```dotnet run --project [path/to/project.csproj]```

**Run in Release** configuration

```dotnet run -c Release```

**Run without building**

```dotnet run --no-build```

**Run specific framework**

```dotnet run -f [net8.0]```

# SYNOPSIS

**dotnet run** [_options_] [**--** _args_]

# PARAMETERS

**--project** _PATH_
> Project to run.

**-c**, **--configuration** _CONFIG_
> Build configuration.

**-f**, **--framework** _FRAMEWORK_
> Target framework.

**--no-build**
> Run without building first.

**--no-restore**
> Skip package restore.

**--launch-profile** _NAME_
> Launch profile to use.

**--** _ARGS_
> Arguments to pass to application.

**--help**
> Display help information.

# CONFIGURATION

**Properties/launchSettings.json**
> Configures launch profiles with environment variables and application arguments.

# DESCRIPTION

**dotnet run** builds and executes a .NET project in one step. It's the standard way to run applications during development without creating deployment artifacts.

The double-dash separates dotnet options from arguments passed to the application. Launch profiles in launchSettings.json can configure environment variables and arguments for development scenarios.

For web applications, dotnet run starts the development server with hot reload support in newer versions.

# CAVEATS

Includes build time in execution. Use --no-build for faster iteration. Launch profiles only work from project directory. Not intended for production use.

# HISTORY

dotnet run is part of the **.NET CLI** providing streamlined development iteration. It combines build and execution, improving developer experience over separate compile-then-run workflows.

# SEE ALSO

[dotnet](/man/dotnet)(1), [dotnet-build](/man/dotnet-build)(1), [dotnet-watch](/man/dotnet-watch)(1)
