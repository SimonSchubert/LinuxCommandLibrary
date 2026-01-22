# TLDR

**Start notebook server**

```jupyter notebook```

**Start JupyterLab**

```jupyter lab```

**Start on specific port**

```jupyter notebook --port [8888]```

**List running servers**

```jupyter notebook list```

**Stop server**

```jupyter notebook stop [8888]```

**Convert notebook**

```jupyter nbconvert --to [html|pdf|py] [notebook.ipynb]```

# SYNOPSIS

**jupyter** _command_ [_options_]

# PARAMETERS

**notebook**
> Classic notebook interface.

**lab**
> JupyterLab interface.

**nbconvert**
> Convert notebooks.

**--port** _PORT_
> Server port.

**--no-browser**
> Don't open browser.

**--ip** _IP_
> Server IP address.

**--help**
> Display help information.

# DESCRIPTION

**Jupyter** provides interactive computing environments. It runs notebook servers for code execution and documentation.

The platform supports multiple languages through kernels. Notebooks combine code, output, and markdown.

Jupyter runs interactive notebooks.

# CAVEATS

Python-based. Browser required. Security considerations for remote access.

# HISTORY

Jupyter was spun off from **IPython** in 2014, expanding to support multiple languages (Julia, Python, R - hence Ju-Pyt-eR).

# SEE ALSO

[ipython](/man/ipython)(1), [jupytext](/man/jupytext)(1), [nbconvert](/man/nbconvert)(1)
