# TAGLINE

launches JupyterLab, an interactive development environment

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
> Port to run server on. Default: 8888.

**--no-browser**
> Don't open browser automatically.

**--notebook-dir** _path_
> Directory to serve notebooks from.

**--ip** _address_
> IP address to bind to. Default: localhost.

**--allow-root**
> Allow running as root user.

**--core-mode**
> Start in core mode with no extensions enabled.

**--dev-mode**
> Start in development mode using local JavaScript packages.

**--app-dir** _path_
> Start with a particular set of extensions.

**--certfile** _path_
> SSL/TLS certificate file for HTTPS.

**--help**
> Show abbreviated command-line options.

**--help-all**
> Show all available options including detailed ones.

# DESCRIPTION

**jupyter lab** launches JupyterLab, an interactive development environment for working with notebooks, code, and data. It provides a flexible interface for data science, scientific computing, and machine learning workflows with support for multiple programming languages.

JupyterLab is the next-generation web-based interface for Project Jupyter, offering a tabbed workspace with file browser, terminals, text editors, and notebook support all in one environment.

# SEE ALSO

[jupyter](/man/jupyter)(1), [python](/man/python)(1), [pip](/man/pip)(1)

