# TAGLINE

dynamic Markdown documentation site generator

# TLDR

**Initialize new documentation** site

```docsify init [./docs]```

**Initialize with a specific theme**

```docsify init [./docs] --theme [dark]```

**Start local preview** server

```docsify serve [./docs]```

**Serve on specific port**

```docsify serve [./docs] --port [4000]```

**Serve and open in browser** automatically

```docsify serve [./docs] --open```

**Generate sidebar** automatically

```docsify generate [./docs]```

# SYNOPSIS

**docsify** _command_ [_options_] [_path_]

# PARAMETERS

_COMMAND_
> Operation: init, serve, generate.

_PATH_
> Documentation directory.

**init** [_PATH_]
> Initialize new docsify project. Shorthand: **i**.

**--local, -l**
> Copy docsify files to the docs path instead of using CDN (default: false).

**--theme, -t** _THEME_
> Choose a theme: vue, buble, dark, pure (default: vue).

**--plugins, -p**
> Add plugin script tags to index.html.

**serve** [_PATH_]
> Start local server with live reload. Shorthand: **s**.

**--port, -p** _N_
> Server port (default: 3000).

**--host, -H** _HOST_
> Host to bind to (default: localhost).

**--open, -o**
> Open browser automatically.

**generate** [_PATH_]
> Generate sidebar file. Shorthand: **g**.

**--sidebar, -s** _FILE_
> Sidebar filename (default: _sidebar.md).

**--overwrite, -o**
> Allow overwriting existing files.

**--help**
> Display help information.

# DESCRIPTION

**docsify** is a documentation site generator that dynamically renders Markdown files without building static HTML. It loads and parses Markdown files on the fly, providing instant updates during editing.

The tool creates simple, elegant documentation websites from Markdown files. Features include full-text search, multiple themes, plugin support, and GitHub Pages compatibility. Configuration is minimal, typically just an index.html and Markdown files.

docsify is particularly suited for project documentation, requiring no build step and supporting features like cover pages, sidebars, and embedded code samples.

# CAVEATS

Requires JavaScript for rendering (no static HTML). SEO may be affected by client-side rendering. Large documentation sites may have initial load delay.

# HISTORY

docsify was created by **QingWei-Li** (cinwell) and released as an open-source project. It gained popularity as a lightweight alternative to documentation generators like GitBook and VuePress, emphasizing simplicity and no build requirements. It is installed via npm: **npm i docsify-cli -g**.

# SEE ALSO

[mkdocs](/man/mkdocs)(1), [vuepress](/man/vuepress)(1), [gitbook](/man/gitbook)(1), [npm](/man/npm)(1)
