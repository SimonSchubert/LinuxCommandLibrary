# TAGLINE

static site generator built with Ruby

# TLDR

**Create new project** in a directory

```middleman init [project_name]```

Create a project from a **template**

```middleman init [project_name] -T [middleman/middleman-templates-default]```

**Start development server** (the default when no command is given)

```middleman server```

**Start on specific port** and address

```middleman server -p [4567] -b [0.0.0.0]```

**Build static site** into the build directory

```middleman build```

Build and **stop on the first error** with debug output

```middleman build --bail --verbose```

Build **without removing** orphaned files

```middleman build --no-clean```

**Create new article** (requires middleman-blog)

```middleman article "[Article Title]"```

Open an **interactive console** with the app loaded

```middleman console```

**Show version**

```middleman version```

# SYNOPSIS

**middleman** [_command_] [_options_]

# PARAMETERS

**init** [_TARGET_]
> Create a new project (default: current directory). **-T**, **--template** selects a template; **-B**, **--skip-bundle** skips bundle install.

**server**, **s**
> Start the preview server. This is the default command.

**build**, **b**
> Build the static site for deployment.

**console**
> Start an interactive console with the app loaded.

**config**
> Output the project configuration in JSON format.

**extension** _NAME_
> Create a new extension skeleton.

**article** _TITLE_
> Create a new blog article (middleman-blog). Options include **-t** tags, **-d** date and **-b** blog.

**version**
> Show the Middleman version.

**-p**, **--port** _PORT_
> Preview server port (default 4567).

**-b**, **--bind-address** _HOST_
> Address the preview server binds to.

**-d**, **--daemon**
> Run the preview server in the background.

**-e**, **--environment** _ENV_
> Environment (default development for server and console, production for build).

**--clean**, **--no-clean**
> Remove orphaned files from the build directory (enabled by default).

**--parallel**, **--no-parallel**
> Output files in parallel during build (enabled by default).

**-g**, **--glob** _PATTERN_
> Build only files matching the pattern.

**--bail**
> Stop the build on the first error.

**--verbose**
> Print debug messages.

**--instrument**, **--profile**
> Print instrumentation messages or generate a profiling report.

**--help**
> Show help.

# DESCRIPTION

**Middleman** is a static site generator built with Ruby. It uses templates, layouts, and data files to produce static HTML, CSS, and JavaScript.

The preview server rebuilds pages on request as source files change; automatic browser refresh is available through the **middleman-livereload** extension.

Templates support ERB, Haml, Slim, Markdown and other Tilt-supported languages, with Sass compiled out of the box. Since Middleman 4, the built-in Sprockets asset pipeline was replaced by the **external_pipeline** feature, which runs tools such as webpack or esbuild alongside Middleman.

Data files in YAML or JSON populate templates dynamically. This separates content from presentation, enabling data-driven pages.

The blog extension adds post creation, tagging, and pagination. Articles are written in Markdown with YAML frontmatter.

Build produces a static site in the **build/** directory, ready for deployment to any web server or CDN. Configuration lives in **config.rb** in the project root.

# CAVEATS

Requires a Ruby environment; run commands through **bundle exec** to use the project's Gemfile versions. Commands other than init must be run inside a project containing config.rb. Build times increase with site size. Development has slowed considerably, and some extensions are unmaintained.

# HISTORY

**Middleman** was created by **Thomas Reynolds** starting around **2009**. It brought modern web development practices (asset pipeline, live reload) to static site generation. Version 4.0 (2015) removed the built-in asset pipeline; the 4.x series (4.6.2, released 2025) is current, while a 5.0 release candidate from 2019 was never finalized.

# SEE ALSO

[jekyll](/man/jekyll)(1), [hugo](/man/hugo)(1), [gatsby](/man/gatsby)(1), [bundle](/man/bundle)(1), [ruby](/man/ruby)(1)

# RESOURCES

```[Source code](https://github.com/middleman/middleman)```

```[Homepage](https://middlemanapp.com)```

<!-- verified: 2026-09-29 -->
