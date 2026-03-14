# TAGLINE

fast static site generator written in Go

# TLDR

**Create new site**

```hugo new site [site-name]```

**Build site**

```hugo```

**Create new content**

```hugo new content [posts/my-post.md]```

**Start development server**

```hugo server```

**Build with drafts included**

```hugo --buildDrafts```

**Build for production with minification**

```hugo --minify```

**Build to a specific directory**

```hugo -d [/path/to/output]```

# SYNOPSIS

**hugo** [_command_] [_options_]

# PARAMETERS

**new content**
> Create new content file.

**new site**
> Create a new site scaffold.

**server**
> Start built-in development server.

**-b**, **--baseURL** _URL_
> Hostname and path to the root.

**-D**, **--buildDrafts**
> Include content marked as draft.

**-E**, **--buildExpired**
> Include expired content.

**-F**, **--buildFuture**
> Include content with future publish dates.

**-d**, **--destination** _DIR_
> Filesystem path to write files to.

**--minify**
> Minify supported output formats (HTML, XML, etc.).

**--gc**
> Run cleanup tasks after the build (remove unused cache files).

**--cleanDestinationDir**
> Remove files from destination not found in static directories.

**-t**, **--theme** _THEME_
> Theme to use.

**--logLevel** _LEVEL_
> Log level (debug, info, warn, error).

# DESCRIPTION

**Hugo** is a fast static site generator written in Go. It builds websites from Markdown content using templates and themes.

Hugo is extremely fast, building thousands of pages in seconds. It supports themes, taxonomies, and shortcodes for complex sites.

# CAVEATS

Go-template syntax learning curve. Theme compatibility varies. No dynamic content.

# HISTORY

Hugo was created by **Steve Francia** in **2013** as a fast alternative to Jekyll, written in Go. Note: `hugo new` for creating content is deprecated; use `hugo new content` instead.

# SEE ALSO

[hugo-server](/man/hugo-server)(1), [jekyll](/man/jekyll)(1), [hexo](/man/hexo)(1)
