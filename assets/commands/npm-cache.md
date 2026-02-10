# TAGLINE

manages the npm package cache

# TLDR

**Clear npm cache**

```npm cache clean --force```

**Verify cache integrity**

```npm cache verify```

**Show cache location**

```npm cache ls```

# SYNOPSIS

**npm** **cache** _command_ [_options_]

# PARAMETERS

**clean**
> Delete cache folder contents.

**verify**
> Verify cache integrity.

**ls**
> List cache contents.

**--force**
> Required for clean command.

# DESCRIPTION

**npm cache** manages the npm package cache. The cache stores downloaded packages to speed up installations. Verify checks integrity and removes corrupt entries. Clean requires --force flag.

# SEE ALSO

[npm](/man/npm)(1), [npm-install](/man/npm-install)(1)

