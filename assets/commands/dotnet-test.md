# TLDR

**Run tests**

```dotnet test```

**Run tests in specific project**

```dotnet test [tests/Tests.csproj]```

**Run with filter**

```dotnet test --filter "[FullyQualifiedName~UnitTests]"```

**Run specific test**

```dotnet test --filter "Name=[TestMethodName]"```

**Run with verbosity**

```dotnet test --verbosity [detailed]```

**Run without build**

```dotnet test --no-build```

**Generate coverage report**

```dotnet test --collect:"XPlat Code Coverage"```

# SYNOPSIS

**dotnet** **test** [_project_] [_options_]

# PARAMETERS

**--filter** _expression_
> Filter tests by expression.

**--no-build**
> Don't build before testing.

**--no-restore**
> Don't restore before testing.

**-v**, **--verbosity** _level_
> Verbosity (quiet, minimal, normal, detailed).

**--logger** _logger_
> Test logger.

**--collect** _data_
> Enable data collector.

**--blame**
> Run tests in blame mode.

**-r**, **--results-directory** _dir_
> Results directory.

# DESCRIPTION

**dotnet test** runs tests using configured test runner. Supports MSTest, NUnit, and xUnit frameworks. Discovers and executes tests in the project.

# SEE ALSO

[dotnet-build](/man/dotnet-build)(1), [dotnet-run](/man/dotnet-run)(1)

