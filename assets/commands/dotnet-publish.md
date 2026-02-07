# TAGLINE

deployment package builder and publisher

# TLDR

**Publish for deployment**

```dotnet publish```

**Publish Release build**

```dotnet publish -c Release```

**Publish self-contained** app

```dotnet publish -r [linux-x64] --self-contained```

**Publish single file**

```dotnet publish -r [linux-x64] -p:PublishSingleFile=true```

**Publish to directory**

```dotnet publish -o [./publish]```

**Publish trimmed** (smaller output)

```dotnet publish -r [linux-x64] -p:PublishTrimmed=true```

# SYNOPSIS

**dotnet publish** [_project_] [_options_]

# PARAMETERS

_PROJECT_
> Project or solution to publish.

**-c**, **--configuration** _CONFIG_
> Build configuration.

**-r**, **--runtime** _RID_
> Target runtime identifier.

**--self-contained** [_BOOL_]
> Include .NET runtime.

**-o**, **--output** _DIR_
> Output directory.

**-p:**_PROP_=_VALUE_
> Set MSBuild property.

**--no-build**
> Skip build, use existing output.

**--help**
> Display help information.

# DESCRIPTION

**dotnet publish** compiles and packages an application for deployment. It produces a directory containing the application, dependencies, and optionally the .NET runtime itself.

Self-contained deployment includes the runtime, eliminating target machine .NET requirements. Framework-dependent deployment assumes .NET is installed, producing smaller output.

Advanced options like single-file publishing and trimming optimize output for specific deployment scenarios.

# CAVEATS

Self-contained apps are larger. Trimming may remove needed code. Runtime identifiers must match target system. Cross-platform publishing may need additional SDKs.

# HISTORY

dotnet publish is part of the **.NET CLI**, providing standardized deployment artifact creation across platforms. It replaced platform-specific deployment methods in legacy .NET.

# SEE ALSO

[dotnet](/man/dotnet)(1), [dotnet-build](/man/dotnet-build)(1), [dotnet-run](/man/dotnet-run)(1)
