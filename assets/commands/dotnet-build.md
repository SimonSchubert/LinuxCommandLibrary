# TLDR

**Build current project**

```dotnet build```

**Build in Release** configuration

```dotnet build -c Release```

**Build specific project**

```dotnet build [path/to/project.csproj]```

**Build without restoring**

```dotnet build --no-restore```

**Build for specific** framework

```dotnet build -f [net8.0]```

**Build with specific** output directory

```dotnet build -o [./output]```

# SYNOPSIS

**dotnet build** [_project_] [_options_]

# PARAMETERS

_PROJECT_
> Project or solution file to build.

**-c**, **--configuration** _CONFIG_
> Build configuration (Debug, Release).

**-f**, **--framework** _FRAMEWORK_
> Target framework.

**-o**, **--output** _DIR_
> Output directory.

**--no-restore**
> Build without restoring dependencies.

**--no-dependencies**
> Ignore project-to-project references.

**-v**, **--verbosity** _LEVEL_
> Verbosity: quiet, minimal, normal, detailed.

**--help**
> Display help information.

# DESCRIPTION

**dotnet build** compiles .NET projects and their dependencies, producing assemblies and other output files. It invokes MSBuild under the hood with .NET-specific configurations.

The command automatically restores NuGet packages before building unless --no-restore is specified. It supports building multiple projects in a solution file and handles project references.

Output includes compiled assemblies (.dll), debug symbols, and any content files configured in the project.

# CAVEATS

Incremental builds may miss some changes. Clean builds with dotnet clean if needed. Framework targeting requires compatible SDK. Build errors stop the process.

# HISTORY

dotnet build is part of the **.NET CLI** introduced with .NET Core. It provides a cross-platform build experience replacing platform-specific build tools.

# SEE ALSO

[dotnet](/man/dotnet)(1), [dotnet-clean](/man/dotnet-clean)(1), [dotnet-publish](/man/dotnet-publish)(1)
