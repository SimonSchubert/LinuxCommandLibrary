# TAGLINE

Static type checker for Python

# TLDR

**Type check project**

```pyright```

**Type check specific files**

```pyright [file.py]```

**Watch for changes**

```pyright --watch```

**Output in JSON**

```pyright --outputjson```

**Show version**

```pyright --version```

**Create config file**

```pyright --createstub [package]```

# SYNOPSIS

**pyright** [_options_] [_files_...]

# DESCRIPTION

**pyright** is a static type checker for Python. It analyzes Python code for type errors without running it, providing fast feedback in editors and CI pipelines.

The tool implements the Python type system from PEP 484 and subsequent typing PEPs, offering strict checking and IDE integration.

# PARAMETERS

**--watch**
> Watch mode for changes.

**--outputjson**
> JSON output format.

**--project** _dir_
> Project root directory.

**--pythonplatform** _platform_
> Target platform.

**--pythonversion** _version_
> Target Python version.

**--level** _level_
> Diagnostic level (basic, standard, strict).

**--stats**
> Show performance statistics.

**--verifytypes** _package_
> Verify package types.

**--createstub** _package_
> Generate stub files.

# CONFIGURATION

**pyrightconfig.json**
> Project-level configuration for type checking strictness, include/exclude paths, Python version, and platform targeting.

**pyproject.toml**
> Project configuration with a `[tool.pyright]` section supporting the same options as pyrightconfig.json.

# CAVEATS

Requires type annotations for full benefit. Some dynamic patterns hard to type. Configuration needed for complex projects. Not all libraries have type stubs.

# HISTORY

**Pyright** was developed by **Microsoft** and released in **2019**. It powers Python language support in VS Code through Pylance. Written in TypeScript, it focuses on performance and standards compliance.

# SEE ALSO

[mypy](/man/mypy)(1), [python](/man/python)(1), [pylint](/man/pylint)(1), [flake8](/man/flake8)(1)
