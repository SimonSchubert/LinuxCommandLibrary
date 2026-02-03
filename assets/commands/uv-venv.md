# TLDR

**Create virtual environment**

```uv venv```

**Create with specific Python**

```uv venv --python [3.11]```

**Create in specific directory**

```uv venv [path]```

**Create with seed packages**

```uv venv --seed```

# SYNOPSIS

**uv** **venv** [_options_] [_path_]

# PARAMETERS

**--python** _version_
> Python version.

**--seed**
> Install pip and setuptools.

**--system-site-packages**
> Access system packages.

**--prompt** _name_
> Custom prompt.

# DESCRIPTION

**uv venv** creates Python virtual environments. Creates isolated environments for package installation. Much faster than python -m venv or virtualenv.

# SEE ALSO

[uv](/man/uv)(1), [virtualenv](/man/virtualenv)(1)

