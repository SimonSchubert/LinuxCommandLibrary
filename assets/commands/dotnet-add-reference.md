# TAGLINE

project-to-project reference adder

# TLDR

**Add project reference**

```dotnet add reference [../Other/Other.csproj]```

**Add multiple references**

```dotnet add reference [../Lib1/Lib1.csproj] [../Lib2/Lib2.csproj]```

**Add reference to specific project**

```dotnet add [src/App/App.csproj] reference [../Lib/Lib.csproj]```

# SYNOPSIS

**dotnet** **add** [_project_] **reference** _project_path_... [_options_]

# PARAMETERS

**-f**, **--framework** _framework_
> Add reference only for specific framework.

# DESCRIPTION

**dotnet add reference** adds project-to-project (P2P) references to a project file, creating build-time dependencies between projects in a solution. Referenced projects are automatically built before the referencing project, ensuring correct build order.

P2P references enable code sharing within a solution while maintaining clear dependency boundaries. The command modifies the project file to include the reference path, which can be relative or absolute.

# SEE ALSO

[dotnet-remove-reference](/man/dotnet-remove-reference)(1), [dotnet-list-reference](/man/dotnet-list-reference)(1)

