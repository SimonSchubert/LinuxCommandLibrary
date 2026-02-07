# TAGLINE

test runner for .NET projects

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

**dotnet test** executes unit tests in .NET projects using the configured test framework adapter. It supports popular testing frameworks including MSTest, NUnit, and xUnit through their respective NuGet packages.

The command discovers test methods through framework-specific attributes, executes them, and reports results including pass/fail status, execution time, and detailed failure information. It integrates with code coverage tools and CI/CD pipelines through various loggers and output formats.

# SEE ALSO

[dotnet-build](/man/dotnet-build)(1), [dotnet-run](/man/dotnet-run)(1)

