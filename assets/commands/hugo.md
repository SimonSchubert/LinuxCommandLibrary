# TLDR

**Create new site**

```hugo new site [site-name]```

**Build site**

```hugo```

**Create new content**

```hugo new [posts/my-post.md]```

**Start development server**

```hugo server```

**Build with drafts**

```hugo --buildDrafts```

**Build for production**

```hugo --minify```

# SYNOPSIS

**hugo** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Subcommand to run.

**new**
> Create new content.

**server**
> Start dev server.

**build**
> Build site (default).

**--buildDrafts**
> Include drafts.

**--minify**
> Minify output.

**-D**
> Include drafts.

**-t** _THEME_
> Use theme.

**--help**
> Display help information.

# DESCRIPTION

**Hugo** is a fast static site generator written in Go. It builds websites from Markdown content using templates and themes.

Hugo is extremely fast, building thousands of pages in seconds. It supports themes, taxonomies, and shortcodes for complex sites.

Hugo generates static websites quickly.

# CAVEATS

Go-template syntax learning curve. Theme compatibility varies. No dynamic content.

# HISTORY

Hugo was created by **Steve Francia** in **2013** as a fast alternative to Jekyll, written in Go.

# SEE ALSO

[hugo-server](/man/hugo-server)(1), [jekyll](/man/jekyll)(1), [hexo](/man/hexo)(1)
