# TAGLINE

reactive Python notebook that stores notebooks as pure Python files

# TLDR

**Create new notebook**

```marimo edit [notebook.py]```

**Open existing notebook**

```marimo edit [notebook.py]```

**Run notebook as app**

```marimo run [notebook.py]```

**Run with custom port**

```marimo run --port [8080] [notebook.py]```

**Convert Jupyter notebook**

```marimo convert [notebook.ipynb] > [notebook.py]```

**Export to HTML**

```marimo export html [notebook.py] > [output.html]```

**New notebook with template**

```marimo new```

**Show version**

```marimo --version```

# SYNOPSIS

**marimo** [_edit_] [_run_] [_convert_] [_export_] [_options_] [_notebook.py_]

# PARAMETERS

**edit** _FILE_
> Edit notebook in browser.

**run** _FILE_
> Run notebook as interactive app.

**convert** _FILE_
> Convert from Jupyter to marimo.

**export** _FORMAT_ _FILE_
> Export notebook (html, md, script).

**new**
> Create new notebook from template.

**--port** _PORT_
> Server port.

**--host** _HOST_
> Server host.

**--headless**
> Don't open browser.

**--watch**
> Watch for file changes.

**--sandbox**
> Run in sandbox environment.

**--version**
> Show version.

**--help**
> Show help.

# DESCRIPTION

**marimo** is a reactive Python notebook that stores notebooks as pure Python files. Unlike Jupyter, cells automatically re-execute when their dependencies change.

Notebooks are Python scripts, enabling version control with Git without JSON merge conflicts. Cells define functions and variables that form a dependency graph.

The reactive execution model ensures consistency. Changing a variable automatically updates all dependent cells. Hidden state and execution order issues from traditional notebooks are eliminated.

Run mode deploys notebooks as interactive web applications. Users interact with widgets while the Python backend handles computation.

Conversion from Jupyter preserves code and markdown cells. The reactive structure may need adjustment for notebooks that relied on execution order.

# CAVEATS

Different mental model from Jupyter - linear execution not guaranteed. Some Jupyter magic commands not supported. Large notebooks may have performance implications from reactive updates.

# HISTORY

**marimo** was created by **Akshay Agrawal** and **Myles Scolnick** in **2023** at Stanford. It addresses reproducibility issues in traditional notebooks by making execution deterministic through reactive programming.

# SEE ALSO

[jupyter](/man/jupyter)(1), [ipython](/man/ipython)(1), [streamlit](/man/streamlit)(1), [python](/man/python)(1)
