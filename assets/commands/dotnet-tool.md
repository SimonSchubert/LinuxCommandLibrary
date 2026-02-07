# TAGLINE

.NET CLI tool package manager

# TLDR

**Install global tool**

```dotnet tool install -g [tool-name]```

**List global tools**

```dotnet tool list -g```

**Update global tool**

```dotnet tool update -g [tool-name]```

**Uninstall global tool**

```dotnet tool uninstall -g [tool-name]```

**Install local tool**

```dotnet tool install [tool-name]```

**Restore local tools**

```dotnet tool restore```

# SYNOPSIS

**dotnet tool** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: install, list, update, uninstall, restore.

**install** _PACKAGE_
> Install tool package.

**list**
> List installed tools.

**update** _PACKAGE_
> Update tool to latest version.

**uninstall** _PACKAGE_
> Remove tool.

**restore**
> Restore local tools from manifest.

**-g**, **--global**
> Global installation (user-wide).

**--tool-path** _PATH_
> Custom installation directory.

**--help**
> Display help information.

# CONFIGURATION

**dotnet-tools.json**
> Manifest file specifying local tool dependencies and versions for the project.

# DESCRIPTION

**dotnet tool** manages .NET CLI tools, which are NuGet packages containing console applications. Tools can be installed globally (user-wide) or locally (project-specific).

Global tools are available from any directory and installed in a user-specific location. Local tools are specified in a manifest file (dotnet-tools.json) and installed per-project.

Popular tools include dotnet-ef (Entity Framework), dotnet-format (code formatting), and various analyzers and generators.

# CAVEATS

Global tools may have version conflicts. Local tools require manifest restoration. Tool versions should match project requirements. PATH configuration needed for global tools.

# HISTORY

dotnet tool was introduced in **.NET Core 2.1** (**2018**) to provide extensibility through NuGet-distributed CLI tools, enabling ecosystem growth beyond the built-in commands.

# SEE ALSO

[dotnet](/man/dotnet)(1), [dotnet-ef](/man/dotnet-ef)(1), [nuget](/man/nuget)(1)
