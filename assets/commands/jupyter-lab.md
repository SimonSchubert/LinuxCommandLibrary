# TLDR

**Start JupyterLab**

```jupyter lab```

**Start on specific port**

```jupyter lab --port [8889]```

**Start without opening browser**

```jupyter lab --no-browser```

**Start with specific notebook directory**

```jupyter lab --notebook-dir=[/path/to/notebooks]```

**Allow external connections**

```jupyter lab --ip [0.0.0.0]```

**Generate configuration file**

```jupyter lab --generate-config```

**List running servers**

```jupyter lab list```

**Stop a server**

```jupyter lab stop [8888]```

# SYNOPSIS

**jupyter lab** [_options_]

**jupyter lab** build|clean|path|paths|workspaces

# COMMANDS

**jupyter lab**
> Start JupyterLab server.

**jupyter lab build**
> Build JupyterLab application.

**jupyter lab clean**
> Remove build artifacts.

**jupyter lab list**
> List running JupyterLab servers.

**jupyter lab stop** _port_
> Stop server on port.

**jupyter lab path**
> Show JupyterLab paths.

**jupyter lab workspaces** list|export|import
> Manage workspaces.

# PARAMETERS

**--port** _port_
> Server port. Default: 8888.

**--ip** _address_
> IP address to bind. Default: localhost.

**--no-browser**
> Don't open browser on startup.

**--notebook-dir** _path_
> Root directory for notebooks.

**--app-dir** _path_
> JupyterLab application directory.

**--generate-config**
> Generate default configuration file.

**--config** _file_
> Path to configuration file.

**--ContentsManager.allow_hidden** _bool_
> Allow access to hidden files.

**--ServerApp.token** _token_
> Authentication token.

**--ServerApp.password** _hash_
> Hashed password for access.

**--collaborative**
> Enable real-time collaboration.

# DESCRIPTION

**jupyter lab** is the CLI for JupyterLab, the next-generation web interface for Project Jupyter. It provides a flexible, extensible IDE for notebooks, code, and data.

JupyterLab runs a server exposing the web interface. Access via browser with the token shown at startup. Multiple users can connect; collaboration mode enables shared editing.

The interface supports notebooks, text editors, terminals, and extensions. File browser navigates the **--notebook-dir** tree. Multiple documents open in tabs with split views.

Extensions add functionality. Use **jupyter labextension** for management. **jupyter lab build** compiles assets after extension changes.

Configuration via **jupyter_lab_config.py** sets defaults. Generate template with **--generate-config**. Common settings include token/password, allowed origins, and kernel settings.

# CAVEATS

Server exposes full filesystem access from notebook-dir. Production deployments need proper authentication and HTTPS. Extensions may require rebuild. Memory usage scales with kernel count.

# HISTORY

JupyterLab development started around **2016** as the successor to Jupyter Notebook interface. Version 1.0 released in **2019** after extensive beta period. It's developed by **Project Jupyter**, which evolved from IPython. The project is part of the broader Jupyter ecosystem including kernels for many languages. JupyterLab 4.0 (2023) brought performance improvements and real-time collaboration.

# SEE ALSO

[jupyter](/man/jupyter)(1), [jupyter-notebook](/man/jupyter-notebook)(1), [ipython](/man/ipython)(1), [jupyterlite](/man/jupyterlite)(1)
