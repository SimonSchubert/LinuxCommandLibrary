# TLDR

**Build solution**

```msbuild [solution.sln]```

**Build specific configuration**

```msbuild [project.csproj] /p:Configuration=[Release]```

**Build specific target**

```msbuild /t:[Clean]```

**Restore and build**

```msbuild /t:Restore;Build```

**Set verbosity**

```msbuild /v:[detailed]```

**Build with parallelism**

```msbuild /m:[4]```

**Build to output directory**

```msbuild /p:OutputPath=[bin/output]```

# SYNOPSIS

**msbuild** [_options_] [_project_file_]

# PARAMETERS

_PROJECT_FILE_
> Solution or project file.

**/t:** _TARGET_
> Target to build.

**/p:** _PROPERTY=VALUE_
> Set property value.

**/v:** _LEVEL_
> Verbosity level.

**/m** [_N_]
> Maximum parallel builds.

**/restore**
> Run restore before build.

**/?**
> Display help information.

# DESCRIPTION

**msbuild** is the Microsoft Build Engine. It builds .NET applications and solutions.

The tool processes project files. Supports parallel builds and custom targets.

msbuild is Microsoft build system.

# CAVEATS

Requires .NET SDK. Windows-centric but cross-platform. XML-based project files.

# HISTORY

MSBuild was created by **Microsoft** as the build platform for .NET, first released with Visual Studio 2005.

# SEE ALSO

[dotnet](/man/dotnet)(1), [nuget](/man/nuget)(1), [make](/man/make)(1)

