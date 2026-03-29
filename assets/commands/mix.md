# TAGLINE

Elixir build tool and task runner

# TLDR

**Create a new project**

```mix new [project_name]```

**Fetch dependencies**

```mix deps.get```

**Compile the project**

```mix compile```

**Run tests**

```mix test```

**Start an interactive shell with the project loaded**

```iex -S mix```

**Format source files**

```mix format```

**Build a production release**

```mix release```

**List all available tasks**

```mix help```

# SYNOPSIS

**mix** [_task_] [_options_]

# PARAMETERS

**new** _NAME_
> Create a new Elixir project in a directory named _NAME_.

**deps.get**
> Fetch all project dependencies listed in `mix.exs`.

**deps.compile**
> Compile fetched dependencies.

**deps.update** _DEP_
> Update a specific dependency (or `--all` to update all).

**compile**
> Compile the current project and its dependencies.

**test**
> Run the project's test suite.

**format**
> Format Elixir source files according to the standard formatter.

**run** _FILE_
> Execute a script or expression within the project context.

**clean**
> Remove build artifacts.

**release**
> Assemble a self-contained release for deployment.

**do** _task1_, _task2_
> Run multiple tasks sequentially in one command.

**help** [_TASK_]
> List all available tasks, or show help for a specific task.

# DESCRIPTION

**mix** is the build tool that ships with Elixir. It manages project creation, dependency resolution, compilation, testing, code formatting, and releases. All functionality is exposed through a task-based system where each `mix task` maps to a Mix.Task module.

Dependencies are declared in `mix.exs` and fetched from the Hex package manager. The active environment is controlled by the `MIX_ENV` variable, which defaults to `dev` (and `test` when running `mix test`). Custom tasks can be created by defining modules under `Mix.Tasks.*`.

# CAVEATS

Requires Elixir to be installed. Package installation requires Hex (`mix local.hex`). The `MIX_ENV` environment variable controls which configuration is active (`dev`, `test`, `prod`).

# HISTORY

Mix was created as the standard build tool for **Elixir** by **José Valim** and ships with every Elixir installation.

# SEE ALSO

[elixir](/man/elixir)(1), [iex](/man/iex)(1)

