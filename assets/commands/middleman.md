# TLDR

**Create new project**

```middleman init [project_name]```

**Start development server**

```middleman server```

**Start on specific port**

```middleman server --port [4567]```

**Build static site**

```middleman build```

**Build with clean output**

```middleman build --clean```

**Create new article** (blog)

```middleman article "[Article Title]"```

**Show version**

```middleman version```

# SYNOPSIS

**middleman** [_init_] [_server_] [_build_] [_article_] [_options_]

# PARAMETERS

**init** _NAME_
> Create new project.

**server**, **s**
> Start development server.

**build**, **b**
> Build static site.

**article** _TITLE_
> Create new blog article.

**console**
> Start interactive console.

**--port** _PORT_
> Server port (default 4567).

**--bind** _HOST_
> Server bind address.

**--clean**
> Remove orphaned files during build.

**--verbose**
> Verbose output.

**--environment** _ENV_
> Build environment (development, production).

**--help**
> Show help.

# DESCRIPTION

**Middleman** is a static site generator built with Ruby. It uses templates, layouts, and data files to produce static HTML, CSS, and JavaScript.

The development server provides live reloading. Changes to source files automatically refresh the browser. This speeds up the design and development workflow.

Templates support ERB, Haml, Slim, and other Ruby templating languages. Asset pipeline handles Sass, CoffeeScript, and JavaScript bundling.

Data files in YAML or JSON populate templates dynamically. This separates content from presentation, enabling data-driven pages.

The blog extension adds post creation, tagging, and pagination. Articles are written in Markdown with YAML frontmatter.

Build produces a static site in the build directory, ready for deployment to any web server or CDN.

# CAVEATS

Requires Ruby environment. Plugin dependencies can be complex. Build times increase with site size. Some plugins may conflict.

# HISTORY

**Middleman** was created by **Thomas Reynolds** starting around **2009**. It brought modern web development practices (asset pipeline, live reload) to static site generation. The project influenced later static site generators.

# SEE ALSO

[jekyll](/man/jekyll)(1), [hugo](/man/hugo)(1), [gatsby](/man/gatsby)(1), [bundle](/man/bundle)(1)
