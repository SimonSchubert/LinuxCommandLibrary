# TAGLINE

cross-platform .NET development CLI

# TLDR

**Create new project**

```dotnet new [console] -n [MyApp]```

**Build project**

```dotnet build```

**Run project**

```dotnet run```

**Run tests**

```dotnet test```

**Add NuGet package**

```dotnet add package [PackageName]```

**Restore dependencies**

```dotnet restore```

**Publish for deployment**

```dotnet publish -c Release```

**List installed SDKs**

```dotnet --list-sdks```

# SYNOPSIS

**dotnet** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: new, build, run, test, publish, add, restore, etc.

**new** _TEMPLATE_
> Create project from template.

**build**
> Build the project.

**run**
> Build and run the project.

**test**
> Run unit tests.

**publish**
> Publish for deployment.

**add package** _NAME_
> Add NuGet package reference.

**restore**
> Restore NuGet packages.

**-c** _CONFIG_
> Build configuration (Debug, Release).

**--help**
> Display help information.

# CONFIGURATION

**global.json**
> Specifies SDK version and project settings at solution level.

**nuget.config**
> Configures NuGet package sources and credentials.

# DESCRIPTION

**dotnet** is the .NET CLI for creating, building, running, and publishing .NET applications. It supports C#, F#, and Visual Basic across console apps, web APIs, libraries, and more.

The CLI handles the full development workflow from project creation through deployment. It manages NuGet packages, runs tests, and produces deployment artifacts. Templates provide starting points for various application types.

dotnet works cross-platform on Windows, macOS, and Linux, enabling .NET development everywhere.

# CAVEATS

Requires .NET SDK installed. Multiple SDK versions can coexist. Large projects may have slow build times. Some features require specific SDK versions.

# HISTORY

The dotnet CLI was introduced with **.NET Core** in **2016** as Microsoft's cross-platform .NET implementation. It unified the fragmented .NET tooling under a single CLI, becoming the standard for .NET development.

# SEE ALSO

[msbuild](/man/msbuild)(1), [nuget](/man/nuget)(1)
