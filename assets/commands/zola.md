# TAGLINE

Fast Rust-based static site generator

# TLDR

**Create a new site**

```zola init [site_name]```

**Build the site**

```zola build```

**Start development server**

```zola serve```

**Serve on specific port**

```zola serve -p [8080]```

**Build with custom output directory**

```zola build -o [public]```

**Check for errors without building**

```zola check```

**Check site structure, skipping external link validation**

```zola check --skip-external-links```

**Serve with auto-open in browser**

```zola serve --open```

**Initialize site in non-empty directory**

```zola init --force [site_name]```

# SYNOPSIS

**zola** [_options_] _command_ [_arguments_]

# SUBCOMMANDS

**init** _name_
> Create new site scaffolding

**build**
> Build the static site

**serve**
> Start local development server with live reload

**check**
> Validate site without building

**completion** _shell_
> Generate shell completions

# PARAMETERS

**-c**, **--config** _file_
> Path to config file (default: config.toml)

**-r**, **--root** _dir_
> Site root directory

**-o**, **--output-dir** _dir_
> Output directory for build

**-p**, **--port** _port_
> Port for serve command (default: 1111)

**-i**, **--interface** _addr_
> Interface to bind server (default: 127.0.0.1)

**-u**, **--base-url** _url_
> Override base URL from config

**--open**
> Automatically open site in browser (serve only)

**--force**
> Overwrite existing output directory without prompting

**--drafts**
> Include draft content

**--skip-external-links**
> Skip external link validation (check only)

# DESCRIPTION

**Zola** is a fast static site generator written in Rust. It combines content (Markdown files), templates (Tera templating), and configuration into a static website.

The site structure includes:
- **content/** - Markdown files organized as sections
- **templates/** - Tera HTML templates
- **static/** - Static assets copied directly
- **themes/** - Optional downloadable themes
- **config.toml** - Site configuration

Zola features include syntax highlighting, automatic table of contents, taxonomies (tags, categories), shortcodes, and built-in Sass compilation.

The development server provides live reload, rebuilding automatically when files change.

# CAVEATS

Zola uses Tera templating, which differs from Hugo, Jekyll, or other static site generators. Template migration requires rewriting.

No plugin system. Extensibility is limited to shortcodes and templates.

Large sites with many pages may have noticeable build times, though Zola is generally faster than alternatives.

# HISTORY

**Zola** was created by **Vincent Prouillet** and originally named **Gutenberg**. It was renamed to Zola in **2018** (after Emile Zola). Written in Rust, it was designed as a single-binary alternative to static site generators like Hugo and Jekyll, emphasizing simplicity and build speed.

# SEE ALSO

[hugo](/man/hugo)(1), [jekyll](/man/jekyll)(1), [mdbook](/man/mdbook)(1)
