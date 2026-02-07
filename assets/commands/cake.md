# TAGLINE

Cross-platform build automation using C#

# TLDR

**Run default build script**

```dotnet cake```

**Run specific build script**

```dotnet cake [build.cake]```

**Run specific target**

```dotnet cake --target=[Clean]```

**Run with verbosity**

```dotnet cake --verbosity=[diagnostic]```

**Show available tasks**

```dotnet cake --showdescription```

**Dry run without executing**

```dotnet cake --dryrun```

**Run with custom argument**

```dotnet cake --configuration=[Release]```

# SYNOPSIS

**dotnet cake** [_script_] [_options_]

# DESCRIPTION

**Cake** (C# Make) is a cross-platform build automation system with a C# DSL. It compiles code, copies files, runs tests, compresses files, and builds NuGet packages. Scripts are written in C# and executed via Roslyn.

# PARAMETERS

**--target**=_name_
> Target task to run

**--verbosity**=_level_
> Output verbosity (quiet, minimal, normal, verbose, diagnostic)

**--dryrun**
> Show tasks without executing

**--showdescription**
> Show task descriptions

**--showtree**
> Show task dependency tree

**--configuration**=_config_
> Build configuration (Debug, Release)

**--exclusive**
> Execute only target task without dependencies

**--version**
> Show version

**--help**
> Show help

# INSTALLATION

```
dotnet new tool-manifest
dotnet tool install Cake.Tool
```

# SCRIPT EXAMPLE

```csharp
Task("Build")
    .Does(() => {
        DotNetBuild("./src/Project.sln");
    });

RunTarget("Build");
```

# CAVEATS

Requires .NET SDK installed. By convention, executes build.cake in current directory. Supports MSBuild, .NET CLI, NuGet, and many other tools through addins.

# SEE ALSO

[dotnet](/man/dotnet)(1), [msbuild](/man/msbuild)(1), [make](/man/make)(1)
