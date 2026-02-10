# TAGLINE

fast, simple static blog framework

# TLDR

**Create new blog**

```hexo init [blog-name]```

**Create new post**

```hexo new [post-title]```

**Generate static files**

```hexo generate```

**Start local server**

```hexo server```

**Deploy to remote**

```hexo deploy```

**Clean generated files**

```hexo clean```

# SYNOPSIS

**hexo** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Subcommand to execute.

**init**
> Initialize new blog.

**new** _TITLE_
> Create new post/page.

**generate**, **g**
> Generate static files.

**server**, **s**
> Start local server.

**deploy**, **d**
> Deploy to remote.

**clean**
> Clean cache and public.

**-p**, **--port** _PORT_
> Server port.

**--help**
> Display help information.

# DESCRIPTION

**Hexo** is a fast, simple static blog framework. It uses Markdown for content and supports themes, plugins, and multiple deployment targets.

The framework generates static HTML from Markdown posts. It's popular for developer blogs and documentation sites.

# CAVEATS

Node.js required. Learning curve for themes. Plugin compatibility varies.

# HISTORY

Hexo was created by **Tommy Chen** as a fast static site generator for blogs, gaining popularity in the developer community.

# SEE ALSO

[hugo](/man/hugo)(1), [jekyll](/man/jekyll)(1), [gatsby](/man/gatsby)(1)
