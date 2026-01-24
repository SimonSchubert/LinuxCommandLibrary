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

**soupault** is a static site generator. It transforms HTML.

HTML-in, HTML-out. No template language.

Widget system. Extensible with Lua.

DOM manipulation. CSS selectors.

Preserves structure. Minimal assumptions.

# CAVEATS

Learning curve unique. HTML-centric approach. OCaml written.

# HISTORY

**soupault** was created as a site generator and HTML processor that works with real HTML rather than template languages.

# SEE ALSO

[hugo](/man/hugo)(1), [jekyll](/man/jekyll)(1), [pandoc](/man/pandoc)(1)
