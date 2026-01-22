# TLDR

**Create new project**

```gleam new [project_name]```

**Build project**

```gleam build```

**Run project**

```gleam run```

**Run tests**

```gleam test```

**Add dependency**

```gleam add [package_name]```

# SYNOPSIS

**gleam** _command_ [_options_]

# PARAMETERS

**new** _NAME_
> Create new project.

**build**
> Compile the project.

**run**
> Build and run.

**test**
> Run tests.

**add** _PACKAGE_
> Add dependency.

**format**
> Format source code.

**docs**
> Generate documentation.

**--help**
> Display help information.

# DESCRIPTION

**gleam** is the build tool for the Gleam programming language. Gleam is a type-safe functional language that compiles to Erlang and JavaScript.

The tool manages projects, dependencies, compilation, and testing. It integrates with the Hex package manager for Erlang/Elixir ecosystem packages.

gleam provides the complete toolchain for Gleam development.

# CAVEATS

Requires Erlang/OTP for BEAM target. JavaScript target needs Node.js. Young language ecosystem.

# HISTORY

Gleam and its tooling were created by **Louis Pilfold** to bring type safety to the BEAM virtual machine ecosystem.

# SEE ALSO

[erlang](/man/erlang)(1), [elixir](/man/elixir)(1)
