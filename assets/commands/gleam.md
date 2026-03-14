# TAGLINE

Gleam programming language compiler and build tool

# TLDR

**Create new project**

```gleam new [project_name]```

**Build project**

```gleam build```

**Run project**

```gleam run```

**Run tests**

```gleam test```

**Add a Hex dependency**

```gleam add [package_name]```

**Remove a dependency**

```gleam remove [package_name]```

**Format source code**

```gleam format```

**Generate HTML documentation**

```gleam docs build```

# SYNOPSIS

**gleam** _command_ [_options_]

# PARAMETERS

**new** _NAME_
> Create a new project with standard directory structure.

**build**
> Compile the project and its dependencies.

**run**
> Build and run the project.

**test**
> Build and run the test suite.

**add** _PACKAGE_
> Add a Hex package dependency.

**remove** _PACKAGE_
> Remove a dependency.

**check**
> Type-check the project without producing build artifacts.

**format**
> Format source code files.

**docs build**
> Generate HTML documentation.

**docs publish**
> Publish documentation to HexDocs.

**publish**
> Publish the package to Hex.

**shell**
> Start an Erlang shell with the project loaded.

**export erlang-shipment**
> Export a standalone Erlang release for deployment.

**--target** _TARGET_
> Compile target: erlang or javascript.

**--help**
> Display help information.

# DESCRIPTION

**gleam** is the build tool and compiler for the Gleam programming language, a type-safe functional language that compiles to Erlang and JavaScript. It manages projects, dependencies, compilation, testing, and documentation.

Gleam integrates with the Hex package manager for the Erlang/Elixir ecosystem and can interoperate with Erlang and Elixir code. The JavaScript target allows Gleam to run in browsers and Node.js/Deno/Bun.

# CONFIGURATION

**gleam.toml**
> Project configuration file defining name, version, target, dependencies, and build options.

# CAVEATS

Requires Erlang/OTP for the BEAM target. The JavaScript target needs Node.js, Deno, or Bun. Gleam has no runtime exceptions by design -- exhaustive pattern matching is enforced at compile time.

# HISTORY

Gleam was created by **Louis Pilfold** starting in **2018** to bring static type safety to the BEAM virtual machine ecosystem while maintaining compatibility with Erlang and Elixir libraries. Version 1.0 was released in **March 2024**.

# SEE ALSO

[elixir](/man/elixir)(1), [cargo](/man/cargo)(1), [mix](/man/mix)(1)
