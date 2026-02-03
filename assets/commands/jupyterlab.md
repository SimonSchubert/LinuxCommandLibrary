# TLDR

**Start JupyterLab server**

```jupyter lab```

**Start on specific port**

```jupyter lab --port [8888]```

**Start without opening browser**

```jupyter lab --no-browser```

**Start in specific directory**

```jupyter lab --notebook-dir=[path]```

**Start with specific IP binding**

```jupyter lab --ip=[0.0.0.0]```

# SYNOPSIS

**jupyter** **lab** [_options_]

# PARAMETERS

**--port** _number_
> Port to run server on.

**--no-browser**
> Don't open browser automatically.

**--notebook-dir** _path_
> Directory to serve notebooks from.

**--ip** _address_
> IP address to bind to.

**--allow-root**
> Allow running as root user.

# DESCRIPTION

**jupyter lab** launches JupyterLab, an interactive development environment for working with notebooks, code, and data. It provides a flexible interface for data science, scientific computing, and machine learning workflows with support for multiple programming languages.

# SEE ALSO

[jupyter](/man/jupyter)(1), [jupyter-notebook](/man/jupyter-notebook)(1)

