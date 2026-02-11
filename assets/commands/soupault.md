# TAGLINE

HTML-native static site generator

# TLDR

**Build site**

```soupault```

**Build with config**

```soupault --config [soupault.toml]```

**Force rebuild**

```soupault --force```

**Verbose output**

```soupault --verbose```

**Show version**

```soupault --version```

**Init project**

```soupault --init```

# SYNOPSIS

**soupault** [_--config file_] [_--force_] [_options_]

# PARAMETERS

**--config** _FILE_
> Config file path.

**--force**
> Force rebuild all.

**--verbose**
> Verbose output.

**--init**
> Initialize project.

**--site-dir** _DIR_
> Site directory.

**--build-dir** _DIR_
> Output directory.

# DESCRIPTION

**soupault** is a static site generator and HTML processor that works directly with HTML files rather than using a template language. It takes plain HTML as input, manipulates the DOM tree using CSS selectors, and outputs modified HTML, making it compatible with any existing HTML content.

The tool uses a widget system configured in TOML to perform transformations like inserting content into pages, generating tables of contents, and adding metadata. Custom widgets can be written in Lua for project-specific processing needs.

Unlike most static site generators, soupault makes no assumptions about site structure or content format. It can process existing HTML sites without conversion, making it suitable for both new projects and migrating legacy websites.

# CAVEATS

Learning curve unique. HTML-centric approach. OCaml written.

# HISTORY

**soupault** was created as a site generator and HTML processor that works with real HTML rather than template languages.

# SEE ALSO

[hugo](/man/hugo)(1), [jekyll](/man/jekyll)(1), [pandoc](/man/pandoc)(1)
