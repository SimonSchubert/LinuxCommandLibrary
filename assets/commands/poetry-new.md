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

**poetry new** creates new Python project. Generates project structure.

The tool scaffolds projects. Creates pyproject.toml and directories.

poetry new starts projects.

# CAVEATS

Creates new directory. Use poetry init for existing projects.

# HISTORY

poetry new provides **project scaffolding** for new Python packages.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-init](/man/poetry-init)(1)

