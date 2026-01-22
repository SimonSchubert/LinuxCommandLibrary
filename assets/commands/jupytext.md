# TLDR

**Convert notebook to Python**

```jupytext --to py [notebook.ipynb]```

**Convert Python to notebook**

```jupytext --to ipynb [script.py]```

**Sync paired files**

```jupytext --sync [notebook.ipynb]```

**Set pairing**

```jupytext --set-formats [ipynb,py:percent] [notebook.ipynb]```

**Update notebook metadata**

```jupytext --update-metadata '{"key":"value"}' [notebook.ipynb]```

# SYNOPSIS

**jupytext** [_options_] _notebook_

# PARAMETERS

**--to** _FORMAT_
> Target format (py, ipynb, md, Rmd).

**--sync**
> Sync paired representations.

**--set-formats** _FORMATS_
> Set pairing formats.

**--from** _FORMAT_
> Source format.

**--update-metadata** _JSON_
> Update notebook metadata.

**--help**
> Display help information.

# DESCRIPTION

**Jupytext** converts Jupyter notebooks to text formats. It enables version control of notebooks as scripts or markdown.

The tool maintains synchronization between formats. Paired notebooks auto-update when either file changes.

Jupytext converts notebooks to text.

# CAVEATS

Python tool. Some cell outputs lost in text. Pairing setup recommended.

# HISTORY

Jupytext was created by **Marc Wouts** to solve version control challenges with Jupyter notebooks.

# SEE ALSO

[jupyter](/man/jupyter)(1), [nbconvert](/man/nbconvert)(1), [nbstripout](/man/nbstripout)(1)
