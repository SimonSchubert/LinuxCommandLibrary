# TAGLINE

manages distribution tags for packages

# TLDR

**List tags for package**

```npm dist-tag ls [package-name]```

**Add tag to version**

```npm dist-tag add [package]@[version] [tag]```

**Remove tag**

```npm dist-tag rm [package] [tag]```

# SYNOPSIS

**npm** **dist-tag** _command_ [_options_]

# PARAMETERS

**ls** _package_
> List tags for package.

**add** _pkg@version_ _tag_
> Add tag to version.

**rm** _package_ _tag_
> Remove tag.

# DESCRIPTION

**npm dist-tag** manages distribution tags for packages. Tags like latest, next, or beta point to specific versions. Used to control what version npm install gets by default.

# SEE ALSO

[npm](/man/npm)(1), [npm-publish](/man/npm-publish)(1)

