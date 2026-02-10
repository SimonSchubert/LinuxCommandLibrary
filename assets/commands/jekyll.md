# TAGLINE

static site generator

# TLDR

**Create new site**

```jekyll new [site_name]```

**Build site**

```jekyll build```

**Serve locally**

```jekyll serve```

**Serve with live reload**

```jekyll serve --livereload```

**Build for production**

```JEKYLL_ENV=production jekyll build```

**Build with drafts**

```jekyll serve --drafts```

# SYNOPSIS

**jekyll** _command_ [_options_]

# PARAMETERS

**new** _NAME_
> Create new site.

**build**
> Build site to _site/.

**serve**
> Serve locally with auto-rebuild.

**--livereload**
> Enable live browser reload.

**--drafts**
> Include draft posts.

**-d** _DIR_
> Destination directory.

**--help**
> Display help information.

# DESCRIPTION

**Jekyll** is a static site generator. It transforms Markdown and Liquid templates into static HTML.

The tool powers GitHub Pages. It supports blogs, documentation, and custom sites with themes and plugins.

# CAVEATS

Ruby-based. Plugin support varies on GitHub Pages. Large sites may build slowly.

# HISTORY

Jekyll was created by **Tom Preston-Werner** in 2008 and became the engine behind **GitHub Pages**.

# SEE ALSO

[bundler](/man/bundle)(1), [hugo](/man/hugo)(1), [hexo](/man/hexo)(1), [gatsby](/man/gatsby)(1)
