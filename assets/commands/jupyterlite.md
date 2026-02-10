# TAGLINE

builds static JupyterLab sites that run entirely in the browser using

# TLDR

**Build JupyterLite site**

```jupyter lite build```

**Build with specific content**

```jupyter lite build --contents [notebooks/]```

**Serve built site locally**

```jupyter lite serve```

**Build with additional packages**

```jupyter lite build --piplite-wheels [package.whl]```

**Clean build artifacts**

```jupyter lite clean```

**Check configuration**

```jupyter lite status```

**Build with custom output**

```jupyter lite build --output-dir [dist/]```

**Initialize configuration**

```jupyter lite init```

# SYNOPSIS

**jupyter lite** _command_ [_options_]

# COMMANDS

**build**
> Build JupyterLite static site.

**serve**
> Serve built site locally.

**init**
> Initialize configuration files.

**status**
> Show build configuration status.

**clean**
> Remove build artifacts.

**archive**
> Create archive of built site.

**list**
> List addons and their status.

# PARAMETERS

**--contents** _path_
> Path to content directory for notebooks.

**--output-dir** _path_
> Output directory for built site. Default: _output.

**--piplite-wheels** _path_
> Include pip wheels for piplite.

**--pyodide** _url_
> Custom Pyodide distribution URL.

**--port** _port_
> Port for serve command. Default: 8000.

**--lite-dir** _path_
> Source directory for JupyterLite files.

**--settings-overrides** _file_
> JSON file with settings overrides.

**--no-sourcemaps**
> Disable source maps in build.

# DESCRIPTION

**jupyter lite** builds static JupyterLab sites that run entirely in the browser using WebAssembly. No server required—deploy to any static hosting.

**build** generates HTML, JavaScript, and assets in the output directory. Include notebooks with **--contents** to pre-populate the file browser. The resulting site runs JupyterLab with Pyodide kernel.

The Pyodide kernel executes Python in WebAssembly. Pre-install packages with **--piplite-wheels** or install at runtime via piplite. Many scientific Python packages are available.

**serve** starts a local HTTP server for testing. The build output can deploy to GitHub Pages, Netlify, or any static host. No backend infrastructure needed.

Configuration via **jupyter_lite_config.json** customizes settings, extensions, and build behavior. **init** creates template files.

# CAVEATS

Not all Python packages work in Pyodide (no native extensions without WASM builds). Performance is slower than native Python. Large notebooks may hit browser memory limits. Some JupyterLab extensions are incompatible.

# HISTORY

JupyterLite was released in **2021** by the **Project Jupyter** team, leveraging Pyodide for browser-based Python. It enables sharing interactive notebooks without server infrastructure. The project grew from experiments with WebAssembly Python interpreters. JupyterLite enables educational content, documentation, and lightweight demos. Development continues alongside JupyterLab improvements.

# SEE ALSO

[jupyter-lab](/man/jupyter-lab)(1), [pyodide](/man/pyodide)(1), [jupyter](/man/jupyter)(1)
