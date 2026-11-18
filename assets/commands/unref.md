# TAGLINE

Find unused Python classes, functions, and variables

# TLDR

**Check** the project in the current directory

```unref```

Check **one package**

```unref [src/project]```

Point at a **config file** other than the nearest pyproject.toml

```unref --config [unref.toml]```

Use a **specific interpreter** or virtual environment

```unref --python [.venv]```

Print findings as **GitHub Actions annotations**

```unref --output-format github```

Include unused names that **only other unused names reach**

```unref --show-transitive```

# SYNOPSIS

**unref** [_PATH_...] [**--config** _FILE_] [**-j** _N_ | **--jobs** _N_] [**--python** _ENV_] [**--output-format** _FORMAT_] [**--show-transitive** | **--no-show-transitive**]

# DESCRIPTION

**unref** reports Python definitions that nothing reachable uses. It is a Rust binary distributed as a Python package. A wheel contains only that binary. Run it with **uvx unref**, from a virtual environment after installing the **unref** package, or as a pre-commit or prek hook whose id is **unref**.

With no paths, it checks the project root. That root is the directory of the closest **pyproject.toml** that has a **[tool.unref]** table, walking upward from the current directory, or else the closest **pyproject.toml**. Paths named on the command line are checked instead.

Each finding is one line, **path:line:column: code 'name'**, for example **unused-class** or **unused-function**. The process exits **1** when it prints any finding and **0** when it prints none. A configuration or environment error exits **2**.

The check follows imports and base classes on a large stack, and uses one thread per CPU unless **--jobs** is set. It looks for a Python environment in this order: **--python**, then the **python** config key, then the VIRTUAL ENV variable (those two words joined with an underscore) when that environment is not the one **unref** itself is installed in, then **.venv** under the project root, then the environment that contains the **unref** binary when that directory has a **pyvenv.cfg**.

Built-in framework rules cover pytest, Django, Flask, Pydantic, SQLAlchemy, and others, so names those frameworks call without a normal reference are not reported as unused. Requires Python 3.11 or newer to install the package.

# PARAMETERS

_PATH_...
> Files and directories to check. Default: the project root.

**--config** _FILE_
> TOML configuration. A file named **pyproject.toml** is read from its **[tool.unref]** table. Any other file is read from the top level. Default: the closest **pyproject.toml**, as described above.

**-j** _N_, **--jobs** _N_
> Worker threads. Must be at least 1. Default: one thread per CPU.

**--python** _ENV_
> Project interpreter or virtual environment. The path must exist.

**--output-format** _FORMAT_
> **concise** (default) or **github**. **github** prints a workflow command per finding so Actions can show it as an annotation. Same names as Ruff's output formats.

**--show-transitive**
> Also print unused definitions that are reached only from other unused definitions.

**--no-show-transitive**
> Print only unused definitions that are not reached from other unused definitions. This is the default unless the config file sets the opposite.

# CONFIGURATION

**[tool.unref]** in **pyproject.toml**
> Options for a file named **pyproject.toml**. Paths in that file are relative to the file's directory, which is also the project root. Another TOML file holds the same keys at the top level, and its paths are relative to the current directory.

**exclude**
> Patterns of files and directories that are not part of the project.

**used-names**, **used-decorators**
> Name patterns, and decorators, that mark a definition as used.

**dummy-variable-rgx**
> Regular expression for variable names that are unused on purpose.

**output-format**
> **concise** or **github**.

**show-transitive**
> Boolean. Command-line **--show-transitive** and **--no-show-transitive** override it.

**python**
> Interpreter or environment, overridden by **--python**.

**overrides**
> A list of tables. Each table selects files with **paths**, **base-classes**, or **class-decorators**, and may set **used-names** and **used-decorators** for that selection.

**frameworks**
> Which built-in framework rules apply. The file can also name Sphinx configuration files and extra Django settings modules.

Entry points declared in the **[project]** table of **pyproject.toml** count as used.

# CAVEATS

A non-empty report is a failed exit status, which is what a hook or CI job wants. Pass the paths you mean to check; an empty path list checks the whole project root.

**--show-transitive** and **--no-show-transitive** override each other. The one given last wins.

An active VIRTUAL ENV variable (those two words joined with an underscore) that is only the hook's own environment is ignored, so a pre-commit or prek install does not hide the project's **.venv**.

# SEE ALSO

[ruff](/man/ruff)(1), [uv](/man/uv)(1), [pre-commit](/man/pre-commit)(1), [python3](/man/python3)(1)

# RESOURCES

```[Source code](https://github.com/Apakottur/unref)```

```[Documentation](https://unref.readthedocs.io/)```

<!-- verified: 2026-11-18 -->
