# TAGLINE

Create new Python project structure

# TLDR

**Create new project**

```poetry new [project-name]```

**Create with specific source directory**

```poetry new --src [project-name]```

**Create with custom name**

```poetry new --name [package-name] [directory]```

# SYNOPSIS

**poetry new** [_options_] _path_

# PARAMETERS

_PATH_
> Project directory path.

**--name** _NAME_
> Package name.

**--src**
> Use src layout.

**--readme** _FORMAT_
> Readme format (md, rst).

# DESCRIPTION

**poetry new** scaffolds a new Python project directory with a standard structure including **pyproject.toml**, a package directory, and a tests directory. This provides a ready-to-use project layout.

The **--src** flag uses the `src/` layout pattern where the package lives under a `src/` subdirectory. The **--name** option allows the package name to differ from the directory name. For adding Poetry to an existing project, use **poetry init** instead.

# CAVEATS

Creates new directory. Use poetry init for existing projects.

# HISTORY

poetry new provides **project scaffolding** for new Python packages.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-init](/man/poetry-init)(1)

