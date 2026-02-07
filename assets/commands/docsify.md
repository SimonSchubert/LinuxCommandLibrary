# TAGLINE

dynamic Markdown documentation site generator

# TLDR

**Initialize new documentation** site

```docsify init [./docs]```

**Start local preview** server

```docsify serve [./docs]```

**Serve on specific port**

```docsify serve [./docs] --port [4000]```

**Generate sidebar** automatically

```docsify generate [./docs]```

**Serve with live reload**

```docsify serve [./docs] --livereload-port [35729]```

# SYNOPSIS

**docsify** _command_ [_options_] [_path_]

# PARAMETERS

_COMMAND_
> Operation: init, serve, generate.

_PATH_
> Documentation directory.

**init** [_PATH_]
> Initialize new docsify project.

**serve** [_PATH_]
> Start local server.

**--port** _N_
> Server port (default: 3000).

**--livereload-port** _N_
> Live reload port.

**--open**
> Open browser automatically.

**--help**
> Display help information.

# DESCRIPTION

**docsify** is a documentation site generator that dynamically renders Markdown files without building static HTML. It loads and parses Markdown files on the fly, providing instant updates during editing.

The tool creates simple, elegant documentation websites from Markdown files. Features include full-text search, multiple themes, plugin support, and GitHub Pages compatibility. Configuration is minimal, typically just an index.html and Markdown files.

docsify is particularly suited for project documentation, requiring no build step and supporting features like cover pages, sidebars, and embedded code samples.

# CAVEATS

Requires JavaScript for rendering (no static HTML). SEO may be affected by client-side rendering. Large documentation sites may have initial load delay.

# HISTORY

docsify was created by **cinwell** and released as an open-source project. It gained popularity as a lightweight alternative to documentation generators like GitBook and VuePress, emphasizing simplicity and no build requirements.

# SEE ALSO

[mkdocs](/man/mkdocs)(1), [vuepress](/man/vuepress)(1), [gitbook](/man/gitbook)(1)
