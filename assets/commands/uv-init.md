# TAGLINE

Initialize a new Python project with uv

# TLDR

**Initialize new project**

```uv init```

**Initialize with name**

```uv init [project_name]```

**Initialize library project**

```uv init --lib```

**Initialize in directory**

```uv init [path]```

# SYNOPSIS

**uv** **init** [_options_] [_path_]

# PARAMETERS

**--name** _name_
> Project name.

**--lib**
> Create library structure.

**--app**
> Create application structure.

**--no-workspace**
> Don't add to workspace.

**--python** _version_
> Python version requirement.

# DESCRIPTION

**uv init** initializes a new Python project. Creates pyproject.toml with project metadata. Sets up project structure for applications or libraries.

# SEE ALSO

[uv](/man/uv)(1), [uv-add](/man/uv-add)(1), [uv-sync](/man/uv-sync)(1)

